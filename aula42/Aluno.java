package curso_java_basico.aula42;

public class Aluno  {
	
	
	public Aluno() {
		super();
		
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}

	private String curso;
	private double[] notas;
	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}

	
//	public String obterEtiquetasEndereco() {
		// TODO Auto-generated method stub
		//return null;
//	}


//	public void imprimirEtiquetaEndereco() {
	
		//System.out.println(this.obterEtiquetaEndereco());
		
	//}
	

}
