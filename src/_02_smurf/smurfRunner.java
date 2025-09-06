package _02_smurf;

public class smurfRunner {
public static void main(String[] args) {
	Smurf Handy  = new Smurf("Handy Smurf");
	Handy.eat();
	System.out.println("My name is Handy Smurf");
	Smurf Papa = new Smurf("Smurf");
	System.out.println("My name is Papa Smurf");
	Papa.getHatColor();
	Papa.isGirlOrBoy();
}
}
