package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {
    public void openWindow(String window) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(window));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    @FXML
    private MainController mainController;

    @FXML
    public void openApplication() { openWindow("AppScreen.fxml");}

    @FXML
    public void openPrawoOhma() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void openPodstawy() { openWindow("Podstawy.fxml");}

    @FXML
    public void openPrawoOhmaNauka() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void openPrawoKirchhoffa_1_Nauka() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void openPrawoKirchhoffa_2_Nauka() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void openPrawoKirchhoffa_1() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void openPrawoKirchhoffa_2() { openWindow("PrawoOhma.fxml");}

    @FXML
    public void exit() {
        Platform.exit();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
