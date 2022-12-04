import java.util.Objects;

public class SystemUser implements Cloneable{
    public String login;
    public int age;
    public String name;

    CreditCard card;

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Login: " +  login + "\n"
                + "Card number: " + card.cardNumber + "\n"
                + "Card pin: " + card.pinCode + "\n";
    }

    @Override
    protected SystemUser clone() throws CloneNotSupportedException {
        SystemUser newUser = (SystemUser) super.clone();
        newUser.card = (CreditCard) this.card.clone();
        return newUser;
    }

    public SystemUser(String login, int age, String name) {
        this.login = login;
        this.age = age;
        this.name = name;
        this.card = new CreditCard(1133313,1234);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser that = (SystemUser) o;
        return age == that.age && login == that.login && name == that.name && Objects.equals(card,that.card) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, age, name, card);
    }
}
