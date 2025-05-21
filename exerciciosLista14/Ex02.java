package exerciciosLista14;
import java.util.Scanner;
public class Ex02 {
	  public static void main(String[] args) {
	        int[][] matriz = new int[4][4];

	        // Preencher a matriz com 1
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                matriz[i][j] = 1;
	            }
	        }

	        // Exibir a matriz formatada
	        System.out.println("Matriz 4x4 preenchida com 1:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
}
