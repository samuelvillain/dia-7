import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Informe um número: ");
        Scanner N = new Scanner(System.in);
        int valor = N.nextInt();
        if (valor % 2 == 1) {
            System.out.println("O número " + valor + " é impar.");
        } else if (valor % 2 == 0 && valor >= 2 && valor <= 5) {
            System.out.println("A");
        } else if (valor % 2 == 0 && valor >= 6 && valor <= 20) {
            System.out.println("B");
        } else
        System.out.println("C");


    }
}