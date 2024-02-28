// 02_optional_nullish.js
// TODO: 옵셔널 널리쉬

// 예제 : user 속성을 출력하세요.
let user = null;

// 과거 코딩 : 코딩했다 망각하고 속성을 출력함
// if(user != null){
// console.log(`user 는 ${user.address}`);
// }
// TODO: 코딩 간략화(효율성 증가)
// TODO: 사용법 : 객체명?.속성
// TODO: 객체가 null일 경우 undefined로 강제 변경(null 에러 방지)
console.log(`user 는 ${user?.address}`);