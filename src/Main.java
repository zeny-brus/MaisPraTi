package src;

public class Main {
    public static void main(String[] args) {
        //exercicio 1
        double notaUm =9, notaDois = 6;
        final double PESO_NOTA = 0.5;
        double media = (notaUm*PESO_NOTA)+(notaDois*PESO_NOTA);
        System.out.println("nota 1: "+notaUm +"\nnota 2: "+notaDois+"\n---------"+
                "\nmedia: "+media);

        //exercicio 2
        int decisao = 20;
        if (decisao > 0){
            System.out.println("Número: "+decisao+" é positivo!");
        }else {
            System.out.println("Número: "+decisao+" é negativo!");
        }

        //exercicio 3
        int opcao = 3;
        switch (opcao){
            case 1:
                System.out.println("Exercicio 1");
                break;
            case 2:
                System.out.println("exercicio 2");
                break;
            case 3:
                System.out.println("exercicio 3");
                break;
        }

        //exercicio 4
        int regressiva = 10;
        while (regressiva >= 1){
            System.out.println("contagem regressiva: "+regressiva);
            regressiva --;
        }

        //exercicio 5
        int crescente = 1 ;
        do {
            System.out.println("número: "+crescente);
            crescente ++;
        }while (crescente <= 5);

        //exercicio 6
        for (int resultado = 1; resultado <= 10; resultado++) {
            System.out.println(resultado+" x 7 = "+resultado*7);
        }

        //exercicio 7

        //declarando tipo primitivo
        int numInt = 1000;

        //convertendo para tipo wrapper
        Integer objInt = Integer.valueOf(numInt);

        //declarando um wrapper
        Integer valueInt = 1000;

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

    }
}
