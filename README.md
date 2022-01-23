# SNHU-IT-145
Overview
Nearly every Java application involves multiple classes. As you have learned, designing a program around classes and objects is a key feature of object-oriented programming and provides many benefits, such as more readable and maintainable code. However, it is not enough to just have multiple classes. You also need to make sure that these classes can work together within a program. This involves making sure that any relationships, such as inheritance, are properly implemented in the code. It also involves having a main() method, usually located in a special class called the “Driver” class, that runs the program.

In this assignment, you will gain experience putting together a multiple-class program by creating a class that inherits from another (existing) class, and modifying or implementing methods in the Driver class. This milestone will also give you the opportunity to begin coding a part of the solution for Project Two. This will allow you to get feedback on your work before you complete the full project in Module Seven.

Prompt
To gain a clear understanding of the client’s requirements, review the Grazioso Salvare Specification Document. As you read, pay close attention to the attributes and methods that you will need to implement into the program.The Grazioso.zip folder contains three starter code files: Driver.java, RescueAnimal.java, and Dog.java. Once you have uploaded the files, compile the code. Although the program is not complete, it should compile without error.
Read through the code for each class that you have been given. This will help you understand what code has been created and what code must be modified or created to meet the requirements.
You have been asked to demonstrate industry standard best practices in all the code that you create to ensure clarity, consistency, and efficiency among all software developers working on the program. In your code for each class, be sure to include the following:
In-line comments that denote your changes and briefly describe the functionality of each method or element of the class.
Appropriate variable and method naming conventions.
In a new Java file, create the Monkey class, using the specification document as a guide. The Monkey class must do the following:
Inherit from the RescueAnimal class.
Implement all attributes to meet the specifications.
Include a constructor. You may use a default constructor. To score “exemplary” on this criterion, you must include the more detailed constructor that takes all values for the attributes and sets them. Refer to the constructor in the Dog class for an example.
Include accessors and mutators for all implemented attributes.
In the Driver.java class, modify the main method. In main(), you must create a menu loop that does the following:
Displays the menu by calling the displayMenu method. This method is in the Driver.java class.
Prompts the user for input.
Takes the appropriate action based on the value that the user entered.
IMPORTANT: You do not need to complete all of the methods included in the menu for this milestone. Simple placeholder print statements for these methods have been included in the starter code so that you can test your menu functionality.

Next, you will need to create a monkey ArrayList in the Driver.java class. Refer to the dog ArrayList, which is included right before main(), as an example. Creating this ArrayList is necessary for the intakeNewMonkey() method, which you will implement in the next step. Though it is not required, it may be helpful to pre-populate your ArrayList with a few test monkey objects in the initializeMonkeyList() method.
Finally, you will implement the intakeNewMonkey() method in the Driver.java class. Your completed method should do the following:
Prompt the user for input.
Set data for all attributes based on user input.
Add the newly instantiated monkey to an ArrayList.
Tips: Remember to refer to the accessors and mutators in your Monkey and RescueAnimal classes as you create this method. Additionally, you should use the nextLine method of the scanner to receive the user’s input. Refer back to Section 1.15 in zyBooks for a refresher on how to use this method.
