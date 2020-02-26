import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class NumberGame extends JFrame implements ActionListener {
  JButton zero;
  JButton first;
  JButton two;
  JButton three;
  JButton four;
  JButton five;
  JButton six;
  JButton seven;
  JButton eight;
  JButton nine;

  Boolean empty;

  JTextArea FirstOne;

  public NumberGame () {
    setLayout(null);

    FirstOne = new JTextArea();
    FirstOne.setBounds(150, 400, 50, 50);
    add(FirstOne);
    FirstOne.setBackground(Color.YELLOW);

    zero = new JButton("0");
    zero.setBounds(10, 100, 60, 60);
    add(zero);
    zero.addActionListener(this);

    first = new JButton("1");
    first.setBounds(70, 100, 60, 60);
    add(first);
    first.addActionListener(this);

    two = new JButton("2");
    two.setBounds(120, 100, 60, 60);
    add(two);
    two.addActionListener(this);

    three = new JButton("3");
    three.setBounds(190, 100, 60, 60);
    add(three);
    three.addActionListener(this);

    four = new JButton("4");
    four.setBounds(250, 100, 60, 60);
    add(four);
    four.addActionListener(this);

    five = new JButton("5");
    five.setBounds(320, 100, 60, 60);
    add(five);
    five.addActionListener(this);

    six = new JButton("6");
    six.setBounds(400, 100, 60, 60);
    add(six);
    six.addActionListener(this);

    seven = new JButton("7");
    seven.setBounds(470, 100, 60, 60);
    add(seven);
    seven.addActionListener(this);

    eight = new JButton("8");
    eight.setBounds(540, 100, 60, 60);
    add(eight);
    eight.addActionListener(this);

    nine = new JButton("9");
    nine.setBounds(600, 100, 60, 60);
    add(nine);
    nine.addActionListener(this);

    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        }
    } );

  }

  public void Check() {
    empty = false;
    if(FirstOne.getText().trim().isEmpty()) {
      empty = true;
    }
  }

  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();

    if (src == zero) {
      Check();
      if (empty == true) {
      FirstOne.append("0");
      }
    }

    if (src == first) {
      Check();
      if (empty == true) {
      FirstOne.append("1");
      }
    }

    if (src == two) {
      Check();
      if (empty == true) {
      FirstOne.append("2");
      }
    }

    if (src == three) {
      Check();
      if (empty == true) {
      FirstOne.append("3");
      }
    }

    if (src == four) {
      Check();
      if (empty == true) {
      FirstOne.append("4");
      }
    }

    if (src == five) {
      Check();
      if (empty == true) {
      FirstOne.append("5");
      }
    }

    if (src == six) {
      Check();
      if (empty == true) {
      FirstOne.append("6");
      }
    }

    if (src == seven) {
      Check();
      if (empty == true) {
      FirstOne.append("8");
      }
    }

    if (src == eight) {
      Check();
      if (empty == true) {
      FirstOne.append("8");
      }
    }

    if (src == nine) {
      Check();
      if (empty == true) {
      FirstOne.append("9");
      }
    }
  }

  public static void main(String[] args) {
    NumberGame myWindow = new NumberGame(); //creates a new frame that does the class Restaurant
    myWindow.setSize(800,700);
    myWindow.setVisible(true);
    myWindow.setTitle("Number Game");
  }

}
