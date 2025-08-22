import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome e a idade da primeira Pessoa: ");
        String name1 = s.next();
        int idade1 = s.nextInt();
        
        System.out.println("Digite o nome e a idade da segunda Pessoa: ");
        String name2 = s.next();
        int idade2 = s.nextInt();

        int diferença = Math.abs(idade1-idade2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos", name1, name2, diferença);

        s.close();
    }
}
