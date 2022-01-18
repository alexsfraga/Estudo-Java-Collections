package comparators;

public class Estado implements Comparable<Estado>{
	
	private String sigla;
	private String nome;
	
	public Estado() { }
	
	public Estado( String nome, String sigla) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Estado o) {
		if(this.sigla == null && o.getSigla() == null) {
			return 0;
		}else if(this.sigla == null) {
			return -1;
		}else if(o.getSigla() == null || this.equals(o) ) {
			return 1;
		}else
		return this.sigla.toUpperCase().compareTo(o.getSigla().toUpperCase());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estado [sigla=" + sigla + ", nome=" + nome + "]";
	}

	
	
}
