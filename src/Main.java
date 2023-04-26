public class Main {
    public static void main(String[] args) {
        String login= "login";
        String password = "password";
        String confirmPassword = "password";
        try {
            Validate.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("Поймали ошибку");
            exception.printStackTrace();
        } finally {
            System.out.println("Работает блок finally");
        }


    }
}