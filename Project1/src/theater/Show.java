package theater;

import java.util.Date;

public class Show {
	
	private int clientID;
	private String playName;
	private Date playStartDate;
	private Date playEndDate;
	private double ticketPrice;
	 
	 public Show(String playName, int clientId, Date startDate, Date endDate, double ticketPrice) {
		 this.playName = playName;
		 this.clientID = clientId;
		 playStartDate = startDate;
	     playEndDate = endDate;
	     this.ticketPrice = ticketPrice;
	 }
	 
	public int getClientID() {
		return clientID;
	}
	
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	 
	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public Date getPlayStartDate() {
		return playStartDate;
	}

	public void setPlayStartDate(Date playStartDate) {
		this.playStartDate = playStartDate;
	}

	public Date getPlayEndDate() {
		return playEndDate;
	}

	public void setPlayEndDate(Date playEndDate) {
		this.playEndDate = playEndDate;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "\n client ID = \t" + clientID + ", play name =\t" + playName + ", show start date =\t" + playStartDate
				+ ", show end date = \t" + playEndDate;
	}

}
