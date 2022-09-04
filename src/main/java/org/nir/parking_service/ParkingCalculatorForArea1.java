package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorForArea1 extends ParkingCalculatorForArea {

	private final int COST_PER_HOUR = 10;
	
	
	public ParkingCalculatorForArea1(Date startParking, Date stopParking) {
		super(startParking, stopParking);
	}

	@Override
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException {
		
		//super.isStopParkingAfterStartParking();
		if(!this.isStopParkingAfterStartParking()) throw new ParkingTimeException("ParkingCalculatorForArea1()Calculate():startParking should be before stopParking!"
				+ ", But startParking = " + this.startParking + " and stopParking = "  + this.stopParking);
		
		
		
		
		int firstHour = startParking.getHours();
		int lastHour = stopParking.getHours();
		int  totalHours = this.getTotalHours();
		System.out.println(">>ParkingCalclaurforArea1:Calculate(): totolHours = " + totalHours);
		
		
		double totalCost = totalHours * COST_PER_HOUR;
		System.out.println(">>ParkingCalculatorForArea1:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);
		
		return totalCost;
	}
	
	
	
	

}
