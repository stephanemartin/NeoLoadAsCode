/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.api.v2.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * CustomMonitor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-02T07:51:59.064Z[GMT]")
public class CustomMonitor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private List<String> path = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("values")
  private CustomMonitorValues values = null;

  public CustomMonitor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of custom monitor.
   * @return name
  **/
  @Schema(description = "Name of custom monitor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomMonitor path(List<String> path) {
    this.path = path;
    return this;
  }

  public CustomMonitor addPathItem(String pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<String>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * Path of the custom monitor.
   * @return path
  **/
  @Schema(description = "Path of the custom monitor.")
  public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
  }

  public CustomMonitor unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit of the custom monitor.
   * @return unit
  **/
  @Schema(description = "Unit of the custom monitor.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public CustomMonitor values(CustomMonitorValues values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public CustomMonitorValues getValues() {
    return values;
  }

  public void setValues(CustomMonitorValues values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMonitor customMonitor = (CustomMonitor) o;
    return Objects.equals(this.name, customMonitor.name) &&
        Objects.equals(this.path, customMonitor.path) &&
        Objects.equals(this.unit, customMonitor.unit) &&
        Objects.equals(this.values, customMonitor.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, unit, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMonitor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
