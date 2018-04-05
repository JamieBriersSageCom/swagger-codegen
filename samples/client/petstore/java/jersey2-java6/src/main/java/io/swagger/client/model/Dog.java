/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import org.apache.commons.lang3.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Animal;

/**
 * Dog
 */

public class Dog extends Animal {

  
  @JsonProperty("className")
  private String className = null;
  
  
  @JsonProperty("color")
  private String color = "red";
  
  
  @JsonProperty("breed")
  private String breed = null;
  
  public Dog className(String className) {
    this.className = className;
    return this;
  }

  
  /**
  * Get className
  * @return className
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }
  
  public Dog color(String color) {
    this.color = color;
    return this;
  }

  
  /**
  * Get color
  * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  
  public Dog breed(String breed) {
    this.breed = breed;
    return this;
  }

  
  /**
  * Get breed
  * @return breed
  **/
  @ApiModelProperty(value = "")
  public String getBreed() {
    return breed;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }
  
  
  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Dog dog = (Dog) o;
    return ObjectUtils.equals(this.className, dog.className) &&
    ObjectUtils.equals(this.color, dog.color) &&
    ObjectUtils.equals(this.breed, dog.breed) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(className, color, breed, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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



