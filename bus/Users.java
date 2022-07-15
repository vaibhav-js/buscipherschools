// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
public class Users {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;
    private Contact contact;
    private Address address;
    private String password;

    public Users(Contact contact, Address address, String password) {
        this.contact = contact;
        this.address = address;
        this.password = password;
    }

    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
            " contact='" + getContact() + "'" +
            ", address='" + getAddress() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
}