// ST10071160
package st10071160_poe_assignment;


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
        tempID = tName.charAt(0) + tName.charAt(0) + ":" + tNum + ":" + dDetails.charAt(dDetails.length()) + dDetails.charAt(dDetails.length() - 1) + dDetails.charAt(dDetails.length() - 2);
        tID = tempID.toUpperCase();
        return tID;
    }
}
