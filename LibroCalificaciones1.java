import java.util.Scanner;

public class LibroCalificaciones1{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);


        System.out.println("Cantidad de estudiantes: ");
        int CantidadEstudiantes = lector.nextInt();

        while (CantidadEstudiantes <= 0) {
            System.out.println("No puede ingresar valores menores o igualesa 0");
            System.out.println("Cantidad de estudiantes : ");
            CantidadEstudiantes = lector.nextInt();          
        }


        System.out.println("Cantidad de notas: ");
        int CantidadNotas = lector.nextInt();

        while (CantidadNotas <= 0 && CantidadNotas>100) {
            System.out.println("No puede ingresar valores menores o igualesa 0");
            System.out.println("Cantidad de notas: ");
            CantidadNotas = lector.nextInt();          
        }

        int [] notas = new int[CantidadNotas];
        int [] estudiantes = new int[CantidadEstudiantes];

         System.out.println("Ingrese las notas de los  estudiantes");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante[" + (i+1) + "] = ");
            estudiantes[i] = lector.nextInt();
          
        }

         for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + "    " +notas[i]);

              if(  estudiantes[i]>0 && estudiantes[i]<59){
                System.out.println("Reprobado");
            }if ( estudiantes[i]>60 && estudiantes[i]<69){
                System.out.println("Regular");
            }else ( estudiantes[i]>70 &&  estudiantes[i]<79){
                System.out.println("Bueno");
            } if(  estudiantes[i]>80 && estudiantes[i]<89){
                System.out.println("Muy bueno ");
            }if( estudiantes[i] >90 && estudiantes[i]<=100){
                System.out.println("Excelente");
            }

        }
        
        lector.close();










    }
}