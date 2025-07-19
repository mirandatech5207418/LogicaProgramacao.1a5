import java.util.Scanner;

public class Variosoperadores {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = inputScanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double number2 = inputScanner.nextDouble();

        double soma  = number1 + number2;
        double subtracao = number1 - number2;
        double multiplicacao = number1 * number2;
        double divisao = number1 / number2;


        System.out.println("--- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("divisão" + divisao);

        System.out.println("Fim");
        inputScanner.close();
    }
}
