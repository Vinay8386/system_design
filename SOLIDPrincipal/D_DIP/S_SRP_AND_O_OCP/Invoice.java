package SOLIDPrincipal.D_DIP.S_SRP_AND_O_OCP;

public class Invoice {

    private Marker marker;
    private int quantity;

    Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    //First method
    public int calculateInvoice(){
        int amount= ((marker.price)*this.quantity);
        return amount;
    }
    //second method
    public void printInvoice(){
        //logic to print the invoice
    }
    //third method
    public void saveToFile(){
        //logic to save details in the file
    }
}

