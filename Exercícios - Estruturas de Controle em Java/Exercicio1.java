import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resultado=0;
        System.out.println("Digite um numero: ");
        int Num = s.nextInt();
        
        for(int i=1;i<=10;i++){
            resultado=Num*i;
            System.out.printf("\n%d x %d = %d ", Num, i, resultado );
        }
        s.close();
    }
}
