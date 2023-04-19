public class OperatorHeavy {
    public void f1() {
        Integer i1 = 5;
        Integer i2 = i1 * 5 / 7 + i1;
        String s1 = "part 1" + "part 2" + "part 3" + "part 4";
        if ((s1 == "123") && (i1 /i2 < 10 || i2 < 2)) {
            System.out.println("In loop");
        }
    }

    private boolean f2(char ch) {
        return (ch <= '\u001F') || (ch >= '\u200C' && ch <= '\u200F') ||
                (ch >= '\u2028' && ch <= '\u202F') || (ch >= '\u2060' && ch <= '\u206F') ||
                (ch >= '\uFFF0') || (ch >= '\uD800' && ch <= '\uDFFF');
    }

}
