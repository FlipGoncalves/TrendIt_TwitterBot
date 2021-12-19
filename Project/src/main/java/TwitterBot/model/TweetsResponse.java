package TwitterBot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TweetsResponse {
  @Expose
  @SerializedName( "data" )
  List<Tweets> tweetsList;
  
  
}