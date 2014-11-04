package PaqueteMochila;

public class Fitness {


	public int getFitness(Individuo x){
		int valor =0;
		
		for (int i=0;i<=3;i++){
			int pot = (int)Math.pow(2,i);
			if (x.getGen(i)==1){
				int conversion = x.getGen(i) * pot;
				valor = valor+ conversion;
			}
		}
		return (int)Math.pow(valor,2);
	}
}
