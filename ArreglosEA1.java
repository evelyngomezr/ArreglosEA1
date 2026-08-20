import java.util.Scanner;

public class ArreglosEA1 {
    public class ArreglosEA1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // =====================================================
        // 1. CREAR Y LLENAR EL VECTOR
        // =====================================================
        int[] vector = new int[16];

        System.out.println("Manipulación de Vectores en Java");
        System.out.println("=====================================");
        System.out.println("=====================================");
        

        System.out.println("Ingrese 15 numeros enteros entre 10 y 100:");

for (int i = 1; i < vector.length; i++) {

            int numero;

            while (true) {
                System.out.print("Valor para la posicion " + i + ": ");
                numero = teclado.nextInt();

                if (numero >= 10 && numero <= 100) {
                    vector[i] = numero;
                    break;
                } else {
                    System.out.println("El numero esta fuera del rango.");
                    System.out.println("Debe ingresar un valor entre 10 y 100.");
                }
            }
        }

        // Mostrar el vector completo
        System.out.println();
        System.out.println("Vector ingresado:");
        mostrarVector(vector);

        // =====================================================
        // 2. BUSCAR UN VALOR EN EL VECTOR
        // =====================================================
        System.out.println();
        System.out.println("======================================");
        System.out.println("2. BUSQUEDA DE UN VALOR");
        System.out.println("======================================");

        System.out.print("Ingrese el numero que desea buscar: ");
        int valorBuscado = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscado) {
                System.out.println(
                    "El numero " + valorBuscado +
                    " se encuentra en la posicion " + i + "."
                );
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(
                "El numero " + valorBuscado +
                " no se encuentra en el vector."
            );
        }

}
