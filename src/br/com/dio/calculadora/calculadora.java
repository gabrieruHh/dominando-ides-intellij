package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        b = scanner.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        int dividir = dividir(a,b);

        System.out.println("somar: "+ somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("dividir: " + dividir);
        System.out.println("multiplicar: " + multiplicar);

    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int dividir(int a, int b){
        return a * b;
    }
    public static int multiplicar(int a, int b){
        return a / b;
    }
}
