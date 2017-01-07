package whylambda;

//Passing behavior in OOP

public class Greeter {
	
	public void greet(Greet greet){
		greet.perform();
	}
	
	public static void main(String [] args){
		// Greeter greeting =new Greeter();
		// greeting.greet(new HelloWorld());
		
		
		Greet myLambdaFunction = () -> System.out.print("This is crazy");
		
		Greet InnerClassGreeting=new Greet(){
			public void perform(){
				System.out.println("Hello from Anonymouse Inner class");
			}
		};
		
		myLambdaFunction.perform();

		InnerClassGreeting.perform();
	}

}

