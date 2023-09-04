import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler;
        Triangulo triangulo;
        int a;
        int b;
        int c;

        ler = new Scanner(System.in);

        for(int i = 0; i != 5; i++){
            System.out.println("Digite os três lados: ");
            a = ler.nextInt();
            b = ler.nextInt();
            c = ler.nextInt();

            triangulo = new Triangulo(a, b, c);

            if(triangulo.equilatero()){
                System.out.println("Triângulo Equilátero");
            }
            else if(triangulo.escaleno()){
                System.out.println("Triângulo Escaleno");
            }
            else if(triangulo.isosceles()){
                System.out.println("Triângulo Isósceles");
            }
            else{
                System.out.println("Não é triângulo");
            }
                }
    }
}
