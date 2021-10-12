package cursoJavaUdemy.entities;

public class Aluno {
	
	private String name;
	private Double notaA;
	private Double notaB;
	private Double notaC;
	
	public Double notaFinal() {
		return (this.notaA+this.notaB+this.notaC);
	}
	
	public void aprovado() {
		if (notaFinal() >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING "+String.format(" %.2f POINTS", 60.00-notaFinal()));
		}
	}
	
	public Aluno() {
		
	}

	public Aluno(String name, Double notaA, Double notaB, Double notaC) {
		this.name = name;
		this.notaA = notaA;
		this.notaB = notaB;
		this.notaC = notaC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNotaA() {
		return notaA;
	}

	public void setNotaA(Double notaA) {
		this.notaA = notaA;
	}

	public Double getNotaB() {
		return notaB;
	}

	public void setNotaB(Double notaB) {
		this.notaB = notaB;
	}

	public Double getNotaC() {
		return notaC;
	}

	public void setNotaC(Double notaC) {
		this.notaC = notaC;
	}

}
