package concurrency.completablefuture;

public class PrimeCounterCalculator {
	
long start,end;
	
	
	
	public PrimeCounterCalculator(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	
	public Long calculate() {
		long count = 0;
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
		return count;
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

}
