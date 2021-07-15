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

/*
 
Estado e = new Estado("Acre" , "AC");
Estado e = new Estado("Alagoas" , "AL");
Estado e = new Estado("Amapá" , "AP");
Estado e = new Estado("Amazonas" , "AM");
Estado e = new Estado("Bahia" , "BA");
Estado e = new Estado("Ceará" , "CE");
Estado e = new Estado("Espírito Santo" , "ES");
Estado e = new Estado("Goiás" , "GO");
Estado e = new Estado("Maranhão" , "MA");
Estado e = new Estado("Mato Grosso" , "MT");
Estado e = new Estado("Mato Grosso do Sul" , "MS");
Estado e = new Estado("Minas Gerais" , "MG");
Estado e = new Estado("Pará" , "PA");
Estado e = new Estado("Paraíba" , "PB");
Estado e = new Estado("Paraná" , "PR");
Estado e = new Estado("Pernambuco" , "PE");
Estado e = new Estado("Piauí" , "PI");
Estado e = new Estado("Rio de Janeiro" , "RJ");
Estado e = new Estado("Rio Grande do Norte" , "RN");
Estado e = new Estado("Rio Grande do Sul" , "RS");
Estado e = new Estado("Rondônia" , "RO");
Estado e = new Estado("Roraima" , "RR");
Estado e = new Estado("Santa Catarina" , "SC");
Estado e = new Estado("São Paulo" , "SP");
Estado e = new Estado("Sergipe" , "SE");
Estado e = new Estado("Tocantins" , "TO");
Estado e = new Estado("Distrito Federal" , "DF");

 */
