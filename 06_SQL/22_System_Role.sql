-- 22_System_Role.sql (참고)
-- 권한, 롤(역할)
-- 유저 만들기(계정 생성), 권한 부여
-- 1) 유저 만들기
-- Oracle DB 기본 관리자 : system (sys(최고 관리자))
-- 역할 : 거의 대부분의 작업을 수행 (ex. 계정 생성, 권한 주기 등)

-- 예제 1) usertest01 유저를 만들고 암호를 pass1 이라고 지정하세요
-- 특수문자가 있다면 "" 쌍따옴표 사용
-- 사용법 : CREATE USER 계정명 IDENTIFIED BY 패스워드;
CREATE USER usertest01 IDENTIFIED BY pass1;

-- 예제 2) 위에서 만들 usertest01 유저에게 접속 권한을 주세요
-- 사용법 : GRANT 권한명 TO 유저명;
-- CREATE SESSION 권한 : 접속 권한
GRANT CREATE SESSION TO usertest01;
-- CREATE TABLE 권한 : 테이블 생성 권한
GRANT CREATE TABLE TO usertest01;
-- UNLIMITED TABLESPACE : 공간에 대한 사용 권한(무한)
GRANT UNLIMITED TABLESPACE TO usertest01;

-- 예제 3) 권한들의 집합 == ROLE(롤, 역할)
-- 1) ROLE 종류
-- 1-1) CONNECT : 접속 권한들의 집합
-- 1-2) RESOURCE : 테이블, 인덱스, 함수 등을 사용할 수 있는 권한 집합
-- 1-3) CREATE VIEW 권한 : VIEW 생성 권한
GRANT CONNECT, RESOURCE, CREATE VIEW TO usertest01;

-- 예제 4) 계정 삭제
-- 사용법 : DROP USER 계정명;
DROP USER usertest01;

-- (참고) 동의어 : SYNONYM
-- 의미 : 다른 계정의 테이블, 인덱스 등에 간단한 별명을 붙여 사용성을 높인 것
-- 예) SELECT * FROM 계정명.테이블명; ---> 테이블명 앞에 계정명 붙임
--   => 동의어 이용 : 계정명.테이블명 => 테이블명 (동의어 생성)
--      SELECT * FROM 테이블명; ---> 동의어 활용
-- 실습 : 1) 관리자 계정으로 테이블 생성, SCOTT 계정에 그 테이블 조회 권한 부여
-- 예제) 샘플테이블 : SAMPLETBL
CREATE TABLE SAMPLETBL(
    MENO VARCHAR2(50)
);
-- 데이터 2건 생성
INSERT INTO SAMPLETBL VALUES('오월은 푸르구나');
INSERT INTO SAMPLETBL VALUES('최선을 다합시다');
COMMIT;
SELECT * FROM SAMPLETBL;

-- SELECT 권한(조회) 부여 : SCOTT
-- 사용법 : GRANT SELECT ON 테이블명 TO 유저명;
GRANT SELECT ON SAMPLETBL TO scott;
-- 동의어 생성 권한(CREATE SYNONYM) : SCOTT
GRANT CREATE SYNONYM TO scott;

-- 2) SCOTT 계정으로 접속해서 관리자 계정 테이블 조회 + 동의어로도 조회
-- 예제 3) 관리자 계정 테이블 조회
SELECT * FROM SYSTEM.SAMPLETBL;

-- 동의어 생성
CREATE SYNONYM SAMPLETBL FOR SYSTEM.SAMPLETBL;

-- 재조회
SELECT * FROM SAMPLETBL; ---> 동의어 조회

-- 에제 5) 동의어 삭제
-- 사용법 : DROP SYNONYM 동의어명; ---> 개발자 계정(SCOTT)에서 삭제
DROP SYNONYM SAMPLETBL;