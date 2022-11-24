
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;


public class NewTextField extends JTextField{
    boolean preset=false;
    String input;
    
    public void setPreText(String str) {
        preset=true;
        input=str;
        
        setForeground(Color.lightGray);
        setText(str);
    }
    
    public NewTextField() {
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(preset) {
                    setForeground(Color.black);
                    if(getText().equals(input))
                        setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(getText().trim().isEmpty()) {
                    setForeground(Color.lightGray);
                    setText(input);
                }
            }
            
        });
    }
    
}
