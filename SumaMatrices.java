import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[][] matrizResultante = new int[3][3];

        // DECLARACION DE MATRIZ A

        System.out.println("INGRESE LA CANTIDAD DE FILAS DE LA MATRIZ A");
        int CanFilas1 = lector.nextInt();

        System.out.println("INGRESE LA CANTIDAD DE COLUMNAS DE LA MATRIZ A");
        int CantColumnas1 = lector.nextInt();
        int[][] matrizA = new int[CanFilas1][CantColumnas1];

        // DECLARACION DE MATRIZ B

        System.out.println("INGRESE LA CANTIDAD DE FILAS DE LA MATRIZ B");
        int CantFilas2 = lector.nextInt();

        System.out.println("INGRESE LA CANTIDAD DE COLUMNAS DE LA MATRIZ B");
        int CantColumnas2 = lector.nextInt();
        int[][] matrizB = new int[CantFilas2][CantColumnas2];

        // INGRESO DE ELEMENTOS DE AMBAS MATRICES

        System.out.println("Ingrese los elementos de la matriz A: ");
        for (int i = 0; i < matrizA.length; i++) { // Para las filas
            for (int j = 0; j < matrizA[i].length; j++) { // Para las columnas de cada filas
                System.out.print("MatrizA [" + i + "] [" + j + "] :");
                matrizA[i][j] = lector.nextInt();

            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.println("MatrizB [" + i + "][" + j + "] :");
                matrizB[i][j] = lector.nextInt();
            }
        }

        // OPERACION
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizResultante[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA.length; j++) {
                System.out.println("[" + matrizA[i][j] + "]");
            }
            if (i == 1) {
                System.out.println("  +  ");
            } else {
                System.out.println("     ");
            }

            for (int j = 0; j < matrizB.length; j++) {
                System.out.println("[" + matrizB[i][j] + "]");
            }
            if (i == 1) {
                System.out.println("   =   ");
            } else {
                System.out.println("      ");
            }
            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.println("[" + matrizResultante[i][j] + "]");

            }
            System.out.println("");
        }

    }

}
