package com.cohetes.domain;

import java.util.*;

public class Cohete {
	
	protected String codigo;
	protected int numPropulsores;
	protected List<Propulsor> propulsores = new ArrayList<Propulsor>();
    protected float velocidad;
	
	
	public Cohete (String codigo, List<Propulsor> propulsores) {
		
		this.codigo          = codigo;
		this.propulsores     = propulsores;
		this.numPropulsores  = propulsores.size();
		propulsorCode();
		
	}
	
	public void setVelocidad(float velocidadIni) {
		
		int potenciaTot = 0;
				
		for (Propulsor e : propulsores) {
			potenciaTot += e.getPotenciaMax();
		}

		this.velocidad = (float) (velocidadIni + (100 * Math.sqrt(potenciaTot)));
	}
	
    
	public void propulsorCode() {
		for (Propulsor p : propulsores) {
			p.setCoheteID(codigo);
		}
		
	}

    public void acelerar() {
     int i = 1;
     
    	for(Propulsor p : propulsores) {
    		//Le doy el número del propulsor al thread para imprimirlo después. 
            p.setName("Propulsor " + i);
       		p.start();
    		i++;
    		
    	}
    	
    }
    	

	public String toString() {
		return "Cohete " + codigo + propulsores +".\n";
	}
	

	
	
}
