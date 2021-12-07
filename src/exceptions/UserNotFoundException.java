package exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        System.out.println("User Not Found!");
    }

    public UserNotFoundException(Long id){
        System.out.println("User with id (" + id + ") was not found!");
    }
}
