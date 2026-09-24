package Joptionclass;
import javax.swing.JOptionPane;
public class Joption2 {

	public static void main(String[] args) {
		String opcoes[] = {"DS", "ADM", "RH", "Sair"};
				int opc, contDs = 0, contAdm = 0, contRh = 0;
				//int qEntrevistados;
				
				//qEntrevistados = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de entrevistados:",
						//"ENTRADA", JOptionPane.QUESTION_MESSAGE));
				
				do {
					opc = JOptionPane.showOptionDialog(null, "Qual o curso de seu interesse?",
							"Pesquisa", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, 
							opcoes[0]);
					switch (opc) {
					case 0:
						contDs++;
						break;
					case 1:
						contAdm++;
						break;
					case 2:
						contRh++;
						break;
					}
				} while (opc != 3);
				JOptionPane.showMessageDialog(null, "DS: " + contDs + 
						"\nADM: " + contAdm + "\nRH: " + contRh);					
	}
}