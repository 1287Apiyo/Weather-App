import javax.swing.*;
import java.util.jar.JarFile;

public class WeatherAppGui extends JFrame {
  public WeatherAppGui(){
     //set up the GUI and add title
     super("Weather App");
     setDefaultCloseOperation(EXIT_ON_CLOSE);

     //set size of the gui
      setSize(450,650);setLocationRelativeTo(null);
      setLayout(null);

      //prevent any resize of ou gui
      setResizable(false);

  }
}
