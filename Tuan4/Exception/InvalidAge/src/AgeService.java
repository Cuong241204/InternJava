public class AgeService {
    public void validateAge(int age){
        if(age <18){
            throw new InvalidAgeException("Age >=18", "Invalid_Age");
        }
    }
}
