/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a cluster kubeconfig.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateClusterKubeconfigContentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateClusterKubeconfigContentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
        private String tokenVersion;

        public Builder tokenVersion(String tokenVersion) {
            this.tokenVersion = tokenVersion;
            this.__explicitlySet__.add("tokenVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expiration")
        private Integer expiration;

        public Builder expiration(Integer expiration) {
            this.expiration = expiration;
            this.__explicitlySet__.add("expiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private Endpoint endpoint;

        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateClusterKubeconfigContentDetails build() {
            CreateClusterKubeconfigContentDetails __instance__ =
                    new CreateClusterKubeconfigContentDetails(tokenVersion, expiration, endpoint);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterKubeconfigContentDetails o) {
            Builder copiedBuilder =
                    tokenVersion(o.getTokenVersion())
                            .expiration(o.getExpiration())
                            .endpoint(o.getEndpoint());

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

    /**
     * The version of the kubeconfig token. Supported value 2.0.0
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenVersion")
    String tokenVersion;

    /**
     * Deprecated. This field is no longer used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expiration")
    Integer expiration;
    /**
     * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig can only target one at a time.
     **/
    public enum Endpoint {
        LegacyKubernetes("LEGACY_KUBERNETES"),
        PublicEndpoint("PUBLIC_ENDPOINT"),
        PrivateEndpoint("PRIVATE_ENDPOINT"),
        ;

        private final String value;
        private static java.util.Map<String, Endpoint> map;

        static {
            map = new java.util.HashMap<>();
            for (Endpoint v : Endpoint.values()) {
                map.put(v.getValue(), v);
            }
        }

        Endpoint(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Endpoint create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Endpoint: " + key);
        }
    };
    /**
     * The endpoint to target. A cluster may have multiple endpoints exposed but the kubeconfig can only target one at a time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    Endpoint endpoint;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
