package exerciciosLista14;
import java.util.Scanner;
public class Ex08 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];

	        // Leitura da matriz
	        System.out.println("Digite os valores da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        // Calcula e exibe a soma dos elementos de cada linha
	        for (int i = 0; i < 3; i++) {
	            int somaLinha = 0;
	            for (int j = 0; j < 3; j++) {
	                somaLinha += matriz[i][j];
	            }
	            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
	        }

	        scanner.close();
	    }
}
