public class ValidadorCandidato {

    private static final double NOTA_MINIMA = 7.0;

    public static boolean isSelecionado(Candidato candidato) {
        return candidato.getNota() >= NOTA_MINIMA;
    }
}
