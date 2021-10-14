package com.generation;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner console = new Scanner( System.in);

            System.out.print("Enter number 1  ");
            int num1 = console.nextInt();
            System.out.print("Enter  number 2  ");
            int num2 = console.nextInt();

            System.out.println("Ingrese que operación quiere realizar: \n 1 Suma\n 2 Resta \n 3 Multiplicacion \n 4 Division\n ");
            int opc = console.nextInt();
            int resultado =0;

            switch (opc) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 + num2;
                        break;
                    case 4:
                        resultado = num1 - num2;
                        break;
            }
            System.out.println(resultado);
        }
       /* public static int suma(int num1,int num2){
            return num1+num2;
        }
        public static int resta(int num1,int num2){
            return num1-num2;
        }
        public static int multiplicacion(int num1,int num2){
            return num1+num2;
        }
        public static int division(int num1,int num2){
            return num1/num2;
        }*/

}
/*
* import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        int addition = num1 + num2;
        System.out.println( num1+" + "+num2+" = "+ addition);

        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        int subtraction = num1 - num2;
        System.out.println( num1+" - "+num2+" = "+ subtraction);

        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        int multiplication = num1 * num2;
        System.out.println( num1+" * "+num2+" = "+ multiplication);

        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        int division = num1 / num2;
        System.out.println( num1+" / "+num2+" = "+ division);
  }
}*/