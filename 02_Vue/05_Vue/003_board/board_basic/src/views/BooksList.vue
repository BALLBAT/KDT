// BooksList.vue(연습) // vueInit
<template>
  <div>
    <!-- 연습) 부트스트랩 테이블에 books.json 데이터를 반복문을 이용해서 출력하세요 -->
    <!-- TODO: 테이블 : ctrl + alt + l -->
    <table class="table">
      <!-- TODO: 테이블 제목 -->
      <thead>
        <tr>
          <!-- TODO: 1열 : th 태그(굵은글씨) -->
          <th scope="col">번호(id)</th>
          <th scope="col">제목(title)</th>
          <th scope="col">출판사(publisher)</th>
          <th scope="col">저자(author)</th>
          <th scope="col">재고(stock)</th>
        </tr>
      </thead>
      <!-- TODO: 테이블 본문 -->
      <!-- TODO: 사용법 : v-for="(data, index) in 배열" :key="index" -->
      <tbody v-for="(data, index) in books" :key="index">
        <!-- TODO: 1행 : tr 태그 -->
        <tr>
          <!-- TODO: 1열 : td 태그 -->
          <td>{{ data.id }}</td>
          <td>{{ data.title }}</td>
          <td>{{ data.publisher }}</td>
          <td>{{ data.author }}</td>
          <td>{{ data.stock }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
// TODO: 1) BooksService.js 에 임포트 (why? getAll() 함수사용)
// TODO: 2) 빈 배열 속성 준비 : books 배열 정의 (why? 결과를 담기위해)
// TODO: 3) getAll() 함수를 실행할 뷰 함수(methods) 정의 : retrieveBooks()
// TODO: 4) mounted() 함수 정의 : 화면이 뜰때 retrieveBooks() 자동실행하게 함
import BooksService from "../services/BooksService";

export default {
  data() {
    return {
      books: [], // 빈 배열
    };
  },
  methods: {
    // TODO: getAll() 함수를 실행할 뷰 함수(methods) 정의
    async retrieveBooks() {
      try {
        let response = await BooksService.getAll(); // books.json 내용 가져오기
        // 콘솔로 내용 출력
        // TODO: response.data == books.json 내용
        console.log(response.data);
        // data 바인딩 속성 : books
        this.books = response.data.books;
      } catch (e) {
        console.log(e); // 에러발생하면 콘솔로 출력
      }
    },
  },
  mounted() {
    this.retrieveBooks(); // 화면이 뜰때 자동실행됨
  },
};
</script>
<style lang=""></style>