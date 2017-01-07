package runnableLambda;

public class RunnableLamda {
	public static void main(String[] args) {
		
		// Using Anonymous inner class
		Thread myThread=new Thread(new Runnable(){
			
			@Override
			public void run(){
				System.out.println("Printed inside Runnable using Anonymouse innerclass");
			}
		});
		myThread.run();
		
		
		//Inline lamda similar to above
		Thread mylambdaThread=new Thread(() -> System.out.println("Printed inside Lamda Runnable"));
		mylambdaThread.run();
	}
}
