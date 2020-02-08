package alex.com.work07;

public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public Device() {    }

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Device other = (Device)obj;
        if (Double.compare(this.price, other.price) != 0) {
            return false;
        }
        if ( !this.serialNumber.equals(other.serialNumber)) {
            return false;
        }
        return this.manufacturer.equals(other.manufacturer);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": serialNumber=" + serialNumber +
                ", manufacturer=" + manufacturer  +
                ", price=" + price;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + manufacturer.hashCode();
        long longBits = Double.doubleToLongBits(price);
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        return result;
    }

}
