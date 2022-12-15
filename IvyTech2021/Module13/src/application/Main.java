package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.*;

/* Filename: Main
 * Author: Austen Lowder
 * Date: 11/28/2021
 * Summary: makes a big text file into smaller text files, and reinvents a gui
 */

public class Main extends Application {
	protected TextField tfFileName = new TextField();
	protected TextField tfnumberOfFiles = new TextField();

	@Override 
	public void start(Stage primaryStage) {
		// Created label
		Label lblText = new Label();
		lblText.setText(
			"If you split a file named temp.txt into 3 smaller files,\n" +
			"the three smaller files are temp.txt.1, temp.txt.2, and temp.txt.3.");

		// Text fields and grid plane
		GridPane paneForInfo = new GridPane();
		paneForInfo.setPadding(new Insets(5, 15, 5, 0));
		paneForInfo.setHgap(5);
		paneForInfo.add(new Label("Enter a file:"), 0, 0);
		paneForInfo.add(tfFileName, 1, 0);
		paneForInfo.add(new Label("Specify the number of smaller files:"), 0, 1);
		paneForInfo.add(tfnumberOfFiles, 1, 1);

		// start button
		Button btStart = new Button("Start");

		// border and node placement
		BorderPane pane = new BorderPane();
		pane.setTop(lblText);
		pane.setCenter(paneForInfo);
		pane.setBottom(btStart);
		pane.setAlignment(btStart, Pos.CENTER);

		// handle
		btStart.setOnAction(e -> start());

		// create a new scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_17_11"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	
	//launches the program
	public static void main(String[] args) {
		launch(args);
	}
	
	// holds an array for the file and helps "Start" it
	private void start() {
		
		int numberOfFiles = Integer.parseInt(tfnumberOfFiles.getText());

		
		RandomAccessFile[] splits = new RandomAccessFile[numberOfFiles];

		try (
			RandomAccessFile inout = 
				new RandomAccessFile(tfFileName.getText(), "r");
		) {
			for (int i = 0; i < splits.length; i++) {
				splits[i] = new RandomAccessFile(
					tfFileName.getText() + "." + (i + 1), "rw");
			}
			int size = Math.round(inout.length() / numberOfFiles);
			int count = 0; 
			byte[] b;

			for (int i = 0; i < numberOfFiles - 1; i++) {
				inout.seek(count * size);
				b = new byte[size];
				inout.read(b);
				splits[i].write(b);
				count++;
			}
			inout.seek(count * size);
			b = new byte[(int)inout.length() - (count * size)];
			inout.read(b);
			splits[numberOfFiles - 1].write(b);
		}
		catch (IOException ex) {}
}
}