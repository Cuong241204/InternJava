public class InvalidUserException extends RuntimeException{
    private String errorCode;
    public InvalidUserException(String message, String error){
        super(message);
        this.errorCode = error;
    }
    public String getError(){
        return errorCode;
    }
}
