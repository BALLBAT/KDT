// 12_dom_quiz_3.js
// params=80
function sum_avg(params, params2, params3) {
    let kor = document.querySelector("#kor")
    let eng = document.querySelector("#eng")
    let math = document.querySelector("#math")
    kor.innerHTML  = params;
    eng.innerHTML  = params2;
    math.innerHTML = params3;

    let sum = document.querySelector("#sum")
    sum.innerHTML = params + params2 + params3;

    let avg = document.querySelector("#avg");
    avg.innerHTML = (params + params2 + params3) /3;
}