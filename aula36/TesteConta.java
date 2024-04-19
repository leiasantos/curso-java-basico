package curso_java_basico.aula36;

public class TesteConta {

	public static void main(String[] args) {
	
		
		Contato contato = new Contato();
		contato.setNome("Clara");
		//contato.setEndereco("Travessa julio prestes");
		//contato.setTelefone("11 2011-5659");
		
		System.out.println(contato.getNome());
		
		
		
		// criar objeto ENDERECO
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua das Rosas");
		end.setNumero("n/a");
		end.setCep("000 000 000");
		end.setCidade("São Paulo");
		end.setEstado("São Paulo");
		
		contato.setEndereco(end);	
		
		if(contato != null && contato.getEndereco() != null) {
			
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());
			System.out.println(contato.getEndereco().getCep());
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		
	 //  criar objeto TELEFONE
		
		
		
		Telefone phone = new Telefone();
		phone.setTipo("Celular");
		phone.setDdd("11");
		phone.setNumero("11 9999-9999");
		
		Telefone phone2 = new Telefone();
		phone2.setTipo("Casa");
		phone2.setDdd("11");
		phone2.setNumero("11 0000-9999");
		
		//contato.setTelefone(phone);
		
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = phone;
		telefones[1] = phone2;
		contato.setTelefones(telefones);
		
		/*if(contato != null && contato.getTelefone() != null ) {
			System.out.println(contato.getTelefone().getTipo() + " " + contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		
		}*/
		
	
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
						
		
	}

}
