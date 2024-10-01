# VintagePub
VintagePub
<br>
<br>

# 하이브리드를 통해 AWS EKS 활용한 3Tier 웹 서비스 구축
<br>
<br>

> [ Final 프로젝트 규칙 ] \
\
AWS Infra 구축 \
WEB-WAS-DB 연동 \
 -> 컨테이너 기반 3-Tier 웹 서비스 운영 \
    ( WEB : 정적페이지 처리  , WAS : 동적페이지 처리, DB : 데이터 처리 ) \
\
부하에 따른 Autoscaling \
 HPA AutoScaling \
 CA 구성에 대한 부하 테스트 \
\
On-Premise - AWS 연결 \
DEV-VPC Peering \
\
컨테이너 이미지 - ECR \
웹페이지의 정보 (가격, 수량 , 내용 등) 버전에 대한 변경사항 \
\
ArgoCD \
\
가산점 부여 사항 : On-Premise & AWS 클라우드와의 Biz 연계 구성
<br>
<br>


## 📆 진행 기간 
2024.02.13 ~ 2024.03.18 (5주) \
제출일 : 2024.03.18.월 오후 15시 \
발표일 : 2024.03.22.금 
<br>
<br>


## 🛠 사용 기술 Stack
### OS 
<img src="https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=black"> 

### Infra 
<img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">
<img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">

### CSP 
<img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> 

### Container Orchestration
<img src="https://img.shields.io/badge/kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white">
<img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/amazoneks-FF9900?style=for-the-badge&logo=amazoneks&logoColor=white">

### DataBase
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
<img src="https://img.shields.io/badge/amazonelasticache-C925D1?style=for-the-badge&logo=amazonelasticache&logoColor=white">
<img src="https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">

### Storage
<img src="https://img.shields.io/badge/amazons3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">

### Skill
<img src="https://img.shields.io/badge/amazonec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
<img src="https://img.shields.io/badge/awselasticloadbalancing-8C4FFF?style=for-the-badge&logo=awselasticloadbalancing&logoColor=white">
<img src="https://img.shields.io/badge/amazonecs-FF9900?style=for-the-badge&logo=amazonecs&logoColor=white">
<img src="https://img.shields.io/badge/grafana-F46800?style=for-the-badge&logo=grafana&logoColor=white">
<img src="https://img.shields.io/badge/Prometheus-E6522C?style=for-the-badge&logo=Prometheus&logoColor=white">
<img src="https://img.shields.io/badge/helm-0F1689?style=for-the-badge&logo=helm&logoColor=white">
<img src="https://img.shields.io/badge/argocd-EF7B4D?style=for-the-badge&logo=argocd&logoColor=white">

### Team Collabolation Tool
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
 
### Drawing Tool
<img src="https://img.shields.io/badge/drawio-F08705?style=for-the-badge&logo=drawio&logoColor=white">
<br>
<br>


## 💁‍♂️ 담당 업무
<div align=center>
 
![image](https://github.com/JJungeee/VintagePub/assets/142209884/1294aa1f-3aca-471c-8bf0-aa8c42fd99d4)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/68b60be0-2b73-4ce6-97fe-5a74400e1e3a)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/76653bd9-de94-4dd8-a977-be669ad8ee7d)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/21ab2938-d795-4108-82bb-710188172cab)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/c1e1c254-d119-4def-bebc-4fa06c2cbec1)

</div>
<br>
<br>   


## 📖 상세 내용
### Infra Architecture
<div align=center>
 
![image](https://github.com/JJungeee/VintagePub/assets/142209884/e6194b9f-7fad-4f30-b585-651101c259de)

</div>
<br>  
<br>  
<br>


## 🔗 구축 과정
### 🔶 프로젝트 진행 과정
1. 인프라 선정 - Vintage Blue > Vintage Pub 
2. 프로젝트 환경 설계 및 구성
3. On-Premise 환경 구축
4. Cloud 환경 구축
5. image를 안전하게 공유하기 위한 repository 구축 - Docker / ECR
6. Computing, VPC
7. Storage
8. 데이터베이스
9. 마이그레이션 및 전송
10. 관리 및 거버넌스
11. 네트워킹
12. 보안
13. 배포 및 롤링 업데이트 및 롤백 - ArgoCD
<br>
<br>


### Notion
<div align=center>
 
![그림2](https://github.com/JJungeee/VintagePub/assets/142209884/31d482a6-a599-4dd0-bdbd-dbd477610bcd)
![그림16](https://github.com/JJungeee/VintagePub/assets/142209884/1e0bbfa7-d6fe-4377-8b7b-f519cab227ff)

</div>
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">

 [AWS Hybrid Cloud Project](https://www.notion.so/AWS-Hybrid-Cloud-Project-efc24c8504b241fabcf3c548db8e0833?pvs=4)
 
 <br> 
 <br> 
  
# VintagePub
VintagePub
<div align=center>
 <a href="https://github.com/JJungeee/VintagePub/github-readme-stats">
    <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=JJungeee&layout=donut&show_icons=true&theme=material-palenight&hide_border=true&bg_color=20232a&icon_color=58A6FF&text_color=fff&title_color=58A6FF&count_private=true&exclude_repo=Face-Transfer-Application" width=38% />
</a>    
<a href="https://github.com/JJungeee/VintagePub/github-readme-stats">
  <img src="https://github-readme-stats.vercel.app/api?username=JJungeee&show_icons=true&theme=material-palenight&hide_border=true&bg_color=20232a&icon_color=58A6FF&text_color=fff&title_color=58A6FF&count_private=true" width=56% />
</a>
<a href="https://github.com/JJungeee/VintagePub/github-readme-activity-graph">
    <img src="https://github-readme-activity-graph.vercel.app/graph?username=JJungeee&theme=react-dark&bg_color=20232a&hide_border=true&line=58A6FF&color=58A6FF" width=94%/>
</a>
</div>
