package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class TextAreaOutput extends Application {
	
  private TextArea ta = new TextArea();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    ta.setWrapText(true);
    
    Runnable printA = new PrintChar('a', 100, 200);
    Runnable printB = new PrintChar('b', 100, 100);
    Runnable print100 = new PrintNum(100);

    Thread thread3 = new Thread(print100);
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);

    // Start threads
    thread1.start();
    thread2.start();
    thread3.start();
    
    // Create a scene and place the pane in the stage
    Scene scene = new Scene(ta, 250, 150);
    primaryStage.setTitle("Concurrent Output"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  //The thread class for printing a specified character in specified times
  class PrintChar implements Runnable {
    private char charToPrint;  //the character to print
    private int	times;  //the times to repeat

    //The thread class constructor
    public PrintChar(char c, int t, int i) {
      charToPrint = c;
      times = t;
    }

    //override the run() method to tell the system what the thread will do
    public void run() {
      for (int i=1; i < times; i++)
    	  synchronized (ta) {
        ta.appendText(charToPrint + ""); }
    }
  }

  //The thread class for printing number from 1 to n for a given n.
  class PrintNum implements Runnable {
    private int lastNum;
    public PrintNum(int i) {
      lastNum = i;
    }

    public void run() {
      for (int i=1; i <= lastNum; i++)
    	  synchronized (ta) {
        ta.appendText(" " + i); }
    }
  }
  
 
  public static void main(String[] args) {
    launch(args);
  }
}
