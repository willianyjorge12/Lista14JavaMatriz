package exerciciosLista14;
import java.util.Scanner;
public class Ex01 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];

	        // Leitura dos valores da matriz
	        System.out.println("Digite os elementos da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        // Exibição da matriz
	        System.out.println("\nMatriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
