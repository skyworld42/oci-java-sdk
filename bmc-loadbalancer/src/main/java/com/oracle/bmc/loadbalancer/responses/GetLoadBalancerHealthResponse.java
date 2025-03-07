/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetLoadBalancerHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned LoadBalancerHealth instance.
     */
    private com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "loadBalancerHealth"})
    private GetLoadBalancerHealthResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.loadBalancerHealth = loadBalancerHealth;
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
        public Builder copy(GetLoadBalancerHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            loadBalancerHealth(o.getLoadBalancerHealth());

            return this;
        }

        public GetLoadBalancerHealthResponse build() {
            return new GetLoadBalancerHealthResponse(
                    __httpStatusCode__, opcRequestId, loadBalancerHealth);
        }
    }
}
