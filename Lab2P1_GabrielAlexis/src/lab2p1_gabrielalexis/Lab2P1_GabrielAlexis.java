package lab2p1_gabrielalexis;

import java.util.Scanner;

public class Lab2P1_GabrielAlexis {

    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("Pulse 4 para salir");
        System.out.println("Eliga una opcion");
        opcion = input.nextInt();
        char resp;
        resp = 's';
        
            while (opcion >= 1 && opcion < 4) {
                while (resp == 's' || resp == 'S') {
                {
                    if (opcion == 1) {
                        char resp1 = 's';
                        while (resp1 == 's' || resp1 == 'S') {
                            int a, b, c;
                            System.out.println("Ingrese el valor a: ");
                            a = input.nextInt();
                            System.out.println("Ingrese el valor b: ");
                            b = input.nextInt();
                            System.out.println("Ingrese el valor c: ");
                            c = input.nextInt();
                            if (a < 0 || b < 0 || c < 0) {
                                System.out.println("Las longitudes no pueden ser negativas.");
                            } else if ((a + b > c) && (b + c > a) && (c + a > b)) {
                                System.out.println("Las longitudes formas un triangulo.");
                            } else {
                                System.out.println("Las longitudes no forman un triangulo.");
                            }
                            if (resp == 's' || resp == 'S') {
                                System.out.println("Desea ingresar mas valores: ");
                                resp1 = input.next().charAt(0);
                            }
                        }
                    } else if (opcion == 2) {
                        int opc_ejer2;
                        System.out.println("Calcular areas: ");
                        System.out.println("Ingrese la figura a la que desea ingrear el area: ");
                        System.out.println("1. Triangulo");
                        System.out.println("2. Rectangulo");
                        System.out.println("3. Circulo");
                        System.out.println("Opcion");
                        opc_ejer2 = input.nextInt();
                        char resp1 = 's';
                        while (resp1 == 's' || resp1 == 'S') {
                            if (opc_ejer2 == 1 || opc_ejer2 == 2) {
                                int base = 0, altura = 0;
                                System.out.println("Ingrese la altura : ");
                                altura = input.nextInt();
                                System.out.println("Ingrese la base: ");
                                base = input.nextInt();
                                if (opc_ejer2 == 2) {
                                    System.out.println("El area del rectangulo es de: " + base * altura);
                                } else if (opc_ejer2 == 1) {
                                    System.out.println("El area del triangulo es de: " + 0.5 * base * altura);
                                }
                            } else if (opc_ejer2 == 3) {
                                int radio = 0;
                                System.out.println("Ingrese el radio: ");
                                radio = input.nextInt();
                                double circulo = Math.PI * radio * radio;
                                System.out.println("El area del circulo es de: " + circulo);
                            } else {
                                System.out.println("Opcion incorrecta");
                            }
                            System.out.println("Desea volver a calcular el area de otra figura[s/n]");
                            resp1 = input.next().charAt(0);
                            if (resp1 == 's' || resp1 == 'S') {
                                System.out.println("Calcular areas: ");
                                System.out.println("Ingrese la figura a la que desea ingrear el area: ");
                                System.out.println("1. Triangulo");
                                System.out.println("2. Rectangulo");
                                System.out.println("3. Circulo");
                                System.out.println("Opcion");
                                opc_ejer2 = input.nextInt();
                            }
                        }

                    } else if (opcion == 3) {
                        char resp1 = 's';
                        while (resp1 == 's' || resp1 == 'S') {
                            int num;
                            System.out.println("Ingrese el numero a evaluar");
                            num = input.nextInt();
                            boolean par;
                            if (num % 2 == 0) {
                                par = true;
                            } else {
                                par = false;
                            }
                            boolean primo;
                            int i = 1;
                            int cont_div = 0;
                            while (i <= num) {
                                if (num % i == 0) {
                                    cont_div++;
                                }
                                i++;
                            }
                            if (cont_div > 2) {
                                primo = false;
                            } else {
                                primo = true;
                            }
                            if (par == true && primo == true) {
                                System.out.println(num + " es primo y par.");
                            } else if (par == false && primo == true) {
                                System.out.println(num + " el numero es primo e impar.");
                            } else if (par == true) {
                                System.out.println(num + " el numero es par.");
                            } else if (par == false) {
                                System.out.println(num + " el numero es impar.");
                            }
                            System.out.println("Desea ingresar otro numero[s/n]: ");
                            resp1 = input.next().charAt(0);
                            if (resp1 == 's' || resp1 == 'S') {
                                System.out.println("Ingrese el numero a evaluar");
                                num = input.nextInt();
                            }
                        }
                    }
                    System.out.println("Desea ingresar a otro opcion[s/n]: ");
                    resp = input.next().charAt(0);
                    if (resp == 's' || resp == 'S') {
                        System.out.println("1. Ejercicio 1");
                        System.out.println("2. Ejercicio 2");
                        System.out.println("3. Ejercicio 3");
                        System.out.println("Pulse 4 para salir");
                        System.out.println("Eliga una opcion");
                        opcion = input.nextInt();
                        if(opcion >= 1 && opcion < 4){
                            break;
                        }
                        break;
                    }
                   
                }
            }
        }
        System.out.println("Fin del programa");
    }//fin del main
}// fin de class

