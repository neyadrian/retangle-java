import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(largura * largura + altura * altura);

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Diagonal do retângulo: " + diagonal);

        entrada.close();
    }
}
