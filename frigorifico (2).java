import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Mantidas as suas variáveis originais (ajustando o tamanho dos vetores para suportar mais fornecedores se necessário)
        int quantF; 
        int i = 0; 
        int p = 0; 
        double soma = 0; 
        double pesoT = 0;
        
        double qb[] = new double[100];    // Quantidade de bois por fornecedor
        double kgB[] = new double[100];   // Peso TOTAL dos bois de cada fornecedor
        double media[] = new double[100];  // Média de peso por fornecedor
        
        // Novas variáveis necessárias para os novos requisitos (menor média e boi mais pesado)
        int fornecedorMenorMedia = 1;
        double menorMedia = Double.MAX_VALUE;
        
        int fornecedorBoiMaisPesado = 1;
        double pesoBoiMaisPesado = 0;

        System.out.println("Há quantos fornecedores hoje?");
        quantF = sc.nextInt();
        
        for(int forn = 1; forn <= quantF; forn++) {
            System.out.println("Quantos bois trouxe? fornecedor " + forn);
            qb[i] = sc.nextDouble();
            
            double pesoAcumuladoFornecedor = 0;
            
            // Um laço para registrar o peso de CADA boi desse fornecedor
            for(int b = 1; b <= qb[i]; b++) {
                System.out.println("e qual o peso do animal " + b + "? fornecedor " + forn);
                double pesoAtual = sc.nextDouble();
                pesoAcumuladoFornecedor += pesoAtual;
                
                // IF/ELSE para verificar se este é o boi mais pesado do dia
                if(pesoAtual > pesoBoiMaisPesado) {
                    pesoBoiMaisPesado = pesoAtual;
                    fornecedorBoiMaisPesado = forn;
                }
            }
            
            // Guarda o peso total que esse fornecedor trouxe
            kgB[p] = pesoAcumuladoFornecedor;
            
            i++;
            p++;
        }
        
        // Calcula as médias e já descobre quem tem a menor média
        for(int TM = 0; TM < quantF; TM++) {
            media[TM] = (kgB[TM] / qb[TM]);
            
            // IF para encontrar a menor média
            if(media[TM] < menorMedia) {
                menorMedia = media[TM];
                fornecedorMenorMedia = TM + 1;
            }
        }
        
        // Calcula a quantidade geral de bois (usando quantF para limitar o vetor)
        for(int SB = 0; SB < quantF; SB++){
            soma += qb[SB];
        }
        
        // Calcula o peso total geral recebido no dia
        for(int Tp = 0; Tp < quantF; Tp++) {
            pesoT += kgB[Tp];
        }
        
        // --- RELATÓRIO FINAL ---
        System.out.println("\n= retatorio =");
        System.out.println("Quantidade geral de bois recebidos: " + soma);
        System.out.println("Peso total de bois recebidos: " + pesoT + " kg");
        System.out.println("-");
        
        // Mostra a média de cada um
        for(int forn = 1; forn <= quantF; forn++) {
            System.out.println("Média de peso dos bois do fornecedor " + forn + ": " + media[forn-1] + " kg");
        }
        
        System.out.println("-");
        System.out.println("Fornecedor com a menor média de peso: Fornecedor " + fornecedorMenorMedia + " (Média: " + menorMedia + " kg)");
        System.out.println("Fornecedor que entregou o boi mais pesado: Fornecedor " + fornecedorBoiMaisPesado + " (Peso do boi: " + pesoBoiMaisPesado + " kg)");
        

    }
}