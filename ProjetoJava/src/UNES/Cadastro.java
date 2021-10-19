package UNES;


public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int regiao;
	private String telefone;
	
	public Cadastro (String nome, String sobrenome, int regiao, String telefone)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.regiao = regiao;
		this.telefone = telefone;
	}
	
	public void menu()
	{
		System.out.println("\nDeseja consultar novamente: ");
		System.out.println("\n1- SIM \t2- N�O");
	}
	
	public void menuEspecialidade()
	{
		System.out.println("\n1- Cl�nico Geral");
		System.out.println("\n2- Ginecologista");
		System.out.println("\n3- Urologista");
		System.out.println("\n4- Cardiologista");
	}
	
	public void menuRegiao()
	{
		System.out.println("\n====        MENU DE REGI�ES       ====");
		System.out.println("\n1- Centro");
		System.out.println("\n2- Zona Norte");
		System.out.println("\n3- Zona Sul");
		System.out.println("\n4- Zona Leste");
		System.out.println("\n5- Zona Oeste");
		System.out.println("\n6- Regi�o Metropolitana");
		System.out.println("\nEscolha a regi�o onde mora: ");
	}
	
	public void info()
	{
		System.out.println("\n\n====    M�dicos Dispon�veis     ====");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}


	
	
