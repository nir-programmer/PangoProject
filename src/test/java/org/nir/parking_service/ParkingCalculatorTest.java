package org.nir.parking_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("Test Calculate for parkingAreadId1 should pass and not throw")
	public void Calculate_Area1()
    {
		   var startParking = new Date(2021, 10, 6, 11, 00, 0);
	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
	        var parkingAreaId = 1;

	        var expected = 20.00;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
       
    }
	
	
	
	
	@Test
	@DisplayName("Test Calculate for parkingAreadId2 when number of hours less or equals to 4 should pass and not throw")
	public void Calculate_Area2_when_number_of_hours_less_than_or_equals_than_4_suould_pass_and_not_throw()
    {
		    var startParking = new Date(2021, 10, 6, 8, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 11, 30, 0);
	        var parkingAreaId = 2;

	        var expected = 20.0;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
    }
	
	@Test
	@DisplayName("Test Calculate for parkingAreadId2 when number of hours greater than 4 should pass and not throw")
	public void Calculate_Area2_when_number_of_hours_greater_than_4_suould_pass_and_not_throw()
    {
		    var startParking = new Date(2021, 10, 6, 8, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
	        var parkingAreaId = 2;

	        var expected = 20.0;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
    }
	
	
	
	@Test
	@DisplayName("Test Calculate for parkingAreadId3 when number of hours less then 12 should pass and not throw")
	public void Calculate_Area3()
    {
		    var startParking = new Date(2021, 10, 6, 9, 0, 0);
	        var stopParking = new Date(2021, 10, 6, 20, 0, 0);
	        var parkingAreaId = 3;

	        var expected = 55;
	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
	        assertEquals(expected, actual);
	        System.out.println(">>actual = " + actual + " , expected = " + expected);
	        
	        
    }
	
	
	//Lambda 
	
	
//	@Test
//	@DisplayName("Test Calculate for parkingAreadId3 when number of hours less then 12 should fail and print an error message")
//	public void Calculate_Area3_when_number_of_hours_greather_than_12_hours_should_pass_and_pring_error_message()
//    {
//		    var startParking = new Date(2021, 10, 6, 9, 0, 0);
//	        var stopParking = new Date(2021, 10, 7, 20, 0, 0);
//	        var parkingAreaId = 3;
//
//	        var expected = 55;
//	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
//	        assertEquals(expected, actual);
//	        System.out.println(">>actual = " + actual + " , expected = " + expected);
//    }
//	
	
	
	
	
	
////	
//	@Test
//	@DisplayName("Test Calculate for parkingAreadId1")
//	public void Calculate_Area1_Should_Throw()
//    {
//	        assertThrows(ParkingTimeException.class, 
//	        	() -> {
//	    		    var startParking = new Date(2021, 10, 6, 13, 0, 0);
//	    	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
//	    	        var parkingAreaId = 1;
//	        		
//	    	        _target.Calculate(startParking, stopParking, parkingAreaId);
//	        	}
//	        );
//       
//    }
////	
////	
////	
////	
////	@Test
////	@DisplayName("Test Calculate for parkingAreadId2")
////	public void Calculate_Area2()
////    {
////		    var startParking = new Date(2021, 10, 6, 13, 0, 0);
////	        var stopParking = new Date(2021, 10, 6, 12, 30, 0);
////	        var parkingAreaId = 2;
////
////	        var expected = 10.0;
////	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
////	        assertEquals(expected, actual);
////	        System.out.println(">>actual = " + actual + " , expected = " + expected);
////    }
////	
////	
////	
////	@Test
////	@DisplayName("Test Calculate for parkingAreadId3")
////	public void Calculate_Area3()
////    {
////		    var startParking = new Date(2021, 10, 6, 13, 0, 0);
////	        var stopParking = new Date(2021, 10, 6, 12, 0, 0);
////	        var parkingAreaId = 3;
////
////	        var expected = 45;
////	        var actual = _target.Calculate(startParking,stopParking, parkingAreaId);
////	        assertEquals(expected, actual);
////	        System.out.println(">>actual = " + actual + " , expected = " + expected);
////    }
////	
////	
//
//	
//	
//	
//	
//	
	
	
}
