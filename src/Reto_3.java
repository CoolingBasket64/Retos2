import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[][] producto = new String[4][4];
        double[][] precios = new double[4][4];
        
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.println("Digite el nombre del producto en la fila "+i+" y la columna "+j);
                producto[i][j] = leer.next();
                System.out.println("Ingrese el precio del producto en la fila "+i+" y la columna "+j);
                precios[i][j] = leer.nextDouble();
            }
        }
        
        System.out.println("Catálogo de productos:");
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.println((i+1)+"- \t" + producto[i][j] + ":\t $" + precios[i][j]+("\t"));
            }
        }

        leer.close();

    }
}
