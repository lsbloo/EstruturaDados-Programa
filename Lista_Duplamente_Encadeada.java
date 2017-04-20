
public class Lista_Duplamente_Encadeada {
	private int size;
	private Node_Dlist primeiro;
	private Node_Dlist ultimo;
	private Node_Dlist[]  busca;
	private Node_Dlist search;
	static int cont;
	
	public Lista_Duplamente_Encadeada() {
		size = 0;
		primeiro = null;
		ultimo = primeiro;
		this.busca = new Node_Dlist[10];
		cont = 0;
	}
	
	
	public void add(int numero) {
		if(primeiro == null) {
			primeiro = new Node_Dlist();
			ultimo = primeiro;
			Node_Dlist novo = new Node_Dlist();
			novo.setNum(numero);
			novo.setNext(null);
			ultimo.setNext(novo);
			ultimo = novo;
			size++;
		}
		else {
			Node_Dlist novo = new Node_Dlist();
			novo.setNum(numero);
			novo.setNext(null);
			ultimo.setNext(novo);
			ultimo = novo;
			size ++;
			
		}
	}
	public void Imprimir() {
		Node_Dlist Percorre = primeiro.getNext();
		while(Percorre != null) {
			System.err.println(Percorre.getNum());
			Percorre = Percorre.getNext();
		}
	}
	public void buscar(int numero) {
		Node_Dlist Percorre = primeiro.getNext();
		while(Percorre != null) {
			Percorre = Percorre.getNext();
			cont ++;
			if(cont == numero) {
				System.err.print("Elemento Encontrado !> "+Percorre.getNum());
			}
		}
	}
	public boolean verifica_fast(){
		if(size == 0){
			return true;
		}
		return false;
	}

}
