
public class Calculator {
	int add(int i, int j) {
		return i + j;
	}
	public static void main(String[] arg)
	{
		Calculator cal = new Calculator();
		System.out.println(cal.add(1,2));
	}
}
