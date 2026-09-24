 /* nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "ENTRADA", JOptionPane.QUESTION_MESSAGE);
    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:", "ENTRADA", JOptionPane.QUESTION_MESSAGE)); 
	JOptionPane.showMessageDialog(null,"Bem vindo! " + nome + ".\n Sua idade é: " + idade + " anos.", "SAÍDA", JOptionPane.PLAIN_MESSAGE); 
	
Utilizando JOptionPane, adapte o código em anexo, desenvolvido em aula, para solicitar ao usuário a quantidade de alunos,
 *  nome e idade de cada um. Ao final, apresentar a quantidade de alunos, a média das idades e a idade do mais novo.*/

 package Desafio;

 import javax.swing.JOptionPane;

 public class Desafio1 {
	 public static void main(String[] args) {
		 String nome, AmI = "";
			int idade, qAlunos, aluno = 1, sI = 0, mI, mIdade = 0;
			
			qAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos:",
					"ENTRADA", JOptionPane.QUESTION_MESSAGE));
			while (aluno <= qAlunos) {
				nome = JOptionPane.showInputDialog(null, "Digite seu nome:",
						"ENTRADA", JOptionPane.QUESTION_MESSAGE);
				idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:",
						"ENTRADA", JOptionPane.QUESTION_MESSAGE));
				sI += idade;
				
				if (aluno == 1) {
					mIdade = idade;
					AmI = nome;
				}else if(idade < mIdade) {
					mIdade = idade;
					AmI = nome;}
				
				aluno++;}
			
			mI = (sI / qAlunos);
			JOptionPane.showMessageDialog(null, "Média idades: " + mI + ".\nMenor idade: " + mIdade +".\nNome: " + AmI +".\nTotal de alunos: " + qAlunos + ".","SAÍDA", JOptionPane.PLAIN_MESSAGE);
		}
	}