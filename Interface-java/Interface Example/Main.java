interface Paymentmethod {
    public void pay(double amount);
    public void getrecept();
}

class CreditCardPayment implements Paymentmethod {
    private int bankcardnum;
    private int cvvnum;
    boolean paymentcom = false;

    public void setBankcardnum(int bankcardnum) {
        this.bankcardnum = bankcardnum;
    }

    public void setCvvnum(int cvvnum) {
        this.cvvnum = cvvnum;
    }

    @Override
    public void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("payemnt completed");
        paymentcom = true;
    }

    @Override
    public void getrecept() {
        // TODO Auto-generated method stub
        if (paymentcom == true) {
            System.out.println("Payment succefully completed");
        } else {
            System.out.println("Paymeny not completed");
        }
    }
}

class PayPalPayment implements Paymentmethod {
    private String email;
    private int tokens;
    boolean paymentcom = false;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    @Override
    public void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Payment completed succesfully");
        paymentcom = true;
    }

    @Override
    public void getrecept() {
        // TODO Auto-generated method stub
        if (paymentcom == true) {
            System.out.println("Payment succesfully compleed on date");
        } else {
            System.out.println("Receipt not generated");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CreditCardPayment cp = new CreditCardPayment();
        cp.setBankcardnum(123456796);
        cp.setCvvnum(895456);
        cp.pay(500);
        cp.getrecept();

        PayPalPayment pp = new PayPalPayment();
        pp.setEmail("abhi@123gmail.com");
        pp.setTokens(456789);
        pp.pay(700);
        pp.getrecept();
    }
}
