package review;

import java.util.Date;

public class ReviewRepository {

	public Review findById(long id) {
		return new Review(id, "Review of Hitchhiker's Guide", "Kierra Westmoreland", "Lorem Ipsum and so on", new Date(2016, 11, 11));
	}
}
