package can_misioneros;


import java.util.ArrayList;


public class Estado {
	
	
	
	private ArrayList<ArrayList<Integer>> estados = new ArrayList<ArrayList<Integer>>();
	private int bote;
	
	//Getters and setters
	


	public int getBote() {
		return bote;
	}



	


	public ArrayList<ArrayList<Integer>> getEstados() {
		return estados;
	}






	public void setEstados(ArrayList<ArrayList<Integer>> estados) {
		this.estados = estados;
	}






	public void setBote(int bote) {
		this.bote = bote;
	}

    // Métodos de la clase
	
	

	public boolean aceptar_estado() {
		//verifica que la lista recibida sea un estado válido
		
		/*El siguiente verifica que sea numeros validos */
		
		for(int estado=0; estado< estados.size();estado++){
			
			for(int i = 0; i < 2 ; i++){
				
				if (i > 3 || i < 0){
					return false;
				}
				
			}
			
		/*El siguiente verifica que el # de canibales no sea mayor al 
		  de misioneros  */
			
		for(int i = 0; i < 2 ; i++){
							
				if (i < i+1 ){
					return false;
				}
							
		 }
			
	
			
		}
		
		return true;
		
	}
	
	//Realiza cambios entre estados
	
	public ArrayList<ArrayList<Integer>> viajar(ArrayList<Integer> lista){
		
		ArrayList<ArrayList<Integer>> nuevoEstado = new ArrayList<ArrayList<Integer>>();
		
	    ArrayList<Integer> nuevo = new ArrayList<Integer>();
	    ArrayList<Integer> nuevo1 = new ArrayList<Integer>();
		
	    //int copiaBote = bote;
	    
	    
	    int cambio1=estados.get(0).get(0)- lista.get(0);
	    int cambio2= estados.get(0).get(1)- lista.get(1);
	    nuevo.add(cambio1);
	    nuevo.add(cambio2);
	    
	    nuevoEstado.add(nuevo);
	    
	    
	    int cambio3= estados.get(1).get(0)- lista.get(0);
	    int cambio4= estados.get(1).get(1)- lista.get(1);
	    
	    nuevo1.add(cambio3);
	    nuevo1.add(cambio4);
	    
	    nuevoEstado.add(nuevo1);
	    
	    return nuevoEstado;
	   

		
	}
	
	//Imprime la información
	
	
	
	//Constructor

	public Estado(int pCanoa, ArrayList<ArrayList<Integer>> pEstados) {
		setBote(pCanoa);
		setEstados(pEstados);
		
	}

	public static void main(String[] args) {
		
		
		
		
	}

}
