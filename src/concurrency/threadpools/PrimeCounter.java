package concurrency.threadpools;

public class PrimeCounter implements Runnable {
	
	long start,end,count;
	
	
	
	public PrimeCounter(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		System.out.println("Counter running in "+Thread.currentThread().getName());
		for(long i = start;i<end;i++) {
			if(Thread.interrupted()) {
				System.out.println("Counter thread has been asked to terminate, returning");
				break;
			}
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println("There are "+count+" primes");
	}

	private boolean isPrime(long num) {
		if(num <= 2) {
			return true;
		}
		for(long i=2;i<num;i++) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public long getCount() {
		return count;
	}
}
