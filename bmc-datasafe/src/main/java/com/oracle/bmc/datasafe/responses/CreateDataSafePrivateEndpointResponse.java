/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateDataSafePrivateEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     *
     */
    private String etag;

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with this OCID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The full URI of the Data Safe private endpoint.
     *
     */
    private String location;

    /**
     * The returned DataSafePrivateEndpoint instance.
     */
    private com.oracle.bmc.datasafe.model.DataSafePrivateEndpoint dataSafePrivateEndpoint;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "dataSafePrivateEndpoint"
    })
    private CreateDataSafePrivateEndpointResponse(
            int __httpStatusCode__,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.datasafe.model.DataSafePrivateEndpoint dataSafePrivateEndpoint) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.dataSafePrivateEndpoint = dataSafePrivateEndpoint;
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
        public Builder copy(CreateDataSafePrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            dataSafePrivateEndpoint(o.getDataSafePrivateEndpoint());

            return this;
        }

        public CreateDataSafePrivateEndpointResponse build() {
            return new CreateDataSafePrivateEndpointResponse(
                    __httpStatusCode__,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    dataSafePrivateEndpoint);
        }
    }
}
