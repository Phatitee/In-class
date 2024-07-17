package ku.cs.models;

public class FavoriteSinger {
    private String name;
    private String lastName;
    private int birthyear;
    private int age;

    public FavoriteSinger(String name, String lastName, int birthyear) {
        this.name = name;
        this.lastName = lastName;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirthyear() {
        age = 2024 - birthyear;
        return String.valueOf(age);
    }

}
