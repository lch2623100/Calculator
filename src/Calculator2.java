import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �Է� �� : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("�� ��° �Է� �� : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("���� : " + (first + second));
		System.out.println("���� : " + (first - second));
		System.out.println("���� : " + (first * second));
		System.out.println("������ : " + (first / second));
	}

} 
 
