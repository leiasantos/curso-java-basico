package curso_java_basico.exercicios9;

public class ContatoNaoExisteException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public String getMessage() {
		return "Contato " + nomeContato + "não existe";
	}

}
