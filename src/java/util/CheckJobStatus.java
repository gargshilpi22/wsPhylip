
package util;

import java.io.File;

/**
 * @author Alok Dhamanaskar
 * @see    LICENSE (MIT style license file).
 * 
 * <br/><br/> The class defines method to return the status of the Job.
 */
public class CheckJobStatus
{

    /**
     * Returns the status of the job, depending upon whether output files are generated
     * @param dirName Job identifier
     * @return Job Status
     */
    public static String checkStatus(String dirName)
    {
        GetAbsolutePath pt = new GetAbsolutePath();
        String absolutePath = pt.getPath();
        
        File directory = new File(absolutePath + dirName);
        File outFile = new File(absolutePath + dirName + "/outfile");
        File outTree = new File(absolutePath + dirName + "/outtree");
        String status ="";
        
        boolean exists1 = directory.exists();
        boolean exists2 = outFile.exists();
        boolean exists3 = outTree.exists();
        if (exists1 == false)
            status = "Job Not Found";
        else
        {
            if (dirName.contains("PhylipConsense") || dirName.contains("PhylipNeighbor") || dirName.contains("PhylipProtpars"))
            {   
                if (exists2 == true && exists3 == true)
                    status = "FINISHED";
                else
                    status = "RUNNING";
            }//if
            else if (dirName.contains("PhylipProtdist"))
            {
                if (exists2 == true )
                    status = "FINISHED";
                else
                    status = "RUNNING";
            }//else           
        }//else
        
        return status;
    }//checkStatus

    public static void main(String args[])
    {
        System.out.println(CheckJobStatus.checkStatus("PhylipProtpars:f7dce074-f74d-4411-a955-17243d5eb4ee"));

    }//main
}