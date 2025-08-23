import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float imc = 0.00f;

        System.out.println("Digite seu peso: ");
        float peso = s.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura = s.nextFloat();

        imc = peso/(altura*altura);
        System.out.printf("\nIMC: %.2f\n", imc);

        if(imc<=18.5){
            System.out.println("Abaixo do Peso");
        }if (imc>18.5 && imc<=24.9) {
            System.out.println("Peso Ideal");
        }if (imc>24.9 && imc<=29.9) {
            System.out.println("Levamente acima do Peso");
        }if (imc>29.9 && imc<= 34.9) {
            System.out.println("Obesidade Grau I");
        }if (imc>34.9 && imc<= 39.9) {
            System.out.println("Obesidade Grau II");
        }if (imc>39.9) {
            System.out.println("Obesidade Grau III");
        }
        s.close();
    }
}