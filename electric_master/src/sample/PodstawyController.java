package sample;

import javafx.fxml.FXML;

public class PodstawyController {

    private MainController mainController;

    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }

    @FXML
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


}
