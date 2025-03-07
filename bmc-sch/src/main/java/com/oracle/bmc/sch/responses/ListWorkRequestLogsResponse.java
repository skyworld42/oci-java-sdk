/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.responses;

import com.oracle.bmc.sch.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListWorkRequestLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results remain. For important details about
     * how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination.  When this header appears in the response,
     * previous pages of results exist. For important details about
     * how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * The returned WorkRequestLogEntryCollection instance.
     */
    private com.oracle.bmc.sch.model.WorkRequestLogEntryCollection workRequestLogEntryCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "opcPrevPage",
        "workRequestLogEntryCollection"
    })
    private ListWorkRequestLogsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            String opcPrevPage,
            com.oracle.bmc.sch.model.WorkRequestLogEntryCollection workRequestLogEntryCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.opcPrevPage = opcPrevPage;
        this.workRequestLogEntryCollection = workRequestLogEntryCollection;
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
        public Builder copy(ListWorkRequestLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            opcPrevPage(o.getOpcPrevPage());
            workRequestLogEntryCollection(o.getWorkRequestLogEntryCollection());

            return this;
        }

        public ListWorkRequestLogsResponse build() {
            return new ListWorkRequestLogsResponse(
                    __httpStatusCode__,
                    opcNextPage,
                    opcRequestId,
                    opcPrevPage,
                    workRequestLogEntryCollection);
        }
    }
}
