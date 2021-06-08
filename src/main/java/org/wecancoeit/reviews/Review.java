package org.wecancoeit.reviews;

public class Review {
    private long id;
    private String gameTitle;
    private String gameImageURL;
    private String gameCategory;
    private String gameContent;
    private String gameDescription;

    public Review(long id, String title, String imageURL, String category, String content, String description) {
        this.id = id;
        this.gameTitle = title;
        this.gameImageURL = imageURL;
        this.gameCategory = category;
        this.gameContent = content;
        this.gameDescription = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return gameTitle;
    }

    public String getImageURL() {
        return gameImageURL;
    }

    public String getCategory() {
        return gameCategory;
    }

    public String getContent() {
        return gameContent;
    }

    public String getDescription() {
        return gameDescription;
    }
}

