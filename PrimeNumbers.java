/*
 * Author: Chad Lajeunesse
 * CST8110 - Lab 7
 * Section: 301
 * Prof: Howard Rosenblum
 * Date: January 8th 2018
 * Purpose: Calculate the first Nth number of Prime Numbers. Intro to arrays.m
 */
import java.util.Scanner;

public class PrimeNumbers {
	private int numberOfPrimes;
	private int primes[];
	Scanner keyboard;

	public PrimeNumbers() {
		keyboard = new Scanner(System.in);
	}
	
	public void getNumberFromUser()
	{
		System.out.println("How many prime numbers do you want?");
		numberOfPrimes = keyboard.nextInt();
		while(numberOfPrimes < 1)
		{
			System.out.println("You need to generate at least 1 prime number");
			System.out.println("How many prime numbers do you want?");
			numberOfPrimes = keyboard.nextInt();
		}
		
		primes = new int[numberOfPrimes];
		
	}
	
	public void generatePrimes()
	{
		int primeNumbers = 1;
		int current = 3;
		boolean isPrime;
		int previousPrime;
		primes[0] = 2;
		while(primeNumbers < numberOfPrimes)
		{
			isPrime = true;
			previousPrime = 0;
			while(previousPrime < primeNumbers)
			{
				if(current % primes[previousPrime] == 0)
				{
					isPrime = false;
					// Adding a break will optimize the performance of this method.
					break;
				}
				previousPrime = previousPrime + 1;
			}
			if(isPrime)
			{
				primes[primeNumbers] = current;
				primeNumbers = primeNumbers + 1;
			}
			current = current + 2;
		}
	}
	
	public void printPrimes()
	{	
		System.out.println("The first " + numberOfPrimes + " prime numbers are: ");
			for(int i = 0; i < primes.length; i++)
		{
			System.out.println(i+1 + " " + primes[i]);
		}
	}
	
	
}
