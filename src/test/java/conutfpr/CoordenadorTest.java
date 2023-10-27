package conutfpr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoordenadorTest {

	@Test
	public void testCriarCoordenadorValido() {
		Coordenador coordenador = new Coordenador("Maria", "test@test.com", "455");
		assertEquals("Maria", coordenador.getNome());
		assertEquals("test@test.com", coordenador.getEmail());
		assertEquals("455", coordenador.getMatricula());
	}

	@Test
	public void testCriarCoordenadorComNomeNulo() {
		Coordenador coordenador = new Coordenador(null, "test@test.com", "455");
		assertEquals(null, coordenador.getNome());
		assertEquals("test@test.com", coordenador.getEmail());
		assertEquals("455", coordenador.getMatricula());
	}

	@Test
	public void testCriarCoordenadorComMatriculaNula() {
		Coordenador coordenador = new Coordenador("Maria", "test@test.com", null);
		assertEquals("Maria", coordenador.getNome());
		assertEquals("test@test.com", coordenador.getEmail());
		assertEquals(null, coordenador.getMatricula());
	}
}
