/*
Pasco Logan 
4/17/21 
IT 145
Graziso Salvare*/




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	// Print method
	public static Scanner scanner = new Scanner(System.in);
	// Array List for Dogs
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	// Array List for Monkey
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	
    public static void main(String[] args) {
    	String menuChoice=""; //menu choice for user 
        
        //Dog list 
    	initializeDogList();
        // Monkey list
    	initializeMonkeyList();
        
        while(!menuChoice.equalsIgnoreCase("q")) {
        	displayMenu();
        	menuChoice = scanner.nextLine();//get menu choice form user 
        	switch(menuChoice) {
        	case "1":
        		intakeNewDog(scanner);
        		break;
        	case "2":
        		intakeNewMonkey(scanner);
        		break;
        	case "3":
        		reserveAnimal(scanner);
        		break;
        	case "4":
        		printAnimals("Dog");
        		break;
        	case "5":
        		printAnimals("Monkey");
        		break;
        	case "6":
        		printAnimals("available");
        		break;
        	default:
        		if(!menuChoice.equalsIgnoreCase("q")) {
        			System.out.println("Invalid input, Try again. Please enter 1");
        		}
        		}
        	}
        	

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tWelcome to Graziso Salvare");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }
    
 // This method prints the menu options for monkey
    public static void intakeMenuMonkey() {
    	System.out.println("\n\n");
        System.out.println(" Please enroll the new monkey" );
        System.out.println("[1] Name");
        System.out.println("[2] Species");
        System.out.println("[3] Tail ");
        System.out.println("[4] Height");
        System.out.println("[5] Body Length");
        System.out.println("[6] Gender");
        System.out.println("[7] Age");
        System.out.println("[8] Weight");
        System.out.println("[9] Accquisition Date");
        System.out.println("[10] Accquisition Continent");
        System.out.println("[11] Training Status");
        System.out.println("[12] Reserve Status");
        System.out.println("[13] In Service Continent");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    	
	}
    
 // This method prints the menu options for dog
    public static void intakeMenuDog() {
    	System.out.println("\n\n");
        System.out.println(" Please enroll the new dog" );
        System.out.println("[1] Name");
        System.out.println("[2] breed");
        System.out.println("[3] gender ");
        System.out.println("[4] age");
        System.out.println("[5] weight");
        System.out.println("[6] Accquisition Date");
        System.out.println("[7] Accquisition Continent");
        System.out.println("[8] Training Status");
        System.out.println("[9] Reserve Status");
        System.out.println("[10] In Service Continent");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

	// list for testing dog
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "available", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "not availabe", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "available", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // list for testing monkey
     public static void initializeMonkeyList() {
        Monkey Monkey1 = new Monkey("Coco", "Spider Monkey", "male", "94", "20", "South America", "available", false, "Asia", "9", "42", "29", "Spider Monkey");
        Monkey Monkey2 = new Monkey("Bubbles", "Gorilla", "female", "3", "32", "Asia", "Not available", false, "North America", "13", "49", "35", "Gorilla");
        
     
        monkeyList.add(Monkey1);
        monkeyList.add(Monkey2);

    }

    // dog intake method with input validation and menu options
    public static void intakeNewDog(Scanner scanner) {
    	Dog obj1 = new Dog(null, null, null, null, null, null, null, null, false, null);
    	boolean x;
    	String user = scanner.nextLine();
    	String Status =("");
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {//checks to see if dog is already in system
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else{//intake for new dog
				while(!user.equalsIgnoreCase("q")) {
                 	intakeMenuDog();//menu choice form user
                 	user = scanner.nextLine();//get menu choice form user 
                 	switch(user) {
                 	case "1":
                 		System.out.println("What is the dog's name");
                 		user = scanner.nextLine();
                 		obj1.setName(user);
             			
                 		
                 
                 	case "2":
                 		System.out.println("What is the breed of the dog");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("American terrier")||user.equalsIgnoreCase("Beagle")||user.equalsIgnoreCase("Belgian malinois")
                 			||user.equalsIgnoreCase("Border collie")||user.equalsIgnoreCase("Bloodhound")||user.equalsIgnoreCase("Coonhound")
                 			||user.equalsIgnoreCase("English springer spaniel")||user.equalsIgnoreCase("German shepherd")||
                 			user.equalsIgnoreCase("Golden retriever")||user.equalsIgnoreCase("Labrador retriever")||user.equalsIgnoreCase("Rough collie")
                 			||user.equalsIgnoreCase("Smooth collie")) {
                 		obj1.setBreed(user);
                 		}
             
                 		else {
                 			System.out.println("Invlad input please try again!" );
                 		break;
                 		}
                	case "3":
                 		System.out.println("What is the gender of the dog");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("male")||user.equalsIgnoreCase("female")) {
                 			obj1.setGender(user);
                 			
                 		
                 		}
                 		else {
                 		System.out.println("Invlad input please try again!" );
                 		break;
                 		}
                 
                 		
                 	case "4":
                 		System.out.println("What is the age of the dog (years)");
                 		user = scanner.nextLine();
                 		if(user.matches("^[a-zA-z]*$")) {
                 			System.out.println("Invlad entry please try again!");
                 			break;
                 		}
                 		else {
                 			obj1.setAge(user);
                 			
                 		}
                 	case "5":
                 		System.out.println("What is the dog's weight ");
                 		user = scanner.nextLine();
                 		if(user.matches("^[a-zA-z]*$")) {
                 			System.out.println("Invlad entry please try again!");
                 			break;
                 		}
                 		else {
                 			obj1.setWeight(user);;
                 			
                 		}
                 	case "6":
                 		System.out.println("Enter acquisition date of the dog (mm/dd/yy))");
                 		user = scanner.nextLine();
                 		if(user.matches("")&&user.matches("[a-zA-z]*$")) {
                 			System.out.println("Invlad input please try again!");
                 			break;
                 		}
                 		else {
                 			obj1.setAcquisitionDate(user);
                 			
                 		}
                  	case "7":
                 		System.out.println("What continent was the dog acquired from");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("south america")||user.equalsIgnoreCase("north america")||user.equalsIgnoreCase("europe")||
                 				user.equalsIgnoreCase("asia")||user.equalsIgnoreCase("antarctica")||user.equalsIgnoreCase
                 				("africa")||user.equalsIgnoreCase("oceania")){
                 			obj1.setAcquisitionLocation(user);
                 			
                 		}
                 		
                 		else {
                 			System.out.println("Invald input please try again!");
                 			break;
                 		}
                   		
                 	case "8":
                 		System.out.println("training status (yes/no)");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("yes")) {
                 			obj1.setTrainingStatus("available");
                 
                 		}
                 		else if(user.equalsIgnoreCase("no")){
                 				obj1.setTrainingStatus("not available");
                 				
                 			}
                 		else {
                 			System.out.println(" Invald input please try again ");
                 			break;
                 		}
                  	case "9":
                 		System.out.println("Is this dog reserved (Yes/no)");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("yes")) {
                 			x = true;
                 			obj1.setReserved(x);
                 				
                 		}
                 		else if(user.equalsIgnoreCase("no")) {
                 			x = false;
                 			obj1.setReserved(x);
                 				
                 		}
                 		else {
                 			System.out.println("Invald input please try again!");
                 			break;
                 		}
                	case "10":
                 		System.out.println("What is the dog's in service Continent");
                 		user = scanner.nextLine();
                 		if(user.equalsIgnoreCase("south america")||user.equalsIgnoreCase("north america")||user.equalsIgnoreCase("europe")||
                 				user.equalsIgnoreCase("asia")||user.equalsIgnoreCase("antarctica")||user.equalsIgnoreCase
                 				("africa")||user.equalsIgnoreCase("oceania")) {
                 			obj1.setInServiceCountry(user);
                 			dogList.add(obj1);
                 		}
                 		else {
                 			System.out.println("Invald input please try again!");
                 			break;
                 		}
                 return;
                 
                 			
            }
				}
				} } 
        
    }


    // Monkey intake method with input validation and menu options
        public static void intakeNewMonkey(Scanner scanner) {
        	Monkey obj = new Monkey(null, null, null, null, null, null, null, false, null, null, null, null, null);
        	boolean x;
        	String user = scanner.nextLine();
        	String Status =("");
        	System.out.println("What is the monkeys name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList){//check to see if monkey is already in system
            	if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system.\n\n");
                    return;
                    }
                else{//intake for new monkey
					while(!user.equalsIgnoreCase("q")) {
                     	intakeMenuMonkey();//menu choice form user
                     	user = scanner.nextLine();//get menu choice form user 
                     	switch(user) {
                     	case "1":
                     		System.out.println("What is the monkeys name");
                     		user = scanner.nextLine();
                     		obj.setName(user);
                 			
                     		
                     
                     	case "2":
                     		System.out.println("What is the Species of the monkey");
                     		user = scanner.nextLine();
                     		if(user.equalsIgnoreCase("gorilla")||user.equalsIgnoreCase("proboscis")||user.equalsIgnoreCase("hamadryad")
                     			||user.equalsIgnoreCase("mandrill")||user.equalsIgnoreCase("orangutan")||user.equalsIgnoreCase("gibbon")
                     			||user.equalsIgnoreCase("baboon")||user.equalsIgnoreCase("chimpanzee")) {
                     			System.out.println("This monkey species can not be trained");
                     			Status = "not available";
                     		obj.setSpecies(user);
                     		obj.setTrainingStatus(Status);
                 			
                     		}
                     		else if(user.equalsIgnoreCase("capuchin")||user.equalsIgnoreCase("guenon")||user.equalsIgnoreCase("macaque")||
                     				user.equalsIgnoreCase("marmoset")||user.equalsIgnoreCase("squirrel monkey")||user.equalsIgnoreCase("tamarin")){
                     			System.out.println("This monkey species can be trained");
                     			Status = "available";
                         		obj.setSpecies(user);
                         		obj.setTrainingStatus(Status);
                     			
                     			
                     		}
                     		else {
                     			System.out.println("Invlad input please try again!" );
                     		break;
                     		}
                     		
                     	case "3":
                     		System.out.println("What is the monkeys tail length (inches)");
                     		user = scanner.nextLine();
                     		if(user.matches("^[a-zA-z]*$")) {
                     			System.out.println("Invlad entry please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setBodyLength(user);
                     			
                     		}
                     	case "4":
                     		System.out.println("What is the monkeys height (inches)");
                     		user = scanner.nextLine();
                     		if(user.matches("^[a-zA-z]*$")) {
                     			System.out.println("Invlad entry please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setHeight(user);
                     			
                     		}
                     	case "5":
                     		System.out.println("Whats is the monkeys body length (inches)");
                     		user = scanner.nextLine();
                     		if(user.matches("^[a-zA-z]*$")) {
                     			System.out.println("Invlad entry please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setBodyLength(user);
                     			
                     		}
                     		
                     	case "6":
                     		System.out.println("What is the gender of the animal");
                     		user = scanner.nextLine();
                     		if(user.equalsIgnoreCase("male")||user.equalsIgnoreCase("female")) {
                     			obj.setGender(user);
                     			
                     		
                     		}
                     		else {
                     		System.out.println("Invlad input please try again!" );
                     		break;
                     		}
                     
                     	
                     	case "7":
                     		System.out.println("What is the age of the monkey in years");
                     		user = scanner.nextLine();
                     		if(user.matches("^[a-zA-z]*$")) {
                     			System.out.println("Invlad input please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setAge(user);
                     				
                     		}
                     		
                     	case "8":
                     		System.out.println("Enter monkeys weight");
                     		user = scanner.nextLine();
                     		if(user.matches("^[a-zA-z]*$")) {
                     			//Monkey3[4] = user;
                     			System.out.println("Invlad input please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setWeight(user);
                     				
                     		}
                     		
                     	case "9":
                     		System.out.println("Enter acquisition date of the monkey(mm/dd/yy))");
                     		user = scanner.nextLine();
                     		if(user.matches("")&&user.matches("[a-zA-z]*$")) {
                     			System.out.println("Invlad input please try again!");
                     			break;
                     		}
                     		else {
                     			obj.setAcquisitionDate(user);
                     			
                     		}
                  
                     	case "10":
                     		System.out.println("What continent was the monkey acquired from");
                     		user = scanner.nextLine();
                     		if(user.equalsIgnoreCase("south america")||user.equalsIgnoreCase("north america")||user.equalsIgnoreCase("europe")||
                     				user.equalsIgnoreCase("asia")||user.equalsIgnoreCase("antarctica")||user.equalsIgnoreCase
                     				("africa")||user.equalsIgnoreCase("oceania")){
                     			obj.setAcquisitionLocation(user);
                     			
                     		}
                     		
                     		else {
                     			System.out.println("Invald input please try again!");
                     			break;
                     		}
                     		
                     	case "11":
                     		System.out.println("training status");
                     		if(obj.getTrainingStatus().equalsIgnoreCase("available")) {
                     			System.out.println("This monkey has been trained");
                     		}
                     		else {
                     			if(obj.getTrainingStatus().equalsIgnoreCase("not available")){
                     				System.out.println("This monkey is awaiting training");
                     				
                     			}
                     		}
                     		
                     		
                     	case "12":
                     		System.out.println("Is this monkey reserved (Yes/no)");
                     		user = scanner.nextLine();
                     		if(user.equalsIgnoreCase("yes")) {
                     			x = true;
                     			obj.setReserved(x);
                     				
                     		}
                     		else if(user.equalsIgnoreCase("no")) {
                     			x = false;
                     			obj.setReserved(x);
                     				
                     		}
                     		else {
                     			System.out.println("Invald input please try again!");
                     			break;
                     		}
                     	
                     	case "13":
                     		System.out.println("What is the monkeys in service Continent");
                     		user = scanner.nextLine();
                     		if(user.equalsIgnoreCase("south america")||user.equalsIgnoreCase("north america")||user.equalsIgnoreCase("europe")||
                     				user.equalsIgnoreCase("asia")||user.equalsIgnoreCase("antarctica")||user.equalsIgnoreCase
                     				("africa")||user.equalsIgnoreCase("oceania")) {
                     			obj.setInServiceCountry(user);
                     			monkeyList.add(obj);
                     		}
                     		else {
                     			System.out.println("Invald input please try again!");
                     			break;
                     		}
                     return;
                     
                     			
                }
                
                
					}
            }}
                
        }

        // reserve animal method with input validation and menu options
        public static void reserveAnimal(Scanner scanner) {
        	boolean x;
        	System.out.println("Enter animal type (Dog or Monkey)");
        	String type = scanner.nextLine();
        	if(!type.equalsIgnoreCase("dog")&&!type.equalsIgnoreCase("monkey")) {
        		System.out.println("Invalid input");
        		return;
        	}
        	System.out.println("Enter animals name you want to reserve: ");
        	String user = scanner.nextLine();
        	if(type.equals("dog")) {
        		for(Dog dog : dogList) {
        			if(dog.getName().equalsIgnoreCase(user)) {
        				x = true;
        				dog.setReserved(x);
        				System.out.println(dog.getName()+" has been successfully reserved");
        				
        				return;
        			}
        		}
        	}
        	else {
        		for(Monkey monkey : monkeyList) {
            			if(monkey.getName().equalsIgnoreCase(user)) {
            				x = true;
            				monkey.setReserved(x);
            				System.out.println(monkey.getName()+" has been successfully reserved");
        			}
        		}
        	}

        }

        // print animals method with name,training status,asquistion location and reserved status
        public static void printAnimals(String type) {
  
        	if(type.toLowerCase().equals("dog")) {
        		System.out.println("List of Dogs: ");
        		for(Dog dog: dogList) { System.out.println("Name:" + dog.getName()+"\t"+"Training Status:"+dog.getTrainingStatus()+"\t"
        			+" Acquisition Location:"+dog.getAcquisitionLocation()+"\t"+"Reserved:"+dog.getReserved());	
        		}
        		}
        	else if(type.toLowerCase().equals("monkey")) {
        		System.out.println("List of Monkeys: ");
        		for(Monkey monkey: monkeyList) {
        			System.out.println("Name:"+monkey.getName()+"\t"+"Training Status:"+monkey.getTrainingStatus()+"\t"+"Acquisition Location:"+monkey.getAcquisitionLocation()+"\t"+
        		"Reserved:"+monkey.getReserved());
        			}
        		}
        	
        	else if (type.toLowerCase().equals("available")) {
        			System.out.println("List of available aniamls: ");
        			for(Dog dog : dogList) {
        				if(dog.getTrainingStatus().equalsIgnoreCase("available")&&!dog.getReserved()){  
        				System.out.println("Name:"+dog.getName()+"\t"+"This dog is "+dog.getTrainingStatus());
        				}
        			}
        			for(Monkey monkey: monkeyList) {
            			if(monkey.getTrainingStatus().equalsIgnoreCase("available")&&!monkey.getReserved()) {
            				System.out.println("Name:"+monkey.getName()+"\t"+"This monkey is "+monkey.getTrainingStatus());
            			}

        			}
       			
 
        		}
        		
           
            }
            	
            

        }


