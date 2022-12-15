package org.openjfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;

/* Filename: DisplayCards
 * Author: Austen Lowder
 * Date: 11/14/2021
 * Summary: This displays three random cards from the images package.
 */

public class DisplayCards extends Application {
	@Override
	
	public void start(Stage PrimaryStage) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <=52; i++) {
			list.add(i);
		}
		java.util.Collections.shuffle(list);
		
		HBox pane = new HBox(5);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().add(new ImageView("image/" + list.get(0) + ".png"));
		pane.getChildren().add(new ImageView("image/" + list.get(1) + ".png"));
		pane.getChildren().add(new ImageView("image/" + list.get(2) + ".png"));
		
		Scene scene = new Scene(pane);
		PrimaryStage.setTitle("Random Cards");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);
	}
	
}