package custom_exception.exceptions;

public class TempTooLowException2 extends TempOutOfRangeException{
	private static final long serialVersionUID = 1L;

	public TempTooLowException2(String message) {
		super(message);
	}

}
