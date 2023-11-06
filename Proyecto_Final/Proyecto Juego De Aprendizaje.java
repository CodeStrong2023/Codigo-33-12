public class JuegoDeAprendizaje {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String respuesta;
		System.out.println("Resistencia es capital de Chaco?");
		respuesta = bufEntrada.readLine();
		if (respuesta.equals("si")) {
			System.out.println("9x9 es = a 81?");
			respuesta = bufEntrada.readLine();
			if (respuesta.equals("si")) {
				System.out.println(" La Localidad de San Bernardo pertenece al departamento O Higgins?");
				respuesta = bufEntrada.readLine();
				if (respuesta.equals("si")) {
					System.out.println("Felicidades has ganado el juego");
				} else {
					System.out.println("Has perdido el juego");
				}
			} else {
				System.out.println("Incorrecto Has perdido el juego");
			}
		} else {
			System.out.println("Incorrecto Has perdido el juego");
		}
	}


}


