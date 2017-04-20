
public class Lista_Encadeada_Simples {
	
	private int size;
	private Node_Lista_Simples next;
	int[] numeros;
	static int aux;
	public Lista_Encadeada_Simples() {
		size = 0;
		next = null;
		this.numeros = new int[10];
	}
	public void add(int num) {
		Node_Lista_Simples novo = new Node_Lista_Simples();
		novo.setNumeros(num);
		novo.setProx(next);
		size++;
		numeros[++size] = novo.getNumeros();
	}
	
	public void Imprimir() {
		for(int i = 0 ; i < numeros.length ; i ++) {
			if(numeros[i] == 0) {
				aux++;
			}
			else {
				System.out.println("Adicionados :"+numeros[i]);
			}
		}
	}
	
	}


