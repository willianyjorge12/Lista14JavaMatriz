package exerciciosLista14;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE; // inicializa com o menor valor possível

        // Leitura dos valores da matriz
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j]; // atualiza maior valor
                }
            }
        }

        // Exibe o maior valor encontrado
        System.out.println("\nO maior valor da matriz é: " + maior);

        scanner.close();
    }
}
