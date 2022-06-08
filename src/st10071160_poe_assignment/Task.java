// ST10071160
package st10071160_poe_assignment;

import javax.swing.JOptionPane;


public class Task
{
    private String tName;
    private int tNum;
    private String tDesc;
    private String dDetails;
    private int tDuration;
    private String tID;
    private String tStatus;
    
    public Task(String tna, int tnu, String tde, String dde, int tdu, String tid, String tst)
    {
        tName = tna;
        tNum = tnu;
        tDesc = tde;
        dDetails = dde;
        tDuration = tdu;
        tID = tid;
        tStatus = tst;
    }
    
    public Task()
    {
        
    }
    
    public void inputTask()
    {
        String tName = "";
        int tNum = 0;
        String tDesc = "";
        String dDetails = "";
        int tDuration = 0;
        String tID = "";
        String tStatus = "";
        
        tName = JOptionPane.showInputDialog("Enter the name of the task");
        tNum = tNum + 1;
        tDesc = JOptionPane.showInputDialog("Enter the description of the task in 50 characters or less");
        dDetails = JOptionPane.showInputDialog("Enter the details of the developer");
        tDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration of the task"));
        tID = returnTID();
        tStatus = JOptionPane.showInputDialog("Enter the status of the task: " + "\nTo do" + "\nDoing" + "\nDone");
    }
    
    public String getTName()
    {
        return tName;
    }
    
    public String getDDetails()
    {
        return dDetails;
    }
    
    public int getNum()
    {
        return tNum;
    }
    
    public String getTDesc()
    {
        return tDesc;
    }
    
    public String getTStatus()
    {
        return tStatus;
    }
    
    public int getTDuration()
    {
        return tDuration;
    }
    
    public String getTID()
    {
        return tID;
    }
    
    public int increaseTNum()
    {
        tNum = tNum++;
        return tNum;
    }
    
    public boolean checkTDesc()
    {
        boolean valid = true;
        
        if(tDesc.length() > 50)
        {
            valid = false;
        }
        
        return valid;
    }
    
    public String returnTID()
    {
        String tempID = "";
        int detailsNum = dDetails.length();
        tempID = tName.charAt(0) + tName.charAt(0) + ":" + tNum + ":" + dDetails.charAt(detailsNum - 1);
        tID = tempID.toUpperCase();
        return tID;
    } 
    
    public int totalHours()
    {
        int totalHours = 0;
        totalHours = totalHours + tDuration;
        return totalHours;
    }
    
    public String toString()
    {
        return "Task Status: " + getTStatus() + "\nDeveloper Details: " + getDDetails() + "\nTask Number: " + getNum() + "\nTask Name: " + getTName() + "\nTask Description: " + getTDesc() + "\nTask ID: " + getTID() + "\nTask Duration: " + getTDuration();
    }
}
