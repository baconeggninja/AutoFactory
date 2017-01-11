package com.baconeggninja.autofactory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	public GridPane grid = new GridPane();
	public Scene scene;
	
	@Override
	public void start(Stage stage) {
		scene = new Scene(grid);
		stage.setScene(scene);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
