package org.nir.parking_service;

import java.util.Date;

@FunctionalInterface
public interface ParkingCalculatorForAreaStrategy 
{
	
	
	public double Calculate(Date startParking, Date stopParking) throws ParkingTimeException;// throws ParkingTimeException;


	//Common non abstract methods
	public default int getTotalHours(Date startParking, Date stopParking) 
	{
		
		long secondsDifference = (stopParking.getTime()-startParking.getTime())/1000;	      
	    double totalHours  = secondsDifference / 3600.0; 
	    
	    int totalFullHours = (int)totalHours;

	    if(totalHours > (int)totalHours) totalFullHours += 1;
	   
		return totalFullHours;
	}
	
	
	
	//method for checking validation of startParking and stopParking
	public default boolean isStopParkingAfterStartParking(Date startParking, Date stopParking) throws ParkingTimeException
	{
		boolean valid =  stopParking.after(startParking);
			
//		if(!valid) throw new ParkingTimeException(">>ParkingCalculatorForAreaStrategy():isStopParkingAfterStartParking():"
//					+ " startParking should be before stopParking , But startParking = " + startParking + " and stopParking = " + stopParking);
//			
		return valid;
	}
}
