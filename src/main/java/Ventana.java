import java.util.InputMismatchException;
import java.util.Scanner;

public class Ventana {

	public void menu() {
		Scanner teclado = new Scanner(System.in);
		ListaTareas listaTareas = new ListaTareas();
		int opcion = 0;
		do {
			try {
				mostrarMenu();
				opcion = teclado.nextInt();
				if(opcion < 1 || opcion > 4){
					teclado.nextLine();
					System.err.println("Opción ingresada no valida, por favor intente de nuevo");
				}
				switch (opcion){
					case 1:{
						listaTareas.agregarTarea();
						break;
					}
					case 2:{
						listaTareas.eliminarTarea();
						break;
					}
					case 3:{
						listaTareas.mostrarTareas();
						break;
					}
				}
			} catch (InputMismatchException e) {
				teclado.nextLine();
				System.err.println("Opción ingresada no valida, por favor intente de nuevo");
			}
		}while (opcion != 4) ;
		salirMenu();
	}

	public void mostrarMenu(){
		System.out.println("1) Agregar tarea.");
		System.out.println("2) Eliminar tarea.");
		System.out.println("3) Mostrar todas las tareas.");
		System.out.println("4) Salir del programa.");
		System.out.println("Seleccione la opción que desee.");
	}
	public void salirMenu() {
		System.out.println("\n Ha salido del menu");
	}
}