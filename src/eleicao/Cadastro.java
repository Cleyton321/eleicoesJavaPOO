package eleicao;

import java.util.Scanner;

public class Cadastro {
	//Cadastro de candidatos
    public void cadastro() {
    	System.out.println("");
    	System.out.println(" ======================= CADASTRO DE CANDIDATOS ========================= ");
    	System.out.println("");
    	Scanner tl = new Scanner(System.in);
    	System.out.print("Quantos candidatos serão cadastrados? ");
    	int numCandidatos = tl.nextInt();
    	Candidato[] candidatos = new Candidato[numCandidatos];
    		for (int i = 0; i < numCandidatos; i++) {
    			System.out.println("");
    			System.out.print("Digite o número do candidato " + (i + 1) + ": ");
                int numero = tl.nextInt();
                tl.nextLine(); // Limpar a quebra de linha
                System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
                String nome = tl.nextLine();
                System.out.println("");
                candidatos[i] = new Candidato(numero, nome);
    		}
    		
    		System.out.println("");
    		System.out.println(" ======================= CONTABILIZAR VOTOS ========================= ");
    		System.out.println("");
    		
    		System.out.print("Quantos votos serão lidos? ");
            int numVotos = tl.nextInt();
            int totalVotos = 0;

            for (int i = 0; i < numVotos; i++) {
                System.out.print("Digite o número do candidato que recebeu o voto " + (i + 1) + ": ");
                int numeroVoto = tl.nextInt();

                for (Candidato candidato : candidatos) {
                    if (candidato.getNumero() == numeroVoto) {
                        candidato.incrementarVotos();
                        totalVotos++;
                        break;
                    }
                }
            }
            
            System.out.println("");
            System.out.println(" ======================= RESULTADO DA ELEIÇÃO ========================= ");
            System.out.println("");
            
            int maiorNumeroVotos = -1; // Inicializa com um valor impossível
            String nomeVencedor = "";
            
            
            for (Candidato candidato : candidatos) {
            	int votosCandidato = candidato.getVotos();
                double percentualVotos = (votosCandidato * 100.0) / totalVotos;
                System.out.println("O candidato " + candidato.getNome() + ", número " + candidato.getNumero() + ", recebeu " + candidato.getVotos() + " votos (" + percentualVotos + "%)" );
            
                if (candidato.getVotos() > maiorNumeroVotos) {
                    maiorNumeroVotos = candidato.getVotos();
                    nomeVencedor = candidato.getNome().toUpperCase();
                    
                }
            
            }
    	
            System.out.println("");
            System.out.println("--- O VENDECEDOR DA ELEIÇÃO É " + nomeVencedor + "!! ---");
    	}

    public void encerrar() {
        System.out.println("Encerrando o programa.");
        System.exit(0);
    }
}
