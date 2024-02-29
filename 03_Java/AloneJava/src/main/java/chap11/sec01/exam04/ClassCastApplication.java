package chap11.sec01.exam04;

/**
 * packageName : chap11.sec01.exam04
 * fileName : ClassCastApplication
 * author : GGG
 * date : 2024-02-14
 * description : TODO: Class Cast Exception(예외==에러)
 * 요약 :
 * TODO: 1) 부모 클래스에 자식클래스 A 가 있는데 (다형성)
 *          => 자식클래스 B로 복원할 때 에러가 발생
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class ClassCastApplication {
//    전역함수
    public static void changeDog(Animal animal){
        Dog dog = (Dog)animal; // 다형성을 이용한 강제 형변환
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
//        매개변수의 다형성
        changeDog(dog); // 가능

//        매개변수의 다형성 : 에러 발생
        Cat cat = new Cat();
        changeDog(cat); // 에러 발생
    }
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
