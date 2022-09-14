package br.edu.ifpb.mt.dac.dao;

import br.edu.ifpb.mt.dac.DacException;

public class PersistenciaDacException extends DacException {

	private static final long serialVersionUID = 7159282553688713660L;

	public PersistenciaDacException(String message) {
		super(message);
	}

	public PersistenciaDacException(String message, Throwable cause) {
		super(message, cause);
	}

}
