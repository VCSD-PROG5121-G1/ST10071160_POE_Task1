// ST10071160
package st10071160_poe_assignment;

//importing methods for JOptionPane, and regex matcher and pattern
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login
{
    //initializing variables
    String name;
    String surname;
    String username;
    String password;
    String loginUsername;
    String loginPassword;
    
    //constructor for Login class
    public Login(String n, String s, String u, String p, String lu, String lp)
    {
        name = n;
        surname = s;
        username = u;
        password = p;
        loginUsername = lu;
        loginPassword = lp;
    }
    
    public Login()
    {
        
    }
    
    //returns username
    public String getUsername()
    {
        return username;
    }
    
    //changes the username value
    public void setUsername(String u)
    {
        username = u;
    }
    
    //returns password
    public String getPassword()
    {
        return password;
    }
    
    //changes password
    public void setPassword(String p)
    {
        password = p;
    }
    
    //returns username entered when logging in
    public String getLoginUser()
    {
        return loginUsername;
    }
    
    //returns password entered when logging in
    public String getLoginPass()
    {
        return loginPassword;    
    }
    
    //this method will check if the length of the username is less than 5 characters, and if it contains an underscore, and then return a true or false value
    public boolean checkUserName(String u)
    {
        boolean validUser = false;
        
        if(u.length() < 5 && u.contains("_"))
        {
            validUser = true;
        }
        return validUser;
    }
    
    //this method will check if the password meets the complexity standards, and return a true or false value
    //true will be returned if the password is more than 8 characters long, contains a capital letter, contains a number, and contains a special character
    //false will be returned if one of these checks is false
    public boolean checkPasswordComplexity(String p)
    {
        
        boolean validPass = false;
        
        if(p.length() >= 8)
        {
            //question:  https://stackoverflow.com/questions/1795402/check-if-a-string-contains-a-special-character
            //answer:  https://stackoverflow.com/a/41697673
            //answered by: Pir Fahim Shah
            //link to account: https://stackoverflow.com/users/1564065/pir-fahim-shah
            Pattern upperCase = Pattern.compile("[A-Z]");
            Pattern number = Pattern.compile("[0-9]");
            Pattern specialChar = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            
            Matcher hasUpperCase = upperCase.matcher(p);
            Matcher hasNumber = number.matcher(p);
            Matcher hasSpecialChar = specialChar.matcher(p);
            
            return hasUpperCase.find() && hasNumber.find() && hasSpecialChar.find();
        }
        else
        {
            return validPass;
        }
    }
    
    //this method will check if the checkUserName() and checkPasswordComplexity() methods return true and will return a method
    //if false is returned for either of these methods, it will reprompt the user to enter another username or password depending which is incorrect
    public String registerUser(boolean cu, boolean cp)
    {
        String temp = "";
        
        if(checkUserName() == false)
        {
            username = JOptionPane.showInputDialog("Username not formatted correctly, please enter a username that includes an underscore (_) and is less than 5 characters long");
        }
        
        if(checkPasswordComplexity() == false)
        {
            password = JOptionPane.showInputDialog("Password is not formatted correctly, please enter a password that is more than 8 characters long, and includes a capital letter, a number, and a special character");
        }
        
        if(checkUserName() == true && checkPasswordComplexity() == true)
        {
            temp = "Username and password successfully captured";
        }
        
        return temp;
    }
    
    //this method will check if the username and password entered by the user when logging in match the ones that were entered when signing up by the user
    //the method will return true if they both match, otherwise it will return false
    public boolean loginUser(String lu)
    {
        boolean validLog = false;
            
        if((lu.equals(getUsername()) && (lu.equals(getPassword()))))
        {
            validLog = true;
        }
        
        return validLog;
    }
    
    //this method will check if the loginUser() method returns true or false
    //if true is returned, it will display a message with the users name and surname
    //if false is returned, it will display a message and reprompt the user to enter their username and password again
    public String returnLoginStatus()
    {
        String temp = "";
        if(loginUser(lu) == true)
        {
            temp = "Welcome " + name + " " + surname + " it is great to see you again!";
        }
        else if(loginUser(lu) == false)
        {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
            loginUsername = JOptionPane.showInputDialog("Enter your username to log in");
            loginPassword = JOptionPane.showInputDialog("Enter your password to log in");
        }
        return temp;
    }
}
