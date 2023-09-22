package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class implementacionConexionBD implements conexionBD {

	@Override
	public void accesoBD() {
		//Se crean los objetos y se ponen a null
		 Connection BaseDatos = null;
		    Statement st = null;

		    Properties properties= new Properties();
		    try {
		    	//Se busca el archuivo
			   properties.load(new FileInputStream(new File("C:\\Users\\Puesto3\\git\\pruebaBaseDeDatos\\src\\modelo\\claves.properties")));
			 //Se pasa los datos de conexion
		    BaseDatos = DriverManager.getConnection(properties.getProperty("jdbc"), properties.getProperty("USUARIO"), properties.getProperty("CLAVE"));
		    //Se relaciona la base de datos
		    st = BaseDatos.createStatement();
		    //Se mete la query
		    ResultSet rs = st.executeQuery("SELECT * FROM gbp_almacen.gbp_alm_cat_libros");
		    //Sale todos las filas
		    while    ( rs.next() ) {
		    libro l = new libro(rs.getInt("id_libro"),rs.getString("titulo"),rs.getString("autor"),rs.getString("isbn"),rs.getInt("edicion"));
		    System.out.println(l.toString());
		    }
		    //Cierra la base de datos y Statement y Resulset
		    rs.close();
	        st.close();
	        BaseDatos.close();
		    }catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }

	}

}
