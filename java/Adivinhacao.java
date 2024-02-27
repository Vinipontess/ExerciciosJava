import java.util.Scanner;

class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 11);
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinha��o!");
        System.out.println("Tente adivinhar o n�mero entre 0 e 10.");

        while (true) {
            System.out.print("Digite um n�mero: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parab�ns! Voc� acertou em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um n�mero maior.");
            } else {
                System.out.println("Tente um n�mero menor.");
            }
        }

        scanner.close();
    }
}