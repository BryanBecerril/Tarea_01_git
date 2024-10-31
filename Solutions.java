public class Solutions {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        
        return countVowels(a) == countVowels(b);
    }
    
    private int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Solutions solution = new Solutions();
        
        String s1 = "book";
        System.out.println(solution.halvesAreAlike(s1)); // true

        String s2 = "textbook";
        System.out.println(solution.halvesAreAlike(s2)); // false
    }
}
