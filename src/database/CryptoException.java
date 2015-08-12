package database;

public class CryptoException extends Exception {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 3199098635209684558L;

	public CryptoException() {
    }
 
    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}