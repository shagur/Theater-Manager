package theater;

import java.util.Date;

public class AdvanceTicket extends Ticket {
    public AdvanceTicket(double price, Date showDate, int serialNum) {
        super((price * 0.7), showDate, serialNum);
    }
}
