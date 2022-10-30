package p1;

public class MyString implements IString {

    private boolean checkPalindrome(String str) {

        char toCharArray[] = str.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {

            if (toCharArray[i] != toCharArray[toCharArray.length - i - 1]) {
                return false;

            }
        }
        return true;
    }

    @Override
    public int f1(String p0) {
        int cout = 0;
        String[] words = p0.split("\\s");
        for (int i = 0; i < words.length; i++) {
            char arrayChar[] = words[i].toCharArray();
            for (int j = 0; j < arrayChar.length; j++) {
                int a = ((int) arrayChar[j]);
                if (a % 2 != 0 && a > 47 && a < 58) {
                    cout++;
                    break;
                }
            }
        }
        return cout;
    }

    @Override
    public String f2(String p0) {
        String[] words = p0.split("\\s");
        String result = "";
        int[] temp = new int[words.length];
        // String temp[]= new String[words.length];
        int cout = 0;
        for (int i = 0; i < words.length; i++) {
            if (checkPalindrome(words[i])) {
                temp[cout] = i;
                cout++;
            }
            for (int j = cout; j < words.length; j++) {
                temp[j] = -1;
            }

        }
        for (int j = 0; j <= cout - 1; j++) {
            for (int k = j + 1; k <= cout; k++) {
                if (temp[j] != -1 && temp[k] != -1) {
                    if (words[temp[j]].equals(words[temp[k]])) {
                        temp[k] = -1;
                    }
                }
            }
        }
        for (int j = 0; j <= cout; j++) {
            if (temp[j] != -1) {
                words[temp[j]] = "XX";
            }
        }
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            result += " ";
        }
        return result;
    }

}
