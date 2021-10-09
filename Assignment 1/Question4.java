public class Question4 {
    public boolean canConstruct(String ransomNote, String magazine) {

        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index == -1) {
                return false;
            }

            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }
}
// Algorithm:
//Strings are an immutable type. This means that they can't be modified, and so don't have "insert" and "delete" operations.
// For this reason, we instead need to repeatedly replace the magazine with a new String, that doesn't have the character
// we wanted to remove.