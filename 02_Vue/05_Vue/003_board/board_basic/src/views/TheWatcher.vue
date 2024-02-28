// TheWatcher.vue
// 참고) 뷰의 변수 감시 기능
<template>
    <div>
        <h2>입력문자 감시해서 alert 대화상자 띄우기</h2>
        <div id="app">
            <p>금지문자 : {{ ftext }}</p>
            <!-- 입력양식 : v-model -->
            <textarea v-model="inputText" cols="60" rows="20"></textarea>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            ftext: "안돼",    // TODO: 금지문자(금칙어)
            inputText: "안녕" // TODO: textarea 태그와 바인딩
        }
    },
    // 뷰의 바인딩 속성 감시기능 : inputText 속성 감시
    watch: {
        // TODO: 사용법 : watch:{ 바인딩속성: function(value){실행문} }
        inputText: function(value){
            // TODO: 1) value == 새로 입력된 문자열
            // TODO: 2) 문자열.indexOf(찾을문자열) :
            // TODO: => 찾을 문자열 있으면 그 위치의 인덱스번호를 가져오기, 없으면 -1
            let pos = value.indexOf(this.ftext);

            // TODO: 찾을 문자열(안돼)이 inputText에 있으면
            if(pos>-1){
                alert("금지문자가 입력되었습니다.");
            }
        }
    }
}
</script>

<style>
    
</style>