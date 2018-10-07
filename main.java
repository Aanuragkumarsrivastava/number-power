import java.util.Scanner;

//printing the square ,cube and 4thsquare of the number
public class Main 
{

public static void main(String[] args) 
	{
    
	Scanner input = new Scanner(System.in);

	System.out.println("enter the number");
    
	int num = input.nextInt();
    
	int a = num*num;
    
	int b = num*num*num;
    
	double c = Math.pow(num,4);
    
	System.out.println("powers are\n"+a+"\n"+b+"\n"+c);
 
	}

}
