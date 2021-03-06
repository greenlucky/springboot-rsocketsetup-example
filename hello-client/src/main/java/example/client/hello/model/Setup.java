package example.client.hello.model;

/**
 * Setup payload sent to the connection setup method.
 */
public class Setup {

    private String language;
    private String country;

    public Setup() {
        // Noop
    }

    public Setup(String language, String country) {
        this.language = language;
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
