package ListaJ;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int contador = 1 ,num;
		
		System.out.println("uau");
		num = SC.nextInt();
				
		while ((num >= 0) && (num <=99 ))	{
			num++;
			System.out.println("seu numero em ordem crescente : " + num);
		}
		System.out.println("uau");
		 while ((num <= 100 ) && (num >= 1))  {
			num--;
			System.out.println("seu numero em ordem decrescente : " + num);
		}
	}
}
