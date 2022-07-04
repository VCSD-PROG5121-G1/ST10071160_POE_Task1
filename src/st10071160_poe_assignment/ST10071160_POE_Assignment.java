//ST10071160 POE Assignment
package st10071160_poe_assignment;

//importing JOptionPane methods
import javax.swing.*;

public class ST10071160_POE_Assignment
{

    public static void main(String[] args)
    {
         //Initializing variables
       String name;
       String surname;
       String username;
       String password;
       
       String choice;
       String loginUsername = "";
       String loginPassword = "";
       
       //Assigning values to the name, surname, username and password variables
       name = JOptionPane.showInputDialog("Enter your name");
       surname = JOptionPane.showInputDialog("Enter your surname");
       username = JOptionPane.showInputDialog("Enter a username" + "\n Ensure that the username includes an underscore and is not more than 5 characers long");
       password = JOptionPane.showInputDialog("Enter a password" + "\nEnsure that the password is at least 8 characters long, contains a capital letter, contains a number, and contains a special character");
       
       //creating a sign in object from the login class
       Login si = new Login(name, surname, username, password, loginUsername, loginPassword);
       
       //running the checkUserName() and checkPasswordComplexity() methods
       si.checkUserName();
       si.checkPasswordComplexity();
       
       //if the format of either of the first inputs is incorrect, the program will reprompt the user for a new username or password depending on what is incorrect
       while(si.checkUserName() == false || si.checkPasswordComplexity() == false)
       {
           si.registerUser();
           si.checkUserName();
           si.checkPasswordComplexity();
       }
       //when the format of both password and username are correct, the program will display a message from the registerUser() method
       JOptionPane.showMessageDialog(null, si.registerUser());
       
       
      
       //the program prompts the user to input a choice of 'login' or 'exit'
       choice = JOptionPane.showInputDialog("Enter 'login' to log in or 'exit' to exit the program");
       
       //the program checks if the users choice was 'login' and runs the code to prompt them for their username and password again
       if(choice.equals("login"))
       {
            loginUsername = JOptionPane.showInputDialog("Enter your username to log in");
            loginPassword = JOptionPane.showInputDialog("Enter your password to log in");
            
            //creating a login object from the login class
            Login lg = new Login(name, surname, username, password, loginUsername, loginPassword);
            
            //running the loginUser() method to check for a true or false value
            lg.loginUser();
            
            //while the loginUser() class returns false, the program will keep reprompting the user for their username and password 
            while(lg.loginUser() == false)
            {
                lg.returnLoginStatus();
                lg.loginUser();
            }
            //when the loginUser() class returns true, the program will display a message and then end
            JOptionPane.showMessageDialog(null, lg.returnLoginStatus());
            
            //will check if the login details entered by the user are correct and then will proceed with code
            if(lg.loginUser() == true)
            {
                //Welcome message is displayed to the user
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                
                //User is promprted for a choice as to what to do next
                int choiceTwo = Integer.parseInt(JOptionPane.showInputDialog( "Enter the value of your chosen option " + "\nOption 1: Add Tasks" + "\nOption 2: Show report" + "\nOption 3: Quit"));
                
                //Creates a new task object 
                Task tk = new Task();
                
                //loops until the user chooses the option '3'
                while(choiceTwo != 3)
                {
                    //if the user chooses the option '1' this code will execute 
                    if(choiceTwo == 1)
                    {
                         int count = 0;
                         
                         //this will prompt the user to enter a value to indicate the amount of tasks to add
                         count = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of tasks you would like to enter"));
                         
                         //this will loop the code until it reaches the amount that the user entered 
                         for(int i = 0; i < count; i++)
                         {
                             //this will prompt the user to enter their task details
                            tk.inputTask();
                            //this will check if the description entered is less than 50 characters long
                            tk.checkTDesc();
                            //this will add the hours value entered to the total hours of every task
                            tk.totalHours();
                            //this will increase the number of the current task being entered 
                            tk.increaseTNum();
                            
                            //this will display all of the variables entered by the user in a specified order
                            JOptionPane.showMessageDialog(null, tk.toString());
                         }
                         
                         //this will display the total amount of hours after every task has been entered 
                         JOptionPane.showMessageDialog(null, "Total hours of all tasks: " + tk.totalHours());
                        
                    }
                    //if the choice is '2' this code will executed 
                    else if(choiceTwo == 2)
                    {
                        //this will display the message 'coming soon'
                        JOptionPane.showMessageDialog(null, "Coming soon");
                    }
                    //this will continuously reprompt the user for their next choice until they pick '3'
                    choiceTwo = Integer.parseInt(JOptionPane.showInputDialog( "Enter the value of your chosen option " + "\nOption 1: Add Tasks" + "\nOption 2: Show report" + "\nOption 3: Quit"));
                }
                
                //this will display the message 'see you next time!'
                JOptionPane.showMessageDialog(null, "See you next time!");
            }
       }
       //if the users choice is 'exit' the program will return a message and then end
       else if(choice.equals("exit"))
       {
           //this will display the message 'see you next time!'
           JOptionPane.showMessageDialog(null, "See you next time!");
       }
       
       
       
    }
    
}
