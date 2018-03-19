
package com.mycompany.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;

/**
 *
 * @author Azmir
 */

public class gitPushWiki {
    public void openGitbash() throws IOException{
        String[] command = {"C:/Program Files/Git/git-bash.exe",
            "/c","cd && cd 243122-STIW3054-A172-A1.wiki && git add * && git commit -m \"Commit\" && git push"};
        Runtime.getRuntime().exec(command);
    }
    
    public void runTerminal() throws IOException{
        try{
          
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd && cd \"C:\\Users\\Azmir\\243122-STIW3054-A172-A1.wiki\" && git add * && git commit -m \"commit\" && git push");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        System.out.println("\nCMD result : \n");
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
        sleep(3000);
        }catch(Exception e){
            System.out.println("Terminal cant open");
        }
    }
}
