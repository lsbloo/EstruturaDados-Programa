import java.io.PrintStream;
import java.util.Arrays;

public class pilha_de_int {
	
	public int PosicaoPilha;
	private int[] pilha_de_int;
	private int capacidade;
	
	public pilha_de_int(int cap) {
		this.PosicaoPilha = -1;
		this.pilha_de_int = new int[cap];
		this.capacidade = cap;
	}
	
	public int capacity(){
		return this.capacidade;
	}
	public void push(int numero) {
		if(PosicaoPilha == capacidade) {
			System.out.print("PiLHA cHEIA!! ");
		}
		else {
			this.pilha_de_int[++PosicaoPilha] = numero;
			//System.out.println(Arrays.toString(pilha_de_int));
			System.out.print("ok!");
		}
	}
	public PrintStream pop() {
		if(PosicaoPilha != -1) {
			System.out.println("Elemento Removido ! >"+this.pilha_de_int[this.PosicaoPilha --]);
			
			
		}
		
		return null;
	}
	
	public void show() {
		for(int i = 0 ; i<pilha_de_int.length ; i++) {
			System.out.println(pilha_de_int[i]);
		}
	}

}
