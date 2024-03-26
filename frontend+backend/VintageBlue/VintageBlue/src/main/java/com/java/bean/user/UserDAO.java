package com.java.bean.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.bean.JDBCutil;

public class UserDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs = null;
	
	private final static String USER_LOGIN = "select * from user where userId=?";
	private final static String USER_INSERT = "insert into user(userName, userId, userPw, userEmail, userTel, addr, detailAddr, postNum) values(?, ?, ?, ?, ?, ?, ?, ?)";
	private final static String USER_IDCHECK = "select userId from user where userId=?";
	private final static String USER_ALL_LIST = "select * from user";
	private final static String USER_DELETE = "delete from user where userId = ?";
	private final static String USER_UPDATE = "update user set userEmail=? and userTel=? where userId=?;";
	
	// 로그인 프로세스
	public int loginProcess(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_LOGIN);
			
			pstmt.setString(1, dto.getUserId());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("userId").equals("admin") && dto.getUserId().equals("admin") && rs.getString("userPw").equals(dto.getUserPw())) return 0;
				if(rs.getString("userPw").equals(dto.getUserPw())) 
					return 1;	// 로그인 성공
				else return 2;	// 비밀번호 오류
			}
			return 3;	// 해당 아이디 없음
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		return 4;	// DB 오류
	}
	
	//로그인 한 회원 정보 저장 
	public UserDTO saveInfo(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_LOGIN);
			
			pstmt.setString(1, dto.getUserId());
			rs = pstmt.executeQuery();
			
			UserDTO resultDto = new UserDTO();
			
			if(rs.next()) {
				resultDto.setUserSeq(rs.getInt("userSeq"));
				resultDto.setUserName(rs.getString("userName"));
				resultDto.setUserId(rs.getString("userId"));
				resultDto.setUserPw(rs.getString("userPw"));
				resultDto.setUserEmail(rs.getString("userEmail"));
				resultDto.setUserTel(rs.getString("userTel"));
				resultDto.setAddr(rs.getString("addr"));
				resultDto.setDetailAddr(rs.getString("detailAddr"));
				resultDto.setPostNum(rs.getString("postNum"));
					
				return resultDto;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		return null;  // DB 오류 
	}
	
	// 회원가입 프로세스
	public int signUpProcess(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_INSERT);
			
			pstmt.setString(1, dto.getUserName());
			pstmt.setString(2, dto.getUserId());
			pstmt.setString(3, dto.getUserPw());
			pstmt.setString(4, dto.getUserEmail());
			pstmt.setString(5, dto.getUserTel());
			pstmt.setString(6, dto.getAddr());
			pstmt.setString(7, dto.getDetailAddr());
			pstmt.setString(8, dto.getPostNum());
			
			pstmt.executeUpdate();
			
			System.out.println("User DAO : signUp Sucess!");
			
			return 1;	// 회원가입 성공
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
		
		System.out.println("User DAO : signUp Fail!");
		return 2;	// Error
	}
	
	// 아이디 중복 확인
	public int checkIdProcess(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_IDCHECK);
			
			pstmt.setString(1, dto.getUserId());
			rs = pstmt.executeQuery();
			
			if(rs.next()) return 2;	// 아이디 중복
			else return 1;	// 아이디 사용 가능
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(rs, pstmt, conn);
		}
		return 3;	// Error
	}
	
	// 회원 정보 수정 Email, Tel
	public void updateUserProcess(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_UPDATE);
			pstmt.setString(1, dto.getUserEmail());
			pstmt.setString(2, dto.getUserTel());
			pstmt.setString(3, dto.getUserId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 목록 조회
		public ArrayList<UserDTO> selectAllUserListProcess(){
			ArrayList<UserDTO> aList = new ArrayList<UserDTO>();
			
			try {
				conn = JDBCutil.getConnection();
				pstmt = conn.prepareStatement(USER_ALL_LIST);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					UserDTO dto = new UserDTO();
					dto.setUserName(rs.getString("userName"));
					dto.setUserId(rs.getString("userId"));
					dto.setUserPw(rs.getString("userPw"));
					dto.setUserEmail(rs.getString("userEmail"));
					dto.setUserTel(rs.getString("userTel"));
					dto.setAddr(rs.getString("addr"));
					dto.setDetailAddr(rs.getString("detailAddr"));
					dto.setPostNum(rs.getString("postNum"));
					aList.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCutil.close(rs, pstmt, conn);
			}
			return aList;
		}
	
	// 회원 삭제
	public void deleteUserProcess(UserDTO dto) {
		try {
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_DELETE);
			pstmt.setString(1, dto.getUserId());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(pstmt, conn);
		}
	}
}
