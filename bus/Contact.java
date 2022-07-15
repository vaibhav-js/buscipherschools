//package bus;

public class Contact {
    private String name;
    private int phonenumber;
    private String emailID;

    public Contact() {
    }

    public Contact(String name, int phonenumber, String emailID) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.emailID = emailID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailID() {
        return this.emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phonenumber='" + getPhonenumber() + "'" +
            ", emailID='" + getEmailID() + "'" +
            "}";
    }
}