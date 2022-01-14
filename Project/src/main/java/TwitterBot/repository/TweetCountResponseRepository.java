package TwitterBot.repository;

import java.util.List;
import TwitterBot.model.Tweet;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import TwitterBot.model.CountTweets.*;

public interface TweetCountResponseRepository extends MongoRepository<Tweet, Long> {

    TotalTweetCount findbyTotalTweetCount(Long TotalTweetCount);
    List<Tweet> findByTag(Long tag);
}