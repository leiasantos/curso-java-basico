package curso_java_basico.exercicios_aulas2527;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	int transferencia;
	int saques;
	int folhasCheque;
	
	
	boolean realizarSaque(double quantiaASacar) {
		
		if(saldo >= quantiaASacar) { // se tem saldo na conta
			saldo -= quantiaASacar;
			return true;
		}else { // se não tem saldo na conta 
			if(especial) {
				
				double limite = limiteEspecial - saldo;
			if(limite >= quantiaASacar) {
				saldo -= quantiaASacar;
				return true;
			}else {
				return false;
			}
				
			}else {
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	

}
