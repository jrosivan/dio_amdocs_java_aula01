package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o Primeiro Valor: ");
        a = scan.nextInt();

        System.out.println("Digite o Segundo Valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar.....:  " + a + " + " + b + " = " + somar);
        System.out.println("Subtrair..:  " + a + " - " + b + " = " + subtrair);
        System.out.println("Mutiplicar:  " + a + " * " + b + " = " + multiplicar);
        System.out.println("Dividir...:  " + a + " / " + b + " = " + dividir);


    }

    public static int somar(int a, int b){
        return a +b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }

}
