public class UserService {
    public void validateUser(String name, String pass){
        if(name == null || name.isEmpty()){
            throw new InvalidUserException("Username not null", "Invalid_error");
        }
        if(pass == null || pass.length() < 6 ){
            throw new InvalidUserException("Password >=6","Invalid_error" );
        }
        if(pass.contains(" ")){
            throw new InvalidUserException("Password not space","Invalid_error" );
        }
        System.out.println("Đăng nhập thành công.");

    }

}
