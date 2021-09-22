public class CorrectPerson {
    public static boolean isTeenager(int age) {
        if (age < 0) {
            throw new RuntimeException();
        }
        boolean result;
        if (age <= 19 && age >= 13) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
