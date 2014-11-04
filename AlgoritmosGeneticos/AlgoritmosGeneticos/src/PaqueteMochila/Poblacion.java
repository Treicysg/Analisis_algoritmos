package PaqueteMochila;
import PaqueteMochila.*;

import java.util.ArrayList;

public class Poblacion {
	
	Individuo[] individuos;
	
	public Poblacion (ArrayList<Elemento> x){
		individuos = new Individuo [x.size()];
		for (int i=0;i<x.size();i++){
			guardarIndividuo(i,x.get(i).getIndividuo());
		}
	}
	
	public void guardarIndividuo(int index,Individuo indiv){
		individuos[index] = indiv;
	}
	public Individuo getIndividuo(int index){
		return individuos[index];
}
	
	public Individuo getFittest(){
		Individuo fittest = individuos[0];
		for (int i=0;i<individuos.length;i++){
			if (fittest.getFitness()<= getIndividuo(i).getFitness()){
				fittest=getIndividuo(i);
			}
		}
		return fittest;
	}
	
	
	public Poblacion() {
		// TODO Auto-generated constructor stub
	}

}
