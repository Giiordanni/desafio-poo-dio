package desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10; // ao defenir o static estou dizendo que vou poder trabalhar com essa variável fora da minha classe
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp(); 
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
