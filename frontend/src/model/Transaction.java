package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="transaction")
@SessionScoped

public class Transaction {
	private String name;
	private String sourcePassport;
	private String destPassport;
	private String destBank;
	private String destCountry; 
	private int accNumber;
	private int amount;
	private String transCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestPassport() {
		return destPassport;
	}
	public void setDestPassport(String destPassport) {
		this.destPassport = destPassport;
	}
	public String getDestBank() {
		return destBank;
	}
	public void setDestBank(String destBank) {
		this.destBank = destBank;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	public TransactionEntity getEntity() {
		
		TransactionEntity transactionentity = new TransactionEntity();
		transactionentity.setName(name);
		transactionentity.setSourcePassport(sourcePassport);
		transactionentity.setDestPassport(destPassport);
		transactionentity.setDestBank(destBank);
		transactionentity.setDestCountry(destCountry);
		transactionentity.setAccNumber(accNumber);
		transactionentity.setTransCode(transCode);
		transactionentity.setAmount(amount);
		
		return transactionentity;
	}
}
