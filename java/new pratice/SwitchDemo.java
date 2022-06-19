public class SwitchDemo {
    public static void main(String[] args) {
        int ch = 43;
        switch (ch) {
            case 23:
                System.out.println("case  23 is printed");
            case 33:
                System.out.println("case 33 is printed");
            case 43:
                System.out.println("case 43 is printed");
                break;
            default:
                System.out.println("not printed");
        }
    }

}