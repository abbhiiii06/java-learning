public class User {
    String userName;
    String email;
    double cart_total = 0;

    public void get_details(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public void orderbilling(String item, int purchased, int price) {
        this.cart_total = purchased * price;
    }

    public void checkout() {
        System.out.println("User name:" + userName);
        System.out.println("Customer mailid:" + email);
        System.out.println("Total amount to pay:" + cart_total);
    }

    public static void main(String[] args) {
        User us = new User();
        us.get_details("Abhi", "example@gmail.com");
        us.orderbilling("soaps", 5, 56);
        us.checkout();

        System.out.println();

        PremiumUser pu = new PremiumUser();
        pu.get_details("sai", "sai@gmail.com");
        pu.orderbilling("surf", 10, 45);
        pu.verfication(false);
    }
}

class PremiumUser extends User {
    boolean membership;

    public void verfication(boolean membership) {
        this.membership = membership;
        if (membership == true) {
            double discount = cart_total * 0.20;
            double finalprice = cart_total - discount;
            System.out.println("User name" + userName);
            System.out.println("mailid:" + email);
            System.out.println("Total amount after disount:" + finalprice);
        } else {
            System.out.println("Your membership has been expired");
            System.out.println("User name:" + userName);
            System.out.println("mailid:" + email);
            System.out.println("so pay total:" + cart_total);
        }
    }
}