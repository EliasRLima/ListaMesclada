package Estruturas;

import java.util.ArrayList;

public class Lista {
	
	private Nodo inicio;
	
	public Lista() {
		// TODO Auto-generated constructor stub
		inicio = null;
	}

	public boolean isNull(){
	   if (inicio == null)
	      return true;
	   else
	      return false;
	}

	public void addOrdenado(Nodo n) {
	      if(isNull()) {
	         inicio = n; 
	         return;
	      }
	      else {
	    	  if(inicio.getValor() >= n.getValor() ) {
	    		  n.setProx(inicio);
	    		  this.inicio = n;
	    		  return;
	    	  }else {
	    		  Nodo aux = inicio;
	    		  while(aux.getProx() != null) {
	 	    		 if(aux.getProx().getValor() >= n.getValor()) {
	 	    			 Nodo aux2 = aux.getProx();
	 	    			 aux.setProx(n);
	 	    			 n.setProx(aux2);
	 	    			 return;
	 	    		 }
	 	    		 aux = aux.getProx();
	 	    	  }
	 	         aux.setProx(n);
	    	  }
	    	 
	    	 
	      }
	}
	
	public ArrayList<String> getValores() {
		
		ArrayList<String> valores = new ArrayList<String>();
		Nodo aux = inicio;
		while(aux != null) {
	    	valores.add("" + aux.getValor());
	    	aux = aux.getProx();
	    }
		return valores;
	}
	
	public void list() {
		Nodo aux = inicio;
		System.out.print("Saida: ");
		while(aux != null) {
	    	System.out.print("\t" + aux.getValor());
	    	aux = aux.getProx();
	    }
		System.out.println("");
	}
}
