package PaqueteMochila;

import java.util.ArrayList;

public class ProcesosAG {
	
	private Poblacion population;
	private ArrayList<Integer> fitness_posible=new ArrayList<Integer>();
	private int max_weight;

	public ProcesosAG(ArrayList<Individuo>partida,int peso_maximo) {
		
		population = new Poblacion(partida);
		for (int i=0;i<population.individuos.length;i++){
			fitness_posible.add(population.getIndividuo(i).getFitness());
		}
		
	}
	
	public void Seleccion(){
		
		for (int j=0;j<3;j++){
			Poblacion nueva = new Poblacion(population.individuos.length,false);
			for (int i=0;i<population.individuos.length;i++){
				int ale1=(int)Math.floor(Math.random()*population.individuos.length);
				int ale2=(int)Math.floor(Math.random()*population.individuos.length);
				int ale3=(int)Math.floor(Math.random()*population.individuos.length);
			}
	}
	}
}
	
	
	
	


