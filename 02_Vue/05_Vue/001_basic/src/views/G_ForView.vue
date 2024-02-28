// G_ForView.vue
<template>
<!-- TODO: 반복문 예제 -->
    <div>
        <ul>
            <!-- TODO: 사용법 : <태그 v-for="(변수명, 변수명2) in 배열" :key="변수명2"> {{ 변수명 }} {{ 변수명2 }} </태그> -->
            <!-- TODO: 사용법 : 변수명 : 배열의 값, 변수명2 : 배열의 인덱스 번호 -->
            <li v-for="(data, index) in fruits" :key="index">{{data}} {{index}}</li>
        </ul>
    </div>
</template>

<script>
export default {
    data() {
        return {
            fruits : ["딸기","오렌지","사과","포도"],
        }
    },
}
</script>

<style>
    
</style>