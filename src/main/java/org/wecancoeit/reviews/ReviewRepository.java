package org.wecancoeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class ReviewRepository {
    Map<Long, Review> reviews = new HashMap<>();

    public ReviewRepository() {
        Review game = new Review(1L, "Spider-man Miles Morales", "./images/Spidermanps5.jpg",
                " Action-adventure ",
                "Building on and expanding the Spider-Man saga, Marvel's Spider-Man: Miles Morales has players experiencing the rise of Miles Morales as he masters new powers to become his own Spider-Man.",
                "Licensed by Insomniac Games." + " Released on November 12, 2020");

        Review game2 = new Review(2L, "Marvel's Spider-Man", "./images/Spidermanps4.jpg",
                "Action-adventure ",
                "The game follows Peter Parker, a 23-year-old college graduate and research assistant who gained superhuman abilities after being bitten by a radioactive spider. Peter is in his eighth year of crime-fighting under his super heroic alter ego of Spider-Man, who has become highly experienced at this point, but struggles to balance his superhero and personal lives.",
                "Licensed by Insomniac Games." + " Released on September 7, 2018");

        Review game3 = new Review(3L, "Dragon Ball Z: Kakarot", "./images/Dbzkakarot.jpg",
                "Action, Adventure, Comedy, Romance, Fantasy",
                "The primary storyline of Dragon Ball Z: Kakarot follows the events of the Raditz Saga through to the end of the Kid Buu Saga of Dragon Ball Z.",
                " Licensed by BANDAI NAMCO, CyberConnect2." + " Released on January 16, 2020");

        Review game4 = new Review(4L, "Returnal", "./images/Returnalps5.jpg",
                "Action, Adventure, Ecchi, Fantasy, Seinen",
                "After crash-landing on this shape-shifting world, Selene must search through the barren landscape of an ancient civilization for her escape. Isolated and alone, she finds herself fighting tooth and nail for survival. Again and again, she’s defeated – forced to restart her journey every time she dies.",
                "Licensed by Housemarque," + "Released on April 30, 2021");

        reviews.put(game.getId(), game);
        reviews.put(game2.getId(), game2);
        reviews.put(game3.getId(), game3);
        reviews.put(game4.getId(), game4);
    }

    public ReviewRepository(Review... reviews) {
        populateReviewsMap(reviews);
    }

    private void populateReviewsMap(Review... reviews) {
        for (Review review : reviews) {
            this.reviews.put(review.getId(), review);
        }
    }

    public Review findOne(long reviewID) {
        return reviews.get(reviewID);
    }

    public Collection<Review> findAll() {
        return reviews.values();
    }
}

