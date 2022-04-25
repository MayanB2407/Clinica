package clinica;

public class Paciente {
	private String nome;
	private String rg;
	private int idade;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, String rg, int idade) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Paciente:\nnome: " + nome + "\nRG: " + rg + "\nidade: " + idade;
	}
}