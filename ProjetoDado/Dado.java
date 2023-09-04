package ProjetoDado;

import java.util.Random;

public class Dado {
    private int numeroDado1;
    private int numeroDado2;
    //método construtor que sorteia o valor de dois dados 
    //chamando a função de rolar dado que sorteia um número
    //entre 1 e 6
    public Dado(){
        numeroDado1 = rolarDado();
        numeroDado2 = rolarDado();
    }
    //método que sorteia um número entre 1 e 6
    private int rolarDado(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    //imprime os números sorteados,e logo após chama a soma atribuindo
    //os valores dos dois dados e em seguida imprime o resultado
    public void imprmir(){
        System.out.println("Valor do primeiro dado: " + numeroDado1);
        System.out.println("Valor do segundo dado: " + numeroDado2);
        int resultado = soma(numeroDado1, numeroDado2);
        System.out.println("Soma dos dados: " + resultado);
    }
    //método que realiza a soma dos números sorteados
    //nos dois dados passado pelos argumentos
    private int soma(int numeroDado1, int numeroDado2) {
        return numeroDado1 + numeroDado2;
    }
    
}
