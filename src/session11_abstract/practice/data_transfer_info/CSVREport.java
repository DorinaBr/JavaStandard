package session11_abstract.practice.data_transfer_info;

public class CSVREport extends Report implements CSVExportable {

    @Override
    public void showPreview() {
//from abstract class
    }

    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void exportToCsv() {
        //from interface
    }
}
