// WebtoonsList.vue // vueInit
<template>
  <div>
    <!-- 연습) 부트스트랩 테이블에 webtoons.json 데이터를 반복문을 이용해서 출력하세요
        url : /webtoons
        TODO: img 태그 사용 : url넣기 <img :src="인터넷주소" />
      -->
    <table class="table">
      <!-- TODO: 테이블 제목 -->
      <thead>
        <tr>
          <!-- TODO: 1열 : th 태그(굵은글씨) -->
          <th scope="col">웹툰명(name)</th>
          <th scope="col">웹툰링크(link)</th>
          <th scope="col">이미지(img)</th>
          <th scope="col">신간여부(isUpdate)</th>
        </tr>
      </thead>
      <!-- TODO: 테이블 본문 -->
      <!-- TODO: 사용법 : v-for="(data, index) in 배열" :key="index" -->
      <tbody>
        <!-- TODO: 1행 : tr 태그 -->
        <tr v-for="(data, index) in webtoons" :key="index">
          <!-- TODO: 1열 : td 태그 -->
          <td>{{ data.name }}</td>
          <td><a :href="data.link">{{ data.link }} </a></td>
          <td><img :src="data.img" alt="웹툰이미지"> </td>
          <td>{{ data.isUpdate }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
// js 코딩
import WebtoonsService from "../services/WebtoonsService";

export default {
    data() {
        return {
            webtoons: [], // TODO: 빈배열 정의(결과 저장용)
        }
    },
    methods: {
        // 함수 정의 : retrieveWebtoons() : .getAll() 실행
        async retrieveWebtoons() {
            // 에러처리 : try{}catch(변수명){}
            try {
                // 실행문
                let response = await WebtoonsService.getAll(); // 프라미스 함수
                // 결과 출력 : response.data == json 데이터
                console.log(response.data);
                // 바인딩 배열 속성 : webtoons
                this.webtoons = response.data.webtoons;
            } catch (e) {
                console.log(e); // 에러 출력
            }
        }
    },
    mounted() {
        this.retrieveWebtoons(); // TODO: 화면이 뜰때 자동 실행됨
    },
};
</script>
<style lang=""></style>