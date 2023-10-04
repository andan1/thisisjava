package Ch12.sec03.Object클래스;

public record Member1(String id, String name, int age) {
}
// 레코드 선언 : 데이터 전달을 위한 DTO를 작성할 때 반족적으로 사용되는 코드를 줄이기 위해
// private final 필드가 자동 생성되고, 생성자 및 Getter 메소드가 자동으로 추가
// hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동으로 추가