package pojos;

public class Country {
/*
 "country": {
        "id": 3,
        "name": "USA",
        "states": null
    }
  */

    private Integer id;
    private String name;
    private String states;

    public Country(Integer id, String name, String states) {
        this.id = id;
        this.name = name;
        this.states = states;
    }

    public Country() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states='" + states + '\'' +
                '}';
    }
}