# VintagePub
VintagePub


# 하이브리드를 통해 AWS EKS 활용한 3Tier 웹 서비스 구축


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


## 📆 진행 기간 
2024.02.13 ~ 2024.03.18 (5주) \
제출일 : 2024.03.18.월 오후 15시 \
발표일 : 2024.03.22.금 
 
 
## 🛠 사용 기술
### CSP 
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/d07ecd60e94498eee17b1b702c3034e6d9a30abe4a23ae4b23b3c2f1c98325f8/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f416d617a6f6e204157532d3233324633453f7374796c653d666c61742d737175617265266c6f676f3d416d617a6f6e20415753266c6f676f436f6c6f723d7768697465)

### OS 
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/a3d2446a97b12162718ac87671c8d22bea478b38333cc057815652e7f3aadaa6/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f416d617a6f6e204c696e757820322d3233324633453f7374796c653d666c61742d737175617265266c6f676f3d416d617a6f6e20415753266c6f676f436f6c6f723d7768697465)

### Database 
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/0efa8fcd6f09597585ca1b0acbd5f64e77cae7c209143ae65eb517374df7daeb/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6d7973716c2d3434373941313f7374796c653d666c61742d737175617265266c6f676f3d6d7973716c266c6f676f436f6c6f723d7768697465)

### Container 
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/60bd8f50238e3468fc6d8b54543b9a1e675eb448ddfe22107e013b8964e2f67a/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f446f636b65722d3234393645443f7374796c653d666c61742d737175617265266c6f676f3d446f636b6572266c6f676f436f6c6f723d7768697465)

### Container Orchestration
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/8e7a8599d050f85c44a133a2d95eb2a6b87453d232ecee7080e1d992833e83ca/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f416d617a6f6e20454b532d4646393930303f7374796c653d666c61742d737175617265266c6f676f3d416d617a6f6e20454b53266c6f676f436f6c6f723d7768697465)

### Team Collabolation Tool
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/ac8e50ec4dfc3513f4d66c023dcecf106f3d7e2d5ad70da9375cf71bd1987e93/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4e6f74696f6e2d3030303030303f7374796c653d666c61742d737175617265266c6f676f3d4e6f74696f6e266c6f676f436f6c6f723d7768697465)

### Drawing Tool
![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://camo.githubusercontent.com/dbdaa692167ef45698b2fdf349b51d3678255d76d835c804221fb7f563304d33/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f44726177696f2d3030303030303f7374796c653d666c61742d737175617265266c6f676f3d44726177696f266c6f676f436f6c6f723d7768697465)


## 💁‍♂️ 담당 업무
![image](https://github.com/JJungeee/VintagePub/assets/142209884/1294aa1f-3aca-471c-8bf0-aa8c42fd99d4)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/68b60be0-2b73-4ce6-97fe-5a74400e1e3a)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/76653bd9-de94-4dd8-a977-be669ad8ee7d)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/21ab2938-d795-4108-82bb-710188172cab)
![image](https://github.com/JJungeee/VintagePub/assets/142209884/c1e1c254-d119-4def-bebc-4fa06c2cbec1)


## 📖 상세 내용
### Infra Architecture
![image](https://github.com/JJungeee/VintagePub/assets/142209884/e6194b9f-7fad-4f30-b585-651101c259de)



## 🔗 구축 과정
