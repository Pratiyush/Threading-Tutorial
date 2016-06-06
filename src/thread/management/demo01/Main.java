package thread.management.demo01;


//Creating and running a thread
//	As with every element in the Java language,two ways of creating a thread
//		Extending the Thread class and overriding the run() method.
//		Building a class that implements the Runnable interface and then creating an object of the Thread class passing the Runnable object as a parameter

/*When we call the start() method of a Thread object, we are creating another execution
thread.

A Java program ends when all its threads finish (specifically,non-daemon). If the initial thread (the one that executes the main() method) ends, the rest
of the threads will continue with their execution until they finish. If one of the threads use the
System.exit() instruction to end the execution of the program, all the threads end
their execution.
Creating an object of the Thread class doesn't create a new execution thread. Also, calling
the run() method of a class that implements the Runnable interface doesn't create a new
execution thread. Only calling the start() method creates a new execution thread.*/
/**
 *  Main class of the example
 */
public class Main {

	/**
	 * Main method of the example
	 * @param args
	 */
	public static void main(String[] args) {

		//Launch 10 threads that make the operation with a different number
		for (int i=1; i<=10; i++){
			Calculator calculator=new Calculator(i);
			Thread thread=new Thread(calculator);
			thread.start();
		}
	}
}
