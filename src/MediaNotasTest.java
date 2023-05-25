import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaNotasTest {

    MediaNotas mediaNotas = new MediaNotas();

    @Test
    public void testCalcularMedia() {
        // Cria um array com três notas.
        double[] notas = {5.5, 6.0, 7.0};

        // Usa a classe MediaNotas para calcular a média das notas.
        double media = mediaNotas.calcularMedia(notas);

        // Compara a média calculada com o valor esperado (6.0).
        // A diferença entre eles deve ser menor que 0.01.

        assertEquals(6.0, media, 0.01);
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
}
