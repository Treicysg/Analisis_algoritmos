import java.util.ArrayList;


public class AplicacionCambio {

	public static void main(String[] args) {
		
		int cantidad = 80;
		ArrayList<Integer> mon = new ArrayList<Integer>();
		
		mon.add(1);
		mon.add(5);
		mon.add(3);
		mon.add(8);
		
		Cambio Mivuelto = new Cambio(cantidad,mon);
		
		Mivuelto.generarSoluciones(cantidad, mon);
		Mivuelto.imprimoSoluciones();
        
	}

}
