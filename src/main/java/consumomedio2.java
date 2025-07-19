import java.util.Scanner;

public class consumomedio2 {

    public static void main (String[] args){

        Scanner x = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida em km: ");
        double distancia = x.nextDouble();

        System.out.print("Digite o total do combustível gasto em litros: ");
        double combustivelGasto = x.nextDouble();

        if (combustivelGasto < 0) {
            System.out.println("Erro: 0 total de combustível gasto deve ser maior que zero.");
        } else {
            double consumoMedio = distancia /combustivelGasto;

            System.out.printf("O consumo médio do automóvel é %.2f km/l%n", consumoMedio);
        }

x.close();
    }


}
