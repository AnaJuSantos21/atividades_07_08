package curso07_08;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	String profissao;
	int cpf;
	int rg;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
		
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() { //get mostra
		return endereco;
	}
	public void setEndereco(String endereco) { //set modifica
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}


}
