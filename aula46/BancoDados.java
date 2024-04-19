package curso_java_basico.aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {
	
	void abrirConexao();
	void fecharConexao();

}
