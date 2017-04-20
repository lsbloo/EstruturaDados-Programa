import java.io.PrintStream;

public class Pilha_Encadeada {
	
	private Node_Pilha topo;
	private int size;
	
	public Pilha_Encadeada() {
		topo = null;
		size = 0;
	}
	
	public void Empilhar(int num) {
		Node_Pilha novo = new Node_Pilha();
		novo.setNumeros(num);
		novo.setAnterior(topo);
		topo = novo;
		size ++;
	}
	
	public  PrintStream Desempilhar() {
		while(size >= 0){
			if(topo != null) {
				int valor = topo.getNumeros();
				topo = topo.getAnterior();
				size --;
				System.out.println("Elemento Removido ! >"+valor);
			}
			return null;
			
		}
		return null;
	}
	public void show() {
		Node_Pilha Percorre = topo.getAnterior();
		while(Percorre != null) {
			System.err.print(Percorre.getNumeros());
			Percorre = Percorre.getAnterior();
		}
		
	}
	public boolean verifica_fast(){
		if(size == 0){
			return true;
		}
		return false;
	}

}
