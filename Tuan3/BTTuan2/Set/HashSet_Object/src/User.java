import java.util.Objects;

public class User {
    private int id;
    private String name;
    public User(int id, String name){
        setId(id);
        setName(name);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("Id > 0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is not null");
        }
        this.name = name;
    }
    @Override
    public String toString(){
        return id + " - " + name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // cùng object
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    // override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
