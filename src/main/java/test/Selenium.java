package test;

public class Selenium {
	
	
	int j=20;

	public static void main(String[] args) {
		
		Selenium set=new Selenium();
		
		set.test();
		set.test1();

	}
	
	
	public void test() {	
		int i=10;
		System.out.println(i);
		System.out.println(j);
	}
	
	public void test1() {
		System.out.println(j);
	}

}
