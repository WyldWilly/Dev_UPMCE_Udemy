
package anonymousclass;


public class AnonymousClass
{

    public static void main(String[] args)
    {
        ActionAfterClick a = () -> {
            System.out.println("Im action from anonymous class");
        };
        
        ActionAfterClick2 a2 = (c, d) -> {
            System.out.println(c + d);
        };
        
        Button p = new Button();
        Button p2 = new Button();
        Button p3 = new Button();
        
        p.addAction(a);
        p2.addAction(a);
        p3.addAction(new ActionAfterClick() {
            @Override
            public void action() {
                System.out.println("Im action from anonymous class for button p3");
            }
        });
        
        p.addAction2(10, 15, a2);
    }
    
}

interface ActionAfterClick
{
    void action();
    
}

interface ActionAfterClick2
{
    void action2(int c, int d);
}

class Button
{
    void addAction(ActionAfterClick a)
    {
        a.action();
    }
    
    void addAction2(int x, int y, ActionAfterClick2 a2)
    {
        a2.action2(x, y);
    }
} 

/*
JButton
button.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e)
    {
        // do something
    }
}

*/
