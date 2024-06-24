package desafio.dominio;

import java.time.LocalDate;


public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
	@Override
	public String toString() {
		return "Mentoria{"
				+ "Titulo: " + super.getTitulo() + ", " 
				+ "Descrição: " + super.getDescricao() + ", " 
				+ "data: " + this.data + "}";
	}
	

}
