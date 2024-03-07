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

-- 3) 시퀀스 삭제 :
-- 사용법 : DROP SEQUENCE 시퀀스명;
DROP SEQUENCE DEPT_TEMP_SEQ;

-- *) 인덱스(Index)
-- 용도 : 조회 속도 향상을 위해 컬럼에 인덱스를 생성함
-- 사용 : 컬럼에 인덱스를 지정해서 생성하면 됨
-- 기본키(PK) 특징 : 유일(중복 금지) + NOT NULL + 자동 인덱스 생성

--  예제 3) 어떤 사이트에서 조회시 이름검색이(ENAME) 많다고 합니다.
--          그런데 속도가 많이 느리다고 합니다. 인덱스를 생성해주세요
-- 사용법 : CREATE INDEX 인덱스명 ON 테이블명(컬럼명);
CREATE INDEX IX_EMPLOYEE_ENAME ON EMPLOYEE(ENAME);

-- 속도 느림 대상 SQL문
SELECT * FROM EMPLOYEE
WHERE ENAME LIKE 'SCO%';         -- 조건절(WHERE절 등)에 주로 사용하는 컬럼에 생성

-- 시스템 테이블 : 데이터 사전(DICTIONARY VIEW)
-- USER_IND_COLUMNS
-- DBA(관리자)가 많이 사용, 개발자는 참고
SELECT * FROM USER_IND_COLUMNS
WHERE TABLE_NAME IN ('EMPLOYEE','DEPARTMENT');

-- 인덱스 삭제하기
-- 사용법 : DROP INDEX 인덱스명;
DROP INDEX IX_EMPLOYEE_ENAME;

-- 연습 1) DEPARTMENT 테이블에 DNAME 부서명에 인덱스를 생성하세요
-- 인덱스명 : IX_DEPARTMENT_DNAME
CREATE INDEX IX_DEPARTMENT_DNAME ON DEPARTMENT(DNAME);

-- *) 인덱스 생성 기준
-- 1) WHERE(조건절)에 해당 컬럼이 많이 등장할 경우 인덱스 생성 고려
-- 2) 테이블에 행 개수가 굉장히 많을 경우 (데이터 건수가 많을 경우)
--    예) 10만건 이상
-- 3) 주로 테이블 조인(2개 이상)의 공통 컬럼으로 사용될 경우 인덱스 생성 고려

-- 기타 인덱스 (특수 인덱스) (참고) :
-- 1) 결합 인덱스 : 여러개의 컬럼을 동시에 인덱스 1개로 생성
-- 예제) 아래의 SQL문이 자바에서 실행되는데 느리다고 합니다. 개선해주세요
SELECT * FROM DEPARTMENT
WHERE DNAME = 'SALES'
AND LOC = 'NEW YORK';

-- 결합 인덱스 생성
-- 사용법 : CREATE INDEX 인덱스명 ON 테이블명(컬럼명1, 컬럼명2, ...);
CREATE INDEX IX_DEPARTMENT_DNAME_LOC ON DEPARTMENT(DNAME, LOC);

-- 2) 함수 인덱스 : SQL 함수 또는 산술식에 인덱스 걸기
-- 예제) 아래의 SQL문이 자바에서 실행되는데 느리다고 합니다. 개선해주세요
SELECT * FROM EMPLOYEE
WHERE SALARY = SALARY * 12;

-- 함수 인덱스 생성
CREATE INDEX IX_EMPLOYEE_ANNSAL ON EMPLOYEE(SALARY * 12);

