package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

public class Naidis_KollaneVilkuja extends Application {

    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor();
        int a = 0;
        while (a < 5) {
            foor.vahetaPunast();
            foor.paus(2.0);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.paus(1.0);
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(2.0);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(1.0);
            foor.vahetaKollast();
            a = a + 1;

        }

    }


}