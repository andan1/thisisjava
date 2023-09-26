package Ch08.sec13.봉인된인터페이스;

public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
