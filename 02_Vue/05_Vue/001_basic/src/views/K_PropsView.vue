// K_PropsView.vue
<template>
    <div>
        예제
        <!-- TODO: Props : 자식컴포넌트로 데이터 전달하기 -->
        <!-- TODO: 사용법 : <자식컴포넌트 : 자식바인딩 속성="부모바인딩속성"> -->
        <K_TodoItemVue :list="list" />
    </div>
</template>

<script>
// 자식 컴포넌트 import
import K_TodoItemVue from '../components/K_TodoItem.vue'

export default {
    data() {
        return {
            list: "삼겹살"
        }
    },
    // TODO: 사용할 자식 컴포넌트 정의
    components: {
        K_TodoItemVue
    }
}
</script>

<style>
    
</style>