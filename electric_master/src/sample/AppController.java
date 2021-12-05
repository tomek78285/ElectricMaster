package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AppController {

    private MainController mainController;
    double napiecie = 9;

    @FXML
    private CheckBox A2_B2;
    @FXML
    private CheckBox A3_B3;
    @FXML
    private CheckBox A4_B4;
    @FXML
    private CheckBox A5_B5;
    @FXML
    private CheckBox A6_B6;
    @FXML
    private CheckBox A7_B7;
    @FXML
    private CheckBox A8_B8;
    @FXML
    private CheckBox A9_B9;
    @FXML
    private CheckBox A10_B10;
    @FXML
    private CheckBox B1_B2;
    @FXML
    private CheckBox B2_B3;
    @FXML
    private CheckBox B3_B4;
    @FXML
    private CheckBox B4_B5;
    @FXML
    private CheckBox B5_B6;
    @FXML
    private CheckBox B6_B7;
    @FXML
    private CheckBox B7_B8;
    @FXML
    private CheckBox B8_B9;
    @FXML
    private CheckBox B9_B10;
    @FXML
    private CheckBox C1_C2;
    @FXML
    private CheckBox C2_C3;
    @FXML
    private CheckBox C3_C4;
    @FXML
    private CheckBox C4_C5;
    @FXML
    private CheckBox C5_C6;
    @FXML
    private CheckBox C6_C7;
    @FXML
    private CheckBox C7_C8;
    @FXML
    private CheckBox C8_C9;
    @FXML
    private CheckBox C9_C10;
    @FXML
    private CheckBox D1_D2;
    @FXML
    private CheckBox D2_D3;
    @FXML
    private CheckBox D3_D4;
    @FXML
    private CheckBox D4_D5;
    @FXML
    private CheckBox D5_D6;
    @FXML
    private CheckBox D6_D7;
    @FXML
    private CheckBox D7_D8;
    @FXML
    private CheckBox D8_D9;
    @FXML
    private CheckBox D9_D10;
    @FXML
    private CheckBox E1_E2;
    @FXML
    private CheckBox E2_E3;
    @FXML
    private CheckBox E3_E4;
    @FXML
    private CheckBox E4_E5;
    @FXML
    private CheckBox E5_E6;
    @FXML
    private CheckBox E6_E7;
    @FXML
    private CheckBox E7_E8;
    @FXML
    private CheckBox E8_E9;
    @FXML
    private CheckBox E9_E10;
    @FXML
    private CheckBox E1_F1;
    @FXML
    private CheckBox E2_F2;
    @FXML
    private CheckBox E3_F3;
    @FXML
    private CheckBox E4_F4;
    @FXML
    private CheckBox E5_F5;
    @FXML
    private CheckBox E6_F6;
    @FXML
    private CheckBox E7_F7;
    @FXML
    private CheckBox E8_F8;
    @FXML
    private CheckBox E9_F9;


// #########################################

    @FXML
    private ImageView im_A2_B2;
    @FXML
    private ImageView im_A3_B3;
    @FXML
    private ImageView im_A4_B4;
    @FXML
    private ImageView im_A5_B5;
    @FXML
    private ImageView im_A6_B6;
    @FXML
    private ImageView im_A7_B7;
    @FXML
    private ImageView im_A8_B8;
    @FXML
    private ImageView im_A9_B9;
    @FXML
    private ImageView im_B1_B2;
    @FXML
    private ImageView im_B2_B3;
    @FXML
    private ImageView im_B3_B4;
    @FXML
    private ImageView im_B4_B5;
    @FXML
    private ImageView im_B5_B6;
    @FXML
    private ImageView im_B6_B7;
    @FXML
    private ImageView im_B7_B8;
    @FXML
    private ImageView im_B8_B9;
    @FXML
    private ImageView im_B9_B10;
    @FXML
    private ImageView im_C1_C2;
    @FXML
    private ImageView im_C2_C3;
    @FXML
    private ImageView im_C3_C4;
    @FXML
    private ImageView im_C4_C5;
    @FXML
    private ImageView im_C5_C6;
    @FXML
    private ImageView im_C6_C7;
    @FXML
    private ImageView im_C7_C8;
    @FXML
    private ImageView im_C8_C9;
    @FXML
    private ImageView im_C9_C10;
    @FXML
    private ImageView im_D1_D2;
    @FXML
    private ImageView im_D2_D3;
    @FXML
    private ImageView im_D3_D4;
    @FXML
    private ImageView im_D4_D5;
    @FXML
    private ImageView im_D5_D6;
    @FXML
    private ImageView im_D6_D7;
    @FXML
    private ImageView im_D7_D8;
    @FXML
    private ImageView im_D8_D9;
    @FXML
    private ImageView im_D9_D10;
    @FXML
    private ImageView im_E1_E2;
    @FXML
    private ImageView im_E2_E3;
    @FXML
    private ImageView im_E3_E4;
    @FXML
    private ImageView im_E4_E5;
    @FXML
    private ImageView im_E5_E6;
    @FXML
    private ImageView im_E6_E7;
    @FXML
    private ImageView im_E7_E8;
    @FXML
    private ImageView im_E8_E9;
    @FXML
    private ImageView im_E9_E10;
    @FXML
    private ImageView im_E2_F2;
    @FXML
    private ImageView im_E3_F3;
    @FXML
    private ImageView im_E4_F4;
    @FXML
    private ImageView im_E5_F5;
    @FXML
    private ImageView im_E6_F6;
    @FXML
    private ImageView im_E7_F7;
    @FXML
    private ImageView im_E8_F8;
    @FXML
    private ImageView im_E9_F9;
    @FXML
    private TextField wynik;
    @FXML
    private ChoiceBox elementy;

    Image przewod = new Image(getClass().getResourceAsStream("przewod.png"));
    Image przewod2 = new Image(getClass().getResourceAsStream("przewod2.png"));
    Image rezystor330 = new Image(getClass().getResourceAsStream("rezystor330.png"));
    Image rezystor10k = new Image(getClass().getResourceAsStream("rezystor10k.png"));
    Image brak = new Image(getClass().getResourceAsStream("brak.png"));

    public void initialize() {
        elementy.getItems().add("Przewod");
        elementy.getItems().add("Rezystor 330");
        elementy.getItems().add("Rezystor 10k");
        elementy.getItems().add("Dioda");
    }

    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void changeA2_B2(ActionEvent event) {
        if(A2_B2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A2_B2.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A2_B2.setImage(rezystor330);
            }
        }
        else im_A2_B2.setImage(brak);
    }

    public void changeA3_B3(ActionEvent event) {
        if(A3_B3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A3_B3.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A3_B3.setImage(rezystor330);
            }
        }
        else im_A3_B3.setImage(brak);
    }

    public void changeA4_B4(ActionEvent event) {
        if(A4_B4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A4_B4.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A4_B4.setImage(rezystor330);
            }
        }
        else im_A4_B4.setImage(brak);
    }
    public void changeA5_B5(ActionEvent event) {
        if(A5_B5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A5_B5.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A5_B5.setImage(rezystor330);
            }
        }
        else im_A5_B5.setImage(brak);
    }

    public void changeA6_B6(ActionEvent event) {
        if(A6_B6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A6_B6.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A6_B6.setImage(rezystor330);
            }
        }
        else im_A6_B6.setImage(brak);
    }

    public void changeA7_B7(ActionEvent event) {
        if(A7_B7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A7_B7.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A7_B7.setImage(rezystor330);
            }
        }
        else im_A7_B7.setImage(brak);
    }

    public void changeA8_B8(ActionEvent event) {
        if(A8_B8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A8_B8.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A8_B8.setImage(rezystor330);
            }
        }
        else im_A8_B8.setImage(brak);
    }

    public void changeA9_B9(ActionEvent event) {
        if(A9_B9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_A9_B9.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_A9_B9.setImage(rezystor330);
            }
        }
        else im_A9_B9.setImage(brak);
    }

    public void changeB1_B2(ActionEvent event) {
        if(B1_B2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B1_B2.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B1_B2.setImage(rezystor330);
            }
        }
        else im_B1_B2.setImage(brak);
    }

    public void changeB2_B3(ActionEvent event) {
        if(B2_B3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B2_B3.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B2_B3.setImage(rezystor330);
            }
        }
        else im_B2_B3.setImage(brak);
    }
    public void changeB3_B4(ActionEvent event) {
        if(B3_B4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B3_B4.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B3_B4.setImage(rezystor330);
            }
        }
        else im_B3_B4.setImage(brak);
    }
    public void changeB4_B5(ActionEvent event) {
        if(B4_B5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B4_B5.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B4_B5.setImage(rezystor330);
            }
        }
        else im_B4_B5.setImage(brak);
    }

    public void changeB5_B6(ActionEvent event) {
        if(B5_B6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B5_B6.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B5_B6.setImage(rezystor330);
            }
        }
        else im_B5_B6.setImage(brak);
    }

    public void changeB6_B7(ActionEvent event) {
        if(B6_B7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B6_B7.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B6_B7.setImage(rezystor330);
            }
        }
        else im_B6_B7.setImage(brak);
    }

    public void changeB7_B8(ActionEvent event) {
        if(B7_B8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B7_B8.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B7_B8.setImage(rezystor330);
            }
        }
        else im_B7_B8.setImage(brak);
    }
    public void changeB8_B9(ActionEvent event) {
        if(B8_B9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B8_B9.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B8_B9.setImage(rezystor330);
            }
        }
        else im_B8_B9.setImage(brak);
    }
    public void changeB9_B10(ActionEvent event) {
        if(B9_B10.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_B9_B10.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_B9_B10.setImage(rezystor330);
            }
        }
        else im_B9_B10.setImage(brak);
    }

    public void changeC1_C2(ActionEvent event) {
        if(C1_C2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C1_C2.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C1_C2.setImage(rezystor330);
            }
        }
        else im_C1_C2.setImage(brak);
    }

    public void changeC2_C3(ActionEvent event) {
        if(C2_C3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C2_C3.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C2_C3.setImage(rezystor330);
            }
        }
        else im_C2_C3.setImage(brak);
    }

    public void changeC3_C4(ActionEvent event) {
        if(C3_C4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C3_C4.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C3_C4.setImage(rezystor330);
            }
        }
        else im_C3_C4.setImage(brak);
    }
    public void changeC4_C5(ActionEvent event) {
        if(C4_C5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C4_C5.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C4_C5.setImage(rezystor330);
            }
        }
        else im_C4_C5.setImage(brak);
    }

    public void changeC5_C6(ActionEvent event) {
        if(C5_C6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C5_C6.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C5_C6.setImage(rezystor330);
            }
        }
        else im_C5_C6.setImage(brak);
    }

    public void changeC6_C7(ActionEvent event) {
        if(C6_C7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C6_C7.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C6_C7.setImage(rezystor330);
            }
        }
        else im_C6_C7.setImage(brak);
    }

    public void changeC7_C8(ActionEvent event) {
        if(C7_C8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C7_C8.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C7_C8.setImage(rezystor330);
            }
        }
        else im_C7_C8.setImage(brak);
    }
    public void changeC8_C9(ActionEvent event) {
        if(C8_C9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C8_C9.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C8_C9.setImage(rezystor330);
            }
        }
        else im_C8_C9.setImage(brak);
    }

    public void changeC9_C10(ActionEvent event) {
        if(C9_C10.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_C9_C10.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_C9_C10.setImage(rezystor330);
            }
        }
        else im_C9_C10.setImage(brak);
    }

    public void changeD1_D2(ActionEvent event) {
        if(D1_D2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D1_D2.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D1_D2.setImage(rezystor330);
            }
        }
        else im_D1_D2.setImage(brak);
    }

    public void changeD2_D3(ActionEvent event) {
        if(D2_D3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D2_D3.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D2_D3.setImage(rezystor330);
            }
        }
        else im_D2_D3.setImage(brak);
    }

    public void changeD3_D4(ActionEvent event) {
        if(D3_D4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D3_D4.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D3_D4.setImage(rezystor330);
            }
        }
        else im_D3_D4.setImage(brak);
    }
    public void changeD4_D5(ActionEvent event) {
        if(D4_D5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D4_D5.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D4_D5.setImage(rezystor330);
            }
        }
        else im_D4_D5.setImage(brak);
    }
    public void changeD5_D6(ActionEvent event) {
        if(D5_D6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D5_D6.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D5_D6.setImage(rezystor330);
            }
        }
        else im_D5_D6.setImage(brak);
    }

    public void changeD6_D7(ActionEvent event) {
        if(D6_D7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D6_D7.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D6_D7.setImage(rezystor330);
            }
        }
        else im_D6_D7.setImage(brak);
    }

    public void changeD7_D8(ActionEvent event) {
        if(D7_D8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D7_D8.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D7_D8.setImage(rezystor330);
            }
        }
        else im_D7_D8.setImage(brak);
    }

    public void changeD8_D9(ActionEvent event) {
        if(D8_D9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D8_D9.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D8_D9.setImage(rezystor330);
            }
        }
        else im_D8_D9.setImage(brak);
    }

    public void changeD9_D10(ActionEvent event) {
        if(D9_D10.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_D9_D10.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_D9_D10.setImage(rezystor330);
            }
        }
        else im_D9_D10.setImage(brak);
    }

    public void changeE1_E2(ActionEvent event) {
        if(E1_E2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E1_E2.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E1_E2.setImage(rezystor330);
            }
        }
        else im_E1_E2.setImage(brak);
    }

    public void changeE2_E3(ActionEvent event) {
        if(E2_E3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E2_E3.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E2_E3.setImage(rezystor330);
            }
        }
        else im_E2_E3.setImage(brak);
    }

    public void changeE3_E4(ActionEvent event) {
        if(E3_E4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E3_E4.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E3_E4.setImage(rezystor330);
            }
        }
        else im_E3_E4.setImage(brak);
    }

    public void changeE4_E5(ActionEvent event) {
        if(E4_E5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E4_E5.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E4_E5.setImage(rezystor330);
            }
        }
        else im_E4_E5.setImage(brak);
    }
    public void changeE5_E6(ActionEvent event) {
        if(E5_E6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E5_E6.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E5_E6.setImage(rezystor330);
            }
        }

        else im_E5_E6.setImage(brak);
    }

    public void changeE6_E7(ActionEvent event) {
        if(E6_E7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E6_E7.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E6_E7.setImage(rezystor330);
            }
        }
        else im_E6_E7.setImage(brak);
    }


    public void changeE7_E8(ActionEvent event) {
        if(E7_E8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E7_E8.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E7_E8.setImage(rezystor330);
            }
        }
        else im_E7_E8.setImage(brak);
    }

    public void changeE8_E9(ActionEvent event) {
        if(E8_E9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E8_E9.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E8_E9.setImage(rezystor330);
            }
        }
        else im_E8_E9.setImage(brak);
    }

    public void changeE9_E10(ActionEvent event) {
        if(E9_E10.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E9_E10.setImage(przewod2);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E9_E10.setImage(rezystor330);
            }
        }
        else im_E9_E10.setImage(brak);
    }

    public void changeE2_F2(ActionEvent event) {
        if(E2_F2.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E2_F2.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E2_F2.setImage(rezystor330);
            }
        }
        else im_E2_F2.setImage(brak);
    }

    public void changeE3_F3(ActionEvent event) {
        if(E3_F3.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E3_F3.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E3_F3.setImage(rezystor330);
            }
        }
        else im_E3_F3.setImage(brak);
    }

    public void changeE4_F4(ActionEvent event) {
        if(E4_F4.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E4_F4.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E4_F4.setImage(rezystor330);
            }
        }
        else im_E4_F4.setImage(brak);
    }

    public void changeE5_F5(ActionEvent event) {
        if(E5_F5.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E5_F5.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E5_F5.setImage(rezystor330);
            }
        }
        else im_E5_F5.setImage(brak);
    }

    public void changeE6_F6(ActionEvent event) {
        if(E6_F6.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E6_F6.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E6_F6.setImage(rezystor330);
            }
        }
        else im_E6_F6.setImage(brak);
    }

    public void changeE7_F7(ActionEvent event) {
        if(E7_F7.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E7_F7.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E7_F7.setImage(rezystor330);
            }
        }
        else im_E7_F7.setImage(brak);
    }


    public void changeE8_F8(ActionEvent event) {
        if(E8_F8.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E8_F8.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E8_F8.setImage(rezystor330);
            }
        }
        else im_E8_F8.setImage(brak);
    }

    public void changeE9_F9(ActionEvent event) {
        if(E9_F9.isSelected()) {
            if(elementy.getValue() == "Przewod") {
                im_E9_F9.setImage(przewod);
            }
            else if(elementy.getValue() == "Rezystor 330") {
                im_E9_F9.setImage(rezystor330);
            }
        }
        else im_E9_F9.setImage(brak);
    }
}
