package theater;

public class Client {

    private String clientName;
    private String clientAddress;
    private String clientPhone;
    private int clientID;
    private double balanceDue;

    public Client(int clientID, String clientName,
                  String clientAddress, String clientPhone, double balanceDue) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.balanceDue = balanceDue;
    }

    public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public double getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}

	public void addBalanceDue(double ticketRevenue){
    	this.balanceDue += ticketRevenue;
	}

	public void payClient(double payment){

    	if(balanceDue > payment){
			System.out.println("Error: payment is more than the balance due;");
		}else{
    		balanceDue -= payment;
		}

	}

	@Override
    public String toString() {
        return "Client{" +
                "client name='" + clientName + '\'' +
                ", client address='" + clientAddress + '\'' +
                ", client phone=" + clientPhone +
                ", client ID=" + clientID +
                ", balance due=" + balanceDue +
                
                '}';
    }

}