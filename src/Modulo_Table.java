public class Modulo_Table {
    public static void main(String[] args) {
        horizontalModulo();
        verticalModulo();
    }

    public static void lineBreak() {
        for (int i = 0; i < 101; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static String spaceBreak() {
        return "||";
    }

    public static void horizontalModulo() {
        System.out.println('\n' + "Horizontal");
        lineBreak();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(spaceBreak() + " " + j + "%" + i + " = " + j % i + " ");
            }
            System.out.print(spaceBreak());
            System.out.println();
            lineBreak();
        }
    }

    public static void verticalModulo() {
        System.out.println('\n' + "Vertical");
        lineBreak();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(spaceBreak() + " " + i + "%" + j + " = " + i % j + " ");
            }
            System.out.print(spaceBreak());
            System.out.println();
            lineBreak();
        }
    }
}

