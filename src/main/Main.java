package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entidades.Especie;
import entidades.Pez;
import entidades.Tanque;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	
	static List<Pez> listaPeces = new ArrayList<>();
	
	static List<Tanque> listaTanques = new ArrayList<>(Arrays.asList(new Tanque((byte) 1, "Junior's", "Verde", 50.3d),
			new Tanque((byte) 2, "Midle's", "Amarillo", 40.3d), new Tanque((byte) 3, "Senior's", "Cafe", 70.3d)));

	static List<Especie> listaEspecies = new ArrayList<>(Arrays.asList(new Especie((byte) 1, "Trucha", "pan"),
			new Especie((byte) 2, "Mojarra", "miga de pan"), new Especie((byte) 3, "Cachama", "pedigri")));

	
	public static void main(String args[]) {
		//agregarPez();
		byte bandera = 0;
		do {
			byte opcion;
			
			System.out.println("| Acuario LosPecaos |");
			System.out.println("|-------------------|");
			System.out.println("| 1. Agregar Peces  |");
			
			opcion = entrada.nextByte();
			
			switch (opcion) {
			case 1: {
				agregarPez();
				break;
			}
			default:
				System.out.println("se jodio, chao");
			}
			
			
			System.out.println("Desea continuar con el programa?");
			bandera = entrada.nextByte();
		}while(bandera != 1);
		
	}
	
	private static void agregarPez() {
		Pez peces = new Pez();
		
		System.out.println("Id del pez:");
		peces.setId(entrada.nextByte());
		System.out.println("Nombre del pez:");
		peces.setNombre(entrada.next());
		System.out.println("Color del pez:");
		peces.setColor(entrada.next());
		System.out.println("Peso del pez:");
		peces.setPeso(entrada.nextDouble());
		System.out.println("Especie del pez:");
		listarEspecie();
		byte idEspecie;
		System.out.println("Ingrese el id de la especie: ");
		idEspecie = entrada.nextByte();
		Especie especie = listaEspecies.stream().filter(j -> j.getId() == idEspecie).findAny().orElse(null);
		if ( especie != null ) {
			peces.setIdEspecie(especie);
		}else {
			System.out.println("la especie no esta registrada");
		}
		
		System.out.println("Tanque del pez:");
		listarTanque();
		byte idTanque;
		System.out.println("Ingrese el id del tanque: ");
		idTanque = entrada.nextByte();
		Tanque tanque = listaTanques.stream().filter(l -> l.getId() == idTanque).findAny().orElse(null);
		if ( tanque != null) {
			peces.setIdTanque(tanque);
		}else {
			System.out.println("el tanque no esta registrado");
		}
		
		listaPeces.add(peces);
	}
	
	private static void listarEspecie() {
		listaEspecies.forEach(k->{
			System.out.println("Id: "+k.getId()+", Nombre: "+k.getNombre());
		});
	}

	private static void listarTanque() {
		listaTanques.forEach(j->{
			System.out.println("Id: "+j.getId()+", Nombre: "+j.getNombre());
		});
	}
}
