package canciones;
/**
 * Esta clase cancion es para saber el titulo,grupo la duracion de esta y si esta sonando o no
 * @author Ángel Cruz
 * @version 1.0
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
/**
 * En este primer constructor vacio que contiene el titulo duracion y el sonido no esta sonando 
 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/**
 * En este segundo constructor con el titulo y la duracion
 * @param titulo de la cancion
 * @param duracion de la cancion
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/**
 * Este tercer constructor con todos los atributos
 * @param titulo de la cancion
 * @param grupo de la cancion
 * @param duracion de la cancion
 * @param sonando si suena o no
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * Este metodo nos indica si esta sonando la cancion
	 * @return devuelve "sonando" si la cancion esta reproduciendo
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 *Este metodo para la cancion 
	 * @return nos devuelve false si no esta sonando 
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}
	
	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Indicamos si esta sonando
	 * @return devuelve si suena la cancion
	 */
	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * En este metodo nos indica si la cancion es la misma
	 * @param cancion nombre
	 * @return devuelve true si es la misma y false sino
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * Este metodo nos indica de todas las canciones la que tiene mas duracion 
	 * @param canciones un arrays de canciones
	 * @return devuelve la cancion de mayor duracion
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * Este metodo nos pasa de cancion
	 * @param canciones array de canciones
	 * @param titulo de la cancion 
	 * @return las cancion siguiente
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	/**
	 * Este override nos devuelve como queremos que nos muestre en pantalla la cancion
	 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
	
