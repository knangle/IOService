
package ioservice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Nangle
 * 
 */
public class Startup {

    public static void main(String[] args) {
    
    // Build a hashMap containing the total hours and charges for a garage    
    Map testRun = new HashMap<String,Object>();    
    testRun.put("Total Hours", (Double)(77.8));
    testRun.put("Total Charges", (Double)(185.95));
    
    // Instantiate the FileService class and pass the HashMap to it.
    FileService fs = new FileService(testRun);   
    
    // Call the FileService's readRecord method to get total hours and charges
    double hours = (Double)fs.readRecord("Total Hours");
    double charges = (Double)fs.readRecord("Total Charges");   
   
    // Print the results
    System.out.println("The total accumulated hours for this garage are " 
            + hours + ".");
    System.out.println("The total accumulated charges for this garage are " 
            + charges + ".");
    }
}
