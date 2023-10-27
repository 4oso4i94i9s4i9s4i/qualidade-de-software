package conutfpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlunoTest {

	@Test
	public void testCriarAlunoValido() {
		Aluno aluno = new Aluno("Ricardo", "2418347", "ricardofranca@alunos.utfpr.edu.br");
		Assertions.assertEquals("Ricardo", aluno.getNome());
		Assertions.assertEquals("2418347", aluno.getRa());
		Assertions.assertEquals("ricardofranca@alunos.utfpr.edu.br", aluno.getEmail());
	}

	@Test
	public void testCriarAlunoComNomeNulo() {
		Aluno aluno = new Aluno(null, "2418347", "ricardofranca@alunos.utfpr.edu.br");
		Assertions.assertEquals(null, aluno.getNome());
		Assertions.assertEquals("2418347", aluno.getRa());
		Assertions.assertEquals("ricardofranca@alunos.utfpr.edu.br", aluno.getEmail());
	}

	@Test
	public void testCriarAlunoComRaNulo() {
		Aluno aluno = new Aluno("Ricardo", null, "ricardofranca@alunos.utfpr.edu.br");
		Assertions.assertEquals("Ricardo", aluno.getNome());
		Assertions.assertEquals(null, aluno.getRa());
		Assertions.assertEquals("ricardofranca@alunos.utfpr.edu.br", aluno.getEmail());
	}

	@Test
	public void testCriarAlunoComEmailNulo() {
		Aluno aluno = new Aluno("Ricardo", "2418347", null);
		Assertions.assertEquals("Ricardo", aluno.getNome());
		Assertions.assertEquals("2418347", aluno.getRa());
		Assertions.assertEquals(null, aluno.getEmail());
	}

}
