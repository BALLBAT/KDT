-- 26_Procedure.sql
-- DB 프로그래밍 분야 : SQL 숙련자들이 코딩함
-- 중급 개발자가 주로 개발함
-- 난이도 높음
-- 소스 위치 : Oracle DB 내에 저장됨
-- 장점 : 1) 처리속도 빠름
-- 특징 : 1) 제어문(조건문/반복문), 변수/상수

-- 프로시저 정의 (3단계)
-- 1. 선언부 : 변수 정의, 변수값 받기(매개변수)
-- 2. 실행부(BEGIN) : 본격적인 코딩
-- 3. 예외처리(EXCEPTION) : 예외 블럭 처리
-- 4. 종료 : END, 프로시저 끝

-- 1) 화면 출력 모드 ON
SET SERVEROUTPUT ON;

-- 예제 1) 매개변수 2개의 합을 출력
-- in : 매개변수의 의미
-- 사용법 : CREATE OR REPLACE PROCEDURE 프로시저명(
--           매개변수 in 자료형,
--           ...
--           )
-- IS
--    변수 자료형(자리수); ---> 선언부
-- BEGIN
--    실제코딩
-- END;
-- /
-- 화면 출력 함수 : dbms_output.put_line("문자열")

CREATE OR REPLACE PROCEDURE pro_exam01
(
    -- 매개변수 부분 : 함수 매개변수와 비슷
    p_num1 in NUMBER,
    p_num2 in NUMBER
)
IS
-- 선언부 : 변수정의
    v_sum NUMBER(10);
BEGIN
-- 실행 블럭 : 본격적 코딩
-- 합 계산 : v_sum = p_num1 + p_num2
-- ( := ) : 대입연산자
    v_sum := p_num1 + p_num2;

-- DB 출력 : 1줄 출력
-- || : 문자열 붙이기 연산자
-- 사용법 : dbms_output.put_line(변수)
dbms_output.put_line('총합은 : ' || v_sum);
END;
/

-- 프로시저 실행 방법
-- 사용법 : CALL 프로시저명(매개변수, 매개변수2, ...);
CALL pro_exam01(1, 2);

-- 예제 2) 입력 받은 사원벊에 해당하는 월급 출력하기 : 사원테이블
-- 입력값 : 7788 (SCOTT)
CREATE OR REPLACE PROCEDURE pro_exam02
(
    p_num1 in NUMBER -- 매개 변수
)
IS
    v_sal NUMBER(10); -- 결과 저장 변수
BEGIN
-- 입력 받은 사원 번호에 해당하는 월급 출력
-- 사용법 : SELECT 컬럼명 INTO 변수 ---> 컬럼값이 변수에 저장됨
SELECT SALARY INTO v_sal
FROM EMPLOYEE
WHERE ENO = p_num1;

dbms_output.put_line('월급은 : ' || v_sal);
END;
/

CALL pro_exam02(7788);

-- 예제 3) 조건문 : IF/ELSEIF/ELSE/END IF;
CREATE OR REPLACE PROCEDURE pro_exam03
(
    p_num1 in NUMBER -- 매개 변수
)
IS
BEGIN
-- 입력값에 따라 짝수/홀수 인지 출력하세요 : MOD(값, 나누기) => 결과 : 나머지
-- =(등호) : 비교연산자, 같다
    IF MOD(p_num1, 2) = 0 THEN
        dbms_output.put_line('짝수');
    ELSE
        dbms_output.put_line('홀수');
    END IF;
END;
/

CALL pro_exam03(2);

-- 예제 4) 반복문 : 커서(CURSOR)
-- 커서(CURSOR) : SELECT문의 결과로 여러건을 가지고 있는 변수
CREATE OR REPLACE PROCEDURE pro_exam04
(
    p_num1 in NUMBER -- 매개 변수
)
IS
-- 선언부
-- 커서 정의 : 배열과 유사, SELECT문의 결과 저장
-- 사용법 : CURSOR 커서변수명 IS SELECT ~ 문;
    CURSOR emp_cursor IS
        SELECT ENAME, SALARY, DNO
        FROM EMPLOYEE
        WHERE DNO = p_num1; -- 부서번호(매개변수)

BEGIN
-- FOR문 : 반복문
-- 자바의 향상된 FOR문과 유사 : 예) for(변수 : 배열){}
-- 특징 : 증감식 없음, 테이터 끝에 도달하면 반복문 종료
    FOR emp_record IN emp_cursor LOOP
    -- 반복문 실행 부분
    -- emp_record : 커서의 1개 행이 차례대로 들어감

    -- 차례로 화면 출력
    dbms_output.put_line(emp_record.ename || ' ' || emp_record.SALARY || ' ' || emp_record.DNO);
    END LOOP;

END;
/

-- 프로시저 실행
CALL pro_exam04(20);

-- 예제 5) 펑션 만들기
-- 부서번호를 매개변수로 받아서 부서위치를 출력하는 함수 정의
-- 사용법 : CREATE OR REPLACE FUNCTION 펑션명(매개변수 IN 자료형)
--          RETURN 리턴값자료형;
-- 예약어 : 테이블명.컬럼명%type => 테이블명에 해당하는 컬ㄻ의 자료형을 가져옴
--         예) DEPARTMENT.DNO%TYPE => DEPARTMENT 테이블의 DNO 컬럼의 자료형 : NUMBER
CREATE OR REPLACE FUNCTION fn_exam05
(
    p_num1 in DEPARTMENT.DNO%TYPE ---> 매개변수 자료형 (NUMBER) ---> MORE 유연한 코딩
)
RETURN DEPARTMENT.LOC%TYPE
IS
-- 선언부
    v_loc DEPARTMENT.LOC%TYPE; ---> 부서 테이블의 LOC 자료형 참고
BEGIN
-- 부서번호를 매개변수로 받아 위치를 조회하는 SQL문
    SELECT LOC INTO v_loc 
    FROM DEPARTMENT
    WHERE DNO = p_num1;      ---> 부서변호 매개변수

    RETURN v_loc;
END;
/

-- 함수 실행 방법 :
SELECT fn_exam05(10) FROM DUAL;