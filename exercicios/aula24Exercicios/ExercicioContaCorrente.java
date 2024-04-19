package curso_java_basico.aula24Exercicios;

public class ExercicioContaCorrente {

	public static void main(String[] args) {

		/*
		 * Cria uma classe para representar uma conta corrente que possui um número, um
		 * saldo, um status que informa se ela é especial ou não, um limite.
		 */
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "12345";
		conta.agencia = "123";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 600;
		
		System.out.println("Número da conta = " + conta.numero);
		System.out.println("Número da agencia = " + conta.agencia);
		System.out.println(conta.especial);
		System.out.println("Valor do limete especial = " + conta.limiteEspecial);
		System.out.println("O saldo da conta é = " + conta.saldo);
		
	}

}
