package can_misioneros;
import java.util.ArrayList;

import can_misioneros.Estado;

public class Aplicacion_Estado {
	
	public static boolean fue_recorrido(ArrayList<ArrayList<Integer>> pNuevo, ArrayList<ArrayList<ArrayList<Integer>>> pRecorrido )
	{  boolean result = false;
		
		
		for (int elemento=0; elemento < pRecorrido.size();elemento++ ){
			
			if(pNuevo.equals((pRecorrido).get(elemento))){
				result= true;
			}
			
			
		}
		
		return result;
		 
		
		
		
	}
	
		public static String imprimirResultado(ArrayList<ArrayList<ArrayList<Integer>>> pRecorrido){
				
			String mensaje = "";
			for(int k = 0; k < pRecorrido.size();k++){
				int misioneroD = pRecorrido.get(k).get(0).get(0);
				int canibalD = pRecorrido.get(k).get(0).get(1);
				
				int misioneroI = pRecorrido.get(k).get(1).get(0);
				int canibalI = pRecorrido.get(k).get(1).get(1);
				
				mensaje = misioneroD + "Misioneros "+ canibalD +"Canibales"+ "____"+ misioneroI + "Misoneros"+ canibalI+ "Canibales" + "/n" ;
				
				
				
			}
				
			return mensaje;
		
		
	}
	
	
	public static boolean Es_final(Estado pInicio){
		
		boolean resultado = false;
		ArrayList<ArrayList<Integer>> lista= new ArrayList<ArrayList<Integer>>(); 
		lista = pInicio.getEstados();
		
		if(lista.get(0).get(0) == 0 || lista.get(0).get(1) == 0 || lista.get(1).get(0) == 3 || lista.get(1).get(1) == 3){
			
			resultado= true;
		}
		
		
		return resultado;
	
		
		
		
	}

	public static void main(String[] args) {

         
	    //Se crea el objeto con el estado inicial
		
		ArrayList<ArrayList<Integer>> estSInicial = new  ArrayList<ArrayList<Integer>> ();
		
		ArrayList<Integer> est = new ArrayList<Integer>();
		
		est.add(3);
		est.add(3);
		
		estSInicial.add(est);
		
		est.clear();
		
		est.add(0);
		est.add(0);
		
		estSInicial.add(est);
		
		
		Estado inicio = new Estado(0,estSInicial);
		
		//Se crea una lista con posibles viajes
		
		ArrayList<ArrayList<ArrayList<Integer>>> viajesTotales = new  ArrayList<ArrayList<ArrayList<Integer>>> ();
		
		ArrayList<ArrayList<Integer>> viajes = new  ArrayList<ArrayList<Integer>> ();
		
		ArrayList<Integer> viaje = new ArrayList<Integer> ();
		
		viaje.add(1);
		viaje.add(0);
        viajes.add(viaje);
		viaje.clear();
		

		viaje.add(0);
		viaje.add(1);
        viajes.add(viaje);
		viaje.clear();
		

		viaje.add(1);
		viaje.add(1);
        viajes.add(viaje);
		viaje.clear();
		

		viaje.add(2);
		viaje.add(0);
        viajes.add(viaje);
		viaje.clear();
		

		viaje.add(0);
		viaje.add(2);
        viajes.add(viaje);
		viaje.clear();
		
		
		viajesTotales.add(viajes);
		
		ArrayList<ArrayList<ArrayList<Integer>>> recorrido = new  ArrayList<ArrayList<ArrayList<Integer>>> ();
		
		ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> viajesRestantes = new  ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> ();
		
		
		
		while(Es_final(inicio) == false){
		
				
				ArrayList<Integer> trip = new  ArrayList<Integer> ();
				
				int largoVT = viajesTotales.size()-1;
				trip = viajesTotales.get(largoVT).get(0);
				
				try{
					
					ArrayList<ArrayList<Integer>> nuevo = new ArrayList<ArrayList<Integer>>();
					nuevo = inicio.viajar(trip);
					
					if(!(fue_recorrido(nuevo,recorrido))){
						
						recorrido.add(nuevo);
						viajesRestantes.add(viajesTotales);	
						
						
						Estado n = new Estado(0,nuevo);
						inicio = n;
						
					}
					
					
				}
				
				
				catch(Exception IllegalArgumentException){}
			
				
			if( recorrido.isEmpty()){
				int largoRT = recorrido.size()-1;
				ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
				r = recorrido.get(largoRT);
				
				Estado c = new Estado(0,r);
				inicio = c;
				
				
			}
				
			
			
			
		}
		
		if (Es_final(inicio)){
			
			System.out.println("Tenemos un resultado");
			
		}		
		
		
		

	}

}
