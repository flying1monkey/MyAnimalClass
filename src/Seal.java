/*
* All Seals are Animals but all Animals are not Seals
*/
public class Seal extends Animal{
public Seal()
{
	System.out.println("A seal is born!");
}


@Override
public String sleep() {
return "A seal sleeps in the water...";
}

@Override
public String eat() {
return "A seal eats fish...";
}


public String swim()
{
//Seals can swim but not all other animals can so this method
//is unique to the Seal class
return "A seal swims...";
}

public String slide()
{
//Seals can slide on the ice, but not all animals can slide
	return "A seal slides on the ice.";
}
}

 