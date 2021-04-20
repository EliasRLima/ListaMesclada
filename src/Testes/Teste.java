package Testes;

import java.io.FileNotFoundException;

import Estruturas.Lista;
import Estruturas.Nodo;
import Service.LeitorArquivo;

public class Teste {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Lista unificada = LeitorArquivo.getUnificada("src/Service/listas.txt");
		unificada.list();
	}
	
}
