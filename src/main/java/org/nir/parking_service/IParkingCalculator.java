package org.nir.parking_service;

import java.util.Date;

public interface IParkingCalculator {
	
	public double Calculate(Date startParking, Date stopParking, int parkingAreaId) throws ParkingTimeException;//throws ParkingTimeException;

}
