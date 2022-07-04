// St10071160
package st10071160_poe_assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysTest
{
    
    Arrays ar = new Arrays();
    public ArraysTest()
    {
    }

    /**
     * Test of displayTaskInfo method, of class Arrays.
     */
    @Test
    public void testDisplayTaskInfo()
    {
        String dDetails1 = "Mike Smith";
        String tName1 = "Create Login";
        int tDuration1 = 5;
        String tStatus1 = "To do";
        
        String dInfo1 = ar.displayTaskInfo();
        String nInfo1 = ar.displayTaskInfo();
        int dur1 = Integer.parseInt(ar.displayTaskInfo());
        String stat1 = ar.displayTaskInfo();
        
        assertEquals("Mike Smith", dInfo1);
        assertEquals("Create Login", nInfo1);
        assertEquals(5, dur1);
        assertEquals("To do", stat1);
        
        
        String dDetails2 = "Edward Harrison";
        String tName2 = "Create Add Features";
        int tDuration2 = 8;
        String tStatus2 = "Doing";
        
        String dInfo2 = ar.displayTaskInfo();
        String nInfo2 = ar.displayTaskInfo();
        int dur2 = Integer.parseInt(ar.displayTaskInfo());
        String stat2 = ar.displayTaskInfo();
        
        assertEquals("Edward Harrison", dInfo2);
        assertEquals("Create Add Features", nInfo2);
        assertEquals(8, dur2);
        assertEquals("Doing", stat2);
        
        
        String dDetails3 = "Samantha Paulson";
        String tName3 = "Create Reports";
        int tDuration3 = 2;
        String tStatus3 = "Done";
        
        String dInfo3 = ar.displayTaskInfo();
        String nInfo3 = ar.displayTaskInfo();
        int dur3 = Integer.parseInt(ar.displayTaskInfo());
        String stat3 = ar.displayTaskInfo();
        
        assertEquals("Samantha Paulson", dInfo3);
        assertEquals("Create Reports", nInfo3);
        assertEquals(2, dur3);
        assertEquals("Done", stat3);
        
        
        String dDetails4 = "Glenda Oberholzer";
        String tName4 = "Add Arrays";
        int tDuration4 = 11;
        String tStatus4 = "To do";
        
        String dInfo4 = ar.displayTaskInfo();
        String nInfo4 = ar.displayTaskInfo();
        int dur4 = Integer.parseInt(ar.displayTaskInfo());
        String stat4 = ar.displayTaskInfo();
        
        assertEquals("Glenda Oberholzer", dInfo4);
        assertEquals("Add Arrays", nInfo4);
        assertEquals(11, dur4);
        assertEquals("To do", stat4);
    }

    /**
     * Test of displayLongestDuration method, of class Arrays.
     */
    @Test
    public void testDisplayLongestDuration()
    {
        String dDetails1 = "Mike Smith";
        int tDuration1 = 5;
        
        String dInfo1 = ar.displayLongestDuration();
        int dur1 = Integer.parseInt(ar.displayLongestDuration());
        
        assertEquals("Mike Smith", dInfo1);
        assertEquals(5, dur1);
        
        String dDetails2 = "Edward Harrison";
        int tDuration2 = 8;
        
        String dInfo2 = ar.displayLongestDuration();
        int dur2 = Integer.parseInt(ar.displayLongestDuration());
        
        assertEquals("Edward Harrison", dInfo2);
        assertEquals(8, dur2);
        
        
        String dDetails3 = "Samantha Paulson";
        int tDuration3 = 2;
        
        String dInfo3 = ar.displayLongestDuration();
        int dur3 = Integer.parseInt(ar.displayLongestDuration());
        
        String dDetails4 = "Glenda Oberholzer";
        int tDuration4 = 11;
        
        String dInfo4 = ar.displayLongestDuration();
        int dur4 = Integer.parseInt(ar.displayLongestDuration());
        
        assertEquals("Glenda Oberholzer", dInfo4);
        assertEquals(11, dur4);
    }

    /**
     * Test of searchTaskName method, of class Arrays.
     */
    @Test
    public void testSearchTaskName()
    {
        String dDetails1 = "Mike Smith";
        String tName1 = "Create Login";
        String tStatus1 = "To do";
        
        String dInfo1 = ar.searchTaskName(tName1);
        String nInfo1 = ar.searchTaskName(tName1);
        String stat1 = ar.searchTaskName(tName1);
        
        assertEquals("Mike Smith", dInfo1);
        assertEquals("Create Login", nInfo1);
        assertEquals("To do", stat1);
        
        
        String dDetails2 = "Edward Harrison";
        String tName2 = "Create Add Features";
        String tStatus2 = "Doing";
        
        String dInfo2 = ar.searchTaskName(tName2);
        String nInfo2 = ar.searchTaskName(tName2);
        String stat2 = ar.searchTaskName(tName2);
        
        assertEquals("Edward Harrison", dInfo2);
        assertEquals("Create Add Features", nInfo2);
        assertEquals("Doing", stat2);
        
        
        String dDetails3 = "Samantha Paulson";
        String tName3 = "Create Reports";
        String tStatus3 = "Done";
        
        String dInfo3 = ar.searchTaskName(tName3);
        String nInfo3 = ar.searchTaskName(tName3);
        String stat3 = ar.searchTaskName(tName3);
        
        assertEquals("Samantha Paulson", dInfo3);
        assertEquals("Create Reports", nInfo3);
        assertEquals("Done", stat3);
        
        
        String dDetails4 = "Glenda Oberholzer";
        String tName4 = "Add Arrays";
        String tStatus4 = "To do";
        
        String dInfo4 = ar.searchTaskName(tName4);
        String nInfo4 = ar.searchTaskName(tName4);
        String stat4 = ar.searchTaskName(tName4);
        
        assertEquals("Glenda Oberholzer", dInfo4);
        assertEquals("Add Arrays", nInfo4);
        assertEquals("To do", stat4);
    }

    /**
     * Test of searchDeveloper method, of class Arrays.
     */
    @Test
    public void testSearchDeveloper()
    {
        String dDetails1 = "Mike Smith";
        String tName1 = "Create Login";
        String tStatus1 = "To do";
        
        String dInfo1 = ar.searchDeveloper(dDetails1);
        String nInfo1 = ar.searchDeveloper(dDetails1);
        String stat1 = ar.searchDeveloper(dDetails1);
        
        assertEquals("Mike Smith", dInfo1);
        assertEquals("Create Login", nInfo1);
        assertEquals("To do", stat1);
        
        
        String dDetails2 = "Edward Harrison";
        String tName2 = "Create Add Features";
        String tStatus2 = "Doing";
        
        String dInfo2 = ar.searchDeveloper(dDetails2);
        String nInfo2 = ar.searchDeveloper(dDetails2);
        String stat2 = ar.searchDeveloper(dDetails2);
        
        assertEquals("Edward Harrison", dInfo2);
        assertEquals("Create Add Features", nInfo2);
        assertEquals("Doing", stat2);
        
        
        String dDetails3 = "Samantha Paulson";
        String tName3 = "Create Reports";
        String tStatus3 = "Done";
        
        String dInfo3 = ar.searchDeveloper(dDetails3);
        String nInfo3 = ar.searchDeveloper(dDetails3);
        String stat3 = ar.searchDeveloper(dDetails3);
        
        assertEquals("Samantha Paulson", dInfo3);
        assertEquals("Create Reports", nInfo3);
        assertEquals("Done", stat3);
        
        
        String dDetails4 = "Glenda Oberholzer";
        String tName4 = "Add Arrays";
        String tStatus4 = "To do";
        
        String dInfo4 = ar.searchDeveloper(dDetails4);
        String nInfo4 = ar.searchDeveloper(dDetails4);
        String stat4 = ar.searchDeveloper(dDetails4);
        
        assertEquals("Glenda Oberholzer", dInfo4);
        assertEquals("Add Arrays", nInfo4);
        assertEquals("To do", stat4);
    }

    /**
     * Test of deleteTask method, of class Arrays.
     */
    @Test
    public void testDeleteTask()
    {
        String dDetails1 = "Mike Smith";
        String tName1 = "Create Login";
        int tDuration1 = 5;
        String tStatus1 = "To do";
        
        String dInfo1 = ar.deleteTask();
        String nInfo1 = ar.deleteTask();
        int dur1 = Integer.parseInt(ar.deleteTask());
        String stat1 = ar.deleteTask();
        
        assertEquals("", dInfo1);
        assertEquals("", nInfo1);
        assertEquals(0, dur1);
        assertEquals("", stat1);
        
        
        String dDetails2 = "Edward Harrison";
        String tName2 = "Create Add Features";
        int tDuration2 = 8;
        String tStatus2 = "Doing";
        
        String dInfo2 = ar.deleteTask();
        String nInfo2 = ar.deleteTask();
        int dur2 = Integer.parseInt(ar.deleteTask());
        String stat2 = ar.deleteTask();
        
        assertEquals("", dInfo2);
        assertEquals("", nInfo2);
        assertEquals(0, dur2);
        assertEquals("", stat2);
        
        
        String dDetails3 = "Samantha Paulson";
        String tName3 = "Create Reports";
        int tDuration3 = 2;
        String tStatus3 = "Done";
        
        String dInfo3 = ar.deleteTask();
        String nInfo3 = ar.deleteTask();
        int dur3 = Integer.parseInt(ar.deleteTask());
        String stat3 = ar.deleteTask();
        
        assertEquals("", dInfo3);
        assertEquals("", nInfo3);
        assertEquals(0, dur3);
        assertEquals("", stat3);
        
        
        String dDetails4 = "Glenda Oberholzer";
        String tName4 = "Add Arrays";
        int tDuration4 = 11;
        String tStatus4 = "To do";
        
        String dInfo4 = ar.deleteTask();
        String nInfo4 = ar.deleteTask();
        int dur4 = Integer.parseInt(ar.deleteTask());
        String stat4 = ar.deleteTask();
        
        assertEquals("", dInfo4);
        assertEquals("", nInfo4);
        assertEquals(0, dur4);
        assertEquals("", stat4);
    }

    /**
     * Test of toString method, of class Arrays.
     */
    @Test
    public void testToString()
    {
        String dDetails1 = "Mike Smith";
        String tName1 = "Create Login";
        int tDuration1 = 5;
        String tStatus1 = "To do";
        
        String dInfo1 = ar.toString();
        String nInfo1 = ar.toString();
        int dur1 = Integer.parseInt(ar.toString());
        String stat1 = ar.toString();
        
        assertEquals("Mike Smith", dInfo1);
        assertEquals("Create Login", nInfo1);
        assertEquals(5, dur1);
        assertEquals("To do", stat1);
        
        
        String dDetails2 = "Edward Harrison";
        String tName2 = "Create Add Features";
        int tDuration2 = 8;
        String tStatus2 = "Doing";
        
        String dInfo2 = ar.toString();
        String nInfo2 = ar.toString();
        int dur2 = Integer.parseInt(ar.toString());
        String stat2 = ar.toString();
        
        assertEquals("Edward Harrison", dInfo2);
        assertEquals("Create Add Features", nInfo2);
        assertEquals(8, dur2);
        assertEquals("Doing", stat2);
        
        
        String dDetails3 = "Samantha Paulson";
        String tName3 = "Create Reports";
        int tDuration3 = 2;
        String tStatus3 = "Done";
        
        String dInfo3 = ar.toString();
        String nInfo3 = ar.toString();
        int dur3 = Integer.parseInt(ar.toString());
        String stat3 = ar.toString();
        
        assertEquals("Samantha Paulson", dInfo3);
        assertEquals("Create Reports", nInfo3);
        assertEquals(2, dur3);
        assertEquals("Done", stat3);
        
        
        String dDetails4 = "Glenda Oberholzer";
        String tName4 = "Add Arrays";
        int tDuration4 = 11;
        String tStatus4 = "To do";
        
        String dInfo4 = ar.toString();
        String nInfo4 = ar.toString();
        int dur4 = Integer.parseInt(ar.toString());
        String stat4 = ar.toString();
        
        assertEquals("Glenda Oberholzer", dInfo4);
        assertEquals("Add Arrays", nInfo4);
        assertEquals(11, dur4);
        assertEquals("To do", stat4);
    }
    
}
