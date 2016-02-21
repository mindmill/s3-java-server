/*
 * Copyright (c) 2016 Mind Consulting UG(haftungsbeschränkt)
 */

package de.mc.s3server.exceptions;

import de.mc.s3server.entities.api.S3RequestId;

/**
 * @author Ralf Ulrich on 17.02.16.
 */
public class BucketAlreadyExistsException extends S3ServerException {

    public BucketAlreadyExistsException(String resource, S3RequestId requestId) {
        super("The requested bucket name is not available.", resource, requestId);
    }


}
