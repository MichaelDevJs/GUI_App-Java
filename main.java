package GUIPRACTICE;

public class main {

    public static void main(String[] args) {
        writeFiles frame = new writeFiles();
        setup(frame);
        frame.setVisible(true);

    }

    public static void setup(writeFiles frame) {
        String title = "Documents";
        frame.setSize(600, 800);
        frame.setTitle(title);

    }

}
