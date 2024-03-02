# 기본 이미지(필수) : OS (ubuntu)
FROM ubuntu:18.04
# (선택, 생략) 추가 설치 유틸리티 설치 등
RUN apt-get update -y
# 실제 작업 : 윈도우:message_exam.txt => 리눅스:/message_exam.txt에 복사
ADD ./message_exam.txt /message_exam.txt
# 컨테이너 실행 후에 1번 실행할 명령어
CMD cat /message_exam.txt