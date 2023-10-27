package conutfpr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfessorTest {

	@Test
	public void testCriarProfessorValido() {
		Professor professor = new Professor("Maria", "test@test.com", "Engenharia de Software");
		assertEquals("Maria", professor.getNome());
		assertEquals("test@test.com", professor.getEmail());
		assertEquals("Engenharia de Software", professor.getAreaEspecializacao());
	}

	@Test
	public void testCriarProfessorComNomeNulo() {
		Professor professor = new Professor(null, "test@test.com", "Engenharia de Software");
		assertEquals(null, professor.getNome());
		assertEquals("test@test.com", professor.getEmail());
		assertEquals("Engenharia de Software", professor.getAreaEspecializacao());
	}

	@Test
	public void testCriarProfessorComAreaEspecializacaoNula() {
		Professor professor = new Professor("Maria", "test@test.com", null);
		assertEquals("Maria", professor.getNome());
		assertEquals("test@test.com", professor.getEmail());
		assertEquals(null, professor.getAreaEspecializacao());
	}
}
