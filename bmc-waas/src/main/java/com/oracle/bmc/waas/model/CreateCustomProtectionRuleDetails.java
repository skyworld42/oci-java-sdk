/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The required data to create a custom protection rule.
 * For more information about custom protection rules, see [Custom Protection Rules](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/customprotectionrules.htm).
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCustomProtectionRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateCustomProtectionRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private String template;

        public Builder template(String template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCustomProtectionRuleDetails build() {
            CreateCustomProtectionRuleDetails __instance__ =
                    new CreateCustomProtectionRuleDetails(
                            compartmentId,
                            displayName,
                            description,
                            template,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCustomProtectionRuleDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .template(o.getTemplate())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the custom protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name for the custom protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A description for the Custom Protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The template text of the custom protection rule. All custom protection rules are expressed in ModSecurity Rule Language.
     * <p>
     * Additionally, each rule must include two placeholder variables that are updated by the WAF service upon publication of the rule.
     * <p>
     * {@code id: {{id_1}}} - This field is populated with a unique rule ID generated by the WAF service which identifies a {@code SecRule}. More than one {@code SecRule} can be defined in the {@code template} field of a CreateCustomSecurityRule call. The value of the first {@code SecRule} must be {@code id: {{id_1}}} and the {@code id} field of each subsequent {@code SecRule} should increase by one, as shown in the example.
     * <p>
     * {@code ctl:ruleEngine={{mode}}} - The action to be taken when the criteria of the {@code SecRule} are met, either {@code OFF}, {@code DETECT} or {@code BLOCK}. This field is automatically populated with the corresponding value of the {@code action} field of the {@code CustomProtectionRuleSetting} schema when the {@code WafConfig} is updated.
     * <p>
     *Example:*
     *   {@code
     *   SecRule REQUEST_COOKIES "regex matching SQL injection - part 1/2" \\
     *           "phase:2,                                                 \\
     *           msg:'Detects chained SQL injection attempts 1/2.',        \\
     *           id: {{id_1}},                                             \\
     *           ctl:ruleEngine={{mode}},                                  \\
     *           deny"
     *   SecRule REQUEST_COOKIES "regex matching SQL injection - part 2/2" \\
     *           "phase:2,                                                 \\
     *           msg:'Detects chained SQL injection attempts 2/2.',        \\
     *           id: {{id_2}},                                             \\
     *           ctl:ruleEngine={{mode}},                                  \\
     *           deny"
     *   }{@code
     * <p>
     *
     * The example contains two }SecRules{@code  each having distinct regex expression to match the }Cookie header value during the second input analysis phase.
     * <p>
     * For more information about custom protection rules, see [Custom Protection Rules](https://docs.cloud.oracle.com/Content/WAF/tasks/customprotectionrules.htm).
     * <p>
     * For more information about ModSecurity syntax, see [Making Rules: The Basic Syntax](https://www.modsecurity.org/CRS/Documentation/making.html).
     * <p>
     * For more information about ModSecurity's open source WAF rules, see [Mod Security's OWASP Core Rule Set documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    String template;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
