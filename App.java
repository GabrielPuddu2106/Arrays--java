import java. util. Scanner;

public class App{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        // DECLARACION DE MATRIZ A

        System.out.println("Cantidad de  filas Matriz A : ");
        int CantFilas1 = lector.nextInt();

        System.out.println("Cantidad de columnas A : ");
        int CantColumnas1 = lector.nextInt();
        int[][] matrizA = new int [CantFilas1][CantColumnas1];

        // DECLARACION DE MATRIZ B

        System.out.println( "Cantidad de filas Matriz B: ");
        int CantFilas2 = lector.nextInt();

        System.out.println("Cantidad de columnas Matriz B: ");
        int CantColumnas2 = lector.nextInt();
        int [][] matrizB = new int [CantFilas2][CantColumnas2];

        System.out.println("Ingrese los elementos de la matriz A: ");
        for (int i = 0; i< matrizA.length; i++) { //Para las filas 
            for ( int j = 0; j < matrizA[i].length; j++){ //Para las columnas de cada filas

            }
        
        
        }
    }
}
