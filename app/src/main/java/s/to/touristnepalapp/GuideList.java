package s.to.touristnepalapp;

public class GuideList {
    private String name;
    private String language;
    private String mobile;
    private String email;
    private int image;
    // image is int as we create a static RecyclerView

    public GuideList(String name, String language, String mobile, String email, int image) {
        this.name = name;
        this.language = language;

        this.mobile = mobile;

        this.email = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }


    public String getLanguage() {
        return language;
    }
    public String getMobile() {
        return mobile;
    }
    public String getEmail() {
        return email;
    }
    public int getImage() {
        return image;
    }

}
