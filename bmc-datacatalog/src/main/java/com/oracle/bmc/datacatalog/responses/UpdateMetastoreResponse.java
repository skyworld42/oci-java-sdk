/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.responses;

import com.oracle.bmc.datacatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateMetastoreResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Metastore instance.
     */
    private com.oracle.bmc.datacatalog.model.Metastore metastore;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "opcRequestId", "metastore"})
    private UpdateMetastoreResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.datacatalog.model.Metastore metastore) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.metastore = metastore;
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
        public Builder copy(UpdateMetastoreResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            metastore(o.getMetastore());

            return this;
        }

        public UpdateMetastoreResponse build() {
            return new UpdateMetastoreResponse(__httpStatusCode__, etag, opcRequestId, metastore);
        }
    }
}
