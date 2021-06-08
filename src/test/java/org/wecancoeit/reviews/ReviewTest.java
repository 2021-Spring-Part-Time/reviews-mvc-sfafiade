package org.wecancoeit.reviews;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReviewTest {
    private Review underTest;

    @Before("")
    public void setup() {
        long ID = 1111;
        String TITLE = "title";
        String IMAGEURL = "imageURL";
        String CATEGORY = "category";
        String CONTENT = "content";
        String DESCRIPTION = "description";
        underTest = new Review(ID, TITLE, IMAGEURL, CATEGORY, CONTENT, DESCRIPTION);
    }

    @Test
    public void shouldConstructIdTitleImageURLCategoryContentDescription() {
        Assertions.assertNotNull(underTest);
    }

    @Test
    public void shouldReturnId() {
        long check = underTest.getId();
        Assertions.assertEquals(1111L, check);
    }

    @Test
    public void shouldReturnTitle() {
        String check = underTest.getTitle();
        Assertions.assertEquals("title", check);
    }

    @Test
    public void shouldReturnImageURL() {
        String check = underTest.getImageURL();
        Assertions.assertEquals("imageURL", check);
    }

    @Test
    public void shouldReturnCategory() {
        String check = underTest.getCategory();
        Assertions.assertEquals("category", check);
    }

    @Test
    public void shouldReturnContent() {
        String check = underTest.getContent();
        Assertions.assertEquals("content", check);
    }

    @Test
    public void shouldReturnDescription() {
        String check = underTest.getDescription();
        Assertions.assertEquals("description", check);
    }



}
