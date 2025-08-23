import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite um numero: ");
       int num = s.nextInt();
       int divisor;
        
        do{
            System.out.printf("Digite um numero que é divisor de %s: \n", num);
            divisor = s.nextInt();
            if(num % divisor!=0){
               System.out.printf("Errado! %d não é divisor de %d \n\n", divisor, num); 
            }
        }while(num % divisor!=0);

        System.out.printf("Correto! %d é divisor de %d%n", divisor, num);
       
    }
}
