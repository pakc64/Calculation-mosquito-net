import javax.swing.*;

public class First {
    public static void main(String[] args) {
        Handler mc = new Handler("Расчет москитной сетки");
        mc.setVisible(true);
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mc.setSize(300, 200);
        mc.setResizable(false);
        mc.setLocationRelativeTo(null);

    }
}
