public class Question5 {
    public boolean checkString(String str) {
        int a = str.length();
        if (a == 1) {
            return true;
        }

        for (int i = 0; i < a - 1; i++) {
            char A = str.charAt(i);
            char B = str.charAt(i + 1);
            if (Character.isLetter(A)) {
                if (Character.isLetter(B)) {
                    return false;
                }
            } else if (Character.isDigit(A)) {
                if (Character.isDigit(B)) {
                    return false;
                }
            }
        }
        return true;
    }
}
