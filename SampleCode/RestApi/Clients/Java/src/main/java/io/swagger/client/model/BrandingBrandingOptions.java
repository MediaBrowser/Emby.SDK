/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BrandingBrandingOptions
 */


public class BrandingBrandingOptions {
  @SerializedName("LoginDisclaimer")
  private String loginDisclaimer = null;

  @SerializedName("CustomCss")
  private String customCss = null;

  public BrandingBrandingOptions loginDisclaimer(String loginDisclaimer) {
    this.loginDisclaimer = loginDisclaimer;
    return this;
  }

   /**
   * The login disclaimer.
   * @return loginDisclaimer
  **/
  @Schema(description = "The login disclaimer.")
  public String getLoginDisclaimer() {
    return loginDisclaimer;
  }

  public void setLoginDisclaimer(String loginDisclaimer) {
    this.loginDisclaimer = loginDisclaimer;
  }

  public BrandingBrandingOptions customCss(String customCss) {
    this.customCss = customCss;
    return this;
  }

   /**
   * The custom CSS.
   * @return customCss
  **/
  @Schema(description = "The custom CSS.")
  public String getCustomCss() {
    return customCss;
  }

  public void setCustomCss(String customCss) {
    this.customCss = customCss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingBrandingOptions brandingBrandingOptions = (BrandingBrandingOptions) o;
    return Objects.equals(this.loginDisclaimer, brandingBrandingOptions.loginDisclaimer) &&
        Objects.equals(this.customCss, brandingBrandingOptions.customCss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginDisclaimer, customCss);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingBrandingOptions {\n");
    
    sb.append("    loginDisclaimer: ").append(toIndentedString(loginDisclaimer)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
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
