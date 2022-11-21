package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBody {
    /*
    {
  "activated": true,
  "authorities": [
    "string"
  ],
  "email": "trkklckyaaaaa@gmail.com",
  "firstName": "tarik",
  "imageUrl": "https://i.ytimg.com/vi/wUN6Ffli33U/maxresdefault.jpg",
  "langKey": "tarik",
  "lastModifiedBy": "tarik",
  "lastName": "kilickaya",
  "login": "tarik10",
  "ssn": "123-12-3856"
}
     */


    private Boolean activated;
    private AuthoritiesPojo authorities;
    private String email;
    private String firstName;
    private String imageUrl;
    private String langKey;
    private String lastModifiedBy;
    private String lastName;
    private String login;
    private String ssn;


    public ResponseBody(Boolean activated, AuthoritiesPojo authorities, String email, String firstName, String imageUrl, String langKey, String lastModifiedBy, String lastName, String login, String ssn) {
        this.activated = activated;
        this.authorities = authorities;
        this.email = email;
        this.firstName = firstName;
        this.imageUrl = imageUrl;
        this.langKey = langKey;
        this.lastModifiedBy = lastModifiedBy;
        this.lastName = lastName;
        this.login = login;
        this.ssn = ssn;
    }

    public ResponseBody() {
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public AuthoritiesPojo getAuthorities() {
        return authorities;
    }

    public void setAuthorities(AuthoritiesPojo authorities) {
        this.authorities = authorities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "activated=" + activated +
                ", authorities=" + authorities +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", langKey='" + langKey + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
