package br.edu.ifpb.mt.dac;

public class DacException extends Exception {

	private static final long serialVersionUID = -7669751088704144947L;

	public DacException(String message) {
		super(message);
	}

	public DacException(String message, Throwable cause) {
		super(message, cause);
	}

}
