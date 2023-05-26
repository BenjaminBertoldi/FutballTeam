package people;

import java.util.Objects;

public class User  {
    private String email;
    private String address;
    private int idCard;
    private int creditCardNumber;

    public User(String email, String address , int idCard, int creditCardNumber) {
        this.email = email;
        this.address = address;
        this.idCard = idCard;
        this.creditCardNumber = creditCardNumber;
    }

    public User() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public String toString() {
        return "User:" +
                " Email: " + email +
                " Address: " + address + " " +
                " ID Card: " + idCard +
                " Credit Card Number: " + creditCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return creditCardNumber == user.creditCardNumber && Objects.equals(email, user.email) && address.equals(user.address) && Objects.equals(idCard, user.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, address, idCard, creditCardNumber);
    }
}
