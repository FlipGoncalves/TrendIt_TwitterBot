import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TweetController {
  @Autowired TwitterServiceimp twitterService;
  
  @GetMapping("Trends")
  public String getTrends() {
    String s = twitterService.getTrends( 1 ).toString();
    return s;
  }
}