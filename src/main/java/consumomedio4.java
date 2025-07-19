
import java.util.InputMismatchException;
import java.util.Scanner;

public class consumomedio4 {

    public static void main (String [] args){

        Scanner x = new Scanner(System.in);
        double distancia = 0;
        double combustivelGasto = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite a distância percorrida pelo automóvel em km: ");
                distancia = x.nextDouble();
                if (distancia <= 0) {
                    System.out.println("A distância não pode ser igual a zera e nem negativa. Por favor, tentar novamente.");
                }else {
                    entradaValida = true;
                }

            } catch (InputMismatchException e) {

                System.out.println( "Entrada inválida. Por favor, dgite um número para a distância.");
                x.next();
            }
        }
        entradaValida = false;

        while (!entradaValida) {

                       try {
                System.out.print("Digite o total de combustível gasto em litros: ");
                combustivelGasto = x.nextDouble();

                if (combustivelGasto <= 0) {
                    System.out.println("O consumo de combustível deve ser maior que zero. Por favor, tente novamente.");

                }  else {
                    entradaValida =true;
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, digite um número para o combustível");
                x.next();
            }
        }
double consumoMedio = distancia / combustivelGasto;
        System.out.printf( "O consumo médio de automóvel é %.2f km/l%n", consumoMedio);
        x.close();
    }
}
