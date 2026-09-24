/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de
40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva
um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário
total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas.
*/
package ListaExtra;

import java.util.Scanner;

public class QlistaDec3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double hrt, vhr, sala,desc, valp, dif,mes;
		
		System.out.println("quanto você ganha por hora ?");
		vhr = leia.nextDouble();
		
		System.out.println("quantos horas por semana você ganha?");
		hrt = leia.nextDouble();
		
		System.out.println("quantos dias tem esse mês?");
		mes = leia.nextDouble();
		
		sala = (vhr *hrt * mes);
		if (hrt > 40);
		

	}

}
