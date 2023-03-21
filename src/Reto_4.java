import java.util.Scanner;

public class Reto_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int igual=0, iguales=0;

        int[][] numero = new int[3][3];


                   
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
              System.out.println("Digite el numero de la fila "+i+" y la columna "+j);
              numero[i][j] = leer.nextInt(); 
           }
        }

        System.out.println("Los numeros ingresados son: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(numero[i][j] + "\t");
            }
            System.out.println();
         }

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            if (numero[i][j]==numero[igual][iguales]){ 
                igual=i;
                iguales=j;
            }
         }
        }

                System.out.println("Los numeros que se repiten son "+numero[igual][iguales]);

    leer.close();
}
}