import java.util.Scanner;
public class Main {



	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Think of a country");
		String country = in.nextLine();
		System.out.println("Pick a random decimal number between 0.10 and .50");
		String decimal = in.nextLine();
		System.out.println("Pick a random whole number");
		String whole = in.nextLine();
		System.out.println("Think of a city name");
		String city = in.nextLine();
		System.out.println("Think of a Ice Cream Flavor");
		String icecream = in.nextLine();
		System.out.println("What's your favorite pair of shoes?");
		String shoes = in.nextLine();
		System.out.println("What colour eyes do you have?");
		String eyes = in.nextLine();
		System.out.println("What's your favorite colour?");
		String tshirt = in.nextLine();
		System.out.println("One day, "+name+" was in "+country+" on vacation. "+name+" bought an Ice Cream Cone for "+whole+" dollars and "+decimal+" cents.The flavor that "+name+" chose was a brand new flavor called "+icecream+". "+name+" was walking on the sidewalk to go meet friends then tripped!!! The Ice Cream cone quickly entered into the "+eyes+" eyes that "+name+" had and the "+icecream+" icecream landed on the "+tshirt+" shirt that "+name+" had just bought. "+name+"'s "+shoes+" became dirty and sticky with the Ice Cream."+name+" was sad and went back to the Hotel."+name+" was so sad that he went back to "+city+"");
		in.close();
		
		
		

	   
		
	}
		
}
	



