package pojos;

public class User {
 /*
 “user”: {
        “id”: 110016,
        “login”: “leopoldo.reinger”,
        “firstName”: “Jasmine”,
        “lastName”: “Stehr”,
        “email”: “marni.zboncak@yahoo.com”,
        “activated”: true,
        “langKey”: “en”,
        “imageUrl”: null,
        “resetDate”: null
    }
  */

    private Integer id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean activated;
    private String langKey;
    private Object imageUrl;
    private Object resetDate;

    public User(Integer id, String login, String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, Object resetDate) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getResetDate() {
        return resetDate;
    }

    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", imageUrl=" + imageUrl +
                ", resetDate=" + resetDate +
                '}';
    }
}