/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A run object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Run.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Run {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
        private String archiveUri;

        public Builder archiveUri(String archiveUri) {
            this.archiveUri = archiveUri;
            this.__explicitlySet__.add("archiveUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("className")
        private String className;

        public Builder className(String className) {
            this.className = className;
            this.__explicitlySet__.add("className");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, String> configuration;

        public Builder configuration(java.util.Map<String, String> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
        private Long dataReadInBytes;

        public Builder dataReadInBytes(Long dataReadInBytes) {
            this.dataReadInBytes = dataReadInBytes;
            this.__explicitlySet__.add("dataReadInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
        private Long dataWrittenInBytes;

        public Builder dataWrittenInBytes(Long dataWrittenInBytes) {
            this.dataWrittenInBytes = dataWrittenInBytes;
            this.__explicitlySet__.add("dataWrittenInBytes");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("execute")
        private String execute;

        public Builder execute(String execute) {
            this.execute = execute;
            this.__explicitlySet__.add("execute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileUri")
        private String fileUri;

        public Builder fileUri(String fileUri) {
            this.fileUri = fileUri;
            this.__explicitlySet__.add("fileUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private ApplicationLanguage language;

        public Builder language(ApplicationLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private RunLifecycleState lifecycleState;

        public Builder lifecycleState(RunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
        private String logsBucketUri;

        public Builder logsBucketUri(String logsBucketUri) {
            this.logsBucketUri = logsBucketUri;
            this.__explicitlySet__.add("logsBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
        private Integer numExecutors;

        public Builder numExecutors(Integer numExecutors) {
            this.numExecutors = numExecutors;
            this.__explicitlySet__.add("numExecutors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            this.__explicitlySet__.add("opcRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
        private String ownerPrincipalId;

        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            this.__explicitlySet__.add("ownerPrincipalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
        private String ownerUserName;

        public Builder ownerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            this.__explicitlySet__.add("ownerUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ApplicationParameter> parameters;

        public Builder parameters(java.util.List<ApplicationParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsZones")
        private java.util.List<String> privateEndpointDnsZones;

        public Builder privateEndpointDnsZones(java.util.List<String> privateEndpointDnsZones) {
            this.privateEndpointDnsZones = privateEndpointDnsZones;
            this.__explicitlySet__.add("privateEndpointDnsZones");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMaxHostCount")
        private Integer privateEndpointMaxHostCount;

        public Builder privateEndpointMaxHostCount(Integer privateEndpointMaxHostCount) {
            this.privateEndpointMaxHostCount = privateEndpointMaxHostCount;
            this.__explicitlySet__.add("privateEndpointMaxHostCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointNsgIds")
        private java.util.List<String> privateEndpointNsgIds;

        public Builder privateEndpointNsgIds(java.util.List<String> privateEndpointNsgIds) {
            this.privateEndpointNsgIds = privateEndpointNsgIds;
            this.__explicitlySet__.add("privateEndpointNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSubnetId")
        private String privateEndpointSubnetId;

        public Builder privateEndpointSubnetId(String privateEndpointSubnetId) {
            this.privateEndpointSubnetId = privateEndpointSubnetId;
            this.__explicitlySet__.add("privateEndpointSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
        private Long runDurationInMilliseconds;

        public Builder runDurationInMilliseconds(Long runDurationInMilliseconds) {
            this.runDurationInMilliseconds = runDurationInMilliseconds;
            this.__explicitlySet__.add("runDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
        private Integer totalOCpu;

        public Builder totalOCpu(Integer totalOCpu) {
            this.totalOCpu = totalOCpu;
            this.__explicitlySet__.add("totalOCpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Run build() {
            Run __instance__ =
                    new Run(
                            archiveUri,
                            arguments,
                            applicationId,
                            className,
                            compartmentId,
                            configuration,
                            dataReadInBytes,
                            dataWrittenInBytes,
                            definedTags,
                            displayName,
                            driverShape,
                            execute,
                            executorShape,
                            fileUri,
                            freeformTags,
                            id,
                            language,
                            lifecycleDetails,
                            lifecycleState,
                            logsBucketUri,
                            numExecutors,
                            opcRequestId,
                            ownerPrincipalId,
                            ownerUserName,
                            parameters,
                            privateEndpointDnsZones,
                            privateEndpointMaxHostCount,
                            privateEndpointNsgIds,
                            privateEndpointId,
                            privateEndpointSubnetId,
                            runDurationInMilliseconds,
                            sparkVersion,
                            timeCreated,
                            timeUpdated,
                            totalOCpu,
                            warehouseBucketUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Run o) {
            Builder copiedBuilder =
                    archiveUri(o.getArchiveUri())
                            .arguments(o.getArguments())
                            .applicationId(o.getApplicationId())
                            .className(o.getClassName())
                            .compartmentId(o.getCompartmentId())
                            .configuration(o.getConfiguration())
                            .dataReadInBytes(o.getDataReadInBytes())
                            .dataWrittenInBytes(o.getDataWrittenInBytes())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .driverShape(o.getDriverShape())
                            .execute(o.getExecute())
                            .executorShape(o.getExecutorShape())
                            .fileUri(o.getFileUri())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .language(o.getLanguage())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .logsBucketUri(o.getLogsBucketUri())
                            .numExecutors(o.getNumExecutors())
                            .opcRequestId(o.getOpcRequestId())
                            .ownerPrincipalId(o.getOwnerPrincipalId())
                            .ownerUserName(o.getOwnerUserName())
                            .parameters(o.getParameters())
                            .privateEndpointDnsZones(o.getPrivateEndpointDnsZones())
                            .privateEndpointMaxHostCount(o.getPrivateEndpointMaxHostCount())
                            .privateEndpointNsgIds(o.getPrivateEndpointNsgIds())
                            .privateEndpointId(o.getPrivateEndpointId())
                            .privateEndpointSubnetId(o.getPrivateEndpointSubnetId())
                            .runDurationInMilliseconds(o.getRunDurationInMilliseconds())
                            .sparkVersion(o.getSparkVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .totalOCpu(o.getTotalOCpu())
                            .warehouseBucketUri(o.getWarehouseBucketUri());

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
     * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
    String archiveUri;

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * `Service Api Spec`, where `name` is the name of the parameter.
     * Example:  `[ \"--input\", \"${input_file}\", \"--name\", \"John Doe\" ]`
     * If \"input_file\" has a value of \"mydata.xml\", then the value above will be translated to
     * `--input mydata.xml --name \"John Doe\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    java.util.List<String> arguments;

    /**
     * The application ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    String applicationId;

    /**
     * The class for the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    String className;

    /**
     * The OCID of a compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { \"spark.app.name\" : \"My App Name\", \"spark.shuffle.io.maxRetries\" : \"4\" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    java.util.Map<String, String> configuration;

    /**
     * The data read by the run in bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
    Long dataReadInBytes;

    /**
     * The data written by the run in bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
    Long dataWrittenInBytes;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. This name is not necessarily unique.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    String driverShape;

    /**
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
     * Supported options include ``--class``, ``--file``, ``--jars``, ``--conf``, ``--py-files``, and main application file with arguments.
     * Example: ``--jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10``
     * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
     * Data Flow service will use derived information from execute input only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("execute")
    String execute;

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    String executorShape;

    /**
     * An Oracle Cloud Infrastructure URI of the file containing the application to execute.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileUri")
    String fileUri;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The ID of a run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The Spark language.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    ApplicationLanguage language;

    /**
     * The detailed messages about the lifecycle state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The current state of this run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    RunLifecycleState lifecycleState;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
    String logsBucketUri;

    /**
     * The number of executor VMs requested.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
    Integer numExecutors;

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    String opcRequestId;

    /**
     * The OCID of the user who created the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
    String ownerPrincipalId;

    /**
     * The username of the user who created the resource.  If the username of the owner does not exist,
     * `null` will be returned and the caller should refer to the ownerPrincipalId value instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
    String ownerUserName;

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * `Application.arguments`.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: \"iterations\", value: \"10\"}, { name: \"input_file\", value: \"mydata.xml\" }, { name: \"variable_x\", value: \"${x}\"} ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<ApplicationParameter> parameters;

    /**
     * An array of DNS zone names.
     * Example: `[ \"app.examplecorp.com\", \"app.examplecorp2.com\" ]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsZones")
    java.util.List<String> privateEndpointDnsZones;

    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used
     * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
     * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
     * to 512.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMaxHostCount")
    Integer privateEndpointMaxHostCount;

    /**
     * An array of network security group OCIDs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointNsgIds")
    java.util.List<String> privateEndpointNsgIds;

    /**
     * The OCID of a private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    String privateEndpointId;

    /**
     * The OCID of a subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSubnetId")
    String privateEndpointSubnetId;

    /**
     * The duration of the run in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
    Long runDurationInMilliseconds;

    /**
     * The Spark version utilized to run the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    String sparkVersion;

    /**
     * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: `2018-04-03T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: `2018-04-03T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The total number of oCPU requested by the run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
    Integer totalOCpu;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    String warehouseBucketUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
