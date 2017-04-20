import java.util.Scanner;

import javax.swing.JOptionPane;

public class Inter_Prog{
	
	public static void main(String[] args){
		
		System.out.println("----------- Programa De Estrutura De Dados ----------");
		System.out.println("Contém FIlaEncadeada , FIlaSimples -,PilhaEncadeada,PilhaSimples");
		System.out.println("Lista Duplamente Encadeada ");
		System.out.println("Política FIFO-LIFO");
		System.out.println("Desenvolvido por : OsvaldoAiron");
		System.out.println("* Fuiz;;");
		
		System.out.println();
		System.out.println("Opções [1] - FilaEncadeada , [2] -FilaSimples , [3]-PilhaEncadeada , [4]-PilhaSImples, [5] ListaDuplamenteEncadeada");
		System.err.println("Digite a Opcão >");
		String opcao;
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextLine();
		
		
		if(opcao.equals("1")){
			System.out.println("---------Bem vindo ----- [FILA ENCADEADA !]");
			System.out.println("Métodos: Enfileirar(int num), Desenfileirar() ,show()");
			Fila_Encadeada filaE = new Fila_Encadeada();
			int vezes;
			String saindo;
			vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que deseja adicionar ! > "));
			int cont =0;
			boolean sair = true;
			while(sair){
				String test = JOptionPane.showInputDialog("Deseja Enfileirar[1] , Desenfileirar[2] , Mostrar[3]");
				if (test.equals("1")){
					while(cont < vezes){
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
						filaE.enqueue_linked(numero);
						System.out.println("Numero Adicionado !");
						cont++;
					}
					
				}else if(test.equals(("2"))){
					if(filaE.verifica_fast() == true){
						System.err.println("Fila Vazia !!");
					}
					else {
						for(int i = 0 ; i <vezes ; i++){
							filaE.dequeue_linked();
							System.out.println("Removendo Elemento INDICE > "+ i);
						}
					}
				}else if(test.equals("3")){
					/*
					 * METODO SHOW() - EM LOOP INFINITO \=
					 */
					System.out.println("Nao implementado");
				}
				else{
					System.err.println("Opcao Inválida. !! ");
				}
				saindo = JOptionPane.showInputDialog("Deseja sair s/n > ");
				if(saindo.equals("s")){
					System.err.println("VOCE SAIU !!!!!!!!!");
					break;
				}
			}
			
			
		}
		else if(opcao.equals(("2"))){
			System.out.println("---------Bem vindo ----- [FILA SIMPLES !]");
			System.out.println("Métodos: Enfileirar(int num), Desenfileirar() ,Exibir()");
			Fila_Simples fila = new Fila_Simples(100);
			
			int vezes;
			String saindo;
			vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que deseja adicionar ! > "));
			int cont =0;
			boolean sair = true;
			while(sair){
				String test = JOptionPane.showInputDialog("Deseja Enfileirar[1] , Desenfileirar[2] , Exibir[3]");
				if(test.equals("1")){
					while(cont < vezes){
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
						fila.Enfileirar(numero);
						System.out.println("Numero Adicionado !");
						cont++;
					}
					
				}else if(test.equals(("2"))){
					for(int i = 0 ; i <=vezes ; i++){
						fila.Desenfileirar();
						
					}
					
				}
				else if(test.equals("3")){
					fila.Exibir();
				}
				else {
					System.err.println("Opcão Inválida !! ");
				}
				saindo = JOptionPane.showInputDialog("Deseja sair s/n > ");
				if(saindo.equals("s")){
					System.err.println("VOCE SAIU !!!!!!!!!");
					break;
				}
			}
			
			
		}
		else if(opcao.equals("3")){
			System.out.println("---------Bem vindo ----- [Pilha Encadeada !]");
			System.out.println("Métodos: Empilhar(int num), Desempilhar() ,SHOw()");
			Pilha_Encadeada pilhaE = new Pilha_Encadeada();
			
			int vezes;
			String saindo;
			vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que deseja adicionar ! > "));
			int cont =0;
			boolean sair = true;
			while(sair){
				String test = JOptionPane.showInputDialog("Deseja Empilhar[1] , Desempilhar[2] , SHOW[3]");
				if(test.equals("1")){
					while(cont < vezes){
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
						pilhaE.Empilhar(numero);
						System.out.println("Numero Adicionado !");
						cont++;
					}
					
				}else if(test.equals(("2"))){
					if(pilhaE.verifica_fast() == true){
						System.err.println("Pilha Vazia !!");
					}
					else{
						for(int i = 0 ; i <=vezes ; i++){
							pilhaE.Desempilhar();
						}
						
					}
					
				}
				else if(test.equals("3")){
					pilhaE.show();
				}
				else {
					System.err.println("Opcão Inválida !! ");
				}
				saindo = JOptionPane.showInputDialog("Deseja sair s/n > ");
				if(saindo.equals("s")){
					System.err.println("VOCE SAIU !!!!!!!!!");
					break;
				}
			}
		}
		else if (opcao.equals("4")){
			System.out.println("---------Bem vindo ----- [Pilha Simples!]");
			pilha_de_int pilha = new pilha_de_int(100);
			
			int vezes;
			String saindo;
			vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que deseja adicionar ! > "));
			int cont =0;
			boolean sair = true;
			while(sair){
				String test = JOptionPane.showInputDialog("Deseja Empilhar[1] , Desempilhar[2] , Exibir[3]");
				if(test.equals("1")){
					while(cont < vezes){
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
						pilha.push(numero);
						System.out.println("Numero Adicionado !");
						cont++;
					}
					
				}else if(test.equals(("2"))){
					for(int i = 0 ; i <=vezes ; i++){
						pilha.pop();
						
					}
					
				}
				else if(test.equals("3")){
					pilha.show();
				}
				else {
					System.err.println("Opcão Inválida !! ");
				}
				saindo = JOptionPane.showInputDialog("Deseja sair s/n > ");
				if(saindo.equals("s")){
					System.err.println("VOCE SAIU !!!!!!!!!");
					break;
				}
			}
		}
		else if (opcao.equals("5")){
			System.out.println("---------Bem vindo ----- [Lista Duplamente ENcadeada !]");
			System.out.println("Métodos: ADICIONAR(INT NUM) , IMPRIMIR() , BUSCAR()");
			Lista_Duplamente_Encadeada listaligada = new Lista_Duplamente_Encadeada();
			
			int vezes;
			String saindo;
			vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que deseja adicionar ! > "));
			int cont =0;
			boolean sair = true;
			while(sair){
				String test = JOptionPane.showInputDialog("Deseja Adicionar[1] , Imprimir[2] , Buscar[3]");
				if(test.equals("1")){
					while(cont < vezes){
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
						listaligada.add(numero);
						System.out.println("Numero Adicionado !");
						cont++;
					}
					
				}else if(test.equals(("2"))){
					if(listaligada.verifica_fast() == true){
						System.err.println("Pilha Vazia !!");
					}
					else{
						for(int i = 0 ; i <=vezes ; i++){
							listaligada.Imprimir();
						}
						
					}
					
				}
				else if(test.equals("3")){
					int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite num >"));
					listaligada.buscar(numero);
				}
				else {
					System.err.println("Opcão Inválida !! ");
				}
				saindo = JOptionPane.showInputDialog("Deseja sair s/n > ");
				if(saindo.equals("s")){
					System.err.println("VOCE SAIU !!!!!!!!!");
					break;
				}
			}
		}
		else {
			System.err.println("Opcão Inválida !!");
		}
		
    
	}
	
	}
	

