public class ClassA {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("olololo");
        }
    }

    public void foo() {
        return;
    }

    public String str(String s) {
        return s;
    }

    public String astr() {
        return str(astr());
    }

    //todo 123456
}
