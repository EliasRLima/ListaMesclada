package Estruturas;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

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
	
	public void addNaFrase(Nodo n) {
			Collator brCollator = Collator.getInstance(new Locale("pt","BR"));
			brCollator.setStrength(Collator.PRIMARY);
	      if(isNull()) {
	         inicio = n; 
	         return;
	      }
	      else {
	    	  if(brCollator.compare(inicio.getTexto(), n.getTexto()) > 0) {
	    		  n.setProx(inicio);
	    		  this.inicio = n;
	    		  return;
	    	  }else {
	    		  Nodo aux = inicio;
	    		  while(aux.getProx() != null) {
	 	    		 if(brCollator.compare(aux.getTexto(), n.getTexto()) > 0) {
	 	    			 Nodo aux2 = aux.getProx();
	 	    			 aux.setProx(n);
	 	    			 n.setProx(aux2);
	 	    			 return;
	 	    		 }
	 	    		if(aux.getProx().getProx() == null) {
	 	    			if(brCollator.compare(aux.getProx().getTexto(), n.getTexto()) > 0) {
	 		 	        	n.setProx(aux.getProx());
	 		 	        	aux.setProx(n);
	 		 	        	return;
	 		 	        }
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
	
	public void text() {
		Nodo aux = inicio;
		System.out.print("Saida: ");
		while(aux != null) {
	    	System.out.print(" " + aux.getTexto());
	    	aux = aux.getProx();
	    }
		System.out.println("");
	}
}
