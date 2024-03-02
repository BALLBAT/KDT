# xxx.md : 마크다운 파일
# 리눅스 : 
    - 운영체제(OS) : Operating System, 컴퓨터를 관리하는 s/w
        예) 사운드카드 설치, 마이크 s/w 설치, 키보드/마우스 설치 등
    - OS 종류 : 윈도우(pc개인용컴퓨터)
                리눅스(pc용 개발 -> 기업용 사용)
                유닉스(기업용 컴퓨터)
    - 리눅스 특징 : 명령 프롬포트 기반으로 실행됨
       (CLI : Command Line Interface) vs (GUI : Graphic User Interface)
# 리눅스 설치 : OS는 기본적으로 컴퓨터에 1개만 설치 가능
#  가상화 s/w를 통해 여러개의 OS를 설치할 수 있음
   => 가상화 s/w : docker s/w

# 리눅스 설치 절차
### 1) 도커 이미지 다운로드 : 도커데스크탑에서 검색 후 pull 버튼 클릭
       (1) 윈도우 : kangtaegyung/ubuntu-win
       (2) 맥     : kangtaegyung/ubuntu-edu

### 2) 도커 컨테이너 실행 : 컨테이너(다운받은 s/w를 실행시키는 것)
       - 윈도우 : docker run -it --name ubuntu kangtaegyung/ubuntu-win
### 3) 도커 컨테이너 종료 : 리눅스 프로그램 정지
       - 1) 도커 데스크탑 : 정지 아이콘 클릭
       - 2) 명령 프롬포트 : exit
### 4) 도커 컨테이너 시작 : 리눅스 프로그램 시작
       - 1) 도커 데스크탑 : 시작 아이콘 클릭
       - 2) 명령 프롬포트 : docker start ubuntu
### 5) 도커 컨테이너 접속 : 리눅스 프로그램 연결(접속)
       - 1) 명령 프롬포트 : docker attach ubuntu