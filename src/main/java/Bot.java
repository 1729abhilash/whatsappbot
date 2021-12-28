import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Bot{

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;

        Robot robot = new Robot();
     //   Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String Text = "import java.awt.AWTException;\n" +
                "import java.awt.Robot;\n" +
                "import java.awt.Toolkit;\n" +
                "import java.awt.datatransfer.Clipboard;\n" +
                "import java.awt.datatransfer.StringSelection;\n" +
                "import java.awt.event.KeyEvent;\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class Bot{\n" +
                "\n" +
                "    public static void main(String[] args) throws AWTException, InterruptedException {\n" +
                "        int x = 1;\n" +
                "\n" +
                "        Robot robot = new Robot();\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "\n" +
                "        System.out.println(\"Enter your text:\");\n" +
                "        String Text = scanner.nextLine();\n" +
                "\n" +
                "        StringSelection stringSelection = new StringSelection(Text);\n" +
                "        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();\n" +
                "        clipboard.setContents(stringSelection, null);\n" +
                "\n" +
                "        System.out.println(\"The spamming will start in 2 seconds\");\n" +
                "        Thread.sleep(2000);\n" +
                "\n" +
                "        while(x <= 1000) {\n" +
                "\n" +
                "            Thread.sleep(1000);\n" +
                "\n" +
                "            robot.keyPress(KeyEvent.VK_CONTROL);\n" +
                "            robot.keyPress(KeyEvent.VK_V);\n" +
                "            robot.keyRelease(KeyEvent.VK_CONTROL);\n" +
                "            robot.keyRelease(KeyEvent.VK_V);\n" +
                "\n" +
                "            robot.keyPress(KeyEvent.VK_ENTER);\n" +
                "            robot.keyRelease(KeyEvent.VK_ENTER);\n" +
                "\n" +
                "            x++;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n";

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("The spamming will start in 2 seconds");
        Thread.sleep(2000);

        while(x <= 1000) {

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            x++;

        }

    }

}
