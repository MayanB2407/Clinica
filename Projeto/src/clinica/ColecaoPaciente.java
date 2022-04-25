package clinica;

import java.util.Scanner;

public class ColecaoPaciente {
	
	Scanner in = new Scanner(System.in);
	private Paciente pacientes[] = new Paciente[1];
	
	int cadastrados = 0;
	
	public void cadastrarPaciente() {
		aumentaArray();
		
		Paciente p = new Paciente();
		System.out.println("\nDigite o nome do paciente");
		p.setNome(in.next());
		System.out.println("\nDigite o RG do paciente");
		p.setRg(in.next());
		System.out.println("\nDigite a idade do paciente");
		p.setIdade(in.nextInt());
		System.out.println(" ");
		pacientes[cadastrados] = p;
		cadastrados++;
	}
	
	public void listarPaciente() {
		
		for(int cont = 0; cont < cadastrados; cont++) {
			System.out.println("\n" + pacientes[cont]);
		}
		System.out.println(" ");
	}
	
	public void cadastrarPacientePorPosicao() {

			aumentaArray();
			Paciente p = new Paciente();
			
			System.out.println("\nEm qual posição deseja cadastrar de 0 à " + cadastrados + "?");
			int posicao = in.nextInt();
			for(int cont= this.cadastrados - 1; cont >= posicao; cont--) {

				this.pacientes[cont+1] = this.pacientes[cont];

			}
			System.out.println("\nDigite o nome do paciente");
			p.setNome(in.next());
			System.out.println("\nDigite o RG do paciente");
			p.setRg(in.next());
			System.out.println("\nDigite a idade do paciente");
			p.setIdade(in.nextInt());
			System.out.println(" ");
			this.pacientes[posicao]= p;

			this.cadastrados++;

		}
	
	public void removerPacientePorPosicao() {
		System.out.print("\nDigite a posição que deseja remover: ");
		int posicao = in.nextInt();

		for (int cont = posicao; cont < pacientes.length - 1; cont++) {
			pacientes[posicao] = pacientes[posicao + 1];
			posicao++;
			
		}
		
		cadastrados--;
	}
	
	public void procuraPacientePorPosicao() {
		System.out.print("\nDigite o nome que você procura: ");
		int posicao = in.nextInt();
		
		if(pacientes[posicao] != null) {
			System.out.println("\nPaciente:" + pacientes[posicao].getNome());
			System.out.println("RG:" + pacientes[posicao].getRg());
			System.out.println("Idade:" + pacientes[posicao].getIdade()+"\n");
		}
		else {
			System.out.println("\nNão há conta nessa posição.\n");
		}
			
	}
	
	public void procurarPacientePorNome() {

		System.out.print("\nDigite o nome que você procura:");
		String nome = in.next();

		for (int cont = 0; cont < cadastrados; cont++) {
			if (nome.equals(pacientes[cont].getNome())) {
				System.out.println("\nPaciente:" + pacientes[cont].getNome());
				System.out.println("RG:" + pacientes[cont].getRg());
				System.out.println("Idade:" + pacientes[cont].getIdade() + "\n");
			}
		}
	}
	
	public void quantidadeCadastrados() {
		System.out.println("\nAtualmente há " + cadastrados + " pacientes cadastrados.\n");
	}
	
	public void aumentaArray() {

		if(this.pacientes.length == this.cadastrados) {

			Paciente newVetor[] = new Paciente[this.pacientes.length + 10];

			System.arraycopy(this.pacientes, 0, newVetor, 0, this.pacientes.length);

			this.pacientes = newVetor;
		
		}
	}
}
