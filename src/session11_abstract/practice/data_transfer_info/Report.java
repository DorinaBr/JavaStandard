package session11_abstract.practice.data_transfer_info;

import java.util.List;

public abstract class Report {

    private String title;
    private List<String> data;

    public abstract void showPreview();

    public void displayMetadata(){
        System.out.println("Title is: " + title);
    }

}
