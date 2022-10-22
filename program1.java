import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        double a , b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter 1st the num");
        a = scanner.nextDouble();
        System.out.print("enter 2nd the num");
        b = scanner.nextDouble();
        System.out.print("enter  the operator(+, -, *, /):");
        String operator = scanner.next() ;
        scanner.close();
     
        switch(operator)
        {       
        
        case "+":
                double sum=a+b;
                System.out.println(a+" "+operator+" "+b+" : "+sum);
                break;

       case "-":
    	   double diff =a-b;
    	   System.out.println(a+" "+operator+" "+b+" : "+diff);
                break;

        case "*":
        	 double prod=a*b;
        	 System.out.println(a+" "+operator+" "+b+" : "+prod);
                break;

        case "/":
        	 double div=a/b;
        	 System.out.println(a+" "+operator+" "+b+" : "+div);
                break;

                default:
                  System.out.println("You have entered wrong operator");


        }   
             




    }
}


        
    




