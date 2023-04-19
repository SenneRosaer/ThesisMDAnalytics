public class OperatorHeavy {
    public void f1() {
        Integer i1 = 5;
        Integer i2 = i1 * 5 / 7 + i1;
        String s1 = "part 1" + "part 2" + "part 3" + "part 4";
        if ((s1 == "123") && (i1 /i2 < 10 || i2 < 2)) {
            System.out.println("In loop");
        }
        Integer i3 = i2 * 5 / 7 + i1;
        Integer i4 = i3 * 5 / 7 + i1;
        Integer i5 = i4 * 5 / 7 + i1;
        Integer i6 = i5 * 5 / 7 + i1;
        Integer i7 = i6 * 5 / 7 + i1;
        Integer i8 = i7 * 5 / 7 + i1;
        Integer i9 = i8 * 5 / 7 + i1;

    }

    private boolean f2(char ch) {
        return (ch <= '\u001F') || (ch >= '\u200C' && ch <= '\u200F') ||
                (ch >= '\u2028' && ch <= '\u202F') || (ch >= '\u2060' && ch <= '\u206F') ||
                (ch >= '\uFFF0') || (ch >= '\uD800' && ch <= '\uDFFF');
    }

}
