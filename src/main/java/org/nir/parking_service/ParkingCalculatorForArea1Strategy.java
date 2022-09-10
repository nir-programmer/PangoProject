package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorForArea1Strategy implements ParkingCalculatorForAreaStrategy {

	private final int COST_PER_HOUR = 10;
	
	
	
	@Override
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException {
		
		if(!this.isStopParkingAfterStartParking(startParking, stopParking))
			throw new ParkingTimeException("ParkingCalculatorForArea1()Calculate():startParking should be before stopParking!"
				+ ", But startParking = " + startParking + " and stopParking = "  + stopParking);
		
//		//super.isStopParkingAfterStartParking();
//		if(!this.isStopParkingAfterStartParking(startParking, stopParking)) throw new ParkingTimeException("ParkingCalculatorForArea1()Calculate():startParking should be before stopParking!"
//				+ ", But startParking = " + startParking + " and stopParking = "  + stopParking);
		
		int firstHour = startParking.getHours();
		int lastHour = stopParking.getHours();
		int  totalHours = this.getTotalHours(startParking, stopParking);
		System.out.println(">>ParkingCalclaurforArea1:Calculate(): totolHours = " + totalHours);
		
		
		double totalCost = totalHours * COST_PER_HOUR;
		System.out.println(">>ParkingCalculatorForArea1:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);
		
		return totalCost;
	}
	
	
	
	

}
