import java.util.Arrays;
import java.util.Scanner;

public class MediaNotas {
    private int quantidadeDiscentes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discentes: ");
        int numDiscentes = scanner.nextInt();

        for (int i = 0; i < numDiscentes; i++) {
            System.out.println("Registro para discente " + (i + 1) + ": ");
            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            double media = calcularMedia(notas);
            System.out.println("Média: " + media);

            if (media < 7.0) {
                System.out.print("Digite a nota 4: ");
                double nota4 = scanner.nextDouble();
                double novaMedia = calcularNovaMedia(notas, nota4);
                System.out.println("Nova Média: " + novaMedia);
            }
        }
        scanner.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double calcularNovaMedia(double[] notas, double nota4) {
        Arrays.sort(notas);
        if (nota4 > notas[0]) {
            notas[0] = nota4;
        }
        return calcularMedia(notas);
    }


    public boolean definirQuantidadeDiscentes(int quantidade) {
        // A quantidade de discentes deve ser maior que 0 e menor ou igual a 10.
        if (quantidade > 0 && quantidade <= 10) {
            this.quantidadeDiscentes = quantidade;
            return true;
        } else {
            return false;
        }
    }

}
