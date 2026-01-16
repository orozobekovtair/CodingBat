package String1;

public class String_1 {

    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i) == 't'){
                countCat ++;
            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i) == 'g'){
                countDog ++;
            }
        }
        return countCat == countDog;
    }
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')count ++;
        }
        return count;
    }
    public boolean endOther(String a, String b) {
        return (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase()));
    }
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false;
    }
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue; // саму звёздочку не берём
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue; // слева звёздочка — символ выкидываем
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue; // справа звёздочка — символ выкидываем
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }



}
