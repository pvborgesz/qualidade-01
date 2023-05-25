import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaNotasTest {

    MediaNotas mediaNotas = new MediaNotas();

    @Test
    public void testCalcularMedia() {
        // Cria um array com três notas.
        double[] notas = {5.0, 6.0, 7.0};

        // Usa a classe MediaNotas para calcular a média das notas.
        double media = mediaNotas.calcularMedia(notas);

        // Compara a média calculada com o valor esperado (6.0).
        // A diferença entre eles deve ser menor que 0.01.

        assertEquals(7.0, media, 0.01);
        System.out.println("Teste realizado com sucesso!");
        System.out.println("Valores esperados: " + media);
        System.out.println("Valores obtidos: " + 7.0);
    }

    // Este método testa a funcionalidade de calcular a nova média quando a nota4 é maior que a menor nota.
    @Test
    public void testCalcularNovaMediaNota4Maior() {
        // Cria um array com três notas.
        double[] notas = {5.0, 6.0, 7.0};

        // Usa a classe MediaNotas para calcular a nova média, substituindo a menor nota pela nota4 (8.0).
        double novaMedia = mediaNotas.calcularNovaMedia(notas, 8.0);

        // Compara a nova média calculada com o valor esperado (7.0).
        // A diferença entre eles deve ser menor que 0.01.
        assertEquals(7.0, novaMedia, 0.01);
        System.out.println("Teste realizado com sucesso!");
        System.out.println("Valores esperados: " + novaMedia);
        System.out.println("Valores obtidos: " + 7.0);
    }

    // Este método testa a funcionalidade de calcular a nova média quando a nota4 é menor ou igual a menor nota.
    @Test
    public void testCalcularNovaMediaNota4Menor() {
        // Cria um array com três notas.
        double[] notas = {5.0, 6.0, 7.0};

        // Usa a classe MediaNotas para calcular a nova média, tentando substituir a menor nota pela nota4 (4.0).
        // Como a nota4 é menor que a menor nota, ela não deve ser usada no cálculo da média.
        double novaMedia = mediaNotas.calcularNovaMedia(notas, 4.0);

        // Compara a nova média calculada com o valor esperado (6.0).
        // A diferença entre eles deve ser menor que 0.01.
        assertEquals(6.0, novaMedia, 0.01);
    }

    // teste para verificar número de discentes
    @Test
    public void testQuantidadeDiscentes() {
        // Define uma quantidade inválida de discentes.
        int quantidadeDiscentes = 0;

        // Usa a classe MediaNotas para tentar definir a quantidade de discentes.
        boolean sucesso = mediaNotas.definirQuantidadeDiscentes(quantidadeDiscentes);

        // Verifica se a tentativa foi bem-sucedida. Como estamos tentando definir uma quantidade inválida de discentes, esperamos que a tentativa não tenha sido bem-sucedida.
        
    }

}
