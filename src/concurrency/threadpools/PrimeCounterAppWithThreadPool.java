package concurrency.threadpools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeCounterAppWithThreadPool {

	public static void main(String[] args) throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		System.out.println("In main");
		
//		PrimeCounter task = new PrimeCounter(1, 100_000);
		
//		pool.execute(task);
		
		PrimeCounterCallable callableTask = new PrimeCounterCallable(1, 100_000);
		
		Future<Long> futResult = pool.submit(callableTask);
		
		System.out.println("Is result ready? "+futResult.isDone());
		System.out.println("Ok then waiting till result is ready...");
		System.out.println("Number of primes "+futResult.get());
		
		pool.shutdown();
	}

}
