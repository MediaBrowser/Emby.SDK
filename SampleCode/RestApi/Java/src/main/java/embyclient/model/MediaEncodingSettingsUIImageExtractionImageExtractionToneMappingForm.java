/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.GenericEditIEditObjectContainer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm
 */


public class MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm {
  @SerializedName("IsSeparateForm")
  private Boolean isSeparateForm = null;

  @SerializedName("ShowResetToDefaults")
  private Boolean showResetToDefaults = null;

  @SerializedName("Caption")
  private String caption = null;

  @SerializedName("HelpUrl")
  private String helpUrl = null;

  @SerializedName("Selection")
  private String selection = null;

  @SerializedName("FilterId")
  private String filterId = null;

  @SerializedName("Form")
  private GenericEditIEditObjectContainer form = null;

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm isSeparateForm(Boolean isSeparateForm) {
    this.isSeparateForm = isSeparateForm;
    return this;
  }

   /**
   * Get isSeparateForm
   * @return isSeparateForm
  **/
  @Schema(description = "")
  public Boolean isIsSeparateForm() {
    return isSeparateForm;
  }

  public void setIsSeparateForm(Boolean isSeparateForm) {
    this.isSeparateForm = isSeparateForm;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm showResetToDefaults(Boolean showResetToDefaults) {
    this.showResetToDefaults = showResetToDefaults;
    return this;
  }

   /**
   * Get showResetToDefaults
   * @return showResetToDefaults
  **/
  @Schema(description = "")
  public Boolean isShowResetToDefaults() {
    return showResetToDefaults;
  }

  public void setShowResetToDefaults(Boolean showResetToDefaults) {
    this.showResetToDefaults = showResetToDefaults;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @Schema(description = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

   /**
   * Get helpUrl
   * @return helpUrl
  **/
  @Schema(description = "")
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm selection(String selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @Schema(description = "")
  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm filterId(String filterId) {
    this.filterId = filterId;
    return this;
  }

   /**
   * Get filterId
   * @return filterId
  **/
  @Schema(description = "")
  public String getFilterId() {
    return filterId;
  }

  public void setFilterId(String filterId) {
    this.filterId = filterId;
  }

  public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm form(GenericEditIEditObjectContainer form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @Schema(description = "")
  public GenericEditIEditObjectContainer getForm() {
    return form;
  }

  public void setForm(GenericEditIEditObjectContainer form) {
    this.form = form;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm = (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) o;
    return Objects.equals(this.isSeparateForm, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.isSeparateForm) &&
        Objects.equals(this.showResetToDefaults, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.showResetToDefaults) &&
        Objects.equals(this.caption, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.caption) &&
        Objects.equals(this.helpUrl, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.helpUrl) &&
        Objects.equals(this.selection, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.selection) &&
        Objects.equals(this.filterId, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.filterId) &&
        Objects.equals(this.form, mediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm.form);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSeparateForm, showResetToDefaults, caption, helpUrl, selection, filterId, form);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm {\n");
    
    sb.append("    isSeparateForm: ").append(toIndentedString(isSeparateForm)).append("\n");
    sb.append("    showResetToDefaults: ").append(toIndentedString(showResetToDefaults)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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
