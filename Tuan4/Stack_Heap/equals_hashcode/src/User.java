import java.util.Objects;
public class User {
    private String email;
    public User(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(email, user.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
    @Override
    public String toString(){
        return email;
    }

}
//nếu không override hashCode thì khi ta tạo 2 object khác nhau , mặc định hashCode khác
//khi hashCode giống nhau -> mới gọi equals
