package basicas;

public class Exercicio {
	
	private String obs;
	private String nome;
	private int serie;
	private String tempoDescanso;
	private double porcentagem;
	
	public Exercicio(String obs, String nome, int serie, String tempoDescanso, double porcentagem) {
		
		this.obs = obs;
		this.nome = nome;
		this.serie = serie;
		this.tempoDescanso = tempoDescanso;
		this.porcentagem = porcentagem;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getTempoDescanso() {
		return tempoDescanso;
	}

	public void setTempoDescanso(String tempoDescanso) {
		this.tempoDescanso = tempoDescanso;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
