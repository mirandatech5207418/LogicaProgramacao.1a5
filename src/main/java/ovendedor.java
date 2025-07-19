import java.util.Scanner;
public class ovendedor {
    public static void main (String [] args) {
        Scanner  scanner = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalVendas;
        double comissao;
        double salarioTotal;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.print ("Digite o salário fixo do vendedor em reais: ");
        salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mês em reais: ");
        totalVendas = scanner.nextDouble();

        final double  Percentual_Comissao = 0.15;
        comissao = totalVendas * Percentual_Comissao;
        salarioTotal = salarioFixo + comissao;

        System.out.println("***Relatório de Salário***");
        System.out.println("Nome do vendedor:" + nomeVendedor);
        System.out.printf("Salário Fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão ganha: R$ %.2f%n", comissao);
        System.out.printf("Salário no final do mês: R$ %.2f%n", salarioTotal);

        scanner.close();


    }
}

