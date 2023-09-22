package vista;

import modelo.conexionBD;
import modelo.implementacionConexionBD;
public class Principal {

	public static void main(String[] args) {
		conexionBD con= new implementacionConexionBD();
		con.accesoBD();

	}

}
