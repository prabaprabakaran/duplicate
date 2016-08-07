public class duplicate {

    public static void main(String[] args) {

        String in = new String("abbc");
        String out = new String();

        for (int i = 0; i < in.length(); i++) {
            for (int j = 0; j < out.length(); j++) {
                if (in.charAt(i) != out.charAt(j)) {
                    out = out + in.charAt(i);
                }
            }
        }

        System.out.println(out);

    }
}
