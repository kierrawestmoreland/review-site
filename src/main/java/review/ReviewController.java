package review;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	private ReviewRepository repository = new ReviewRepository();

	@RequestMapping("/review")//tell the controller what to do with the url
	public String displayReview(@RequestParam("id") long id, Model model){
		
		Review review = repository.findById(id);
		model.addAttribute("selectedReview", review);
		return "review-view";
	}
	
	@RequestMapping("/all")
	public String displayAll(Model model){
		
		Collection<Review> reviews = repository.findAll();
		model.addAttribute("reviews", reviews);
		return "review-all";
		
		
	}
}
