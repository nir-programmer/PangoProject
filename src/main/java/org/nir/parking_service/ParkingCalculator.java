package org.nir.parking_service;

import java.util.Date;


public  class ParkingCalculator implements IParkingCalculator 
{
	
	private static final ParkingCalculatorForAreaStrategyFactory parkingCalculatorForAreaStrategyFactory = new ParkingCalculatorForAreaStrategyFactory();

	private ParkingCalculatorForAreaStrategy parkingCalculatorForAreaStrategy; 
	
	//Assume the default parkingAreaId is 1(Can be changed later at run time when calling to Calculate() method) 
	public ParkingCalculator()
	{
		this.parkingCalculatorForAreaStrategy = parkingCalculatorForAreaStrategyFactory.getParkingCalculatorForAreaStrategy(1);
		
	}
	
	
	
	
	public ParkingCalculator(ParkingCalculatorForAreaStrategy parkingCalculatorForAreaStrategy) {
		
		this.parkingCalculatorForAreaStrategy = parkingCalculatorForAreaStrategy;
		
	}




	/**
	 * @param startParking: Date - the start time of the parking
	 * @parm stopParking: Date - the stop time of the parking 
	 * @param parkingAreaId: int - the id of the strategy to be created by the Factory and injected 
	 * 
	 * 
	 * 	Update the ParkingCalculatorForAreaStrategy:
			Create an instance by using the ParkingCalculatorForAreaStrategyFactory and replace the current ParkingCalculatorForAreaStrategy 
			based on the parkingAreaId
	 */
	@Override
	public  double Calculate(Date startParking, Date stopParking, int parkingAreaId)  //throws ParkingTimeException
	{
		double totalCost = 0;
		
		
		
		this.parkingCalculatorForAreaStrategy = parkingCalculatorForAreaStrategyFactory.getParkingCalculatorForAreaStrategy(parkingAreaId);

		try 
		{
			
		//Delegate the call to the ParkingCalculatorForAreaStrategy object 
		totalCost = parkingCalculatorForAreaStrategy.Calculate(startParking, stopParking);
		} 
		catch (ParkingTimeException e)
		{
			System.err.println(e.getMessage());
		}
		 
		return totalCost;
			
	}

}
