package ro.mpp.domain;

public class User extends Entity<Integer>{
    private String email;
    private String name;
    private UserRole role;
    private boolean isBanned;

    public User(Integer id, String email, String name, UserRole role) {
        super(id);
        this.email = email;
        this.name = name;
        this.role = role;
        this.isBanned = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
