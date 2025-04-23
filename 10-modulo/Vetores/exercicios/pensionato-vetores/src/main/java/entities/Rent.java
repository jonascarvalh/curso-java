package entities;

public class Rent {

    private String name;
    private String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    };

    public Rent() {};

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String setName(String name) { return this.name = name; }
    public String setEmail(String email) { return this.email = email; }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
