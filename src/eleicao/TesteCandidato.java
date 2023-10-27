package eleicao;

public class TesteCandidato {

	public void teste() {
		//Teste
    	System.out.println(" ============================ TESTE  ELEIÇÂO =========================== ");
    	Candidato candTeste = new Candidato(123, "Cleyton");
    	System.out.println("");
    	System.out.println("| O candidato " + candTeste.getNome() + ", número " + candTeste.getNumero() + ", teve " + candTeste.getVotos() + " votos.                         |");
    	candTeste.incrementarVotos();
    	System.out.println("| Após receber um voto, o candidato " + candTeste.getNome() + ", número " + candTeste.getNumero() + ", possui " + candTeste.getVotos() + " voto.  |");
    	System.out.println("");
    	System.out.println(" ============================  FIM DO TESTE ============================ ");
	}

}
