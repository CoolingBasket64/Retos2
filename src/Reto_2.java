import java.util.Scanner;

public class Reto_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cant, gana=0;;

        System.out.println("Ingrese el número de competidores: ");
        cant = leer.nextInt();

        String[] nombre = new String[cant];
        double[] tiempo = new double[cant];


        for (int i = 0; i < cant; i++) {
            System.out.println("Competidor "+(i + 1)+"\nNombre: ");
            nombre[i] = leer.next();
            System.out.println("Tiempo: ");
            tiempo[i] = leer.nextDouble();
        }
        
         System.out.println("Nombres y tiempos de los competidores:");

         for (int i = 0; i < cant; i++) {
             System.out.println(nombre[i] + ": " + tiempo[i] + " segundos");
         }
         
       
         for (int i = 1; i < cant; i++) {
             if (tiempo[i] < tiempo[gana]) {
                gana=i;
             }
         }

        
            System.out.println("El ganador es " + nombre[gana] + " con un tiempo de " + tiempo[gana] + " segundos.");


        leer.close();
    }
}
