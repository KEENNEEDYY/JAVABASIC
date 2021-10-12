package cursoJavaUdemy.entities;

public class Conta {
	
	private Integer numero;
	private String nome;
	private Double saldo=0.0;
	public static final Double TAX = 5.0;
	
	public void depositar(Double value) {
		this.saldo += value;
	}
	public void sacar(Double value) {
		this.saldo -= value + TAX;
	}
	public void printData() {
		//System.out.println("Account "+this.numero+", Holder: "+this.nome+", Balance: "+String.format("%.2f", this.saldo));	
	}
	
	public String toString() {
		return "Accont, "
			   + numero
			   +", Holder: "
			   +nome
			   +", Balance: $"
			   +String.format("%.2f ", saldo);
	}
	
	
	public Conta() {
		
	}
	public Conta(Integer numero, String nome, Double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void primeiroDeposito() {
		this.saldo = 0.0;
	}
}
