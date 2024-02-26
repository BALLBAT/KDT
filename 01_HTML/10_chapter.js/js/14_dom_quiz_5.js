// 14_dom_quiz_5.js
function showDetail(){
    let show = document.querySelector("#desc");
    show.style.display = "block";

    let btt = document.querySelector("#open");
    btt.style.display = "none";
}

function hideDetail(){
    let cls = document.querySelector("#desc");
    cls.style.display = "none";
    
    let btt = document.querySelector("#open");
    btt.style.display = "block";
}