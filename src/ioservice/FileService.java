
package ioservice;

import java.util.Map;

/**
 *
 * @author Kevin Nangle
 */
public class FileService {
    FileReader r = new TextFileReader();  
    FileWriter w = new TextFileWriter();
    Map file = null;
    
    public FileService(){
    }
    
    public FileService(Map file){
        this.file=file;
        r.setInputFile(file);
    }
    
    
    public void setInputFile(){
           r.setInputFile(file);
    }
    
    public Object readRecord(String s){
        return r.readRecord(s);
    }
}
