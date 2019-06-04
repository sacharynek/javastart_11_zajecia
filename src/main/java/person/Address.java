package person;

import java.util.Objects;

public class Address {

    private String city, zip, buildNo, houseNo;

    public Address(String city, String zip, String buildNo, String houseNo) {
        this.city = city;
        this.zip = zip;
        this.buildNo = buildNo;
        this.houseNo = houseNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return city.equals(address.city) &&
                zip.equals(address.zip) &&
                buildNo.equals(address.buildNo) &&
                houseNo.equals(address.houseNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, zip, buildNo, houseNo);
    }

    @Override
    public String toString() {
        return "person.Address{" +
                "city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", buildNo='" + buildNo + '\'' +
                ", houseNo='" + houseNo + '\'' +
                '}';
    }
}
