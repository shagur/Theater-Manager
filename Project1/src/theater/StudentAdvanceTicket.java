package theater;

import java.util.Date;

public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(double price, Date showDate, int serialNum) {
        super((price/2), showDate, serialNum);
    }
}
