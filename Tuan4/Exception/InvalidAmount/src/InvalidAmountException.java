public class InvalidAmountException extends RuntimeException{
    private String ErrorCode;
    public InvalidAmountException(String message, String error){
        super(message);
        this.ErrorCode = error;
    }
    public String getError(){
        return ErrorCode;
    }

}
