/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListModelsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Retrieves the next page of results. When this header appears in the response, additional pages of results remain. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Retrieves the previous page of results. When this header appears in the response, previous pages of results exist. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact
     * Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.datascience.model.ModelSummary instances.
     */
    private java.util.List<com.oracle.bmc.datascience.model.ModelSummary> items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcPrevPage",
        "opcRequestId",
        "items"
    })
    private ListModelsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcPrevPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.datascience.model.ModelSummary> items) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
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
        public Builder copy(ListModelsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListModelsResponse build() {
            return new ListModelsResponse(
                    __httpStatusCode__, opcNextPage, opcPrevPage, opcRequestId, items);
        }
    }
}
