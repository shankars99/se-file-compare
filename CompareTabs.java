import java.io.*;

import tabs.Tabs;

public class CompareTabs {

    static int getEditor() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEditors:\n1. Geddit\n2. Notepad++\nEnter your choice:");
        return Integer.parseInt(br.readLine());

    }
    public static void main(String[] args) throws IOException{
        final Tabs obj = new Tabs();
        obj.getTabs();
        obj.tabHandler(getEditor());
    }
}