import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
      addGuiComponents();

  }
  private void addGuiComponents(){

      //search field
      JTextField searchTextField = new JTextField();
      //set the location and size of our component

      searchTextField.setBounds(15,15,351,45);
     searchTextField.setFont(new Font("Dialog",Font.PLAIN,24));
     add(searchTextField);

     //search button
      JButton searchButton=new JButton(loadImage("src/assets/search.png"));

      //change the cursor to a hand cursor when over this button
      searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      searchButton.setBounds(375,13,47,45);
      add(searchButton);

      //weather Image
      JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
      weatherConditionImage.setBounds(0,125,450,217);
      add(weatherConditionImage);

      //temp text
      JLabel temperatureText = new JLabel("10 C");
      temperatureText.setBounds(0,350,450,54);
      temperatureText.setFont(new Font("Dialog",Font.BOLD,48));

      //centre that text
      temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
      add(temperatureText);

      //weather condition description
      JLabel weatherConditionDesc = new JLabel("Cloudy");
      weatherConditionDesc.setBounds(0,405,450,36);
      weatherConditionDesc.setFont(new Font("Dialog",Font.PLAIN,32));
      weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
      add(weatherConditionDesc);

      //humidity image
      JLabel humidityImage = new JLabel(loadImage("src/assets/humidity.png"));
      humidityImage.setBounds(15,500,74,66);
      add(humidityImage);

      //humidity text
      JLabel humidityText =new JLabel("<html><b>Humidity</b> 100%</html>");
      humidityText.setBounds(90,500,85,55);
      humidityText.setFont(new Font("Dialog",Font.PLAIN,16));
      add(humidityText);

      //windspeed image
      JLabel windspeedImage=new JLabel(loadImage("src/assets/windspeed.png"));
      windspeedImage.setBounds(220,500,74,66);
      add(windspeedImage);

      //windspeed text

      JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15km/h<?html>");
      windspeedText.setBounds(310,500,85,55);
      windspeedText.setFont(new Font("Dialog",Font.PLAIN,16));
      add(windspeedText);


  }

  //used to create images in our gui components
  private ImageIcon loadImage(String resourcepath){
      try{
          //read image from the path given
          BufferedImage image = ImageIO.read(new File(resourcepath));

          //returns image icon so as that our component can render it
          return new ImageIcon(image);
      }
   catch (IOException e)
   {
       e.printStackTrace();
   }
      System.out.println("Could not find resource");
      return (null);
  }
}
