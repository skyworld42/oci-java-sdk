/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyLimitRuleCase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SteeringPolicyLimitRuleCase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
        private String caseCondition;

        public Builder caseCondition(String caseCondition) {
            this.caseCondition = caseCondition;
            this.__explicitlySet__.add("caseCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyLimitRuleCase build() {
            SteeringPolicyLimitRuleCase __instance__ =
                    new SteeringPolicyLimitRuleCase(caseCondition, count);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyLimitRuleCase o) {
            Builder copiedBuilder = caseCondition(o.getCaseCondition()).count(o.getCount());

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
     * An expression that uses conditions at the time of a DNS query to indicate
     * whether a case matches. Conditions may include the geographical location, IP
     * subnet, or ASN the DNS query originated. **Example:** If you have an
     * office that uses the subnet {@code 192.0.2.0/24} you could use a {@code caseCondition}
     * expression {@code query.client.subnet in ('192.0.2.0/24')} to define a case that
     * matches queries from that office.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
    String caseCondition;

    /**
     * The number of answers allowed to remain after the limit rule has been processed, keeping only the
     * first of the remaining answers in the list. Example: If the {@code count} property is set to {@code 2} and
     * four answers remain before the limit rule is processed, only the first two answers in the list will
     * remain after the limit rule has been processed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    Integer count;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
