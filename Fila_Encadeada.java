
public class Fila_Encadeada {
	private Node_FilaEncadeada head;
	private Node_FilaEncadeada tail;
	private Node_FilaEncadeada h;

	static int size;
	static int temp;
	static int a;
	public Fila_Encadeada() {
		h = null;
		size = 0;
		
	}
	
	public void enqueue_linked(int num) {
		Node_FilaEncadeada novo = new Node_FilaEncadeada();
		novo.setNumeros(num);
		novo.setProx(h);
		if(size == 0) {
			head = novo;
		}
		else {
			tail.setProx(novo);
		}
		
		tail = novo;
		size++;
			
		
		
	}
	
	public void dequeue_linked() {
		int temp = head.getNumeros();
		head = head.getProx();
		System.out.println("Elemento Removido >"+temp);
		size --;
		if(size == 0) {
			tail = null ; // a fila esta vazia.
		}
	}
	public boolean verifica_fast(){
		if(size == 0){
			return true;
		}
		return false;
	}
	public void show() {
		Node_FilaEncadeada Percorre = head.getProx();
			while(Percorre != null) {
				System.err.println(Percorre.getNumeros());
			}
		
		
	}
}
