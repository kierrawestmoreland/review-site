package review;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;


public class ReviewControllerTest {
	@InjectMocks
	private ReviewController underTest;
	@Mock
	private ReviewRepository repository;
	@Mock
	private Review review; 
	@Mock
	private Model model;
	@Before 
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void shouldAddReviewInTheModel(){
		long id = 42;
		when(repository.findById(id)).thenReturn(review);
	}
}
