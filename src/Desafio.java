import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = " mayra Manzaneda";
        String tipodecuenta = "Corriente";
        double saldo = 1599.00;
        int opcion = 0;

        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es:" + tipodecuenta);
        System.out.println("Su saldo actual es de :" + saldo + " $ ");






        System.out.println("*****************************************************");
        System.out.println("          ********************************            ");

        String menu = """
                
                ____________Escriba el numero de la opcion________________ 
                                
                1 -Consultar Saldo
                2 -Retirar 
                3 -Depositar
                4 - salir 
                """;



        Scanner teclado = new Scanner(System.in);
        while (opcion != 6) {
            System.out.println(menu);
            opcion= teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println(" El saldo actualizado es :" + saldo +" $ ");

                    break;

                case 2:
                    System.out.println("¿Cual es el valor que desea a retirar?");
                    double valoeAretirar = teclado.nextDouble();
                    if ( valoeAretirar > saldo) {

                        System.out.println("saldo insuficieente");
                    }else {
                        saldo= saldo - valoeAretirar;
                        System.out.println(" el saldo actualizado  es :" + saldo + " $");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar");
                    double valorAdepositar =  teclado.nextDouble();
                    saldo += valorAdepositar;
                    System.out.println("el saldo actualizado es: " + saldo + " $");

                    break;

                case 4:
                    System.out.println("Saliendo del Programa , Gracias por utilizar nuestros dervicio");

                    break;

                default:
                    System.out.println("Opcion invalida");


            }
        }
    }


    }

