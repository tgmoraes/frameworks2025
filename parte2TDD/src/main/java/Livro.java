
public class Livro {
	
	private int pagsLidas;
	private final String titulo;
	private final int paginas;
	
	public Livro(String nome, int paginas) {
		this.titulo = nome;
		this.paginas = paginas;
		this.pagsLidas = 0;	
	}

	public void ler(int pags) {
		//o if é implementado somente após implementação do teste2 e sua falha
		if(this.pagsLidas+pags> this.paginas) {
			this.pagsLidas = this.paginas;
		} else {
			//o incremento é implementado somente após a implementação do teste1 e sua falha
			this.pagsLidas+=pags;
		}
	
	}

	public Integer getPaginasLidas() {
		return this.pagsLidas;
	}
}
