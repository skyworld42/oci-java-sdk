/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate revocation list (CRL).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateRevocationListDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CertificateRevocationListDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageConfig")
        private ObjectStorageBucketConfigDetails objectStorageConfig;

        public Builder objectStorageConfig(ObjectStorageBucketConfigDetails objectStorageConfig) {
            this.objectStorageConfig = objectStorageConfig;
            this.__explicitlySet__.add("objectStorageConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customFormattedUrls")
        private java.util.List<String> customFormattedUrls;

        public Builder customFormattedUrls(java.util.List<String> customFormattedUrls) {
            this.customFormattedUrls = customFormattedUrls;
            this.__explicitlySet__.add("customFormattedUrls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateRevocationListDetails build() {
            CertificateRevocationListDetails __instance__ =
                    new CertificateRevocationListDetails(objectStorageConfig, customFormattedUrls);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateRevocationListDetails o) {
            Builder copiedBuilder =
                    objectStorageConfig(o.getObjectStorageConfig())
                            .customFormattedUrls(o.getCustomFormattedUrls());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageConfig")
    ObjectStorageBucketConfigDetails objectStorageConfig;

    /**
     * Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customFormattedUrls")
    java.util.List<String> customFormattedUrls;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
