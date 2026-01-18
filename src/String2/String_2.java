package String2;

public class String_2 {
    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == 'y' || current == 'z') {
                if (i == str.length() - 1) {
                    count++;
                }
                else if (!Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
    public String withoutString(String base, String remove) {
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); ) {
            if (i <= base.length() - remove.length() &&
                    baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == 'i' && str.charAt(i + 1) == 's')countIs ++;
            if (c == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't')countNot ++;
        }
        return countIs == countNot;
    }
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!leftG && !rightG) {
                    return false;
                }
            }
        }
        return true;
    }
    public int countTriple(String str) {
        if (str.length() < 3)return 0;
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))count ++;
        }
        return count;
    }
    public int sumDigits(String str) {
        int sum = 0;
        for(char c: str.toCharArray()){
            if (Character.isDigit(c)){
                int n = Integer.parseInt(String.valueOf(c));
                sum += n;
            }
        }
        return sum;
    }
    public String sameEnds(String string) {
        String result = "";
        for (int i = string.length()/2; i > 0; i--) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))){
                result =  string.substring(0, i);
            }
        }
        return result;
    }
    public String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.charAt(i) == string.charAt(string.length()- 1 - i)){
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }








}
