import java.awt.*; //abstract window toolkit

class LoginFrame extends Frame {   //isA
        Button b1 = new Button("Sign In"); //hasA
        Button b2 = new Button("Forgot password?"); //hasA
        Button b3 = new Button("Not a member yet? Sign Up");   //hasA
        Label l1 = new Label("Enter username");
        Label l2 = new Label("Enter password");

        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);

         LoginFrame() {
                FlowLayout flowLayout = new FlowLayout();
                //setting the layout as free flow of components
                setLayout(flowLayout);
               add(l1); add(t1); add(l2); add(t2);
                add(b1)  ;
                add(b2);
                add(b3);
         }
}
class RegistrationFrame extends Frame {   //isA
    Button b1 = new Button("Sign Up"); //hasA

    Label l1 = new Label("Enter username");
    Label l2 = new Label("Enter password");
    Label l3 = new Label("Enter age");
    Label l4 = new Label("Enter address");

    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(20);
    TextField t4 = new TextField(20);

    RegistrationFrame() {
        FlowLayout flowLayout = new FlowLayout();
        //setting the layout as free flow of components
        setLayout(flowLayout);
        add(l1); add(t1); add(l2); add(t2);
        add(l3); add(t3);add(l4); add(t4);
        add(b1)  ;
    }
}

public class FrameTest {
    public static void main(String[] args) {

        LoginFrame myFrame = new LoginFrame();
        myFrame.setTitle("Login");
        myFrame.setSize(300,400);
        myFrame.setLocation(500,300);
        myFrame.setVisible(true);

        RegistrationFrame myRegistrationFrame = new RegistrationFrame();
        myRegistrationFrame.setTitle("Registration");
        myRegistrationFrame.setSize(300,400);
        myRegistrationFrame.setLocation(500,800);
        myRegistrationFrame.setVisible(true);


        /*
        Frame myFrame = new Frame();//why the whole world is learning Object
        // oriented programming
        myFrame.setTitle("My Chrome");
        myFrame.setSize(200,100);
        myFrame.setLocation(800,300);
        myFrame.setVisible(true);

        Frame myFrame2 = new Frame();
        myFrame2.setTitle("My Safari");
        myFrame2.setSize(200,100);
        myFrame2.setLocation(300,300);
        myFrame2.setVisible(true);

        for(int i=1;i<=10;i++) {
            Frame myFrame3 = new Frame();
            myFrame3.setTitle("My Chrome"+i);
            myFrame3.setSize(120*i, 110*i);
            myFrame3.setLocation(180*i, 130*i);
            myFrame3.setVisible(true);
        }
*/
    }
}
