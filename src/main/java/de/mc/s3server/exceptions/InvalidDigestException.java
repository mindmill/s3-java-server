/*
 * Copyright (c) 2016 Mind Consulting UG(haftungsbeschränkt)
 */

package de.mc.s3server.exceptions;

/**
 * Created by Ralf Ulrich on 20.02.16.
 */
public class InvalidDigestException extends S3ServerException {
    public InvalidDigestException() {
        super("The Content-MD5 you specified is not valid.");
    }

    public InvalidDigestException(String message) {
        super(message);
    }

    public InvalidDigestException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDigestException(Throwable cause) {
        super(cause);
    }

    public InvalidDigestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}