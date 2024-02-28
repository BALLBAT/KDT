// E_FormView.vue
<template>
    <div>
        <!-- TODO: 예제 : Form 양식(입력양식 예) input태그 등 -->
        <div>
            <label for="userId">아이디</label>
            <!-- TODO: input태그와 데이터 바인딩 사용법 : <input type="text" v-model="바인딩 속성"> -->
            <!-- TODO: 바인딩속성 : "값" -->
            <!-- TODO: 바인딩속성값이 변경되면 화면의 input태그값이 같이 변경되고,
            input 태그 값이 같이 변경되면 바인딩속성값도 변경됨 -->
            <input type="text" id="userId" v-model="userId">
            <!-- TODO: 패스워드 input 태그 -->
            <div>
                <label for="">비밀번호</label>
                <input type="password" v-model="passwd">
            </div>
            &nbsp;
            <!-- TODO: select 사용법 : <select v-moder="바인딩속성"><option>값</option></select> -->
            <select v-model="food">
                <option>불고기</option>
                <option>햄버거</option>
                <option>탕수육</option>
                <option>김밥</option>
            </select>
            &nbsp;
            <!-- TODO: radio 입력양식 -->
            <!-- TODO: 사용법 : <input type="radio" value="남" v-model="바인딩속성">값 -->
            <!-- TODO: 사용법 : <input type="radio" value="여" v-model="바인딩속성">값2 -->
            <input type="radio" value="남" v-model="gender">남
            <input type="radio" value="여" v-model="gender">여
            &nbsp;
            <!-- TODO: 나중에 확인 -->
            <input type="checkbox" value="trip" v-model="trip">여행
            <input type="checkbox" value="14" v-model="age">14세이상
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            userId: "",
            passwd: "",
            food: "",
            gender: "남",
            trip: true,
            age: true,
        }
    },
}
</script>
<style lang="">
    
</style>