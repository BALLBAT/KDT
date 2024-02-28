// C_BindingExam.vue
// 연습 : 2개의 바인딩 변수를 이용해서 화면에 출력하세요
//    name    : 홍길동
//    hello : 안녕
// 결과 : 안녕 
//       홍길동
<template>
    <div>
      <br>
      {{hello}}
      <br>
      {{name}}
    </div>
</template>
<script>
export default {
    data() {
        return {
            name: "홍길동",
            hello: "안녕"
        }
    },
}
</script>
<style lang="">
    
</style>