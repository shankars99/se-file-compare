package tabs;
import java.io.*;

public class Tabs {
    final int geditMax = 45;
    final int nppMax = 80;
    int currTab = -1;

    public void getTabs() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of tabs opened:");
        currTab = Integer.parseInt(br.readLine());
    }

    public void tabHandler(int toggle){
        toggle = toggle==1?geditMax:nppMax;

        if(currTab < 0)
            System.out.println("\n  Error:Only a positive number of tabs can be opened");
        else if(currTab > toggle-1){
            System.out.println("\n  Error:Maximum number of tabs reached:"+toggle+".\n  Close a tab to proceed");
        }
        else{
            System.out.println("\nNew tab successfully opened at location: "+(currTab + 1)+".");
        }
    }
}