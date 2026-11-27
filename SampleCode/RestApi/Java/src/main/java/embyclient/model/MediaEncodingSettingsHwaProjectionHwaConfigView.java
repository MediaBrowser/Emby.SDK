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
import embyclient.model.MediaEncodingHwaEnumsHwaConfigMode;
import embyclient.model.MediaEncodingSettingsHwaProjectionBasicModeOption;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesUiNodeRoot;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * MediaEncodingSettingsHwaProjectionHwaConfigView
 */


public class MediaEncodingSettingsHwaProjectionHwaConfigView {
  @SerializedName("IsInitialized")
  private Boolean isInitialized = null;

  @SerializedName("ConfigMode")
  private MediaEncodingHwaEnumsHwaConfigMode configMode = null;

  @SerializedName("Root")
  private MediaEncodingSettingsHwaProjectionNodesUiNodeRoot root = null;

  @SerializedName("FocusNodeId")
  private String focusNodeId = null;

  @SerializedName("ConfigName")
  private String configName = null;

  @SerializedName("ConfigSavedOn")
  private OffsetDateTime configSavedOn = null;

  @SerializedName("ConfigSavedBy")
  private String configSavedBy = null;

  @SerializedName("ConfigRevision")
  private Integer configRevision = null;

  @SerializedName("HasUnsavedChanges")
  private Boolean hasUnsavedChanges = null;

  @SerializedName("BasicModeOptions")
  private List<MediaEncodingSettingsHwaProjectionBasicModeOption> basicModeOptions = null;

  @SerializedName("BasicSelectedNodeId")
  private String basicSelectedNodeId = null;

  @SerializedName("ModeLegend")
  private String modeLegend = null;

  @SerializedName("ChangeConfigWizardUrl")
  private String changeConfigWizardUrl = null;

  @SerializedName("HelpUrl")
  private String helpUrl = null;

  @SerializedName("ShowDeviceSelector")
  private Boolean showDeviceSelector = null;

  @SerializedName("ShowSavedConfigInfo")
  private Boolean showSavedConfigInfo = null;

  public MediaEncodingSettingsHwaProjectionHwaConfigView isInitialized(Boolean isInitialized) {
    this.isInitialized = isInitialized;
    return this;
  }

   /**
   * Get isInitialized
   * @return isInitialized
  **/
  @Schema(description = "")
  public Boolean isIsInitialized() {
    return isInitialized;
  }

  public void setIsInitialized(Boolean isInitialized) {
    this.isInitialized = isInitialized;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView configMode(MediaEncodingHwaEnumsHwaConfigMode configMode) {
    this.configMode = configMode;
    return this;
  }

   /**
   * Get configMode
   * @return configMode
  **/
  @Schema(description = "")
  public MediaEncodingHwaEnumsHwaConfigMode getConfigMode() {
    return configMode;
  }

  public void setConfigMode(MediaEncodingHwaEnumsHwaConfigMode configMode) {
    this.configMode = configMode;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView root(MediaEncodingSettingsHwaProjectionNodesUiNodeRoot root) {
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot getRoot() {
    return root;
  }

  public void setRoot(MediaEncodingSettingsHwaProjectionNodesUiNodeRoot root) {
    this.root = root;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView focusNodeId(String focusNodeId) {
    this.focusNodeId = focusNodeId;
    return this;
  }

   /**
   * Get focusNodeId
   * @return focusNodeId
  **/
  @Schema(description = "")
  public String getFocusNodeId() {
    return focusNodeId;
  }

  public void setFocusNodeId(String focusNodeId) {
    this.focusNodeId = focusNodeId;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView configName(String configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @Schema(description = "")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView configSavedOn(OffsetDateTime configSavedOn) {
    this.configSavedOn = configSavedOn;
    return this;
  }

   /**
   * Get configSavedOn
   * @return configSavedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getConfigSavedOn() {
    return configSavedOn;
  }

  public void setConfigSavedOn(OffsetDateTime configSavedOn) {
    this.configSavedOn = configSavedOn;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView configSavedBy(String configSavedBy) {
    this.configSavedBy = configSavedBy;
    return this;
  }

   /**
   * Get configSavedBy
   * @return configSavedBy
  **/
  @Schema(description = "")
  public String getConfigSavedBy() {
    return configSavedBy;
  }

  public void setConfigSavedBy(String configSavedBy) {
    this.configSavedBy = configSavedBy;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView configRevision(Integer configRevision) {
    this.configRevision = configRevision;
    return this;
  }

   /**
   * Get configRevision
   * @return configRevision
  **/
  @Schema(description = "")
  public Integer getConfigRevision() {
    return configRevision;
  }

  public void setConfigRevision(Integer configRevision) {
    this.configRevision = configRevision;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView hasUnsavedChanges(Boolean hasUnsavedChanges) {
    this.hasUnsavedChanges = hasUnsavedChanges;
    return this;
  }

   /**
   * Get hasUnsavedChanges
   * @return hasUnsavedChanges
  **/
  @Schema(description = "")
  public Boolean isHasUnsavedChanges() {
    return hasUnsavedChanges;
  }

  public void setHasUnsavedChanges(Boolean hasUnsavedChanges) {
    this.hasUnsavedChanges = hasUnsavedChanges;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView basicModeOptions(List<MediaEncodingSettingsHwaProjectionBasicModeOption> basicModeOptions) {
    this.basicModeOptions = basicModeOptions;
    return this;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView addBasicModeOptionsItem(MediaEncodingSettingsHwaProjectionBasicModeOption basicModeOptionsItem) {
    if (this.basicModeOptions == null) {
      this.basicModeOptions = new ArrayList<>();
    }
    this.basicModeOptions.add(basicModeOptionsItem);
    return this;
  }

   /**
   * Get basicModeOptions
   * @return basicModeOptions
  **/
  @Schema(description = "")
  public List<MediaEncodingSettingsHwaProjectionBasicModeOption> getBasicModeOptions() {
    return basicModeOptions;
  }

  public void setBasicModeOptions(List<MediaEncodingSettingsHwaProjectionBasicModeOption> basicModeOptions) {
    this.basicModeOptions = basicModeOptions;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView basicSelectedNodeId(String basicSelectedNodeId) {
    this.basicSelectedNodeId = basicSelectedNodeId;
    return this;
  }

   /**
   * Get basicSelectedNodeId
   * @return basicSelectedNodeId
  **/
  @Schema(description = "")
  public String getBasicSelectedNodeId() {
    return basicSelectedNodeId;
  }

  public void setBasicSelectedNodeId(String basicSelectedNodeId) {
    this.basicSelectedNodeId = basicSelectedNodeId;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView modeLegend(String modeLegend) {
    this.modeLegend = modeLegend;
    return this;
  }

   /**
   * Get modeLegend
   * @return modeLegend
  **/
  @Schema(description = "")
  public String getModeLegend() {
    return modeLegend;
  }

  public void setModeLegend(String modeLegend) {
    this.modeLegend = modeLegend;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView changeConfigWizardUrl(String changeConfigWizardUrl) {
    this.changeConfigWizardUrl = changeConfigWizardUrl;
    return this;
  }

   /**
   * Get changeConfigWizardUrl
   * @return changeConfigWizardUrl
  **/
  @Schema(description = "")
  public String getChangeConfigWizardUrl() {
    return changeConfigWizardUrl;
  }

  public void setChangeConfigWizardUrl(String changeConfigWizardUrl) {
    this.changeConfigWizardUrl = changeConfigWizardUrl;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView helpUrl(String helpUrl) {
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

  public MediaEncodingSettingsHwaProjectionHwaConfigView showDeviceSelector(Boolean showDeviceSelector) {
    this.showDeviceSelector = showDeviceSelector;
    return this;
  }

   /**
   * Get showDeviceSelector
   * @return showDeviceSelector
  **/
  @Schema(description = "")
  public Boolean isShowDeviceSelector() {
    return showDeviceSelector;
  }

  public void setShowDeviceSelector(Boolean showDeviceSelector) {
    this.showDeviceSelector = showDeviceSelector;
  }

  public MediaEncodingSettingsHwaProjectionHwaConfigView showSavedConfigInfo(Boolean showSavedConfigInfo) {
    this.showSavedConfigInfo = showSavedConfigInfo;
    return this;
  }

   /**
   * Get showSavedConfigInfo
   * @return showSavedConfigInfo
  **/
  @Schema(description = "")
  public Boolean isShowSavedConfigInfo() {
    return showSavedConfigInfo;
  }

  public void setShowSavedConfigInfo(Boolean showSavedConfigInfo) {
    this.showSavedConfigInfo = showSavedConfigInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsHwaProjectionHwaConfigView mediaEncodingSettingsHwaProjectionHwaConfigView = (MediaEncodingSettingsHwaProjectionHwaConfigView) o;
    return Objects.equals(this.isInitialized, mediaEncodingSettingsHwaProjectionHwaConfigView.isInitialized) &&
        Objects.equals(this.configMode, mediaEncodingSettingsHwaProjectionHwaConfigView.configMode) &&
        Objects.equals(this.root, mediaEncodingSettingsHwaProjectionHwaConfigView.root) &&
        Objects.equals(this.focusNodeId, mediaEncodingSettingsHwaProjectionHwaConfigView.focusNodeId) &&
        Objects.equals(this.configName, mediaEncodingSettingsHwaProjectionHwaConfigView.configName) &&
        Objects.equals(this.configSavedOn, mediaEncodingSettingsHwaProjectionHwaConfigView.configSavedOn) &&
        Objects.equals(this.configSavedBy, mediaEncodingSettingsHwaProjectionHwaConfigView.configSavedBy) &&
        Objects.equals(this.configRevision, mediaEncodingSettingsHwaProjectionHwaConfigView.configRevision) &&
        Objects.equals(this.hasUnsavedChanges, mediaEncodingSettingsHwaProjectionHwaConfigView.hasUnsavedChanges) &&
        Objects.equals(this.basicModeOptions, mediaEncodingSettingsHwaProjectionHwaConfigView.basicModeOptions) &&
        Objects.equals(this.basicSelectedNodeId, mediaEncodingSettingsHwaProjectionHwaConfigView.basicSelectedNodeId) &&
        Objects.equals(this.modeLegend, mediaEncodingSettingsHwaProjectionHwaConfigView.modeLegend) &&
        Objects.equals(this.changeConfigWizardUrl, mediaEncodingSettingsHwaProjectionHwaConfigView.changeConfigWizardUrl) &&
        Objects.equals(this.helpUrl, mediaEncodingSettingsHwaProjectionHwaConfigView.helpUrl) &&
        Objects.equals(this.showDeviceSelector, mediaEncodingSettingsHwaProjectionHwaConfigView.showDeviceSelector) &&
        Objects.equals(this.showSavedConfigInfo, mediaEncodingSettingsHwaProjectionHwaConfigView.showSavedConfigInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInitialized, configMode, root, focusNodeId, configName, configSavedOn, configSavedBy, configRevision, hasUnsavedChanges, basicModeOptions, basicSelectedNodeId, modeLegend, changeConfigWizardUrl, helpUrl, showDeviceSelector, showSavedConfigInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionHwaConfigView {\n");
    
    sb.append("    isInitialized: ").append(toIndentedString(isInitialized)).append("\n");
    sb.append("    configMode: ").append(toIndentedString(configMode)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    focusNodeId: ").append(toIndentedString(focusNodeId)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configSavedOn: ").append(toIndentedString(configSavedOn)).append("\n");
    sb.append("    configSavedBy: ").append(toIndentedString(configSavedBy)).append("\n");
    sb.append("    configRevision: ").append(toIndentedString(configRevision)).append("\n");
    sb.append("    hasUnsavedChanges: ").append(toIndentedString(hasUnsavedChanges)).append("\n");
    sb.append("    basicModeOptions: ").append(toIndentedString(basicModeOptions)).append("\n");
    sb.append("    basicSelectedNodeId: ").append(toIndentedString(basicSelectedNodeId)).append("\n");
    sb.append("    modeLegend: ").append(toIndentedString(modeLegend)).append("\n");
    sb.append("    changeConfigWizardUrl: ").append(toIndentedString(changeConfigWizardUrl)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
    sb.append("    showDeviceSelector: ").append(toIndentedString(showDeviceSelector)).append("\n");
    sb.append("    showSavedConfigInfo: ").append(toIndentedString(showSavedConfigInfo)).append("\n");
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
