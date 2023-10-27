package eleicao;

import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		Scanner opcao = new Scanner(System.in);
	    Candidato[] candidatos = null;
	    
	    System.out.println("============================ BEM-VINDO A ELEIÇÃO ===========================");

	    while (true) {
	    	System.out.println("");
	    	System.out.println("=== MENU PRINCIPAL ===");
	    	System.out.println("");
	    	System.out.println("Escolha uma opção:");
	        System.out.println("1 - Testar eleição");
	        System.out.println("2 - Cadastrar candidatos e contabilizar votos");
	        System.out.println("3 - Créditos");
	        System.out.println("4 - Sair");
	        System.out.println("");

	        int escolha = opcao.nextInt();

	        switch (escolha) {
	        	case 1:
	        		TesteCandidato teste = new TesteCandidato();
	        		teste.teste();
	                break;
	        	case 2:
	        		Cadastro cadastro = new Cadastro();
	        		cadastro.cadastro();
	        		break;
	        	case 3:
	        		Creditos creditos = new Creditos();
	        		creditos.creditos();
	        		break;
	        	case 4:
	        		Cadastro encerrar = new Cadastro();
	        		encerrar.encerrar();
	        	default:
	                System.out.println("Opção inválida. Por favor, escolha uma das opções abaixo7.");
	        }
	    }
	}
}