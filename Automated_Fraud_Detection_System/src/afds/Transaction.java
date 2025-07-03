package afds;

public class Transaction {
	int amount;
	char type;
	int riskScore;
	int accountID;
	int row,col;
	
	public Transaction(int amount,char type,int riskScore, int accountID, int row,int col) {
		this.amount = amount;
		this.type = type;
		this.riskScore = riskScore;
		this.accountID = accountID;
		this.row = row;
		this.col = col;
		
		
	}
}
