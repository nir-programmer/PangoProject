package org.nir.parking_service;

import java.util.Date;

/**
 * ASSUMPTIONS: 
 * 	1. All sub classes of ParkingCalculator have this method
 * @author nir
 *
 */
public  class ParkingCalculator implements IParkingCalculator {
	
	private static final ParkingCalculatorForAreaFactory parkingCalculatorForAreaFactory = new ParkingCalculatorForAreaFactory();

	//Strategy
	private ParkingCalculatorForArea parkingCalculatorForArea;
	
	
	
	//Inject the default behaviour - DefaultParkingCalculatorForArea
	public ParkingCalculator(ParkingCalculatorForArea parkingCalculatorForArea)
	{
		
		this.parkingCalculatorForArea = parkingCalculatorForArea;
	}
	
	//Inject default implementation of IParkgingCalculatorForArea - which is ParkingCalculatorForArea1
	public ParkingCalculator()
	{
	
//		//this(new ParkingCalculatorArea1())
//		this.parkingCalculatorForArea = parkingCalculatorForAreaFactory.getParkingCalculatorForArea(new Date(), new Date(), 1);
//		
//		System.out.println(">>ParkingCalculator Empty Constructor: " + this.parkingCalculatorForArea);
		
	}

	public ParkingCalculator(ParkingCalculatorArea1 parkingCalculatorArea1) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double Calculate(Date startParking, Date stopParking, int parkingAreaId)  //throws ParkingTimeException
	{
		double totalCost = 0;
		this.parkingCalculatorForArea = parkingCalculatorForAreaFactory.getParkingCalculatorForArea(startParking, stopParking, parkingAreaId);
		//System.out.println(">>ParkingCalculator Empty Calculate() : " + this.parkingCalculatorForArea);
		//	this.parkingCalculatorForArea = this.parkingCalculatorForAreaFactory.getParkingCalculatorForArea(startParking, startParking,parkingAreaId);
		try {
			
			totalCost = this.parkingCalculatorForArea.Calculate(startParking, stopParking);
			
		} 
		catch (ParkingTimeException e) {
			
			System.err.println(e.toString());
		}
		 
		return totalCost;
		
		
		
		
				
		
		
	}

	public double getDifferenceInHours() {
		return 1.0;
		
	}


	

}
