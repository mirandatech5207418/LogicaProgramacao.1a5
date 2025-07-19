import java.util.Scanner;
public class consumomedio {
    public static void main (String [] args) {
        Scanner x = new Scanner(System.in);

        System.out.print( "Digite a distância total percorrida pelo automóvel: ");
        double distancia = x.nextDouble();
        System.out.print("Digite o total combústivel gasto: ");
        double combustivelgasto = x.nextDouble();

        double consumomedio  = distancia / combustivelgasto;
        System.out.print("O consumo médio do automóvel é" + combustivelgasto + "km/l");
        x.close();


    }
}
