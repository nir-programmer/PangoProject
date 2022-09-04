package org.nir.parking_service;

import java.util.Date;

/**
 * ASSUMPTIONS: 
 * 	1. All sub classes of ParkingCalculator have this method
 * @author nir
 *
 */
public  class ParkingCalculator implements IParkingCalculator {
	
	private static final ParkingCalculatorForAreaFactory parkingCalculatorForAreaFactory = new ParkingCalculatorForAreaFactory();

	//An instance of ParkingCalculatorForArea will be created by the factory and will be injected in the Calculate method
	private ParkingCalculatorForArea parkingCalculatorForArea;
	
	
	public ParkingCalculator()
	{

	}


	@Override
	public  double Calculate(Date startParking, Date stopParking, int parkingAreaId)  //throws ParkingTimeException
	{
		double totalCost = 0;
		
		//Inject an implementation of ParkingCalculatorForArea by passing  the parkingAreaId to the factory method of the factory object
		this.parkingCalculatorForArea = parkingCalculatorForAreaFactory.getParkingCalculatorForArea(startParking, stopParking, parkingAreaId);
		
		
		try {
			
			totalCost = this.parkingCalculatorForArea.Calculate(startParking, stopParking);
			
		} 
		catch (ParkingTimeException e) {
			
			System.err.println(e.toString());
		}
		 
		return totalCost;
		
		
	}

	


	

}
