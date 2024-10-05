
    package Recursion;

    import java.util.Scanner;

    public class ProgramasConRecursion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Elige una opcion:");
                System.out.println("1. Mostrar numeros desde el numero ingresado hasta 1");
                System.out.println("2. Mostrar numeros desde 1 hasta el numero ingresado");
                System.out.println("3. Mostrar la serie del numero ingresado hasta 1000");
                System.out.println("4. Mostrar la cantidad de digitos del numero ingresado");
                System.out.println("5. Mostrar el factorial del numero ingresado");
                System.out.println("6. Mostrar el N-esimo termino de la serie de Fibonacci");
                System.out.println("7. Calcular la division restando sucesivamente");
                System.out.println("8. Calcular la multiplicacion mediante sumas sucesivas");
                System.out.println("9. Invertir un texto ingresado");
                System.out.println("10. Mostrar el equivalente en binario del numero ingresado");
                System.out.println("0. Salir");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa un numero: ");
                        int num1 = scanner.nextInt();
                        mostrarDesdeHastaUno(num1);
                        break;
                    case 2:
                        System.out.println("Ingresa un numero: ");
                        int num2 = scanner.nextInt();
                        mostrarDesdeUnoHasta(num2, 1);
                        break;
                    case 3:
                        System.out.println(" Ingresa un numero menor que 10");
                        int num3 = scanner.nextInt();
                        if (num3 <= 10) {
                            System.out.println(" " + num3 + "" + num3 + " en " + num3 + ":");
                            generarSerie(num3, num3);
                        } else {
                            System.out.println("El numero debe ser menor o igual que 10.");
                        }
                        break;
                    case 4:
                        System.out.println("Ingresa un número: ");
                        int num4 = scanner.nextInt();
                        System.out.println("Cantidad de digitos: " + contarDigitos(num4));
                        break;
                    case 5:
                        System.out.println("Ingresa un numero mayor a 1: ");
                        int num5 = scanner.nextInt();
                        System.out.println("Factorial: " + factorial(num5));
                        break;
                    case 6:
                        System.out.println("Ingresa el valor de N: ");
                        int nFib = scanner.nextInt();
                        System.out.println("Fibonacci en N: " + fibonacci(nFib));
                        break;
                    case 7:
                        System.out.println("Ingresa el dividendo: ");
                        int dividendo = scanner.nextInt();
                        System.out.println("Ingresa el divisor: ");
                        int divisor = scanner.nextInt();
                        System.out.println("Resultado de la division: " + division(dividendo, divisor));
                        break;
                    case 8:
                        System.out.println("Ingresa el primer numero: ");
                        int a = scanner.nextInt();
                        System.out.println("Ingresa el segundo numero: ");
                        int b = scanner.nextInt();
                        System.out.println("Resultado de la multiplicacion: " + multiplicacion(a, b));
                        break;
                    case 9:
                        System.out.println("Ingresa un texto: ");
                        scanner.nextLine(); 
                        String texto = scanner.nextLine();
                        System.out.println("Texto invertido: " + invertirTexto(texto));
                        break;
                    case 10:
                        System.out.println("Ingresa un numero entero: ");
                        int numBin = scanner.nextInt();
                        System.out.println("Equivalente en binario: " + convertirABinario(numBin));
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no valida.");
                }
            } while (opcion != 0);

            scanner.close();
        }

        // Programa que pida un numero y muestre los números desde ese numero hasta el uno.
        public static void mostrarDesdeHastaUno(int num) {
            if (num > 0) {
                System.out.println(num);
                mostrarDesdeHastaUno(num - 1);
            }
        }

        // Programa que pida un numero y muestre los números desde uno hasta ese numero.
        public static void mostrarDesdeUnoHasta(int num, int inicio) {
            if (inicio <= num) {
                System.out.println(inicio);
                mostrarDesdeUnoHasta(num, inicio + 1);
            }
        }

        // Programa que pida un numero menor que 10 y muestre la serie de ese numero hasta el 1000.
        public static void generarSerie(int num, int incremento) {
            if (num > 1000) {
                return; 
            }
            System.out.println(num + " "); 
            generarSerie(num + incremento, incremento);
        }

        //Programa que pida un numero y muestre la cantidad de dígitos que contiene.
        public static int contarDigitos(int num) {
            if (num == 0) {
                return 0;
            } else {
                return 1 + contarDigitos(num / 10);
            }
        }

        //Programa que pida un numero positivo mayor a 1 y muestre el factorial de dicho numero.
        public static int factorial(int num) {
            if (num == 1) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }

        //Programa que pida un numero N y muestre el N-ésimo termino de la serie de fibonacci.
        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        //Programa que pida un numero N y calcule la división restando sucesivamente dicho numero.
        public static int division(int dividendo, int divisor) {
            if (dividendo < divisor) {
                return 0;
            } else {
                return 1 + division(dividendo - divisor, divisor);
            }
        }

        // Programa que pida un Numero N y calcule la multiplicación mediante las sumas sucesivas de dicho numero.
        public static int multiplicacion(int a, int b) {
            if (b == 0) {
                return 0;
            } else {
                return a + multiplicacion(a, b - 1);
            }
        }

        //Programa que pida un texto y muestre el texto invierta.
        public static String invertirTexto(String texto) {
            if (texto.isEmpty()) {
                return texto;
            } else {
                return invertirTexto(texto.substring(1)) + texto.charAt(0);
            }
        }

        //Programa que pida un numero entero y que muestre su equivalente en binario
        public static String convertirABinario(int num) {
            if (num == 0) {
                return "";
            } else {
                return convertirABinario(num / 2) + (num % 2);
            }
        }
    }
