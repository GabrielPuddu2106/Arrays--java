import java.util.Scanner;

public class Arreglos{

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Cantidad de notas ");
        int CantidadNotas = lector.nextInt();

        while (CantidadNotas <=0 ) {
            System.out.println("No puede ingresar valores menores o = 0");
            System.out.println("Cantidad de notas: ");
            CantidadNotas = lector.nextInt();
        }
        int [] notas = new int[CantidadNotas ];
        int sumaNotas = 0;
        //Arrays
        System.out.println("INGRESE LAS NOTAS DEL GRUPO : ");
        for (int i = 0; i< notas.length; i++) {
            System.out.println("Notas ["+ i+1 +"]");
            notas[i] = lector.nextInt();
        }
        lector.close();
    }
}