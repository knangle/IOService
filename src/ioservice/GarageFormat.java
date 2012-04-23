
package ioservice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class GarageFormat implements FileFormatStrategy {
    
    Map<String, Object> input = null;

    public GarageFormat (){
    }
    public GarageFormat(Map<String,Object> input){
        this.input = input;    
    }
    
    public Object readRecord(String s){
        return input.get(s);
    }

    public void setInputFile(Map input) {
        this.input = input;
    }
    
    
}
