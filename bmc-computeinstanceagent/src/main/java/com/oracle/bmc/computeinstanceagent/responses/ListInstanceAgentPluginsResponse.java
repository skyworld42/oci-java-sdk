/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.responses;

import com.oracle.bmc.computeinstanceagent.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListInstanceAgentPluginsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * A list of com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary instances.
     */
    private java.util.List<com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary>
            items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "items"
    })
    private ListInstanceAgentPluginsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            java.util.List<com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary>
                    items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
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
        public Builder copy(ListInstanceAgentPluginsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListInstanceAgentPluginsResponse build() {
            return new ListInstanceAgentPluginsResponse(
                    __httpStatusCode__, opcRequestId, opcNextPage, items);
        }
    }
}
