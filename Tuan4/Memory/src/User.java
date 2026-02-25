import java.util.Objects;
public class User {
    private String email;
    public User(String mail){
        this.email = mail;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }
    @Override
    public int hashCode(){
        return Objects.hash(email);
    }
    @Override
    public String toString(){
        return email;
    }

}
