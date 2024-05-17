package com.mycompany.bar;
import java.io.FileWriter;
import java.io.IOException;
public class FileLogger implements Logger{
private String filePath;
    public FileLogger(String filePath) {
        this.filePath = filePath;
    }
  
    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter(this.filePath, true);
            fw.write(msg+ "\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
