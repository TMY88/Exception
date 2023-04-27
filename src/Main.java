import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        String login = "Kazulka198833";
        String password = "Kaban19L78";
        String confirmPassword = "Kaban19L78";

        try {
            Checker.checkParametrs(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
        } catch (WrongPassworException wrongPassworException) {
            wrongPassworException.printStackTrace();
        } finally {
            System.out.println("Hello World");
        }

    }

}