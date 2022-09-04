package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorArea1 extends ParkingCalculator {

	private final int FEE = 10 ; 
	
	
	//Exeption !! 
	@Override
	public double Calculate(Date startParking, Date stopParking, int parkingAreaId)
	{
		
		double totalCost =  0 ; 
		
		int start = startParking.getHours();
		int end = stopParking.getHours();
		int totalHours = end - start ;
		
		
		
//		System.out.println(">>start = " + start);
//		System.out.println(">>end = " + end);
//		System.out.println(">>totalHours = " + totalHours);
		
		totalCost = totalHours * FEE;
		
		

		return totalCost;
		
	}

}
