package scratches;

class strString {
    public int strStr(String haystack, String needle) {

        int maxword = haystack.length();
        int minword = needle.length();
        int count = 0;

        for (int i = 0; i < maxword; i++) {
            for (int j = 0; j < minword; j++) {

                if ((needle.charAt(j)) == (haystack.charAt(i)))
                {
                    count++;
                }
            }

        }
        return count;
    }

    public  char charAt(int index) {
        return (char) index;
    }
}