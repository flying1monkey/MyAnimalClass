
public class Dog extends Animal{
	
	public Dog(){
		System.out.println("The best type of animal now exists!");
	}
	
	@Override
	public String sleep(){
		return "The dog sleeps in the bed, of course.";
	}
	
	@Override
	public String eat(){
		return "The dog eats voraciously.";
	}
	
	public String play(){
		//dogs aren't the only ones that play, but not all animals play like dogs
		return "The dog chases the frisbee over and over and over and over and...";
	}
	
	public String kiss(){
		//dogs love giving kisses
		return "The dog licks everyone.";
	}
	

}
