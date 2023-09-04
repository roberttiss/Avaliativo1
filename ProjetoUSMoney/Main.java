package ProjetoUSMoney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos casos vai querer testar? ");
        int teste = ler.nextInt();
        
        for(int i = 0; i != teste; i++){

        System.out.println("Digite o valor em dólares para o primeiro objeto: ");
        int doll = ler.nextInt();
        System.out.println("Digite o valor em centavos para o primeiro objeto: ");
        int cents = ler.nextInt();

        USMoney y = new USMoney(doll, cents);

        System.out.println("Digite o valor em dólares para o segundo objeto: ");
        int doll2 = ler.nextInt();
        System.out.println("Digite o valor em centavos para o segundo objeto: ");
        int cents2 = ler.nextInt();

        USMoney x = new USMoney(doll2, cents2);

        USMoney resultado = x.plus(y);

        System.out.print(resultado.getdoll() + " dollar e ");
        System.out.print(resultado.getcents() + " cents\n");
        }


    }
}
