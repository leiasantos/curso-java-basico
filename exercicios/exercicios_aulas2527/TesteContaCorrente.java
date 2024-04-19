package curso_java_basico.exercicios_aulas2527;


public class TesteContaCorrente {

	public static void main(String[] args) {

		/*
		 * Cria uma classe para representar uma conta corrente que possui um número, um
		 * saldo, um status que informa se ela é especial ou não, um limite. Desenvolva
		 * métodos para realizar saque (verificando se o cliente pode realizar saques),
		 * despositar dinheiro, consultar saldo e verificar se o cliente está usando
		 * cheque especial ou não. Desenvolva um programa para testar essa classe.
		 */
		
		
       ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "12345";
		conta.agencia = "123";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = 600;
		
		System.out.println("Número da conta = " + conta.numero);
		System.out.println("Número da agencia = " + conta.agencia);
		System.out.println(conta.especial);
		System.out.println("Valor do limete especial = " + conta.limiteEspecial);
		
		boolean saqueEfetuado = conta.realizarSaque(200);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
		}else {
			System.out.println("Não foi possivel realizar o saque. Saldo insuficiente");
		}
		
		System.out.println("Depósito de 800 reais");
		conta.depositar(800);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		

	}

}
