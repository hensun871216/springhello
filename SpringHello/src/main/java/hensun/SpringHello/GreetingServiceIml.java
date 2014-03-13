package hensun.SpringHello;

public class GreetingServiceIml implements GreetingService {
	private String greeting;
	public GreetingServiceIml() {}
	
	public GreetingServiceIml(String greeting) {
		this.greeting = greeting;
	}
	
	public void sayGreeting() {
		System.out.println(this.greeting);
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
}
