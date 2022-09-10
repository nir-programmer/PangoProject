package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorForArea2Strategy implements ParkingCalculatorForAreaStrategy {

	private static  final int COST_PER_HOUR = 5;
	private static final int MAX_NUMBER_OF_HOURS_WITH_PAYMENT = 4 ;
	
	
	@Override
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException 
	{
		if(!this.isStopParkingAfterStartParking(startParking, stopParking))
			throw new ParkingTimeException("ParkingCalculatorForArea2()Calculate():startParking should be before stopParking!"
				+ ", But startParking = " + startParking + " and stopParking = "  + stopParking);
		
		
		isStopParkingAfterStartParking(startParking, stopParking);
		
		double totalCost = 0;
		
		int firstHour = startParking.getHours();
		int lastHour = stopParking.getHours();
		int  totalHours = getTotalHours(startParking, stopParking);
		
		
		if(totalHours > MAX_NUMBER_OF_HOURS_WITH_PAYMENT ) totalCost = 20 ; 
		
		else totalCost = totalHours * COST_PER_HOUR;
		
		
		System.out.println(">>ParkingCalclaurforArea2:Calculate(): totolHours = " + totalHours);
		
		System.out.println(">>ParkingCalculatorForArea2:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);
		

		return totalCost;
	}

}

