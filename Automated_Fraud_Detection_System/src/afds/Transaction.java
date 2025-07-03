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
	
	public int getAmount(){
		return amount;
	}
	public char getType() {
		return type;
	}
	public int getRiskScore() {
		return riskScore;
	}
	public int getAccountID() {
		return accountID;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
}
