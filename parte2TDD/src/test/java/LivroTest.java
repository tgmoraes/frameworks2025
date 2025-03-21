import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LivroTest {
	private Livro livro;
	
	@BeforeEach
	public void inicializaLivro() {
		this.livro = new Livro("HArry Potter", 300); 
	}
	
	//teste1 para validar antes de chegar no final do livro
	@Test
	@DisplayName("testa leitura positiva")
	public void testaLerPos() {
		livro.ler(10);
		livro.ler(30);
		
		assertEquals(40,livro.getPaginasLidas());
	}
	
	//teste2 para validar leitura que conclui livro
	@Test
	@DisplayName("testa leitura de muitas paginas")
	public void testaLerNumGrande() {
		livro.ler(10);
		livro.ler(400);
		
		assertEquals(300, livro.getPaginasLidas());
	}
	

}
