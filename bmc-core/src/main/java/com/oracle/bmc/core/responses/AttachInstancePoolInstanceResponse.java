/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class AttachInstancePoolInstanceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Use [GetWorkRequest](https://docs.cloud.oracle.com/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * Location of the resource.
     *
     */
    private String location;

    /**
     * The returned InstancePoolInstance instance.
     */
    private com.oracle.bmc.core.model.InstancePoolInstance instancePoolInstance;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "opcWorkRequestId",
        "location",
        "instancePoolInstance"
    })
    private AttachInstancePoolInstanceResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            String opcWorkRequestId,
            String location,
            com.oracle.bmc.core.model.InstancePoolInstance instancePoolInstance) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.location = location;
        this.instancePoolInstance = instancePoolInstance;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(AttachInstancePoolInstanceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            location(o.getLocation());
            instancePoolInstance(o.getInstancePoolInstance());

            return this;
        }

        public AttachInstancePoolInstanceResponse build() {
            return new AttachInstancePoolInstanceResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    etag,
                    opcWorkRequestId,
                    location,
                    instancePoolInstance);
        }
    }
}
