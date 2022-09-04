package org.nir.parking_service;

import java.util.Date;

public class ParkingCalculatorForAreaFactory 
{
	

	public ParkingCalculatorForArea getParkingCalculatorForArea(Date startParking, Date stopParking, int parkingAreaId)
	{
		if(parkingAreaId == 1)
			return new ParkingCalculatorForArea1(startParking, stopParking);
		
		else if(parkingAreaId == 2)
		{
			return new ParkingCalculatorForArea2(startParking, stopParking);
		}
		
		else if(parkingAreaId == 3)
		{
			return new ParkingCalculatorForArea3(startParking, stopParking);
		}
		
		return null;
	}
	

}
