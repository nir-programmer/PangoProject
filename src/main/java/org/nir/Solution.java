package org.nir;

import java.util.Date;

import org.nir.parking_service.ParkingCalculator;
import org.nir.parking_service.ParkingCalculatorForArea;
import org.nir.parking_service.ParkingCalculatorForAreaFactory;
import org.nir.parking_service.ParkingTimeException;


public class Solution {

	public static void main(String[] args) throws ParkingTimeException {
		
		Date start1 = new Date(2021, 10, 6, 8, 0, 0); 
		
		Date end1 = new Date(2021, 10, 6, 20, 30, 0); 
		
		Date start2 = new Date(2021, 10, 6, 8, 0, 0); 
		
		Date end2 = new Date(2021, 10, 6, 11, 30, 0); 
		
		int parkingAreaId1 = 1;
		int parkingAreaId2 = 2;
		

		//////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////Test area 2: 
		
		ParkingCalculator parkingCalculatorForArea1 = new ParkingCalculator();
		ParkingCalculator parkingCalculatorForArea2 = new ParkingCalculator();
		
		
		
		
		
		
		double cost1 = parkingCalculatorForArea1.Calculate(start1, end1, parkingAreaId1);
		double cost2 = parkingCalculatorForArea2.Calculate(start2, end2, parkingAreaId2);
	
		System.out.println(">>Cost1: " + cost1);
		
		System.out.println(">>Cost2: " + cost2);

		

		
		
		
//
//		 var startParking = new Date(2021, 10, 6, 9, 0, 0);
//	      var stopParking = new Date(2021, 10, 6, 10, 30, 0);
//	      var parkingAreaId = 1;
//	      
//	      
//	      ParkingCalculatorForAreaFactory parkingCalculatorForAreaFactory = new ParkingCalculatorForAreaFactory();
//	      
//	    ParkingCalculatorForArea parkingCalculatorForArea =
//	    			parkingCalculatorForAreaFactory.getParkingCalculatorForArea(startParking, stopParking, parkingAreaId); 
//	    
//	    
//	   
//	   double dif1 =  parkingCalculatorForArea.getDifferenceInHours();
//	   
//	   System.out.println(">> dif1 = " + dif1);
	      
	     
	     
	     //System.out.println(">>res = " + res);
	      
	      
	     
	      
//	      long seconds = (stopParking.getTime()-startParking.getTime())/1000;	      
//	      System.out.println(">>Difference in seconds: " + seconds);
//			
//	    double hours = seconds / 3600.0; 
//		System.out.println(">>Difference in hours: " + hours);
//			
//	      
	      
		
	      
	        
	        
		
		////////////////////////////////////////////////////////////
//		double res2 = parkingCalculatorForArea.Calculate(new Date(2021, 10, 6, 10, 0, 0), new Date(2323223232L), 2);
//		
//		double res3 = parkingCalculatorForArea.Calculate(new Date(2021, 10, 6, 10, 0, 0), new Date(2323223232L), 2);
//
//		
//		
		//System.out.println("res1  " + res1);
		
		
		//double res2 = parkingCalculatorForArea2.Calculate(new Date(2021, 10, 6, 10, 0, 0), new Date(2323223232L), 2);
		//System.out.println("res2  " + res2);
		
		//double res3 = parkingCalculatorForArea3.Calculate(new Date(2021, 10, 6, 10, 0, 0), new Date(2323223232L), 3);
		//System.out.println("res3  " + res3);
		
//		//Date date1 = new Date();
//		
//		Date d1 = new Date();
//        System.out.println("Current date is " + d1);
//        Date d2 = new Date(2323223232L);
//        System.out.println("Date represented is "+ d2 );
//
////        Date d=new Date();  
////        System.out.println("Hour of the day is  : "+d.getHours());  
//		
//		ParkingCalculator parkingCalculator = new ParkingCalculatorArea1();
//		
//		double cost1 = parkingCalculator.Calculate(d1, d2, 1);
//		
//		System.out.println(">>cost1 = " + cost1);
	}
	
	

}

/**
 * using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Pango.New.Employe.Task.Test
{
    // parkingArea 1 => 10 NIS for each hour or part of it
    // parkingArea 2 => 5 NIS for each hour or part of it  Or fix price 20 NIS (the lesser of them)
    // parkingArea 3 => Pay for parking from 8:00 to 20:00  - 5 NIS for each hour or part of it

    [TestClass]
    public class ParkingCalculatorTest
    {
        private ParkingCalculator _target;

        [TestInitialize]
        public void Init()
        {
            _target = new ParkingCalculator();

        }

        [TestMethod]
        public void Calculate_Area1()
        {
            var startParking = new DateTime(2021, 10, 6, 11, 0, 0);
            var stopParking = new DateTime(2021, 10, 6, 12, 30, 0);
            var parkingAreaId = 1;

            var expected = _target.Calculate(startParking, stopParking, parkingAreaId);

            Assert.AreEqual(20.00, expected);
        }
    }
}
 */

