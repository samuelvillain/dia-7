import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Digite o primeiro número: ");
        Scanner numero = new Scanner(System.in);
        int valor1 = numero.nextInt();
        System.out.print("Digite o segundo número: ");
        int valor2 = numero.nextInt();
        System.out.print("Digite o terceiro número: ");
        int valor3 = numero.nextInt();

        System.out.println("Os números digitados são: " + valor1 + "," + valor2 + ","+valor3);
    }
}