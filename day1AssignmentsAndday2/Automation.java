package week3.day1AssignmentsAndday2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void selenium() {
		System.out.println("I am From TestTool =>  Inferface");
		
	}

	public void java() {
		System.out.println("I am From Language => Interface");
		
	}

	@Override
	void python() {
		System.out.println("I am from MultipleLanguage => abstract class");
		
	}

	@Override
	void ruby() {
		System.out.println("I am from MultipleLanguage => abstract class");
	}
  public static void main(String[] args) {
	Automation a = new Automation();
	a.python();
	a.ruby();
	a.selenium();
	a.java();
	
}
}
