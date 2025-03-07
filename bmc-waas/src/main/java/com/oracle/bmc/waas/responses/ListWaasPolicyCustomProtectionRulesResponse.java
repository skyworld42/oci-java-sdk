/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.responses;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListWaasPolicyCustomProtectionRulesResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * For list pagination. When this header appears in the response, additional pages of results may remain. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary instances.
     */
    private java.util.List<com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary> items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcNextPage",
        "opcRequestId",
        "items"
    })
    private ListWaasPolicyCustomProtectionRulesResponse(
            int __httpStatusCode__,
            String etag,
            String opcNextPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary> items) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.items = items;
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
        public Builder copy(ListWaasPolicyCustomProtectionRulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListWaasPolicyCustomProtectionRulesResponse build() {
            return new ListWaasPolicyCustomProtectionRulesResponse(
                    __httpStatusCode__, etag, opcNextPage, opcRequestId, items);
        }
    }
}
