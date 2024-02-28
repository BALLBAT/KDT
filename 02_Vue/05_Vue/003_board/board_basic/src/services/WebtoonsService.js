// WebtoonsService.js
import http from "../utils/HttpCommon";

// class 객체 정의 : es6 사용법
class WebtoonsService {
    // axios get 함수 정의
    getAll() {
        return http.get("/webtoons.json");
    }
}
// 객체 사용 : new WebtoonsService()
// TODO: 중요) 객체.함수명(), 객체.속성명
export default new WebtoonsService();