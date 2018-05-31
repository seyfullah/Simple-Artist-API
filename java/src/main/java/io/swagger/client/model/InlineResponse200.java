package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-31T13:21:36.746Z")
public class InlineResponse200 {
  @SerializedName("artist_name")
  private String artistName = null;

  @SerializedName("artist_genre")
  private String artistGenre = null;

  @SerializedName("albums_recorded")
  private Integer albumsRecorded = null;

  public InlineResponse200 artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

   /**
   * Get artistName
   * @return artistName
  **/
  @ApiModelProperty(value = "")
  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public InlineResponse200 artistGenre(String artistGenre) {
    this.artistGenre = artistGenre;
    return this;
  }

   /**
   * Get artistGenre
   * @return artistGenre
  **/
  @ApiModelProperty(value = "")
  public String getArtistGenre() {
    return artistGenre;
  }

  public void setArtistGenre(String artistGenre) {
    this.artistGenre = artistGenre;
  }

  public InlineResponse200 albumsRecorded(Integer albumsRecorded) {
    this.albumsRecorded = albumsRecorded;
    return this;
  }

   /**
   * Get albumsRecorded
   * @return albumsRecorded
  **/
  @ApiModelProperty(value = "")
  public Integer getAlbumsRecorded() {
    return albumsRecorded;
  }

  public void setAlbumsRecorded(Integer albumsRecorded) {
    this.albumsRecorded = albumsRecorded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.artistName, inlineResponse200.artistName) &&
        Objects.equals(this.artistGenre, inlineResponse200.artistGenre) &&
        Objects.equals(this.albumsRecorded, inlineResponse200.albumsRecorded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistName, artistGenre, albumsRecorded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artistGenre: ").append(toIndentedString(artistGenre)).append("\n");
    sb.append("    albumsRecorded: ").append(toIndentedString(albumsRecorded)).append("\n");
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

