package Desafio;
import javax.swing.JOptionPane;
public class vila {

	

	    public static void main(String[] args) {
	        int totalEleitores = 0;
	        int votosChaves = 0;
	        int votosKiko = 0;
	        int votosMadruga = 0;
	        int somaIdades = 0;
	        int somaIdadesChaves = 0;
	        int somaIdadesKiko = 0;
	        int somaIdadesMadruga = 0;
	        while (true) {
	            String sexo = JOptionPane.showInputDialog("Informe o sexo do eleitor (M/F), ou C para cancelar:");
	            if (sexo == null || sexo.equalsIgnoreCase("C")) {
	                break;
	            }
	            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
	                JOptionPane.showMessageDialog(null, "Sexo inválido. Tente novamente.");
	                continue;
	            }
	            String idadeStr = JOptionPane.showInputDialog("Informe a idade do eleitor:");
	            if (idadeStr == null) {
	                break;
	            }
	            int idade;
	            try {
	                idade = Integer.parseInt(idadeStr);
	                if (idade <= 0) {
	                    JOptionPane.showMessageDialog(null, "Idade inválida. Tente novamente.");
	                    continue;
	                }
	            } catch (Exception e) {
	                JOptionPane.showMessageDialog(null, "Idade inválida. Tente novamente.");
	                continue;
	            }
	            String voto = JOptionPane.showInputDialog("Informe o candidato escolhido:\n1 - Chaves\n2 - Kiko\n3 - Seu Madruga");
	            if (voto == null) {
	                break;
	            }
	            if (voto.equals("1")) {
	                votosChaves++;
	                somaIdadesChaves += idade;
	            } else if (voto.equals("2")) {
	                votosKiko++;
	                somaIdadesKiko += idade;
	            } else if (voto.equals("3")) {
	                votosMadruga++;
	                somaIdadesMadruga += idade;
	            } else {
	                JOptionPane.showMessageDialog(null, "Candidato inválido. Tente novamente.");
	                continue;
	            }
	            totalEleitores++;
	            somaIdades += idade;
	        }
	        if (totalEleitores == 0) {
	            JOptionPane.showMessageDialog(null, "Nenhum eleitor pesquisado.");
	            System.exit(0);
	        }
	        double percChaves = (votosChaves * 100.0) / totalEleitores;
	        double percKiko = (votosKiko * 100.0) / totalEleitores;
	        double percMadruga = (votosMadruga * 100.0) / totalEleitores;
	        double mediaIdades = (double) somaIdades / totalEleitores;
	        double mediaIdadesChaves = votosChaves > 0 ? (double) somaIdadesChaves / votosChaves : 0;
	        double mediaIdadesKiko = votosKiko > 0 ? (double) somaIdadesKiko / votosKiko : 0;
	        double mediaIdadesMadruga = votosMadruga > 0 ? (double) somaIdadesMadruga / votosMadruga : 0;
	        String resultado = "Total de eleitores: " + totalEleitores + "\n";
	        if (votosChaves >= votosKiko && votosChaves >= votosMadruga) {
	            resultado += "1º Chaves - " + votosChaves + " votos\n";
	            if (votosKiko >= votosMadruga) {
	                resultado += "2º Kiko - " + votosKiko + " votos\n";
	                resultado += "3º Seu Madruga - " + votosMadruga + " votos\n";
	            } else {
	                resultado += "2º Seu Madruga - " + votosMadruga + " votos\n";
	                resultado += "3º Kiko - " + votosKiko + " votos\n";
	            }
	        } else if (votosKiko >= votosChaves && votosKiko >= votosMadruga) {
	            resultado += "1º Kiko - " + votosKiko + " votos\n";
	            if (votosChaves >= votosMadruga) {
	                resultado += "2º Chaves - " + votosChaves + " votos\n";
	                resultado += "3º Seu Madruga - " + votosMadruga + " votos\n";
	            } else {
	                resultado += "2º Seu Madruga - " + votosMadruga + " votos\n";
	                resultado += "3º Chaves - " + votosChaves + " votos\n";
	            }
	        } else {
	            resultado += "1º Seu Madruga - " + votosMadruga + " votos\n";
	            if (votosChaves >= votosKiko) {
	                resultado += "2º Chaves - " + votosChaves + " votos\n";
	                resultado += "3º Kiko - " + votosKiko + " votos\n";
	            } else {
	                resultado += "2º Kiko - " + votosKiko + " votos\n";
	                resultado += "3º Chaves - " + votosChaves + " votos\n";
	            }
	        }
	        resultado += String.format("Percentual Chaves: %.2f%%\n", percChaves);
	        resultado += String.format("Percentual Kiko: %.2f%%\n", percKiko);
	        resultado += String.format("Percentual Seu Madruga: %.2f%%\n", percMadruga);
	        resultado += String.format("Média idade geral: %.2f\n", mediaIdades);
	        resultado += String.format("Média idade Chaves: %.2f\n", mediaIdadesChaves);
	        resultado += String.format("Média idade Kiko: %.2f\n", mediaIdadesKiko);
	        resultado += String.format("Média idade Seu Madruga: %.2f\n", mediaIdadesMadruga);
	        JOptionPane.showMessageDialog(null, resultado);
	    }
}
	