package curso_java_basico.aula52;

public class DivisaoNaoExata extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
		
	}

	@Override
	public String toString() {
		return "Resultado de " + num + " / " + dem + " não é um inteiro!";
	}

	
	

}
