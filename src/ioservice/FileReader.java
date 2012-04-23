
package ioservice;

import java.util.Map;

/**
 *
 * @author Kevin
 */
public interface FileReader {
    
    public abstract void setInputFile(Map file);
    
    public abstract Object readRecord(String s);

}
