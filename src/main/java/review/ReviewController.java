package review;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	private ReviewRepository repository = new ReviewRepository();

	@RequestMapping("/review")
	public String displayReview(Model model){
		
		long id = 42;
		Review review = repository.findById(id);
		model.addAttribute("selectedReview", review);
		return "review-view";
	}
}
