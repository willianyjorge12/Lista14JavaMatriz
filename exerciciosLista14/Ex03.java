package exerciciosLista14;
import java.util.Scanner;
public class Ex03 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[2][2];
	        int soma = 0;

	        // Leitura dos elementos da matriz
	        System.out.println("Digite os elementos da matriz 2x2:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();
	                soma += matriz[i][j];
	            }
	        }

	        // Exibir a soma dos elementos
	        System.out.println("\nA soma de todos os elementos da matriz é: " + soma);

	        scanner.close();
	    }
}
