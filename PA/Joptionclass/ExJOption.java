package desafio;

import javax.swing.JOptionPane;

public class ExJOption {
	public static void main(String[] args) {
		String nome, nMenorIdade = "";
		int idade, qAlunos, aluno = 1, sIdades = 0, mIdades, mIdade = 0;
		
		qAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos:",
				"ENTRADA", JOptionPane.QUESTION_MESSAGE));
		while (aluno <= qAlunos) {
			nome = JOptionPane.showInputDialog(null, "Digite seu nome:",
					"ENTRADA", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:",
					"ENTRADA", JOptionPane.QUESTION_MESSAGE));
			sIdades += idade;
			if (aluno == 1) {
				mIdade = idade;
				nMenorIdade = nome;
			}else if(idade < mIdade) {
				mIdade = idade;
				nMenorIdade = nome;
			}
			aluno++;
		}
		mIdades = (sIdades / qAlunos);
		JOptionPane.showMessageDialog(null, "Média idades: " + mIdades + 
				".\nMenor idade: " + mIdade +
				".\nNome: " + nMenorIdade +
				".\nTotal de alunos: " + qAlunos + ".",
				"SAÍDA", JOptionPane.PLAIN_MESSAGE);
	}
}