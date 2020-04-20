package icc.multi.bankclient;

import com.google.gson.Gson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

	private static final Logger logger  = LogManager.getLogger(Client.class);
	
	public static void main(String[] args) {
		
		logger.info("Multi module bank client log started");
		
		Gson gson = new Gson();
		Account a1 = new Account();
		a1.setAccountId(38273);
		a1.setAccountType("Savings Account");
		logger.info("  **********  ");
		logger.info("bank client output");
		String a1Json = gson.toJson(a1, Account.class);
		logger.info("account details in json format " +  a1Json);
		
		logger.info("Multi module bank client log ended");
	}

}
