/* 
1)A GetCurrentThread implements the Runnable interface, that provides you to execute the thread. 
  An object of GetCurrentThread is Runnable object.
2)We pass the Runnable object as argument to the Thread constructor that is used to create an object of current thread.
3)The Thread object has a Runnable object that implements the run method.
4)Once the thread object is created ,start method is invoked.
5)The start( )return immediately once  a thread has been spawned.
6)Thread.currentThread().get Name());-This method Returns a reference to the currently executing thread object.
7)The current thread ends when the run( ) method ends, This is done either by normal completion or by throwing an uncaught exception.
*/


public class GetCurrentThread implements Runnable {

  Thread th;
  
  public GetCurrentThread(String threadName) {
    th= new Thread(this,threadName);
    th.start();
  }

  public void run() {
    System.out.println(th.getName()+" is starting.....");
    System.out.println("Current thread name : "+
    Thread.currentThread().getName());
  }

  public static void main(String args[]) {
    System.out.println("Current thread name : "+
    Thread.currentThread().getName());
    new GetCurrentThread("1st Thread");
    new GetCurrentThread("2nd Thread");
  }
}
