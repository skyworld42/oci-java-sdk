/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEntitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListEntitiesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire business name given. The match is not case sensitive.
     */
    private String businessName;

    /**
     * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
     * For Example : /folders?displayOrBusinessNameContains=Cu.*
     * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayOrBusinessNameContains;

    /**
     * The key of the object type.
     */
    private String typeKey;

    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayNameContains;

    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    /**
     * Unique external identifier of this resource in the external source system.
     */
    private String externalKey;

    /**
     * Unique pattern key.
     */
    private String patternKey;

    /**
     * Last modified timestamp of this object in the external system.
     */
    private java.util.Date timeExternal;

    /**
     * Time that the resource's status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeStatusUpdated;

    /**
     * Identifies if the object is a physical object (materialized) or virtual/logical object defined on other objects.
     *
     */
    private Boolean isLogical;

    /**
     * Identifies if an object is a sub object (partition) of a physical or materialized parent object.
     */
    private Boolean isPartition;

    /**
     * Key of the associated folder.
     */
    private String folderKey;

    /**
     * Full path of the resource for resources that support paths.
     */
    private String path;

    /**
     * Harvest status of the harvestable resource as updated by the harvest process.
     */
    private com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus;

    /**
     * Key of the last harvest process to update this resource.
     */
    private String lastJobKey;

    /**
     * Specifies the fields to return in an entity summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in an entity summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        DataAssetKey("dataAssetKey"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        UpdatedById("updatedById"),
        LifecycleState("lifecycleState"),
        FolderKey("folderKey"),
        FolderName("folderName"),
        ExternalKey("externalKey"),
        Path("path"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
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
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEntitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in an entity summary response.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in an entity summary response.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

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
        public Builder copy(ListEntitiesRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            displayName(o.getDisplayName());
            businessName(o.getBusinessName());
            displayOrBusinessNameContains(o.getDisplayOrBusinessNameContains());
            typeKey(o.getTypeKey());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            externalKey(o.getExternalKey());
            patternKey(o.getPatternKey());
            timeExternal(o.getTimeExternal());
            timeStatusUpdated(o.getTimeStatusUpdated());
            isLogical(o.getIsLogical());
            isPartition(o.getIsPartition());
            folderKey(o.getFolderKey());
            path(o.getPath());
            harvestStatus(o.getHarvestStatus());
            lastJobKey(o.getLastJobKey());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListEntitiesRequest
         */
        public ListEntitiesRequest build() {
            ListEntitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
