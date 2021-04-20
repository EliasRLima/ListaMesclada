package Estruturas;

public class Nodo {

	private Nodo ante;
	private Nodo prox;
	private int valor;
	private String texto;
	
	public Nodo(int valor) {
		super();
		this.valor = valor;
		this.prox = null;
	}
	
	public Nodo(String texto) {
		super();
		this.texto = texto;
		this.prox = null;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
