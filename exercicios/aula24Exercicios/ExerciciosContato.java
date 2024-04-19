package curso_java_basico.aula24Exercicios;

public class ExerciciosContato {

	public static void main(String[] args) {

		/*
		 * Crie uma classe que represente um contato da agenda do seu celular
		 */
		
		Contato contato1 = new Contato();
		contato1.nome = "Clara";
		contato1.email = "clara@gmail.com";
		contato1.endereco = "Travessa paulista, 40";
		
		contato1.telefones = new String[3];
		contato1.telefones [0] = "99999-99999";
		contato1.telefones[1] = "11111-11111";
		contato1.telefones[2] = "2222-22222";
		
		System.out.println(contato1.nome);
		System.out.println(contato1.email);
		System.out.println(contato1.endereco);
		System.out.println(contato1.telefones[0]);
	;
		
		
			
		

	}

}
