// 02_async_await.js
// node : (설치), js 비동기 코딩 가능
// TODO: 단점 : 1) 순서에 맞게 코딩 불가
// TODO: Promise 객체 정의 : 특징 : 결과가 올때까지 다른 실행을 보류함
// TODO: 사용법 : let 변수명 = new Promise(함수명()) : 함수의 결과가 올때까지 다음 실행을 보류함
let goSchool = new Promise((resolve, reject) => {
  // 2초 지연 함수 : Promise 객체에 넣음
  setTimeout(function () {
    console.log("학교에 도착했습니다.");
    // resolve() : 결과 성공했다는 확인 함수
    resolve();
  }, 2000);
});

// TODO: *)
// TODO: 사용법 : let 함수명 = async () => {await promise함수()};
// TODO: 참고) 예 : 은행에서 입금 결과를 확인 후 출금할 때
let myFunc = async () => {
  // 비동기 코딩
  try {
    // TODO: 결과 순서에 맞게 실행시킬 수 있음
    await goSchool; // Promise 객체 안에 함수가 실행되고 결과가 올때까지 기다림
    console.log("학교에서 코딩함"); // 결과를 받고 실행됨
  } catch (e) {
    console.log(e);
  }
};

myFunc();
