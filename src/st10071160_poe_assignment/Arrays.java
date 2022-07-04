// ST10071160
package st10071160_poe_assignment;

//imported methods
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//constructor of Arrays class
public class Arrays
{
    Task tk = new Task();
    private Task tArr[] = new Task[4];
    private int size = 0;
    
    public Arrays()
    {
        try
        {
            //scanners to scan each method and create arrays
            Scanner inputTName = new Scanner(new File(tk.getTName()));
            Scanner inputTNum = new Scanner(new File(tk.getNum()));
            Scanner inputTDesc = new Scanner (new File (tk.getTDesc()));
            Scanner inputDDetails = new Scanner (new File(tk.getDDetails()));
            Scanner inputTDuration = new Scanner (new File(tk.getTDuration()));
            Scanner inputTID = new Scanner (new File (tk.getTID()));
            Scanner inputTStatus = new Scanner (new File (tk.getTStatus()));
            while(inputTName.hasNext())
            {
                 String tName = inputTName.next();
                 int tNum = inputTNum.nextInt();
                 String tDesc = inputTDesc.next();
                 String dDetails = inputDDetails.next();
                 int tDuration = inputTDuration.nextInt();
                 String tID = inputTID.next();
                 String tStatus = inputTStatus.next();
                
                tArr[size] = new Task(tName, tNum, tDesc, dDetails, tDuration, tID, tStatus);
                size++;
            }
            //closing all scanners 
            inputTName.close();
            inputTNum.close();
            inputTDesc.close();
            inputDDetails.close();
            inputTDuration.close();
            inputTID.close();
            inputTStatus.close();
        }
        //this will display if a file is not found 
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
    }
    
    //this method will display the developer name, the task name, and the task duration if the task status is "done"
    public String displayTaskInfo()
    {
            String temp = "";
            for (int i = 0; i < size; i++)
            if(tArr[i].getTStatus().equals("Done"))
            {
                temp += tArr[i].getDDetails() + "\n";
                temp += tArr[i].getTName() + "\n";
                temp += tArr[i].getTDuration() + "\n";
            }
            return temp;
    }
    
    //this method will display the developer details and duration of the task with the longest duration 
    public String displayLongestDuration()
    {
        String tempDev = "";
        int tempDur = 0;
        for(int i = 0; i<size-1; i++) 
                for(int j = i+1; j<size; j++)
                    if((tArr[i].getTDuration())<(tArr[j].getTDuration()))
                    {
                        tempDev = tArr[j].getDDetails();
                        tempDur = tArr[j].getTDuration();
                    }
        
        return tempDev + "\n" + tempDur;
    }
    
    //this method will allow the user to search for a task using the task name, it will then display the task name, developer, and task status
    public String searchTaskName(String t)
    {
        String temp = "";
            for(int i = 0; i<size; i++)
            {
                if(tArr[i].getTName().equals(t))
                {
                    temp = tArr[i].getTName() + "\n" + tArr[i].getDDetails()
                            + "\n" + tArr[i].getTStatus();
                }
                else
                {
                    temp = "-1";
                }
            }
        return temp;
    }
    
    //this method will allow for the user to search for a developer, it will then display the task names and status of all tasks associated with the developer
    public String searchDeveloper(String d)
    {
        String temp = "";
            for(int i = 0; i<size; i++)
            {
                if(tArr[i].getDDetails().equals(d))
                {
                    temp = tArr[i].getTName() + "\n" + tArr[i].getTStatus();
                }
                else
                {
                    temp = "-1";
                }
            }
        return temp;
    }
    
    //this will allow the user to delete a task using the task name
    public void deleteTask(String dt)
    {
            for(int i = 0; i<size; i++)
            {
                if(tArr[i].getTName().equals(dt))
                {
                    String temp = "";
                    tArr[i] = temp;
                }
            }
    }
    
    //this method will display a report of the full details of all tasks
    public String toString()
    {
        String temp = "";
            for (int i = 0; i < size; i++)
            temp += tArr[i].toString();
            return temp;
    }
}
