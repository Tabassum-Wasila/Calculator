import java.util.Scanner;

public class Calculate {
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	String str;
	while(true)
	{
		System.out.print(">");
		str = s.next();
		double first = Double.parseDouble(str);
		if(first == 0)
			break;
		str = s.next();
		if(str.charAt(0) == '+')
		{
				str = s.next();
				double second = Double.parseDouble(str);
				System.out.println(second + first);
		}
		else if(str.charAt(0) == '-')
		{
			str = s.next();
			double second = Double.parseDouble(str);
			System.out.println(first - second);
		}
		else if(str.charAt(0) == '*')
		{
			str = s.next();
			double second = Double.parseDouble(str);
			System.out.println(first * second);
		}
		else if(str.charAt(0) == '/')
		{
			str = s.next();
			double second = Double.parseDouble(str);
			System.out.println(first/second);
		}
		else if(str.charAt(0) == '^')
		{
			str = s.next();
			double second = Double.parseDouble(str);
			System.out.println(Math.pow(first, second));
		}
		else {
			str = s.next();
			System.out.println("Given operator is beyond the scope of this calculator.");
		}
	}
	System.out.println("Bye, now!");
}
}