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
// =====================================================
        // 3. DETERMINAR MAYOR Y MENOR
        // =====================================================
        System.out.println();
        System.out.println("======================================");
        System.out.println("3. MAYOR Y MENOR");
        System.out.println("======================================");

        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);

        // =====================================================
        // 4. IDENTIFICAR MULTIPLOS DE X
        // =====================================================
        System.out.println();
        System.out.println("======================================");
        System.out.println("4. MULTIPLOS DE UN NUMERO X");
        System.out.println("======================================");

        int x;

        do {
            System.out.print("Ingrese el numero X (diferente de 0): ");
            x = teclado.nextInt();

            if (x == 0) {
                System.out.println("X no puede ser 0.");
            }
        } while (x == 0);

        boolean hayMultiplos = false;

        System.out.println("Multiplos de " + x + " encontrados:");

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % x == 0) {
                System.out.println(
                    "El numero " + vector[i] +
                    " es multiplo de " + x +
                    " y esta en la posicion " + i + "."
                );
                hayMultiplos = true;
            }
        }

        if (!hayMultiplos) {
            System.out.println(
                "No hay multiplos de " + x + " en el vector."
            );
        }

        // =====================================================
        // 5. CALCULAR LA SUMA TOTAL
        // =====================================================
        System.out.println();
        System.out.println("======================================");
        System.out.println("5. SUMA TOTAL");
        System.out.println("======================================");

        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        System.out.println("Suma total de los valores: " + suma);

               // =====================================================
        // 6. PROMEDIO Y NUEVO VECTOR
        // =====================================================
        System.out.println();
        System.out.println("======================================");
        System.out.println("6. VALORES POR ENCIMA DEL PROMEDIO");
        System.out.println("======================================");

        // El vector tiene 16 posiciones, pero la posicion 0 no se utiliza.
        // Por eso dividimos entre 15, que es la cantidad de numeros ingresados.
        double promedio = (double) suma / 15;

        System.out.println("Promedio: " + promedio);

        // Primero contamos cuantos valores estan por encima del promedio
        int cantidadMayores = 0;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > promedio) {
                cantidadMayores++;
            }
        }

        if (cantidadMayores == 0) {

            System.out.println(
                "No hay numeros mayores que el promedio."
            );

        } else {

            // Crear el nuevo vector con el tamaño exacto
            int[] vectorMayorPromedio = new int[cantidadMayores];

            int posicion = 0;

            // Llenar el nuevo vector
            for (int i = 1; i < vector.length; i++) {

                if (vector[i] > promedio) {
                    vectorMayorPromedio[posicion] = vector[i];
                    posicion++;
                }
            }

            System.out.println(
                "Vector con numeros por encima del promedio:"
            );
            mostrarVector(vectorMayorPromedio);

            System.out.println(
                "Cantidad de numeros por encima del promedio: "
                + cantidadMayores
            );
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println("Programa finalizado correctamente.");
        System.out.println("======================================");

        teclado.close();
    }

    // =========================================================
    // METODO PARA MOSTRAR CUALQUIER VECTOR
    // =========================================================
    public static void mostrarVector(int[] vector) {

        System.out.print("[ ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }
}

}
