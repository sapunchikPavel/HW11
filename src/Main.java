public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        SystemUser user = new SystemUser("abrakadabra",19,"Pavel");
        SystemUser clone = user.clone();

        System.out.println(user);
        System.out.println(clone);

        System.out.println(clone.equals(user)?"Equal":"Not Equal\n");
        clone.card.cardNumber = 1212;
        System.out.println(clone.equals(user)?"Equal":"Not Equal\n");

        System.out.println(user);
        System.out.println(clone);
    }
}
