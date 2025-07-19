import java.util.Scanner;

public class SomadordeNumeros {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");

        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: "+ soma );

        entrada.close();


    }


}
