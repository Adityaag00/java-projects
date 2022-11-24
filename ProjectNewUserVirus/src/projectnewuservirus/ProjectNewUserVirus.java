
package projectnewuservirus;

import java.io.IOException;
import java.io.OutputStream;


public class ProjectNewUserVirus {

    
    public static void main(String[] args) throws IOException {
        Process prcs=Runtime.getRuntime().exec("cmd /c start cmd.exe");
        OutputStream os=prcs.getOutputStream();
        os.write("cd C:/ /r/n".getBytes()); 
    }
    
}
