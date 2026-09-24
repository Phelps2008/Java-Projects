package ListaK;

import java.util.Scanner;

public class K1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num;
	     
	    System.out.println("qual o numero que você quer iniciar a contagem ?");
	    num = sc.nextInt();
	    
	    do {
	    	num++;
	    	System.out.println(num);
	    }
	    
	     while(num <= 99 && num >= 1);
	     
	    	 System.out.println(num);
	     
	    System.out.println("yeah");
	    
	    do {
	    	num--;
	    		System.out.println(num);
	    }
	    
	     while(num <= 99 && num >= 1);
	     
	    	 System.out.println(num);
 }
}
