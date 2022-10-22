package programs;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		System.out.println("enter the size of the array ");
		int size = scn.nextInt() ;
		int [] a = new int[size] ;
		System.out.println("enter the elements");
		for(int i=0 ; i<a.length ; i++) {
			a[i] = scn.nextInt() ;
		}
		
		for(int i=1 ; i<=9 ; i++) 
		{
			int count = 0 ;
			for(int j=0 ; j<a.length ; j++) {
				if(a[j] % i == 0 ) {
					count++ ;
				}
			}
			System.out.print(i + ":" + count+ " ");
		}
	}

}
