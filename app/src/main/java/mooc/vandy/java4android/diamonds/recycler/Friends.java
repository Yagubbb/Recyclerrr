package mooc.vandy.java4android.diamonds.recycler;

public class Friends {

    private String place;
    private String imageUrl;
    private String fullName;
    private int progress;
    private String  score;
    private String  level;

    public Friends(String place, String imageUrl, String fullName, int progress, String score, String level) {
        this.place = place;
        this.imageUrl = imageUrl;
        this.fullName = fullName;
        this.progress = progress;
        this.score = score;
        this.level = level;
    }

    public String getPlace() {
        return place;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public int getProgress() {
        return progress;
    }

    public String getScore() {
        return score;
    }

    public String getLevel() {
        return level;
    }
}
