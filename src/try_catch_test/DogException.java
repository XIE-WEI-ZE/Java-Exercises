package try_catch_test;

public class DogException extends Exception {

	private static final long serialVersionUID = 1707170060574115329L;
	
	public DogException() {
		// TODO 自動產生的建構子 Stub
		super("this is dog exception");
	}

	public DogException(String message) {
		super(message);
		// TODO 自動產生的建構子 Stub
	}

	public DogException(Throwable cause) {
		super(cause);
		// TODO 自動產生的建構子 Stub
	}

	public DogException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自動產生的建構子 Stub
	}

	public DogException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自動產生的建構子 Stub
	}

}
