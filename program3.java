import java.util.Scanner;

public class program3
{
	
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
      Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        int i=1;
      while(i<num*2)
        {
       if (num%2==0)
       {
    	   --num;
    	   System.out.print(i+ ",");
           i=i+2;

    	   
       }
       else {  
                System.out.print(i+",");
                i=i+2;
       }   
          
        }
        
    }
}

