public class User {
    private int id;
    private String username;
    private String password;
    public User(int id, String name, String pass){
        setId(id);
        setUserName(name);
        setPassword(pass);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("Id >0");
        }
        this.id = id;
    }
    public String getUserName(){
        return username;
    }
    public void setUserName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is not null");
        }
        this.username = name;
    }
    public String getPass(){
        return password;
    }
    public void setPassword(String pass){
        if(pass.length() < 6){
            throw new IllegalArgumentException("Password >=6");
        }
        this.password = pass;
    }
    @Override
    public String toString(){
        return id + " - " + username + " - " + password;
    }

}
