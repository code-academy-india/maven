package icc.maven.docsite;


/**
 * 
 * @author Vasantha
 * @version 1.0.0
 * 
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("Code Academy Hello World using Maven Tools !!! ");
	}

	/**
	 * Image method to find in real time storage
	 * 
	 * @param name image name to check
	 * @return 1 or 0 based on image presence
	 */
		 public int getImage(String name) {
		        try {
		            return 1;
		        } catch (Exception e) {
		            return 0;
		        }
 }
}
