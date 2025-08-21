import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Candidato> selecionados = new ArrayList<>();

        System.out.println("==== SISTEMA DE VALIDAÇÃO DE PROCESSO SELETIVO ====");
        System.out.print("Quantos candidatos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCandidato #" + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota (0 a 10): ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // limpar o buffer

            Candidato candidato = new Candidato(nome, nota);

            if (ValidadorCandidato.isSelecionado(candidato)) {
                selecionados.add(candidato);
                System.out.println("Status: Selecionado ✅");
            } else {
                System.out.println("Status: Reprovado ❌");
            }
        }

        // Imprimir selecionados
        System.out.println("\n==== CANDIDATOS SELECIONADOS ====");
        for (Candidato c : selecionados) {
            System.out.println("- " + c.getNome());
        }

        // Fazer ligação
        System.out.println("\n==== LIGAÇÕES PARA OS SELECIONADOS ====\n");
        for (Candidato c : selecionados) {
            SimuladorLigacao.ligarPara(c);
        }

        scanner.close();
    }
}
