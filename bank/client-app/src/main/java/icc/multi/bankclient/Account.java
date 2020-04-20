package icc.multi.bankclient;

import java.io.Serializable;

public class Account implements Serializable {

	private int accountId;
	private String accountType;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
