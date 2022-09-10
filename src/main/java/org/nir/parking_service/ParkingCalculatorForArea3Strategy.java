package org.nir.parking_service;

import java.util.Date;

// parkingArea 3 => Pay for parking from 8:00 to 20:00  - 5 NIS for each hour or part of it
public class ParkingCalculatorForArea3Strategy implements ParkingCalculatorForAreaStrategy {

	private static  final int COST_PER_HOUR = 5;
	private static final int TOTAL_HOURS = 12;
	private static final int OPEN_HOUR = 8;
	private static final int CLOSE_HOUR = 20;
	
	
	
	
	//Check for validation against more then 12 hours
	@Override
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException //throws ParkingTimeException {
	{
		if(!this.isStopParkingAfterStartParking(startParking, stopParking))
			throw new ParkingTimeException("ParkingCalculatorForArea3()Calculate():startParking should be before stopParking!"
				+ ", But startParking = " + startParking + " and stopParking = "  + stopParking);
		
		
		double totalCost = 0; 
		
		int firstHour = startParking.getHours();
	
		int lastHour = stopParking.getHours() + stopParking.getMinutes() + stopParking.getSeconds();
		
		
		int totalHours = this.getTotalHours(startParking, stopParking);
		
		
		if(totalHours > TOTAL_HOURS) 
		{
			throw new ParkingTimeException(">>ParkingCalculatorForArea3:Calculate(): \nParking is allowd for at most 12 hours!"
					+ "\nYour car is already parked for " + totalHours + " hours!");
		}	
		
		else if(firstHour < OPEN_HOUR || lastHour > CLOSE_HOUR)
		{
			throw new ParkingTimeException(">>ParkingCalculatorForArea3:Calculate()- You can not park your car!  Parking is in between 08:00 to 20:00 !");
		}
		
		totalCost = totalHours * COST_PER_HOUR; 

		System.out.println(">>ParkingCalculatorForArea3:Calculate(): \nTOTAL HOURS: " + totalHours +  "\nCOST PER HOUR: "+ COST_PER_HOUR + "\nTOTAL COST: " + totalCost);

	
		return totalCost;
	}

}
