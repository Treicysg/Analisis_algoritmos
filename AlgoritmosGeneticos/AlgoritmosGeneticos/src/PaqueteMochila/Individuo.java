package PaqueteMochila;

import java.util.Random;

public class Individuo {
	
	private int beneficio;
	private int peso;
	
	private byte[] genes = new byte[4];
	
	private int fitness= 0;
	
	
	
	
	
	
	//************************************************************************
	

	public void generarIndividuo(){
        Random rg = new Random();
        for(int i =0; i < 4; i++){
            byte gene = (byte) rg.nextInt(2);
            genes[i] = gene;
        }
	}

	public Individuo(int value3,int value2,int value1,int value0){
		genes[0]=(byte) value0;
		genes[1]=(byte) value1;
		genes[2]=(byte) value2;
		genes[3]=(byte) value3;
		fitness = this.getFitness();
	}
	public Individuo(){}

	
	public byte getGen(int index){
		return genes[index];
	}
	
	public int getFitness(){
		Fitness x = new Fitness();
		return x.getFitness(this);
	}
	
	
	
	
	

}
