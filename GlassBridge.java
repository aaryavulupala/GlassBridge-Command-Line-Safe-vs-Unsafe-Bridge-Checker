public class GlassBridge {

    public static void main(String[] args) {
        if (args.length != 30) {
            System.out.println("Usage: java GlassBridge <20 booleans> <10 L/R chars>");
            return;
        }
        boolean[][] bridge = new boolean[2][10];
        for (int col = 0; col < 10; col++) {
            String s0 = args[2 * col].toLowerCase();
            String s1 = args[2 * col + 1].toLowerCase();

            if (!s0.equals("true") && !s0.equals("false") || !s1.equals("true") && !s1.equals("false")) {
                System.out.println("Usage: first 20 inputs must be 'true' or 'false'.");
                return;
            }

            bridge[0][col] = Boolean.parseBoolean(s0);
            bridge[1][col] = Boolean.parseBoolean(s1);
        }
        char[] path = new char[10];
        for (int i = 0; i < 10; i++) {
            String token = args[20 + i];
            if (token.length() == 0) {
                System.out.println("Usage: last 10 inputs must be 'L' or 'R'.");
                return;
            }
            char c = Character.toUpperCase(token.charAt(0));
            if (c != 'L' && c != 'R') {
                System.out.println("Usage: last 10 inputs must be 'L' or 'R'.");
                return;
            }
            path[i] = c;
        }
        boolean safe = true;
        for (int col = 0; col < 10; col++) {
            int row = (path[col] == 'L') ? 0 : 1;
            if (!bridge[row][col]) {
                safe = false;
                break;
            }
        }

        System.out.println(safe ? "Safe" : "Unsafe");
    }
}