package Ch06.sec11.final필드와상수;

public class Earth {
	// 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 상수 선언
	static final double EARTH_SURFACE_AREA;
	
	// 정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
// 상수 : 불변의 값
// 선언 : static final 타입 상수 = 초기값;
// 상수 이름은 모두 대문자