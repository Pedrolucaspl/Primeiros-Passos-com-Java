import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = s.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = s.nextInt();

        System.out.println("Par ou Impar: ");
        String opcao = s.next();
        
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        System.out.println("\nOpção escolhida de "+ menor + " até " + maior +" em ordem decrescente:" );

        s.close();

        for(int i=maior ; i>=menor; i--){
            if(opcao.equalsIgnoreCase("par") && i%2==0){
                System.out.printf("  %s", i);
            }else if(opcao.equalsIgnoreCase("Impar") && i%2!=0){
                System.out.printf("  %s", i);
            }
        }
    }
}
