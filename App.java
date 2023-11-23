import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int media;
        String status;

        System.out.println("\n\nCalculadora de Média");
        System.out.println("--! use numeros entre 0 a 100 !-- \n");

        System.out.println("\nQual a 1° nota?");
        int nota1 = scan.nextInt();

        System.out.println("\nQual a 2° nota?");
        int nota2 = scan.nextInt();

        System.out.println("\nQual a 3° nota?");
        int nota3 = scan.nextInt();

        System.out.println("\nQual a 4° nota?");
        int nota4 = scan.nextInt();

        scan.close();

        media = nota1 + nota2 + nota3 + nota4;

        if (media > 60)
            status = "Aprovado";
        else
            status = "Reprovado";

        System.out.println("\nMédia da Nota: " + media + "\n" + "Status: " + status);
    }
}