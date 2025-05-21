package exerciciosLista14;
import java.util.Scanner;
public class Ex04 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];

	        // Leitura dos valores da matriz
	        System.out.println("Digite os valores da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        // Mostrar os elementos da diagonal principal
	        System.out.println("\nElementos da diagonal principal:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(matriz[i][i]);
	        }

	        scanner.close();
	    }
}
