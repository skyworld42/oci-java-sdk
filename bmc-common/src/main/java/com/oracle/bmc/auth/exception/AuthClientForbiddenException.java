/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.exception;

import com.google.common.base.Preconditions;
import com.oracle.bmc.model.BmcException;

/**
 * Exception thrown when the client failed to authorize to the auth service using configured key suppliers
 */
public class AuthClientForbiddenException extends AuthClientException {
    private static final long serialVersionUID = 1L;
    private static final int STATUS_CODE_FORBIDDEN = 403;
    private static final String MESSAGE = "Client is forbidden. ";

    public AuthClientForbiddenException(BmcException e) {
        this(MESSAGE + e.getMessage(), e);
    }

    public AuthClientForbiddenException(String message, BmcException cause) {
        super(message, validate(cause));
    }

    private static BmcException validate(BmcException cause) {
        Preconditions.checkArgument(matches(cause));
        return cause;
    }

    /**
     * Return true if the exception is a "client forbidden" exception.
     * @param cause BMC exception to check
     * @return true if the exception is a "client forbidden" exception
     */
    public static boolean matches(BmcException cause) {
        return cause.getStatusCode() == STATUS_CODE_FORBIDDEN;
    }
}
