package com.example.actuator.springbootactuator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootActuatorApplication {

	public static void main(String[] args) throws InterruptedException {

		int contador = 0;

		List<String> lista = new ArrayList<>();

		System.out.println("Empezamos el programa");

		System.out.println("Por favor introduzca un número por teclado:");

		int entradaTeclado = 0;

		Scanner entradaEscaner = new Scanner(System.in); // Creación de un objeto Scanner

		entradaTeclado = entradaEscaner.nextInt(); // Invocamos un método sobre un objeto Scanner

		for (int i = 0; i <= entradaTeclado; i++) {
			lista.add("entrada " + i);
			
				if (lista.size() <= 5) {
					System.out.println("Entrada recibida por teclado es: \"" + lista.get(i).toString() + "\"");
					Thread.sleep(500);
				} else {
					Thread.sleep(2000);
					System.out.println("SUMA 1");
					contador++;					
				}
			
			if (contador == 3) {
				System.out.println("SALE");
				break;
			}
		}
		SpringApplication.run(SpringbootActuatorApplication.class, args);

	}

}
