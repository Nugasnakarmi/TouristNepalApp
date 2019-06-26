package s.to.touristnepalapp;

public class GuideList {
    private String name;
    private int image;// image is int as we create a static RecyclerView

    public GuideList(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
