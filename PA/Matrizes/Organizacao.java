package Matrizes;

public class Organizacao {

	public static void main(String[] args) {
		        int[] numeros = {5, 2, 9, 1, 3};

		        // --- Algoritmo Bubble Sort ---
		        // O primeiro laço garante que vamos repetir o processo para todos os elementos
		        for (int i = 0; i < numeros.length - 1; i++) {
		            // O segundo laço compara os vizinhos lado a lado
		            for (int j = 0; j < numeros.length - 1 - i; j++) {
		                
		                // Se o número atual for maior que o próximo, eles trocam de lugar
		                if (numeros[j] > numeros[j + 1]) {
		                    // Variável temporária para não perder o valor na troca
		                    int aux = numeros[j];
		                    numeros[j] = numeros[j + 1];
		                    numeros[j + 1] = aux;
		                }
		            }
		        }

		        // --- Imprimindo o vetor na raça (usando um laço) ---
		        System.out.print("[");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print(numeros[i]);
		            if (i < numeros.length - 1) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("]");
		        // Saída: [1, 2, 3, 5, 9]
		    }
	}