// D_AttributeExam.vue
// 연습 : 1개의 속성 바인딩 변수를 이용해서 이미지를 화면에 출력하세요 
//  바인딩변수명 : imgSrc
//  바인딩변수값 : img/paris.jpg
// 결과 : 이미지출력
<template>
  <div>
    연습
    <img :src="imgSrc" alt="Paris">
  </div>
</template>

<script>
export default {
    data() {
        return {
            imgSrc: require('@/assets/img/paris.jpg')
        }
    },
}
</script>

<style>

</style>