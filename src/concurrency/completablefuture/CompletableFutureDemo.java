package concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
	
	

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		PrimeCounterCalculator calc = new PrimeCounterCalculator(1, 100_000);
		
		CompletableFuture
			.supplyAsync(calc::calculate, pool)
			.thenAccept(l -> System.out.println("The number of primes is "+l+" in thread "+Thread.currentThread().getName()));
		
		System.out.println("Main is here ...........");

	}
	
	
	
	
	

}
