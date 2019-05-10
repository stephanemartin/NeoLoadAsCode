/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.SLAKPIDefinition;
import io.swagger.client.model.SLAStatusDefinition;
import io.swagger.client.model.ThresholdDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * SLAGlobalIndicatorDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-09T16:44:40.746Z[GMT]")
public class SLAGlobalIndicatorDefinition {

  @SerializedName("kpi")
  private SLAKPIDefinition kpi = null;

  @SerializedName("status")
  private SLAStatusDefinition status = null;

  @SerializedName("value")
  private Float value = null;

  @SerializedName("warningThreshold")
  private ThresholdDefinition warningThreshold = null;

  @SerializedName("failedThreshold")
  private ThresholdDefinition failedThreshold = null;
  public SLAGlobalIndicatorDefinition kpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
    return this;
  }

  

  /**
  * Get kpi
  * @return kpi
  **/
  @Schema(description = "")
  public SLAKPIDefinition getKpi() {
    return kpi;
  }
  public void setKpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
  }
  public SLAGlobalIndicatorDefinition status(SLAStatusDefinition status) {
    this.status = status;
    return this;
  }

  

  /**
  * Get status
  * @return status
  **/
  @Schema(description = "")
  public SLAStatusDefinition getStatus() {
    return status;
  }
  public void setStatus(SLAStatusDefinition status) {
    this.status = status;
  }
  public SLAGlobalIndicatorDefinition value(Float value) {
    this.value = value;
    return this;
  }

  

  /**
  * Get value
  * @return value
  **/
  @Schema(description = "")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }
  public SLAGlobalIndicatorDefinition warningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  

  /**
  * Get warningThreshold
  * @return warningThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getWarningThreshold() {
    return warningThreshold;
  }
  public void setWarningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
  }
  public SLAGlobalIndicatorDefinition failedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
    return this;
  }

  

  /**
  * Get failedThreshold
  * @return failedThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getFailedThreshold() {
    return failedThreshold;
  }
  public void setFailedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAGlobalIndicatorDefinition slAGlobalIndicatorDefinition = (SLAGlobalIndicatorDefinition) o;
    return Objects.equals(this.kpi, slAGlobalIndicatorDefinition.kpi) &&
        Objects.equals(this.status, slAGlobalIndicatorDefinition.status) &&
        Objects.equals(this.value, slAGlobalIndicatorDefinition.value) &&
        Objects.equals(this.warningThreshold, slAGlobalIndicatorDefinition.warningThreshold) &&
        Objects.equals(this.failedThreshold, slAGlobalIndicatorDefinition.failedThreshold);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(kpi, status, value, warningThreshold, failedThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAGlobalIndicatorDefinition {\n");
    
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    failedThreshold: ").append(toIndentedString(failedThreshold)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
