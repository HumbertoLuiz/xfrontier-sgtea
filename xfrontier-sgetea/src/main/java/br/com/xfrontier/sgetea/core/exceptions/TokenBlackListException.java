package br.com.xfrontier.sgetea.core.exceptions;

public class TokenBlackListException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TokenBlackListException() {
        super("The given token is not valid");
    }

    public TokenBlackListException(String message) {
        super(message);
    }

}

