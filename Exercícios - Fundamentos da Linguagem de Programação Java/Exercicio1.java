import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("\nQual seu nome: ");
        String name = s.next();
        
        System.out.printf("\nQue ano Você Nasceu: ");
        var date = 2025- s.nextInt();

        System.out.printf("\nOlá %s, você tem %s anos", name, date);

        s.close();
    }
}
