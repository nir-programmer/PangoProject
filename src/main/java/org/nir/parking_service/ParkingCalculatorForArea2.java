package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorForArea2 extends ParkingCalculatorForArea {

	private static  final int COST_PER_HOUR = 5;
	private static final int MAX_NUMBER_OF_HOURS_WITH_PAYMENT = 4 ;
	
	
	
	public ParkingCalculatorForArea2(Date startParking, Date stopParking) {
		super(startParking, stopParking);
	}

	@Override
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException 
	{
		if(!this.isStopParkingAfterStartParking()) throw new ParkingTimeException("REVERSE");
		
		double totalCost = 0;
		
		
		int firstHour = startParking.getHours();
		int lastHour = stopParking.getHours();
		//int totalHours = lastHour - firstHour; 
		
		
		
		
		int  totalHours = this.getTotalHours();
		
		
	
		if(totalHours > MAX_NUMBER_OF_HOURS_WITH_PAYMENT ) totalCost = 20 ; 
		
		else totalCost = totalHours * COST_PER_HOUR;
		
		
		System.out.println(">>ParkingCalclaurforArea2:Calculate(): totolHours = " + totalHours);
		
		
		
		System.out.println(">>ParkingCalculatorForArea2:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);
		
//		
//		System.out.println(">>ParkingCalculatorForArea1:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST");
//		
//		System.out.println(">>ParkingCalculatorForArea2:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);
//
//		
		
		return totalCost;
	}

}

