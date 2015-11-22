package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application {
    Stage lava;
    GridPane laud;
    int lauapikkuslaevades = 4;
    int lavaservpikslites = 100;
    int lauaservpikslites = lauapikkuslaevades* lavaservpikslites;


    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();

        //genlaud//
        paigutalaevad();
        reageeriklikile();
        //kaslaevonalles();//
        //gameower

    }



    private void reageeriklikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle)event.getTarget();
            String ruuduid = ruut.getId();
            if (ruuduid.equals("laev")){
                ruut.setFill(Color.RED);
                ruut.setId("Pihtas");
            }else if (ruuduid.equals("Meri")){
                System.out.println("Mööda");
            }
        });

    }
    private boolean laevadonalles(){
        for (Node ruut); laud.getChildren();{
            if(ruut.getId().equals("laev")){
                return true;
            }
        }return false;
    }

    private void paigutalaevad() {

    }

    private void seadistaLava() {
        GridPane grid = new GridPane();
        Scene mstseen = new Scene(laud);
        lava.setScene(mstseen);
        lava.show();
        lava.setOnCloseRequest(event -> {
            System.exit(0);
        });
    }
}

