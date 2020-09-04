package theater;
import java.util.ArrayList;

public class Customer {

    String customerName;
    String customerAddress;
    String customerPhone;
    int customerID;
    ArrayList<CreditCard> creditCardList;
    ArrayList<Ticket> ticketList;

    public Customer(String customerName, String customerAddress, String customerPhone, int customerID) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.creditCardList = new ArrayList<CreditCard>();
        this.customerID = customerID;
        this.ticketList = new ArrayList<Ticket>();
    }

    public void addCreditCard(String creditCardNumber, String expiryDate){
        creditCardList.add(new CreditCard(creditCardNumber, expiryDate));
    }

    @Override
    public String toString() {

        String creditCardList = "";
        String ticketList = "";

        for(int i = 0; i < this.creditCardList.size(); i++){
            creditCardList = creditCardList + this.creditCardList.get(i);
        }
        for(int i = 0; i < this.ticketList.size(); i++){
            ticketList = ticketList + this.ticketList.get(i);
        }

        return "Customer{" +
                "Customer Name='" + customerName + '\'' +
                ", Customer Address='" + customerAddress + '\'' +
                ", Customer Phone='" + customerPhone + '\'' +
                ", Customer ID=" + customerID +
                ", CreditCard List=" + creditCardList +
                ", Ticket List=" + ticketList +
                '}';
    }
}//end customer

class CreditCard {

    String creditCardNumber;
    String expiryDate;

    CreditCard(String creditCardNumber, String expiryDate){
        this.creditCardNumber = creditCardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "credit card number=" + creditCardNumber +
                ", expiry date='" + expiryDate + '\'' +
                '}';
    }

}//end CreditCard