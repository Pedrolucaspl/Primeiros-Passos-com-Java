import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        System.out.printf("\nQual é o lado do Quadrado: ");
        float lado = s.nextFloat();

        float area = lado*lado;
        System.out.printf("\nA área do quadrado é: %.2f", area);

       s.close();
    }
}
