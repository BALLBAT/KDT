# 07_bash.md
### 1) 쉘 : 윈도우의 바탕화면 테마와 유사, 종류로는 bash쉘, csh쉘, born쉘 등이 있음

### 2) 쉘 변수 :
##### 변수     : 값을 저장하는 곳
##### 쉘 변수  : bash 쉘 환경에 값을 저장하는 것
##### 사용법 1) 쉘 변수 저장 : 변수명='문자열'
##### 사용법 2) 쉘 변수 사용 : $변수명
    oracle@8db54b88ed9b:~/work$ var1='test var'
    oracle@8db54b88ed9b:~/work$ echo $var1
    test var
    oracle@8db54b88ed9b:~/work$

##### 2-2) var2 쉘변수에 'hello world' 넣고 쉘변수를 echo로 출력해보세요
    oracle@8db54b88ed9b:~/work$ var2='Hello World'
    oracle@8db54b88ed9b:~/work$ echo $var2
    Hello World

### 3) 프롬프트 : PS1
##### 프롬프트 : 명령어 앞에 $, # 표시된 부분을 말함
##### root (계정 : 슈퍼 관리자) : # 프롬프트 표시
##### 일반 계정                 : $ 프롬프트 표시

### 4) 리눅스에서 미리 정의한 쉘 변수를 소개
##### 4-1) $SHELL : 현재 사용하는 쉘을 저장하는 변수
##### 예제 1) 현재 사용하는 쉘 화면에 출력(echo)
##### 사용법 : echo $SHELL
    oracle@8db54b88ed9b:~/work$ echo $SHELL
    /bin/bash

##### 4-2) $PATH : 여러가지 경로가(PATH) 미리 저장된 변수
##### 예제 2) 현재 등록된 $PATH 경로를 화면에 출력(echo)
##### 사용법 : echo $PATH
##### PATH => 경로1:경로2:경로3... -> :(콜론)을 기준으로 경로 출력
##### 모든 OS는 명령어를 실행하려면 : 경로/명령어
    oracle@8db54b88ed9b:~/work$ echo $PATH
    /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin
    oracle@8db54b88ed9b:~/work$

##### java 명령어가 /usr/local/sbin 폴더에 있다고 가정
##### 현재 경로 : /home/oracle => 에서 java 실행시
#####          => java를 찾을 수 없습니다. 출력
#####          => /usr/local/sbin/java 실행해야 에러가 안남
#####          => $PATH 쉘변수에 /usr/local/sbin 경로 저장하고 java를 실행하면 OS가 $PATH 경로를 먼저 찾아서 있으면? 정상 실행, 없으면? 에러가 발생

##### 4-3) LANG 쉘 변수 : 로케일, 언어셋
##### 현재 시스템에 설치된 언어셋 보기 명령어
##### 사용법 : locale -a
    oracle@8db54b88ed9b:/$ locale -a
    C
    C.UTF-8
    POSIX
    oracle@8db54b88ed9b:/$
##### (참고) 한국어 라이브러리 설치하면 (생략)
##### LANG=ko_KR.utf8 실행 => 한국어로 변경됨
##### LANG=C 실행          => 영어로 변경됨

##### 5) .profile, .bashrc 환경설정 파일 소개
##### 쉘 변수 만들기 : var1='hello world'
##### 쉘 변수는 로그아웃, 리눅스 종료하면 사라짐
##### => .profile, .bashrc 파일에 쉘 변수를 등록하면 다시 로그인 했을 때도 그 변수를 사용가능함
##### 위치 : ~/.profile   : 홈 폴더(디렉토리)에 숨긴파일로 있음
##### 위치 : ~/.bashrc    : 홈 폴더(디렉토리)에 숨긴파일로 있음
##### 위치 : /etc/profile : etc 폴더에 있음, 모든 사용자에게 쉘 변수가 적용됨
##### 예제 1)