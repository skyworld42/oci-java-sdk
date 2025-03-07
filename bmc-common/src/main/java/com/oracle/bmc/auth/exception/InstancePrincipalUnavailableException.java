/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.exception;

/**
 * Failed to fetch Instance Principal cert from the Instance Metadata Service.
 */
public class InstancePrincipalUnavailableException extends IllegalArgumentException {
    public InstancePrincipalUnavailableException(String message, Exception cause) {
        super(message, cause);
    }

    public InstancePrincipalUnavailableException(String message) {
        super(message);
    }
}
