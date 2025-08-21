public class SimuladorLigacao {

    public static void ligarPara(Candidato candidato) {
        System.out.println("Ligando para " + candidato.getNome() + "...");

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            boolean atendeu = Math.random() > 0.5;

            if (atendeu) {
                System.out.println("Contato com " + candidato.getNome() + " feito na tentativa " + tentativa + " 📞\n");
                return;
            }
        }

        System.out.println("Não foi possível contato com " + candidato.getNome() + " após 3 tentativas ❌\n");
    }
}
