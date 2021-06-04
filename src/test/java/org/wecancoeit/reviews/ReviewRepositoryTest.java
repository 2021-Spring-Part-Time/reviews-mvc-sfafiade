package org.wecancoeit.reviews;


import net.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;

    private long firstReviewID = 101L;
    private Review firstReview = new Review(firstReviewID, "first title", "imageURL 1", "first category", "content 1",
            "descritpion of first review");

    private long secondReviewID = 201L;
    private Review secondReview = new Review(secondReviewID, "second title", "imageURL 2", "second category",
            "content 2", "descritpion of second review");

    @Test
    public void shouldFindFirstReview() {
        underTest = new ReviewRepository(firstReview);
        Review result = underTest.findOne(firstReviewID);
        assertThat(result, is(firstReview));
    }

    @Test
    public void shouldFindSecondReview() {
        underTest = new ReviewRepository(firstReview, secondReview);
        Review result = underTest.findOne(secondReviewID);
        assertThat(result, is(secondReview));
    }

    private void assertThat(Review result, ElementMatcher.Junction<Object> objectJunction) {
    }



}
