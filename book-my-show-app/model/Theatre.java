package model;

public class Theatre {

    private String name;
    private String city;

    public Theatre(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void getAvailableShows() {
        System.out.println("Showing available shows in " + name);
    }
}