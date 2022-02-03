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

    public void openWindowNauka(String window) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(window));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PodstawyController appController = loader.getController();
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
    public void openPodstawy() { openWindowNauka("Podstawy.fxml");}

    @FXML
    public void openPrawoOhmaNauka() { openWindowNauka("PrawoOhmaNauka.fxml");}

    @FXML
    public void openPrawoKirchhoffa_1_Nauka() { openWindowNauka("PrawoKirchhoffa_1_Nauka.fxml");}

    @FXML
    public void openPrawoKirchhoffa_2_Nauka() { openWindowNauka("PrawoKirchhoffa_2_Nauka.fxml");}

    @FXML
    public void openInstrukcja() { openWindowNauka("Instrukcja.fxml");}

    @FXML
    public void openZadanieZDioda() { openWindow("ZadanieZDioda.fxml");}

    @FXML
    public void openZadanieZDioda2() { openWindow("ZadanieZDioda2.fxml");}

    @FXML
    public void exit() {
        Platform.exit();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
