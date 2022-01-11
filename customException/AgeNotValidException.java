package customException;




public class AgeNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6201787427185485252L;
	
	public AgeNotValidException(String msg) {
		super(msg);
	}

}