package Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Estruturas.Lista;
import Estruturas.Nodo;


public class LeitorArquivo {
	
	private static ArrayList<Lista> conjuntoListas = new ArrayList<Lista>();
	
	public static Lista getUnificada(String link) throws FileNotFoundException {
		
		carregaArquivo(link);
		
		Lista unificada = new Lista();
		for(Lista a : conjuntoListas) {
			for(String valor : a.getValores()) {
				unificada.addOrdenado(new Nodo(Integer.parseInt(valor)));
			}
		}
		return unificada;
	}
	
	public static Lista getPalavrasOrdenadas(String link) throws FileNotFoundException {
		Lista palavras = carregaArquivo2(link);
		return palavras;
	}
	
	public static ArrayList<Lista> getConjuntoListas() {
		return getConjuntoListas();
	}
	
	private static void carregaArquivo(String link) throws FileNotFoundException {
		Lista aux;
		Scanner in = new Scanner(new FileReader(link));
		while (in.hasNextLine()) {
			String valores[] = in.nextLine().toString().replace("[", "").replace("]", "").split(",");
			aux = new Lista();
			for(String a : valores) {
				aux.addOrdenado(new Nodo(Integer.parseInt(a)));
			}
			conjuntoListas.add(aux);
		}
	}
	
	private static Lista carregaArquivo2(String link) throws FileNotFoundException {
		Lista aux;
		Scanner in = new Scanner(new FileReader(link));
		while (in.hasNextLine()) {
			String valores[] = in.nextLine().toString().split(" ");
			aux = new Lista();
			for(String a : valores) {
				aux.addNaFrase(new Nodo(a));
			}
			return aux; //pegar apenas 1 linhas
		}
		return null;
	}
	
	
}
