
package ioservice;

import java.util.Map;

/**
 *
 * @author Kevin
 */
public interface FileFormatStrategy {
    
    public abstract Object readRecord(String s);
    public abstract void setInputFile(Map input);
    
}
