package theater;

import java.util.Date;

public class Ticket {

    private double price;
    private int serialNum;
    private Date showDate;

    public Ticket(double price, Date showDate, int serialNum) {
        this.price = price;
        this.showDate = showDate;
        this.serialNum = serialNum;
    }

    public Date getShowDate() {
        return showDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", serial number=" + serialNum +
                ", show date=" + showDate +
                '}';
    }

}
