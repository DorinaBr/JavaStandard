package session11_abstract.practice.data_transfer_info;

public class PDFReport extends Report implements PDFExportable{
    @Override
    public void exportToPdf() {

    }

    //it's not mandatory to override this method
    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void showPreview() {

    }
}
