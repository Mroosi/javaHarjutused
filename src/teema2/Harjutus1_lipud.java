package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
      Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 600);
        primaryStage.setScene(stseen);

        Rectangle kast1 = new Rectangle(0,0,600,200);
        kast1.setFill(Color.BLUE);
        pane.getChildren().add(kast1);

        Rectangle kast2 = new Rectangle(0,200,600,200);
        kast2.setFill(Color.BLACK);
        pane.getChildren().add(kast2);

        Rectangle kast3 = new Rectangle(0,400,600,400);
        kast3.setFill(Color.WHITE);
        pane.getChildren().add(kast3);

        primaryStage.show();

    }
}
