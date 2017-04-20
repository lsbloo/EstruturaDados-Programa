import java.io.PrintStream;

public class Fila_Simples {
	private int PosicaoFila;
	private int[] fila;
	static int capacidade,aux;
	public Fila_Simples(int cap) {
		this.fila = new int[cap];
		PosicaoFila = 0;
		this.capacidade = cap;
	}
	
	public void Enfileirar(int num) {
		this.fila[++PosicaoFila] = num;
	}
	public void Desenfileirar() {
		int temp = this.fila[1];
		this.fila[1] = this.fila[PosicaoFila--];
		System.err.println("Elemento a ser removido! >"+temp);
	}
	
	public void Exibir() {
		for(int i = 0 ; i <fila.length ; i ++) {
			System.err.print(fila[i]);
		}
	}

}
