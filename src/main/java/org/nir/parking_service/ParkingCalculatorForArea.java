package org.nir.parking_service;

import java.util.Date;

public abstract class ParkingCalculatorForArea 
{
	
	protected Date startParking;
	protected Date stopParking;
	
	
	public ParkingCalculatorForArea(Date startParking, Date stopParking) {
		
		this.startParking = startParking;
		this.stopParking = stopParking;
	}


	public abstract double Calculate(Date startParking, Date stopParking) throws ParkingTimeException;// throws ParkingTimeException;

	
	
	
	/*
	 * 
	 */
	public int getTotalHours() 
	{
		
		
		long secondsDifference = (stopParking.getTime()-startParking.getTime())/1000;	      
	    
		//System.out.println(">>Difference in seconds: " + secondsDifference);
			
	    double totalHours  = secondsDifference / 3600.0; 
	    
	    int totalFullHours = (int)totalHours;
	    
//	    System.out.println(">>totalHours() : totalHours = " + totalHours);
//	    
//	    System.out.println(">>totalHours() : totalFullHours = " + totalFullHours);
	    
	    if(totalHours > (int)totalHours) totalFullHours += 1;
	    
	    
	    //System.out.println(">>totalHours() : totalFullHours = " + totalFullHours);
		
		return totalFullHours;

		
	}
	
	//method for checking validation of startParking and stopParking
		public  boolean isStopParkingAfterStartParking() throws ParkingTimeException
		{
			boolean valid =  this.stopParking.after(this.startParking);
			if(!valid) throw new ParkingTimeException(">>ParkingCalculatorForArea():isStopParkingAfterStartParking():"
					+ " startParking should be before stopParking , But startParking = " + this.startParking + " and stopParking = " + this.stopParking);
			
			return true;
		}

	
	
	

}

//public interface IParkingCalculatorForArea {
//	
//	public double Calculate(Date startParking, Date stopParking);
//	
//
//}
