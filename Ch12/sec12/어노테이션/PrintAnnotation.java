package Ch12.sec12.어노테이션;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
// 적용 대상 : METHOD
// 유지 정책 : RUNTIME
// value 속성 : 선의 종류
// number 속성 : 출력 횟수