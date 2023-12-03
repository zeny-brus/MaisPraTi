package src;

import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;

        do {
            System.out.println("digite o numero do exercicio 1 - 9: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    //exercicio 1
                    System.out.println("---- exercicio 1 ----");
                    System.out.println("Digite primeira nota: ");
                    Double notaUm = sc.nextDouble();
                    System.out.println("Digite a segunda nota: ");
                    Double notaDois = sc.nextDouble();
                    final Double PESO_NOTA = 0.5;
                    double media = (notaUm*PESO_NOTA)+(notaDois*PESO_NOTA);
                    System.out.println("nota 1: "+notaUm +"\nnota 2: "+notaDois+"\n---------"+
                            "\nmedia: "+media);
                    continue;
                case 2:
                    //exercicio 2
                    System.out.println("---- exercicio 2 ----");
                    System.out.println("digite um valor inteiro e vejamos se é positivo ou negativo: ");
                    int valor = sc.nextInt();
                    if (valor > 0){
                        System.out.println("Número: "+valor+" é positivo!");
                    }else {
                        System.out.println("Número: "+valor+" é negativo!");
                    }
                    continue;
                case 3:
                    //exercicio 3
                    System.out.println("---- exercicio 3 ----");
                    System.out.println("este exercicio é um loop, portanto somente isso, escolha outra opcao!");
                    continue;
                case 4:
                    //exercicio 4
                    System.out.println("---- exercicio 4 ----");
                    System.out.printf("digite um valor para contagem regressiva: ");
                    int regressiva = sc.nextInt();
                    while (regressiva >= 1){
                        System.out.println("contagem regressiva: "+regressiva);
                        regressiva --;
                    }
                    continue;
                case 5:
                    //exercicio 5
                    System.out.println("---- exercicio 5 ----");
                    System.out.println("digite um valor para contagem crescente: ");
                    int valorCrescente = sc.nextInt();
                    int crescente = 1;
                    do {
                        System.out.println("número: "+crescente);
                        crescente ++;
                    }while (crescente <= valorCrescente);
                    continue;
                case 6:
                    System.out.println("---- exercicio 6 ----");
                    System.out.println("digite um valor inteiro para realizar a tabuada: ");
                    int valorTabuada = sc.nextInt();
                    for (int resultado = 1; resultado <= 10; resultado++) {
                        System.out.println(resultado+" x "+valorTabuada+ " = "+resultado*valorTabuada);
                    }
                    continue;
                case 7:
                    System.out.println("---- exercicio 7 ----");
                    System.out.println("digite um valor inteiro do tipo primitivo: ");
                    //declarado um tipo primitivo
                    int numInt = sc.nextInt();
                    //convertendo para tipo wrapper
                    Integer objInt = Integer.valueOf(numInt);
                    System.out.println("digite um valor inteiro declarando como wrapper: ");
                    Integer valueInt = sc.nextInt();
                    if (objInt == valueInt){
                        System.out.println("valores na memoria sao iguais!");
                    }else {
                        System.out.println("valores na memoria sao diferentes");
                    };

                    if (objInt.equals(valueInt)){
                        System.out.println("valores do objeto sao iguais!");
                    }else {
                        System.out.println("valores do objeto sao diferentes");
                    }
                    continue;
                case 8:
                    System.out.println("---- exercicio 8 ----");
                    System.out.println("digite um valor: ");
                    Double primeiroValor = sc.nextDouble();
                    System.out.println("digite a operação desejada (+ - / *):" );
                    String operacao = sc.next();
                    System.out.println("digite segundo valor: ");
                    Double segundoValor = sc.nextDouble();
                    switch (operacao){
                        case "+":
                            System.out.println(primeiroValor+" + "+segundoValor+" = "+ (primeiroValor+segundoValor));
                            break;
                        case "-":
                            System.out.println(primeiroValor+" - "+segundoValor+" = "+ (primeiroValor-segundoValor));
                            break;
                        case "/":
                            System.out.println(primeiroValor+" / "+segundoValor+" = "+ (primeiroValor/segundoValor));
                            break;
                        case "*":
                            System.out.println(primeiroValor+" + "+segundoValor+" = "+ (primeiroValor*segundoValor));
                            break;
                    }
                    continue;
                case 9:
                    System.out.println("---- exercicio 9 ----");
                    System.out.println("calculo IMC");
                    System.out.println("Digite seu peso em Kg: ");
                    Double peso = sc.nextDouble();
                    System.out.println("Digite sua altura em Mts: ");
                    Double altura = sc.nextDouble();
                    Double imc = peso/(altura*altura);

                    if (imc < 18.5){
                        System.out.println(imc+" abaixo do ideal!!");
                    }else if (imc >= 18.5 && imc <= 24.9){
                        System.out.println(imc+" considerado normal!!");
                    }else if(imc >= 25 && imc <= 29.9){
                        System.out.println(imc+" sobrepeso!!");
                    }else if (imc >= 30 && imc <= 34.9){
                        System.out.println(imc+" obesidade grau 1");
                    }else if(imc >= 35 && imc <= 39.9){
                        System.out.println(imc+" obesidade grau 2");
                    }else if (imc >= 40){
                        System.out.println(imc+" obesidade grau 3 (obesidade morbida)");
                    }else {
                        System.out.println("valor default");
                    };
                case 0:
                    isContinue = false;
                    break;
            }
        }while (isContinue);
    }
}
