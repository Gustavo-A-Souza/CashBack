import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();


        double cashback;
        if (idade >= 21 && valorCompra < 1000) {
            cashback = valorCompra * 0.05;
        } else if (idade < 21 && valorCompra < 1000) {
            cashback = valorCompra * 0.07;
        } else if (idade >= 21 && valorCompra >= 1000) {
            cashback = valorCompra * 0.07;
        } else {
            cashback = valorCompra * 0.10;
        }


        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor da Compra: R$" + valorCompra);
        System.out.println("Cashback Recebido: R$" + cashback);
    }

}