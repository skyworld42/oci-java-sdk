/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.requests;

import com.oracle.bmc.artifacts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListGenericArtifactsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListGenericArtifactsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListGenericArtifactsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * A filter to return the artifacts only for the specified repository OCID.
     *
     */
    private String repositoryId;

    /**
     * A filter to return the resources for the specified OCID.
     *
     */
    private String id;

    /**
     * A filter to return only resources that match the given display name exactly.
     *
     */
    private String displayName;

    /**
     * Filter results by a prefix for the {@code artifactPath} and and return artifacts that begin with the specified prefix in their path.
     *
     */
    private String artifactPath;

    /**
     * Filter results by a prefix for {@code version} and return artifacts that that begin with the specified prefix in their version.
     *
     */
    private String version;

    /**
     * Filter results by a specified SHA256 digest for the artifact.
     *
     */
    private String sha256;

    /**
     * A filter to return only resources that match the given lifecycle state name exactly.
     *
     */
    private String lifecycleState;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListGenericArtifactsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListGenericArtifactsRequest o) {
            compartmentId(o.getCompartmentId());
            repositoryId(o.getRepositoryId());
            id(o.getId());
            displayName(o.getDisplayName());
            artifactPath(o.getArtifactPath());
            version(o.getVersion());
            sha256(o.getSha256());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListGenericArtifactsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListGenericArtifactsRequest
         */
        public ListGenericArtifactsRequest build() {
            ListGenericArtifactsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
