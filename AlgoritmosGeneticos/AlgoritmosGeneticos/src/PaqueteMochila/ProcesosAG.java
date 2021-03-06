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
	
	
	//Cruce
	
	public void Cruce(int punto,Poblacion pop){
		ArrayList<Individuo>cruce = new ArrayList<Individuo>();
		
		Individuo primerCruce;
		Individuo segCruce;
		
		for(int k=0;k<=pop.individuos.length/2;k+=2){
			
			primerCruce= population.getIndividuo(k);
			segCruce=population.getIndividuo(k+1);
			
			Individuo ind1=primerCruce;
			Individuo ind2=segCruce;
			
			for (int x=punto;x>=0;x--){
				ind1.setGen(x, segCruce.getGen(x));
				ind2.setGen(x, primerCruce.getGen(x));
			}
			for (Integer CF : fitness_posible){
				if (ind1.getFitness()==CF){
					cruce.add(ind1);
					break;
				}
		}
			for (Integer CF : fitness_posible){
				if (ind2.getFitness()==CF){
					cruce.add(ind2);
					break;
				}
		}
	
		}
	}
}
	
	
	
	


