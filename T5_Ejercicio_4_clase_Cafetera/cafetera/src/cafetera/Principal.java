package cafetera;
T5_Ejercicio_4_clase_cafetera
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cafetera pruebaCafetera;
		pruebaCafetera=new Cafetera();
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
		
		System.out.println("Introduce la capacidad máxima de la cafetera");
		Scanner sc;
		sc = new Scanner(System.in);
		int cantidad=sc.nextInt();
		pruebaCafetera=new Cafetera(cantidad);
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
		
		pruebaCafetera.llenarCafetera();
		System.out.println("Después de llenar la cafetera...");
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
		
		pruebaCafetera.vaciarCafetera();
		System.out.println("Después de vaciar la cafetera...");
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
		
		pruebaCafetera.agregarCafe(50);
		System.out.println("Después de llenar la cafetera con la cantidad anterior...");
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
		
		int taza=60;
		System.out.println("Después de servir: "+taza+" cc de café...");
		pruebaCafetera.servirTaza(taza);
		System.out.println("La cafetera tiene una capacidad máxima de: "+pruebaCafetera.getCapacidadMaxima());
		System.out.println("La cafetera tiene una cantidad de café actualmente de: "+pruebaCafetera.getCantidadActual());
	}

}
