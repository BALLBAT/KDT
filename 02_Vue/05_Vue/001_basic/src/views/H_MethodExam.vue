// H_MethodExam.vue
// 아래에 바인딩 변수가 2개 있습니다. 화면에 버튼을 클릭하면 alert을 이용해서 출력하세요
// name : 홍길동
// id   : hong
// 출력결과 : 홍길동hong
<template>
    <div>
        <button @click="clickBtn">클릭</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            name: "홍길동",
            id: "hong"
        }
    },
    methods: {
        clickBtn(){
            alert(this.name+this.id);
        }
    },
}
</script>

<style lang="">
    
</style>