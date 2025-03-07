/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListListingsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListListingsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListListingsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The name of the listing.
     */
    private java.util.List<String> name;

    /**
     * The unique identifier for the listing.
     */
    private String listingId;

    /**
     * Limit results to just this publisher.
     */
    private String publisherId;

    /**
     * A filter to return only packages that match the given package type exactly.
     *
     */
    private String packageType;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
     *
     */
    private Integer limit;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMERELEASED} displays results in descending order by default.
     * You can change your preference by specifying a different sort order.
     *
     */
    private SortBy sortBy;

    /**
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMERELEASED} displays results in descending order by default.
     * You can change your preference by specifying a different sort order.
     *
     **/
    public enum SortBy {
        Timereleased("TIMERELEASED"),
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
     * The sort order to use, either {@code ASC} or {@code DESC}.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either {@code ASC} or {@code DESC}.
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
     * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
     * one or more matching categories.
     *
     */
    private java.util.List<String> category;

    /**
     * Name of the pricing type. If multiple pricing types are provided, then any listing with
     * one or more matching pricing models will be returned.
     *
     */
    private java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing;

    /**
     * Indicates whether to show only featured listings. If this is set to {@code false} or is omitted, then all listings will be returned.
     *
     */
    private Boolean isFeatured;

    /**
     * The type of the listing.
     */
    private java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes;

    /**
     * The operating system of the listing.
     */
    private java.util.List<String> operatingSystems;

    /**
     * The unique identifier for the compartment.
     */
    private String compartmentId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListListingsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> name = null;

        /**
         * The name of the listing.
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. The name of the listing.
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> category = null;

        /**
         * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
         * one or more matching categories.
         *
         * @return this builder instance
         */
        public Builder category(java.util.List<String> category) {
            this.category = category;
            return this;
        }

        /**
         * Singular setter. Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
         * one or more matching categories.
         *
         * @return this builder instance
         */
        public Builder category(String singularValue) {
            return this.category(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing = null;

        /**
         * Name of the pricing type. If multiple pricing types are provided, then any listing with
         * one or more matching pricing models will be returned.
         *
         * @return this builder instance
         */
        public Builder pricing(
                java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing) {
            this.pricing = pricing;
            return this;
        }

        /**
         * Singular setter. Name of the pricing type. If multiple pricing types are provided, then any listing with
         * one or more matching pricing models will be returned.
         *
         * @return this builder instance
         */
        public Builder pricing(PricingTypeEnum singularValue) {
            return this.pricing(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes = null;

        /**
         * The type of the listing.
         * @return this builder instance
         */
        public Builder listingTypes(
                java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes) {
            this.listingTypes = listingTypes;
            return this;
        }

        /**
         * Singular setter. The type of the listing.
         * @return this builder instance
         */
        public Builder listingTypes(ListingType singularValue) {
            return this.listingTypes(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> operatingSystems = null;

        /**
         * The operating system of the listing.
         * @return this builder instance
         */
        public Builder operatingSystems(java.util.List<String> operatingSystems) {
            this.operatingSystems = operatingSystems;
            return this;
        }

        /**
         * Singular setter. The operating system of the listing.
         * @return this builder instance
         */
        public Builder operatingSystems(String singularValue) {
            return this.operatingSystems(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListListingsRequest o) {
            name(o.getName());
            listingId(o.getListingId());
            publisherId(o.getPublisherId());
            packageType(o.getPackageType());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            category(o.getCategory());
            pricing(o.getPricing());
            isFeatured(o.getIsFeatured());
            listingTypes(o.getListingTypes());
            operatingSystems(o.getOperatingSystems());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListListingsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListListingsRequest
         */
        public ListListingsRequest build() {
            ListListingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
