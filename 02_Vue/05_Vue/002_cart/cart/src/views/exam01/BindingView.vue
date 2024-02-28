// BindingView.vue
<template>
    <div>
        <h1>{{product}}</h1>
        <p>I Love {{product}}</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            product: "Lamp",
        }
    },
}
</script>

<style>
    
</style>