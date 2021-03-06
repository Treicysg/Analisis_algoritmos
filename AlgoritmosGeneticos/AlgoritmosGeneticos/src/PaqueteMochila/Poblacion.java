package PaqueteMochila;
import PaqueteMochila.Individuo;

import java.util.ArrayList;

public class Poblacion {
	
	Individuo[] individuos;
	
	public Poblacion (ArrayList<Individuo> x){
		individuos = new Individuo [x.size()];
		for (int i=0;i<x.size();i++){
			almacenarIndividuo(i,x.get(i));
		}
	}
	
	public Poblacion(int tamanoPoblacion,boolean inicializar){
		individuos = new Individuo [tamanoPoblacion];
		if (inicializar){
			for (int i=0;i<tamanoPoblacion;i++){
				Individuo nuevo = new Individuo();
				nuevo.generarIndividuo();
				almacenarIndividuo(i,nuevo);
			}
		}
	}
	
	public void almacenarIndividuo(int index,Individuo indiv){
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
