import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
	private ArrayList tareasAlmacenadas = new ArrayList();
	private Ventana unnamed_Ventana_;

	public void agregarTarea() {
		Scanner teclado = new Scanner(System.in);
		String tarea;
		System.out.println("Ingrese la nueva tarea.");
		tarea = teclado.nextLine();
		tareasAlmacenadas.add(tarea);
	}

	public void eliminarTarea() {
		Scanner teclado = new Scanner(System.in);
		int tareaAeliminar;
		System.out.println("Ingrese el indice de la tarea que desee eliminar.");
		tareaAeliminar = teclado.nextInt();
		tareasAlmacenadas.remove(tareaAeliminar-1);
	}

	public void mostrarTareas() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < tareasAlmacenadas.size(); i++) {
			System.out.println((i+1)+"."+ tareasAlmacenadas.get(i));
		}
	}

	public ArrayList getTareasAlmacenadas() {
		return this.tareasAlmacenadas;
	}

	public void setTareasAlmacenadas(ArrayList tareasAlmacenadas) {
		this.tareasAlmacenadas = tareasAlmacenadas;
	}
}