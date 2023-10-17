package session13_recap.challenges.oop.library_management_sys;

public class Address {
    private String country;
    private String city;
    private String streetName;
    private int streetNumber;
    private String postalOfficeBox;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalOfficeBox() {
        return postalOfficeBox;
    }

    public void setPostalOfficeBox(String postalOfficeBox) {
        this.postalOfficeBox = postalOfficeBox;
    }

    @Override
    public String toString() {
        return "Address{" +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postalOfficeBox='" + postalOfficeBox + '\'' +
                "country='" + country + '\'' +
                '}';
    }
}
