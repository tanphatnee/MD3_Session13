package bt.bt2_1;


import java.util.Scanner;

public class Config {
    private static final String ERROR_ALERT = "===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....";
    private static final String EMPTY_ALERT = "===>> Trường nhập vào không thể để trống! Vui lòng thử lại....";

    public Config() {
    }

    public static String getString() {
        while (true) {
            String result = getInput();
            if (!result.equals("")) {
                return result;
            }

            System.err.println("===>> Trường nhập vào không thể để trống! Vui lòng thử lại....");
        }
    }

    public static char getChar() {
        return getString().charAt(0);
    }

    public static boolean getBoolean() {
        String result = getString();
        return result.equalsIgnoreCase("true");
    }

    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    public static short getShort() {
        while (true) {
            try {
                return Short.parseShort(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    public static long getLong() {
        while (true) {
            try {
                return Long.parseLong(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    public static float getFloat() {
        while (true) {
            try {
                return Float.parseFloat(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    public static double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException var1) {
                System.err.println("===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....");
            }
        }
    }

    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void pressAnyKey() {
        getInput();
    }
}


