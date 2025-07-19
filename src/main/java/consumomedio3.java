import java.util.Scanner;

public class consumomedio3 {

    public void main (String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida pelo automóvel em km: " );
        double distancia = x.nextDouble();

        double combustivelGasto;

        do {
            System.out.print("Digite o toal de combustível gasto em litros: ");
            combustivelGasto = x.nextDouble();

            if(combustivelGasto <= 0) {
                System.out.println("O consumo de combustível deve ser maior que zero.");
                            }
        } while (combustivelGasto  <= 0);

        double consumoMedio = distancia / combustivelGasto;

        System.out.printf("O cunsumo médio do automóvel é %2f kml%n", consumoMedio);

        x.close();

    }
}
