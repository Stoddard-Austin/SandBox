import java.util.TreeMap;

public class Fizz {
	
	private int count = 0;
	private boolean finished = false;
	static TreeMap<Integer, String> numbers = new TreeMap<Integer, String>();
	
	public synchronized int increment(){		
		if (count == 100){
			this.finished=true;
			return count;
		} else {
			this.count += 1;
			return count;
		}		
	}
	
	public synchronized void checkNumber(int number){
		
		if(number%15==0){
			numbers.put(number,"FizzBuzz");
		} else if(number%3==0){
			numbers.put(number,"Fizz");
		} else if(number%5==0){
			numbers.put(number,"Buzz");
		} else {
			numbers.put(number, Integer.toString(number));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fizz synch = new Fizz();
		synch.startThreads();		
	}
	
		public void startThreads() {
			
			Thread t1 = new Thread(new Runnable(){
				public void run() {
					while(!finished){
						int number = increment();
						checkNumber(number);
					}
				}
			});
			
			Thread t2 = new Thread(new Runnable(){
				public void run() {	
					while(!finished){
						int number = increment();
						checkNumber(number);
					}
				}	
			});
			
			t1.start();
			t2.start();

			try {
				t1.join();
				t2.join();				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				display();
			}
		}
		
		public void display(){
			for(Integer key: numbers.keySet()) {
		  		  String value = numbers.get(key);
		  		  
		  		  System.out.println(key + ": " + value);
		  	  }
		}
}