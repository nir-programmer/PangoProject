package org.nir.parking_service;

public class ParkingCalculatorForAreaStrategyFactory 
{
	
	public ParkingCalculatorForAreaStrategy getParkingCalculatorForAreaStrategy(int parkingAreaId)
	{
		ParkingCalculatorForAreaStrategy parkingCalculatorForAreaStrategy = null;
		
		try
		{
			if(parkingAreaId == 1)
				parkingCalculatorForAreaStrategy = new  ParkingCalculatorForArea1Strategy();
			
			else if(parkingAreaId == 2)
			{
				parkingCalculatorForAreaStrategy = new ParkingCalculatorForArea2Strategy();
			}
			
			else if(parkingAreaId == 3)
			{
				parkingCalculatorForAreaStrategy = new  ParkingCalculatorForArea3Strategy();
			}
			
			else throw new  ParkingAreaNotExistsException(parkingAreaId);
		}
		catch(ParkingAreaNotExistsException exc)
		{
			exc.printStackTrace();
			
		}
		
		
		//finally stuff.. clean resources if there are any...
	
		
		
		return parkingCalculatorForAreaStrategy;
		
	}
	

}
