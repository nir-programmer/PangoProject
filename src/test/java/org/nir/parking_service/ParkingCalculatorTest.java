package org.nir.parking_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkingCalculatorTest {

	private ParkingCalculator _target;

   // [TestInitialize]
	@BeforeEach
    public void Init()
    {
        _target = new ParkingCalculator();

    }

	
	
	@Test
	public void Calculate_Area1()
    {
		   var startParking = new Date(2021, 10, 6, 11, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
	        var parkingAreaId = 1;

	        var expected = 20.00;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
       
    }
	
	@Test
	public void Calculate_Area1_Should_Throw()
    {
       
    }
	
	
	@Test
	public void Calculate_Area2()
    {
		    var startParking = new Date(2021, 10, 6, 11, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
	        var parkingAreaId = 2;

	        var expected = 10.0;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
    }
	
	
	
	@Test
	public void Calculate_Area3()
    {
		    var startParking = new Date(2021, 10, 6, 11, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 20, 0, 0);
	        var parkingAreaId = 3;

	        var expected = 45;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
    }
	
	
	
	
	
	
	
}
