
public class Worker {
    private ParcelMap parcelMap;
    private Log log = Log.getInstance();

    public Worker(ParcelMap parcelMap) {
        this.parcelMap = parcelMap;
    }

    public void processCustomer(Customer customer) {
        Parcel parcel = this.parcelMap.findParcelById(customer.parcelId);
        if (parcel != null && !parcel.isCollected) {
            parcel.isCollected = true;
            double fee = this.calculateFee(parcel);
            this.log.addEvent("Customer " + customer.name + " collected parcel " + parcel.id + " with fee: " + fee);
            System.out.println("Processed customer: " + customer.name + ", Parcel: " + parcel.id + ", Fee: " + fee);
        } else {
            this.log.addEvent("Parcel " + customer.parcelId + " not found or already collected.");
            System.out.println("Parcel " + customer.parcelId + " not found or already collected.");
        }

    }

    public double calculateFee(Parcel parcel) {
        return (double)parcel.weight * (double)0.5F + (double)parcel.daysInDepot * 0.2;
    }
}
