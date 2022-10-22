import java.util.Scanner;

public class program2
{
	
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
      Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        for(int a=1;a<=num*2;a=a+2)
        {
         
                System.out.print(a);
       
 
        }
        
    }
}
