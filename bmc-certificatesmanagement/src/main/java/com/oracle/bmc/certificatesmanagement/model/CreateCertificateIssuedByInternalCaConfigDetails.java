/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the configuration for creating an internally managed certificate which is issued by a private certificate authority (CA).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCertificateIssuedByInternalCaConfigDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateCertificateIssuedByInternalCaConfigDetails
        extends CreateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
        private CertificateProfileType certificateProfileType;

        public Builder certificateProfileType(CertificateProfileType certificateProfileType) {
            this.certificateProfileType = certificateProfileType;
            this.__explicitlySet__.add("certificateProfileType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
            this.__explicitlySet__.add("issuerCertificateAuthorityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
        private java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

        public Builder subjectAlternativeNames(
                java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            this.__explicitlySet__.add("subjectAlternativeNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
        private KeyAlgorithm keyAlgorithm;

        public Builder keyAlgorithm(KeyAlgorithm keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            this.__explicitlySet__.add("keyAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private SignatureAlgorithm signatureAlgorithm;

        public Builder signatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCertificateIssuedByInternalCaConfigDetails build() {
            CreateCertificateIssuedByInternalCaConfigDetails __instance__ =
                    new CreateCertificateIssuedByInternalCaConfigDetails(
                            versionName,
                            certificateProfileType,
                            issuerCertificateAuthorityId,
                            validity,
                            subject,
                            subjectAlternativeNames,
                            keyAlgorithm,
                            signatureAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateIssuedByInternalCaConfigDetails o) {
            Builder copiedBuilder =
                    versionName(o.getVersionName())
                            .certificateProfileType(o.getCertificateProfileType())
                            .issuerCertificateAuthorityId(o.getIssuerCertificateAuthorityId())
                            .validity(o.getValidity())
                            .subject(o.getSubject())
                            .subjectAlternativeNames(o.getSubjectAlternativeNames())
                            .keyAlgorithm(o.getKeyAlgorithm())
                            .signatureAlgorithm(o.getSignatureAlgorithm());

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

    @Deprecated
    public CreateCertificateIssuedByInternalCaConfigDetails(
            String versionName,
            CertificateProfileType certificateProfileType,
            String issuerCertificateAuthorityId,
            Validity validity,
            CertificateSubject subject,
            java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames,
            KeyAlgorithm keyAlgorithm,
            SignatureAlgorithm signatureAlgorithm) {
        super(versionName);
        this.certificateProfileType = certificateProfileType;
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.validity = validity;
        this.subject = subject;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.keyAlgorithm = keyAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * The name of the profile used to create the certificate, which depends on the type of certificate you need.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
    CertificateProfileType certificateProfileType;

    /**
     * The OCID of the private CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    String issuerCertificateAuthorityId;

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    Validity validity;

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    CertificateSubject subject;

    /**
     * A list of subject alternative names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
    java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

    /**
     * The algorithm to use to create key pairs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
    KeyAlgorithm keyAlgorithm;

    /**
     * The algorithm to use to sign the public key certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    SignatureAlgorithm signatureAlgorithm;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
