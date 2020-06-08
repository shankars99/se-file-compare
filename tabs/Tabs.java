package tabs;
import java.io.*;

public class Tabs {
    final int geditMax = 45;
    final int nppMax = 80;
    final int sublimeMax = 60;
    final int npMax = 30;

    int currTab = -1;

    public void getTabs() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of tabs opened:");
        currTab = Integer.parseInt(br.readLine());
    }

    public void tabHandler(int toggle){
        boolean flag = true;
        switch(toggle)
        {
            case 1:
                toggle = geditMax;
                break;
            case 2:
                toggle = nppMax;
                break;
            case 3:
                toggle = sublimeMax;
                break;
            case 4:
                toggle = npMax;
                break;
            default:
                System.out.println("Incorrect app index number");
                flag = false;
        }

        if(flag == true)
        {
            if (currTab < 0)
                System.out.println("\n  Error:Only a positive number of tabs can be opened");
            else if (currTab > toggle - 1) {
                System.out
                        .println("\n  Error:Maximum number of tabs reached:" + toggle + ".\n  Close a tab to proceed");
            } else {
                System.out.println("\nNew tab successfully opened at location: " + (currTab + 1) + ".");
            }
        }
    }
}