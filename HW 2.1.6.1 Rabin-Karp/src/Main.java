public class Main {
    public static void main(String[] args) {
        String s = "Alibaba or Alibubab? I do not know!";
        String pattern = "b*b";
        int[] found = search(s, pattern);
        printFound(found);
    }

    public static int[] search(String source, String pattern) {
        int[] found = new int[source.length() - pattern.length() + 1];
        for (int i = 0; i < found.length; i++) {
            found[i] = -1;
        }
        if (source.length() < pattern.length()) {
            System.out.println("Subline not found");
            return found;
        }
        int pattern_hash = hashCode(pattern);
        int asterik_position = pattern.indexOf("*");
        pattern_hash -= hashCode(pattern.charAt(asterik_position));
        int window_hash = 0;

        for (int start = 0; start < (source.length() - pattern.length() + 1); start++) {
            if (start == 0) {
                window_hash = (hashCode(source.substring(0, pattern.length())));
                window_hash -= hashCode(source.charAt(asterik_position));
            } else {
                window_hash -= hashCode(source.charAt(start - 1));
                window_hash += hashCode(source.charAt(start + pattern.length() - 1));
                window_hash -= hashCode(source.charAt(start + asterik_position));
            }
            if (window_hash == pattern_hash) {
                for (int i = 0; i < pattern.length(); i++) {
                    if (pattern.charAt(i) != '*' && source.charAt(start + i) != pattern.charAt(i)) {
                        break;
                    }
                    found[start] = start;
                }
            }
            window_hash += hashCode(source.charAt(start + asterik_position));
        }
        return found;
    }

    public static int hashCode(String source) {
        int hash = 0;
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            hash += c;
        }
        return hash;
    }

    public static int hashCode(char source) {
        int hash = source;
        return hash;
    }

    public static void printFound(int[] found) {
        for (int i = 0; i < found.length; i++) {
            if (found[i] == -1) {
                continue;
            } else {
                System.out.print(found[i] + ", ");
            }
        }
    }
}
