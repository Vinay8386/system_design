package SOLIDPrincipal.D_DIP.S_SRP_AND_O_OCP;

//Class-1
class InvoiceCalculator {

    private Marker marker;
    private int quantity;

    public InvoiceCalculator(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateInvoiceAmount() {
        return marker.price * quantity;
    }
}
