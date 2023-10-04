package Ch12.sec12.어노테이션;

public class Annotation {

}
// 어노테이션 : 코드에서 @로 작성되는 요소
// 컴파일 시 사용하는 정보 전달 ex) @Override
// 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보 전달
// 실행 시 특정 기능을 처리할 때 사용하는 정보 전달
// 인터페이스를 정의하는 것과 유사
// 정의 : public @interface AnnotationName {}
// 사용 : @AnnotationName

// 어노테이션 적용 대상
// TYPE : 클래스, 인터페이스, 열거 타입
// ANNOOTATION_TYPE : 어노테이션
// FIELD : 필드
// CONSTRUCTOR : 생성자
// METHOD : 메소드
// LOCAL_VARIABLE : 로컬 변수
// PACKAGE : 패키지

// 어노테이션 유지 정책 : 언제까지 유지할 것인지를 지정
// SOURCE : 컴파일 할 때 적용 / 컴파일된 후에 제거
// CLASS : 메모리로 로딩할 때 적용 / 메모리로 로딩된 후에 제거
// RUNTIME : 실행할 때 적용 / 계속 유지됨

// 어노테이션 설정 정보 이용
// isAnnotationPresent(AnnotationName.class) : 지정한 어노테이션이 적용되었는지 여부
// getAnnotation(AnnotationName.class) : 지정한 어노테이션이 적용되어 있으면 어노테이션 리턴, 아니면 null 리턴
// getDeclaredAnnotations() : 적용된 모든 어노테이션을 리턴