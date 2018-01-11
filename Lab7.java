/*
 * Author: Chad Lajeunesse
 * CST8110 - Lab 7
 * Section: 301
 * Prof: Howard Rosenblum
 * Date: January 8th 2018
 * Purpose: Calculate the first  Nth number of Prime Numbers. Intro to arrays.m
 */
public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program developed by Chad Lajeunesse");
		
		PrimeNumbers primes = new PrimeNumbers();
		
		primes.getNumberFromUser();
		
		long start = System.currentTimeMillis();
		primes.generatePrimes();
		long end = System.currentTimeMillis();
		
		
		primes.printPrimes();
		System.out.println("TIME: " + (end - start));
	}

}