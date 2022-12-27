import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener {

    frame f = new frame();
    Label l1 = new Label("Enter Number");
    Label l2 = new Label("Enter Number");
    Label l3 = new Label("Result");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b1 = new Button("Add");
    Button b2 = new Button("Sub");
    Button b3 = new Button("Mul");
    Button b4 = new Button("Div");

    calculator(){
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        l3.setBounds(50, 200, 100, 30);
        t1.setBounds(200, 100, 100, 30);
        t2.setBounds(200, 150, 100, 30);
        t3.setBounds(200, 200, 100, 30);
        b1.setBounds(50, 250, 50, 20);
        b2.setBounds(110, 250, 50, 20);
        b3.setBounds(170, 250, 50, 20);
        b4.setBounds(230, 250, 50, 20);
        f.add(l1);
        f.add(l2);

    }


}