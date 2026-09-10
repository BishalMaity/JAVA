interface Payment
{
    void pay(double amount);
}

    class UPI implements Payment{

        public void pay(double amount){
            System.out.println(amount+" paid successfully by UPI");
        }
    }

    class CreditCard implements Payment{

        public void pay(double amount){
            System.out.println(amount+" paid successfully by Credit Card");
        }
    }

    class PayPal implements Payment{

        public void pay(double amount){
            System.out.println(amount+" paid successfully by PayPal");
        }
    }

    class CheckPayment {

        void processPayment(Payment payment)
        {
            payment.pay(500);
        }
    }

public class Interface{

    public static void main(String[] args) {
        
        CheckPayment cp=new CheckPayment();

        cp.processPayment(new UPI());
        cp.processPayment(new CreditCard());

    }
}



// Without Interface 

// class UPI {

//     void pay(double amount) {
//         System.out.println(amount + " paid successfully by UPI");
//     }
// }

// class CreditCard {

//     void pay(double amount) {
//         System.out.println(amount + " paid successfully by Credit Card");
//     }
// }

// class PayPal {

//     void pay(double amount) {
//         System.out.println(amount + " paid successfully by PayPal");
//     }
// }


// class CheckPayment {

//     void processUPIPayment(UPI payment) {
//         payment.pay(500);
//     }

//     void processCardPayment(CreditCard payment) {
//         payment.pay(500);
//     }

//     void processPayPalPayment(PayPal payment) {
//         payment.pay(500);
//     }
// }


// public class Interface {

//     public static void main(String[] args) {

//         CheckPayment cp = new CheckPayment();

//         cp.processUPIPayment(new UPI());

//         cp.processCardPayment(new CreditCard());

//         cp.processPayPalPayment(new PayPal());
//     }
// }