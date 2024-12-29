//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ParcelMap {
    private Map<String, Parcel> parcelMap = new HashMap();

    public ParcelMap() {
    }

    public void addParcel(Parcel parcel) {
        this.parcelMap.put(parcel.id, parcel);
    }

    public Parcel findParcelById(String id) {
        return (Parcel)this.parcelMap.get(id);
    }

    public void removeParcel(String id) {
        this.parcelMap.remove(id);
    }

    public Collection<Parcel> getAllParcels() {
        return this.parcelMap.values();
    }
}
