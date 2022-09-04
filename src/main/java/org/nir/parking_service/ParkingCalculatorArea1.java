package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorArea1 extends ParkingCalculator {

	private final int COST_PER_HOUR = 10 ; 
	
	

	@Override
	public double Calculate(Date startParking, Date stopParking, int parkingAreaId)
	{
		
		double totalCost =  0 ; 
		
		int start = startParking.getHours();
		int end = stopParking.getHours();
		int totalHours = end - start ;
		
	
		
		totalCost = totalHours * COST_PER_HOUR;
		
		

		return totalCost;
		
	}

}
