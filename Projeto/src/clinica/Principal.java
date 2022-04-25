package clinica;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ColecaoPaciente ac = new ColecaoPaciente();
		int acao = 0;
		while(acao != 7) {
		System.out.println("Qual ação deseja realizar?");
		System.out.println("1 - Cadastrar paciente \n" + "2 - Listar pacientes\n" + "3 - Cadastrar paciente por posição\n" + "4 - Remover paciente por posição\n" + "5 - Procurar paciente por nome\n" + "6 - Ver quantidade de cadastrados\n"+"7 - Encerra o programa");
	
		
		
			acao = in.nextInt();
			switch(acao)
			{
				case 1:
					ac.cadastrarPaciente();
					break;
				case 2:
					ac.listarPaciente();
					break;
                
				case 3:
					ac.cadastrarPacientePorPosicao();
					break;
            	
				case 4:
					ac.removerPacientePorPosicao();
					break;
                
				case 5:
					ac.procurarPacientePorNome();
					break;
                
				case 6:
					ac.quantidadeCadastrados();
					break;
                
				case 7:
					break;
            
				default:
					System.out.println("Você não digitou uma ação válida.");
            
			}
		
		}
		System.out.println("\nPrograma encerrado.");
		in.close();
	}	

}
