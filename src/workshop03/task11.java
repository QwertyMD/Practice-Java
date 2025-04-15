package workshop03;

class Address{
    private String street, city;
    private int zipCode;
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

public class task11 {
    public static void main(String[] args){
        Address address = new Address();
        address.setStreet("Wall Street");
        address.setCity("New York City");
        address.setZipCode(10005);
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
