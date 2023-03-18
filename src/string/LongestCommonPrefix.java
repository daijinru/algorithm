package string;

import java.util.Vector;

public class LongestCommonPrefix {
    private String[] in;

    public LongestCommonPrefix(String[] in) {
        this.in = in;
    }

    public String run() {
        return runDp();
    }

    public String runDp() {
        Vector<String> DP = new Vector<>();
        DP.add(0, this.in[0]);
        DP.add(1, this.in[1]);

        for (int i = 2; i < this.in.length; i++) {
            DP.add(i, compare(this.in[i - 1], this.in[i - 2]));
        }

        if (DP.size() > 0) {
            return DP.get(DP.size() - 1);
        } else {
            return "";
        }
    }

    public String compare(String pre, String next) {
        String min = pre.length() >= next.length() ? next : pre;
        String max = pre.length() < next.length() ? next : pre;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < min.length(); i++) {
            if (min.charAt(i) == max.charAt(i)) {
                out.append(min.charAt(i));
            }
        }
        return out.toString();
    }
}
