package Egor.Project.MyAnimeList.Models;

public class animeModel {
    private String animeName;

    private byte rating;

    private int views;

    public animeModel(String animeName, byte rating, int views) {
        this.animeName = animeName;
        this.rating = rating;
        this.views = views;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
