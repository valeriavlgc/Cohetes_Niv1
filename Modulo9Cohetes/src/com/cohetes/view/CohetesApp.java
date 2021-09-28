package com.cohetes.view;

import java.util.ArrayList;
import java.util.List;
import com.cohetes.domain.Cohete;
import com.cohetes.domain.Propulsor;

public class CohetesApp {

	public static void main(String[] args) {
		
		List<Propulsor> propCohete1 = new ArrayList<Propulsor>(); 
		//El prop.1 va con potencia objetivo mayor que potencia max para probar que fuciona el "freno".
		Propulsor propulsor1 = new Propulsor(10,11);
		Propulsor propulsor2 = new Propulsor(30,29); 
		Propulsor propulsor3 = new Propulsor(80,79);
		propCohete1.add(propulsor1); propCohete1.add(propulsor2); propCohete1.add(propulsor3);
		
		List<Propulsor> propCohete2 = new ArrayList<Propulsor>();
		Propulsor propulsor11 = new Propulsor(30,29); Propulsor propulsor22 = new Propulsor(40,39); 
		Propulsor propulsor33 = new Propulsor(50,49); Propulsor propulsor44 = new Propulsor(50,49);
		Propulsor propulsor55 = new Propulsor(30,29); Propulsor propulsor66 = new Propulsor(10,9);
		
		propCohete2.add(propulsor11); propCohete2.add(propulsor22); propCohete2.add(propulsor33); propCohete2.add(propulsor44); 
		propCohete2.add(propulsor55); propCohete2.add(propulsor66);
		
		
		Cohete cohete1 = new Cohete("32WESSDS", propCohete1);
		Cohete cohete2 = new Cohete("LDSFJA32", propCohete2);
		
    	

		cohete1.acelerar();	
		cohete2.acelerar();
	}

}
