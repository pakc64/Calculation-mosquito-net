import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler extends JFrame {

    JButton s1, s2, s3;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t4;
    eHandler handler = new eHandler();

    public Handler(String s) {
        super(s);
        setLayout(new FlowLayout());
        s1 = new JButton("Очистить");
        s2 = new JButton("Расчет");
        s3 = new JButton("Информация");
        l1 = new JLabel("Ширина");
        l2 = new JLabel("Высота");
        l3 = new JLabel("Количество секций");
        l4 = new JLabel("Введите размеры окна: \n ");
        t1 = new JTextField(6);
        t2 = new JTextField(6);
        t4 = new JTextField(2);

        add(l4);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t4);
        add(s2);
        add(s1);
        add(s3);
        s2.addActionListener(handler);
        s1.addActionListener(handler);
        s3.addActionListener(handler);
    }

    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                if (e.getSource() == s2) {
                    int width = Integer.parseInt(t1.getText());
                    int height = Integer.parseInt(t2.getText());
                    int section = Integer.parseUnsignedInt(t4.getText());
                    Calculation c = new Calculation(width, height, section);
                    JOptionPane.showMessageDialog(null, "Москитная сетка: " + c.widthCalc() + " * " + c.heightCalc());
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите корректное число или заполните все поля");
            }
            if (e.getSource() == s3) {
                JOptionPane.showMessageDialog(null, "Разработчик: pakc  \n Серков В. Н. \n почта:  djpakc@mail.ru \n 29.03.2021");
            }

            if (e.getSource() == s1) {
                t1.setText(null);
                t2.setText(null);
                t4.setText(null);

            }
        }
    }
}


