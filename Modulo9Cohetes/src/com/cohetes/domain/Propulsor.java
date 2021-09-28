package com.cohetes.domain;

public class Propulsor extends Thread {

	protected int potenciaMax;
	protected int potActual;
	protected int potenciaObj;
	protected String coheteID;
	
	
	public Propulsor (int potenciaMax, int potenciaObj) {
		
		this.potActual   = 0; 
		this.potenciaMax = potenciaMax;
		this.potenciaObj = potenciaObj;
		
		
	}
	
	
	  
	public void setCoheteID(String coheteID) {
		this.coheteID = coheteID;
	}

	public int getPotenciaMax () {
		return potenciaMax;
	}
	
	public int getPotenciaObj () {
		return potenciaObj;
	}
	
	public int getPotActual () {
		return potActual;
	}
	
	public void setPotActual (int potActual) {
		this.potActual = potActual;
	}
	
	public String toString() {
		return "Propulsor [potenciaMax=" + potenciaMax + ", potActual=" + potActual +"]\n";
	}
	
    public void run() {
    		int i;
			
    		for (i = potActual; i <= potenciaObj; i++) {
    			
    			if(potActual >= potenciaMax) {
    				currentThread().interrupt();
    				System.out.println(coheteID + " " + Thread.currentThread().getName() + "PARADO. Exceso de potencia objetivo.");
    				return;
    			}
    			
    		    if(potActual == potenciaObj) {
    				System.out.println(coheteID + " " + Thread.currentThread().getName() + " " + "POTENCIA OBJETIVO ALCANZADA. "
    						+ "pMax= " + potenciaMax + " pActual= " + potActual + " pObjetivo= " + potenciaObj +"]");
    			} else {
    			
    			potActual += 1; 
    			System.out.println(coheteID + " " + Thread.currentThread().getName() + " " + "[pMax= " + potenciaMax + " pActual= " + potActual + " pObjetivo= " + potenciaObj +"]");
                
    			
    			      try {
    			    	  Thread.sleep(1000);
    			      } catch (InterruptedException e) {
    			    	 Thread.currentThread().interrupt();
    			    	 System.out.println(coheteID + " " + Thread.currentThread().getName() + " PARADO. Exceso de potencia objetivo.");
    			      }
    			}
    		}
    		
    		
    	}
}

	

