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
import embyclient.model.BaseItemDto;
import embyclient.model.ScrollDirection;
import embyclient.model.TextSectionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ContentSection
 */


public class ContentSection {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Subtitle")
  private String subtitle = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("SectionType")
  private String sectionType = null;

  @SerializedName("CollectionType")
  private String collectionType = null;

  @SerializedName("ViewType")
  private String viewType = null;

  @SerializedName("Monitor")
  private List<String> monitor = null;

  @SerializedName("CardSizeOffset")
  private Integer cardSizeOffset = null;

  @SerializedName("ScrollDirection")
  private ScrollDirection scrollDirection = null;

  @SerializedName("ParentItem")
  private BaseItemDto parentItem = null;

  @SerializedName("TextInfo")
  private TextSectionInfo textInfo = null;

  @SerializedName("PremiumFeature")
  private String premiumFeature = null;

  @SerializedName("PremiumMessage")
  private String premiumMessage = null;

  @SerializedName("RefreshInterval")
  private Integer refreshInterval = null;

  public ContentSection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentSection subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @Schema(description = "")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public ContentSection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContentSection sectionType(String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

   /**
   * Get sectionType
   * @return sectionType
  **/
  @Schema(description = "")
  public String getSectionType() {
    return sectionType;
  }

  public void setSectionType(String sectionType) {
    this.sectionType = sectionType;
  }

  public ContentSection collectionType(String collectionType) {
    this.collectionType = collectionType;
    return this;
  }

   /**
   * Get collectionType
   * @return collectionType
  **/
  @Schema(description = "")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public ContentSection viewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @Schema(description = "")
  public String getViewType() {
    return viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  public ContentSection monitor(List<String> monitor) {
    this.monitor = monitor;
    return this;
  }

  public ContentSection addMonitorItem(String monitorItem) {
    if (this.monitor == null) {
      this.monitor = new ArrayList<>();
    }
    this.monitor.add(monitorItem);
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @Schema(description = "")
  public List<String> getMonitor() {
    return monitor;
  }

  public void setMonitor(List<String> monitor) {
    this.monitor = monitor;
  }

  public ContentSection cardSizeOffset(Integer cardSizeOffset) {
    this.cardSizeOffset = cardSizeOffset;
    return this;
  }

   /**
   * Get cardSizeOffset
   * @return cardSizeOffset
  **/
  @Schema(description = "")
  public Integer getCardSizeOffset() {
    return cardSizeOffset;
  }

  public void setCardSizeOffset(Integer cardSizeOffset) {
    this.cardSizeOffset = cardSizeOffset;
  }

  public ContentSection scrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
    return this;
  }

   /**
   * Get scrollDirection
   * @return scrollDirection
  **/
  @Schema(description = "")
  public ScrollDirection getScrollDirection() {
    return scrollDirection;
  }

  public void setScrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
  }

  public ContentSection parentItem(BaseItemDto parentItem) {
    this.parentItem = parentItem;
    return this;
  }

   /**
   * Get parentItem
   * @return parentItem
  **/
  @Schema(description = "")
  public BaseItemDto getParentItem() {
    return parentItem;
  }

  public void setParentItem(BaseItemDto parentItem) {
    this.parentItem = parentItem;
  }

  public ContentSection textInfo(TextSectionInfo textInfo) {
    this.textInfo = textInfo;
    return this;
  }

   /**
   * Get textInfo
   * @return textInfo
  **/
  @Schema(description = "")
  public TextSectionInfo getTextInfo() {
    return textInfo;
  }

  public void setTextInfo(TextSectionInfo textInfo) {
    this.textInfo = textInfo;
  }

  public ContentSection premiumFeature(String premiumFeature) {
    this.premiumFeature = premiumFeature;
    return this;
  }

   /**
   * Get premiumFeature
   * @return premiumFeature
  **/
  @Schema(description = "")
  public String getPremiumFeature() {
    return premiumFeature;
  }

  public void setPremiumFeature(String premiumFeature) {
    this.premiumFeature = premiumFeature;
  }

  public ContentSection premiumMessage(String premiumMessage) {
    this.premiumMessage = premiumMessage;
    return this;
  }

   /**
   * Get premiumMessage
   * @return premiumMessage
  **/
  @Schema(description = "")
  public String getPremiumMessage() {
    return premiumMessage;
  }

  public void setPremiumMessage(String premiumMessage) {
    this.premiumMessage = premiumMessage;
  }

  public ContentSection refreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

   /**
   * Get refreshInterval
   * @return refreshInterval
  **/
  @Schema(description = "")
  public Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentSection contentSection = (ContentSection) o;
    return Objects.equals(this.name, contentSection.name) &&
        Objects.equals(this.subtitle, contentSection.subtitle) &&
        Objects.equals(this.id, contentSection.id) &&
        Objects.equals(this.sectionType, contentSection.sectionType) &&
        Objects.equals(this.collectionType, contentSection.collectionType) &&
        Objects.equals(this.viewType, contentSection.viewType) &&
        Objects.equals(this.monitor, contentSection.monitor) &&
        Objects.equals(this.cardSizeOffset, contentSection.cardSizeOffset) &&
        Objects.equals(this.scrollDirection, contentSection.scrollDirection) &&
        Objects.equals(this.parentItem, contentSection.parentItem) &&
        Objects.equals(this.textInfo, contentSection.textInfo) &&
        Objects.equals(this.premiumFeature, contentSection.premiumFeature) &&
        Objects.equals(this.premiumMessage, contentSection.premiumMessage) &&
        Objects.equals(this.refreshInterval, contentSection.refreshInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subtitle, id, sectionType, collectionType, viewType, monitor, cardSizeOffset, scrollDirection, parentItem, textInfo, premiumFeature, premiumMessage, refreshInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSection {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionType: ").append(toIndentedString(sectionType)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    cardSizeOffset: ").append(toIndentedString(cardSizeOffset)).append("\n");
    sb.append("    scrollDirection: ").append(toIndentedString(scrollDirection)).append("\n");
    sb.append("    parentItem: ").append(toIndentedString(parentItem)).append("\n");
    sb.append("    textInfo: ").append(toIndentedString(textInfo)).append("\n");
    sb.append("    premiumFeature: ").append(toIndentedString(premiumFeature)).append("\n");
    sb.append("    premiumMessage: ").append(toIndentedString(premiumMessage)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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
