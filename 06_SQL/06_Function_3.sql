-- 06_Function_3.sql
-- 자료형 변환 함수(*)
-- DB 자료형 : 문자열 : VARCHAR2(가변문자열, *), CHAR(고정문자열)
--             예) 10자리 문자열, 고정일 때 : 가나다, 가나다...자 => 남은 자리수는 공간낭비
--             예) 10자리 문자열, 가변일 때 : 가나다, 가나다...자 => 남은 자리수는 공간낭비 안함
--             숫자 : NUMBER, (실수, 정수, *)
--             날짜 : DATE
--             기타 : CLOB, BLOB 등
-- 사용법 : TO_CHAR(날짜컬럼명, '날짜포맷')
-- 날짜포맷 : 예) 'YYYY-MM-DD HH24:MI:SS'
--            YYYY(4자리 년도), YY(2자리 년도)
--            MM(2자리 MONTH)
--            DD(2자리 DAY)
--            HH(1~12까지 시간, 2자리 HOUR)
--            HH24(1~24까지 시간, 2자리 HOUR)
--            MI(2자리 MINUTE)
--            SS(2자리 SECOND)
-- 1) TO_CHAR : 날짜 -> 문자형으로 바꾸는 함수
-- 사원 : EMPLOYEE
SELECT ENAME, HIREDATE, TO_CHAR(HIREDATE, 'YY-MM') AS 단축날짜,
       TO_CHAR(HIREDATE, 'YYYY-MM-DD HH24:MI:SS') AS 날짜
FROM EMPLOYEE;

-- 연습 1) 현재 날짜와 시간을 표현하세요(날짜 -> 문자열로 변환하세요)
-- 단 출력날짜포맷 예) 2011/05/01, 15:07:43  으로 출력하세요
-- 힌트) 현재날짜 : SYSDATE(날짜형)
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS')
FROM DUAL;

-- 2) 숫자형 -> 문자형으로 변환 : TO_CHAR()
-- 사용법 : TO_CHAR(숫자컬럼, '숫자포맷')
-- 숫자포맷 : 예) 'L999,999', 'L000,000'
--           L : 각 나라별 통화 기호를 자동으로 붙여줌(S/W 설치시 통화지정)
--           9 : 3자리씩 잡고 자리수가 모자라면 빈자리에 0을 채우지 않음 
--           0 : 3자리씩 잡고 자리수가 모자라면 빈자리에 0을 채워줌
--           , : 각 통화의 중간에 쉼표(,)를 자동으로 추가해줌
-- 예제 2) 급여를 출력하면서 통화기호를 (W, $ 등) 포함해서 출력하세요
SELECT ENAME, SALARY,
       TO_CHAR(SALARY, 'L999,999'),
       TO_CHAR(SALARY, 'L000,000')
FROM EMPLOYEE;

-- 3) 문자형 -> 날짜형으로 변환하는 함수
-- 사용법 : TO_DATE('날짜', '날짜포맷') => (참고) 날짜포맷 생략 가능
-- HIREDATE : 날짜형
SELECT ENAME, HIREDATE FROM EMPLOYEE
-- WHERE HIREDATE = '19810220'
WHERE HIREDATE = TO_DATE('19810220', 'YYYYMMDD');

-- 4) 문자형 -> 숫자로 변환하는 함수 : TO_NUMBER()
SELECT TO_NUMBER('100,000', '999,999') - TO_NUMBER('50,000', '999,999')
FROM DUAL;

-- 일반 함수들 
-- 1) NVL() : NULL -> 숫자[문자]로 변경하는 함수
-- 사용법 : NVL(NULL이 포함된 컬럼, 특정숫자[문자])
-- 상여금 컬럼 : COMMISSION (NULL 값이 포함됨)
-- 사원 : EMPLOYEE
SELECT ENAME, SALARY, COMMISSION,
       SALARY*12 + NVL(COMMISSION, 0) AS 연봉_보너스
FROM EMPLOYEE;

-- 2) DECODE / CASE WHEN 함수 : SQL에서 조건문 사용하는 함수 (중급)
-- 사용법 : DECODE(컬럼, 값1, '결과1',
--                      값2, '결과2',
--                      ...,         
--                       '기본결과') AS 부서명
-- 컬럼이 값1이면 결과1이 나오고, 값2면 결과2가 나오고
-- ... 모두 아니면 기본 결과가 화면에 출력됨
-- 예제 5) DECODE를 이용해서 부서명을 출력하세요
-- 10번 부서 '회계부', 20번 부서 '연구소', 30번 부서 '판매부', 40번 '운영부'
SELECT ENAME, DNO, DECODE(DNO, 10, '회계부',
                               20, '연구소',
                               30, '판매부',
                               40, '운영부',   
                               '디폴트') AS 부서명
FROM EMPLOYEE;

-- 예제 6) CASE WHEN 을 이용해서 부서명을 출력하세요
-- 10번 부서 '회계부', 20번 부서 '연구소', 30번 부서 '판매부', 40번 '운영부'
-- 조건식을 사용할 수 있다는 장점이 있다 (EX.DNO=10)
-- 사용법 : CASE WHEN 컬럼=값1 THEN '결과1'
--          WHEN 컬럼=값2 THEN '결과2'
--          ...
--          ELSE '기본결과'
--          END
--  컬럼이 값1이면 결과1이 나오고, 값2이면 결과2가 나오고,
--  ... 모두 아니면 기본결과가 화면에 출력됨
SELECT ENAME, DNO, CASE WHEN DNO=10 THEN '회계부'
                        WHEN DNO=20 THEN '연구소'
                        WHEN DNO=30 THEN '판매부'
                        WHEN DNO=40 THEN '운영부'
                        ELSE '디폴트'
                        END AS 부서명
FROM EMPLOYEE;