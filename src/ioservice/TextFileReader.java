
package ioservice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class TextFileReader implements FileReader{
    
    private FileFormatStrategy thisFormat = new GarageFormat();
    Map file = null;
    
    public TextFileReader(){
    }
    
    public TextFileReader(Map file){
        this.file = file;
        thisFormat.setInputFile(file);
        
    }

    public void setInputFile(Map file) {
        this.file = file;
        thisFormat.setInputFile(file);
    }
    
    public Object readRecord(String s){
        return thisFormat.readRecord(s);
    }

}
