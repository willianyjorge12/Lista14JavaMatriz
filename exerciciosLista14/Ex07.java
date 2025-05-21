package exerciciosLista14;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        int contadorPares = 0;

	        System.out.println("Digite os valores da matriz 4x4:");

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();

	                // Verifica se o número é par
	                if (matriz[i][j] % 2 == 0) {
	                    contadorPares++;
	                }
	            }
	        }

	        System.out.println("\nQuantidade de números pares na matriz: " + contadorPares);

	        scanner.close();
	    }
}
