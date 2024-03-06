-- 20_Sequence_Index.sql
-- Sequence(시퀀스) : 호출(실행)할 때 마다 자동적으로 숫자를 증가시키는 것(객체)
-- 예) 1씩 증가, 2씩 증가
-- 용도 : 기본키(PK:유일, NOT NULL) 용도
--        시퀀스는 숫자가 증가하므로 중복 발생 없음, NOT NULL
-- 활용 예시) 자유게시판 : No(1 ~ n), 고객 : 고객No(1 ~ n)
-- 용어 : 채번 : 자동적으로 1식 증가시키는 값

-- 예제 1) SAMPLE_SEQ 시퀀스를 1부터 시작해서 10씩 증가시키는 시퀀스 생성
-- 사용법 : CREATE SEQUENCE 시퀀스명
--          INCREMENT BY 증가값
--          START WITH 시작값;
--          (MINVALUE 최소값) [생략 가능]
--          (MAXVALUE 최대값) [생략 가능]
CREATE SEQUENCE SAMPLE_SEQ
INCREMENT BY 10
START WITH 1;

-- 실행 방법 : SELECT 시퀀스명.NEXTVAL FROM 테이블명;
--                   시퀀스명.NEXTVAL -> 시퀀스 증가
SELECT SAMPLE_SEQ.NEXTVAL FROM DUAL; -- 지금은 테스트 테이블인데 모든 테이블에서 가능함

-- 현재 시퀀스 값 보기 : 시퀀스명.CURRVAL
SELECT SAMPLE_SEQ.CURRVAL FROM DUAL;

-- 연습 1) SAMPLE_SEQ2 시퀀스를 1부터 시작해서 1씩 증가시키는 시퀀스 생성
CREATE SEQUENCE SAMPLE_SEQ2
INCREMENT BY 1
START WITH 1;

-- 실행문
SELECT SAMPLE_SEQ2.NEXTVAL FROM DUAL;

-- 현재 시퀀스 값 보기
SELECT SAMPLE_SEQ2.CURRVAL FROM DUAL;

-- (참고) 시스템 테이블(딕셔너리 뷰) : USER_SEQUENCES
-- DBA(관리자) 사용
SELECT * FROM USER_SEQUENCES;

-- 예제 2) 테이블에 INSERT 할 때 시퀀스 사용하기
-- 시퀀스는 주로 INSERT에 많이 사용한다.
-- 실습 테이블 : DEPARTMENT 복사해서 -> DEPT_TEMP 만들기
CREATE TABLE DEPT_TEMP
AS
SELECT * FROM DEPARTMENT
WHERE 1=2;

-- 1) 시퀀스 생성 : 초기값 1, 증가값 1
CREATE SEQUENCE DEPT_TEMP_SEQ
INCREMENT BY 1
START WITH 1;

-- 2) INSERT 문에 사용하기
INSERT INTO DEPT_TEMP(DNO, DNAME, LOC)
VALUES(DEPT_TEMP_SEQ.NEXTVAL, 'ACCOUNTING', 'NEW YORK');

-- 데이터 확인
SELECT * FROM DEPT_TEMP;

-- 확정
COMMIT;