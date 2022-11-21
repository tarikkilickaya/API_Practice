package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthoritiesPojo {

    private String authorities;

    public AuthoritiesPojo(String authorities) {
        this.authorities = authorities;
    }

    public AuthoritiesPojo() {
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "AuthoritiesPojo{" +
                "authorities='" + authorities + '\'' +
                '}';
    }
}