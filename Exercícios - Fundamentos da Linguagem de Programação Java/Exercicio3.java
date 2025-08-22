import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual a base do retangulo: ");
        float base = s.nextFloat();

        System.out.println("Qual a altura do retangulo: ");
        float altura = s.nextFloat();

        float area = base*altura;
        System.out.printf("A área do retangulo é: %.2f",area); 
        
        s.close();
    }
}
