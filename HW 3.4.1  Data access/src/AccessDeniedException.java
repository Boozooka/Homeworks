public class AccessDeniedException extends Exception{
    AccessDeniedException(){
        super("You must be at least 18 years old to enter");
    }
}
