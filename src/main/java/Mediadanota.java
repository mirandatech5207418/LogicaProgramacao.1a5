import java.util.Scanner;

public class Mediadanota {

    public static void main (String[] args) {
        Scanner scanner =  new Scanner (System.in);
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média aritmética do(a) nota do aluno(a) %s é %.2f%n", nome, media);

        scanner.close();

    }
}
