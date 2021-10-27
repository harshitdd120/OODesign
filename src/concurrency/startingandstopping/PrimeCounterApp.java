package concurrency.startingandstopping;

public class PrimeCounterApp {

	public static void main(String[] args) throws Exception {
		System.out.println("In "+Thread.currentThread().getName());
		
		PrimeCounter counterTask = new PrimeCounter(1, 100_000);
		
		Thread t = new Thread(counterTask);
		
		t.start();
		
		System.out.println("Started counter task in a thread...");
		
		Thread.sleep(1000);
		System.out.println("Main slept for a second and now issuuing interrupt");
		
		t.interrupt();
		
		//t.join();
		
		System.out.println("Number of primes: "+counterTask.getCount());

	}

}
