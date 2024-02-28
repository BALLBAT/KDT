// ListExam.vue
<template>
  <div id="app">
    <!-- TODO: 카트(장바구니) 헤더바 -->
    <div class="nav-bar"></div>

    <!-- TODO: 장바구니 본문 -->
    <div class="product-display">
      <div class="product-container">
        <!-- TODO: 왼쪽 : 이미지(양말) -->
        <div class="product-image">
          <img :src="image" alt="양말" />
        </div>
        <!-- TODO: 오른쪽 : 설명글 -->
        <div class="product-info">
            <h1>{{product}}</h1>
            <!-- TODO: 조건문(if) : stock=true(false) -->
            <!-- TODO: 사용법 : <태그 v-if="조건식">문자열<태그> -->
            <p v-if="inStock==true">In Stock</p>
            <!-- TODO: 1) 반복문 예제 : details, variants(객체배열) -->
            <!-- TODO: 사용법 : v-for="(data, index) in 배열" :key="인덱스명" -->
            <ul v-for="(data, index) in details" :key="index">
                <li>{{ data }}</li>
            </ul>
            
            <!-- TODO: 2) 반복문 예제(객체배열) -->
            <!-- TODO: data == 객체, data.color == 객체속성 -->
            <ul v-for="(data, index) in variants" :key="index">
                <li>{{data.color}}</li>
            </ul>

            <!-- TODO: 연습 : sizes: ["10","20"] 바인딩속성을 이용해서
                    아래 ul태그에 반복문을 코딩하세요. -->
            <ul v-for="(data, index) in sizes" :key="index">
              <li>{{data}}</li>
            </ul>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
// js코딩
export default {
    data() {
        return {
            product: "Socks",
            image: require("@/assets/images/socks_green.jpg"),
            inStock: true, // 조건문에서 사용
            // TODO: 반복문 예제
            details: ["50% cotton", "30% wool", "20% polyster"],
            variants: [{
                id: 2234,
                color: "green"
            },
            {
                id: 2235,
                color: "blue"
            }],
            sizes: ["10", "20"],
        }
    },
};
</script>

<style></style>