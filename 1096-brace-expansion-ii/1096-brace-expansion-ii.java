class Solution {
    int i = 0;

    public List<String> braceExpansionII(String expression) {
        return new ArrayList<>(parseExpr(expression));
    }

    Set<String> parseExpr(String s) {
        Set<String> result = new TreeSet<>();

        result.addAll(parseTerm(s));

        while (i < s.length() && s.charAt(i) == ',') {
            i++;
            result.addAll(parseTerm(s));
        }

        return result;
    }

    Set<String> parseTerm(String s) {
        Set<String> result = new TreeSet<>();
        result.add("");

        while (i < s.length() &&
                s.charAt(i) != '}' &&
                s.charAt(i) != ',') {

            Set<String> part;

            if (s.charAt(i) == '{') {
                i++;
                part = parseExpr(s);
                i++;
            } else {
                part = new TreeSet<>();
                part.add(String.valueOf(s.charAt(i)));
                i++;
            }

            result = multiply(result, part);
        }

        return result;
    }

    Set<String> multiply(Set<String> a, Set<String> b) {
        Set<String> result = new TreeSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}