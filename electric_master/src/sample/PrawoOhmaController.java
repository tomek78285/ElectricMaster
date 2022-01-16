package sample;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class PrawoOhmaController {

    private MainController mainController;
    double napiecie = 9;
    double rezystancja;

    ArrayList<CheckBox> POLA = new ArrayList<>();

    @FXML
    private Label miernik;
    @FXML
    private Label miernik_nap;
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
    public ImageView im_A2_B2;
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
    private ImageView ohm1;
    @FXML
    private TextField wynik;
    @FXML
    private ChoiceBox elementy;

    Image przewod = new Image(getClass().getResourceAsStream("img/przewod.png"));
    Image przewod2 = new Image(getClass().getResourceAsStream("img/przewod2.png"));
    Image rezystor100 = new Image(getClass().getResourceAsStream("img/rezystor100.png"));
    Image rezystor100_2 = new Image(getClass().getResourceAsStream("img/rezystor100_2.png"));
    Image rezystor330 = new Image(getClass().getResourceAsStream("img/rezystor330.png"));
    Image rezystor330_2 = new Image(getClass().getResourceAsStream("img/rezystor330_2.png"));
    Image rezystor1k = new Image(getClass().getResourceAsStream("img/rezystor1k.png"));
    Image rezystor1k_2 = new Image(getClass().getResourceAsStream("img/rezystor1k_2.png"));
    Image rezystor10k = new Image(getClass().getResourceAsStream("img/rezystor10k.png"));
    Image rezystor10k_2 = new Image(getClass().getResourceAsStream("img/rezystor10k_2.png"));
    Image kondensator100nf = new Image(getClass().getResourceAsStream("img/kondensator_ceramiczny.png"));
    Image kondensator100nf_2 = new Image(getClass().getResourceAsStream("img/kondensator_ceramiczny_2.png"));
    Image kondensator220uf = new Image(getClass().getResourceAsStream("img/kondensator220.png"));
    Image kondensator220uf_2 = new Image(getClass().getResourceAsStream("img/kondensator220_2.png"));
    Image kondensator1000uf = new Image(getClass().getResourceAsStream("img/kondensator1000.png"));
    Image kondensator1000uf_2 = new Image(getClass().getResourceAsStream("img/kondensator1000_2.png"));
    Image dioda_krzemowa = new Image(getClass().getResourceAsStream("img/dioda_krzemowa.png"));
    Image dioda_krzemowa_2 = new Image(getClass().getResourceAsStream("img/dioda_krzemowa_2.png"));
    Image brak = new Image(getClass().getResourceAsStream("img/brak.png"));
    Image brak2 = new Image(getClass().getResourceAsStream("img/brak2.png"));
    Image ohm_1 = new Image(getClass().getResourceAsStream("img/ohm_1.png"));

    public boolean SECTION_1 = false;
    public boolean SECTION_2 = false;
    public boolean SECTION_3 = false;
    public boolean SECTION_4 = false;
    public boolean SECTION_5 = false;
    public boolean SECTION_6 = false;
    public boolean SECTION_7 = false;
    public boolean SECTION_8 = false;
    public boolean SECTION_9 = false;
    public boolean SECTION_10 = false;

    public void initialize() {
        elementy.getItems().add("Przewod");
        elementy.getItems().add("Rezystor 100");
        elementy.getItems().add("Rezystor 330");
        elementy.getItems().add("Rezystor 1k");
        elementy.getItems().add("Rezystor 10k");
        elementy.getItems().add("Kondensator 100nf");
        elementy.getItems().add("Kondensator 220uf");
        elementy.getItems().add("Kondensator 1000uf");
        elementy.getItems().add("Dioda krzemowa");
        ohm1.setImage(ohm_1);
    }

    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void clear_all() {
        E9_F9.setDisable(false);
        E9_F9.setSelected(false);
        im_A2_B2.setImage(brak);
        rezystancja = 0;
        miernik.setText(" " + rezystancja);
        miernik_nap.setText(" " + 9 / 1 + " A");
    }

    public void licz_napiecie() {
        if (rezystancja == 0) {
            miernik_nap.setText(" " + 9 / 1 + " A");
        } else {
            napiecie = napiecie/rezystancja;
            napiecie *= 100;
            napiecie = Math.round(napiecie);
            napiecie = napiecie/100;
            miernik_nap.setText(napiecie + " A");
        }
    }
    public void change_vertical(CheckBox checkBox, ImageView image) {
        if (checkBox.isSelected()) {
            checkBox.setDisable(true);
            if (elementy.getValue() == "Przewod") {
                image.setImage(przewod);
            } else if (elementy.getValue() == "Rezystor 100") {
                image.setImage(rezystor100);
                if (czyAktywne(checkBox)) rezystancja += 100;
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 330") {
                image.setImage(rezystor330);
                if (czyAktywne(checkBox)) rezystancja += 330;
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 1k") {
                image.setImage(rezystor1k);
                if (czyAktywne(checkBox)) rezystancja += 1000;
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 10k") {
                image.setImage(rezystor10k);
                if (czyAktywne(checkBox)) rezystancja += 10000;
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Kondensator 100nf") {
                image.setImage(kondensator100nf);
            } else if (elementy.getValue() == "Kondensator 220uf") {
                image.setImage(kondensator220uf);
            } else if (elementy.getValue() == "Kondensator 1000uf") {
                image.setImage(kondensator1000uf);
            } else if (elementy.getValue() == "Dioda krzemowa") {
                image.setImage(dioda_krzemowa);
            }
            licz_napiecie();
        }
//        else {
//            if (elementy.getValue() == "Rezystor 100") {
//                image.setImage(brak2);
//                if (czyAktywne(checkBox)) rezystancja -= 100;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 330") {
//                image.setImage(brak2);
//                if (czyAktywne(checkBox)) rezystancja -= 330;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 1k") {
//                image.setImage(brak2);
//                if (czyAktywne(checkBox)) rezystancja -= 1000;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 10k") {
//                image.setImage(brak2);
//                if (czyAktywne(checkBox)) rezystancja -= 10000;
//                miernik.setText(" " + rezystancja);
//            }
////            image.setImage(brak2);
////            rezystancja -= 10000;
//            licz_napiecie();
//        }
    }

    public void change_horizontal(CheckBox checkBox, ImageView image) {
        if (checkBox.isSelected()) {
            checkBox.setDisable(true);
            if (elementy.getValue() == "Przewod") {
                image.setImage(przewod2);
            } else if (elementy.getValue() == "Rezystor 100") {
                image.setImage(rezystor100_2);
                if (czyAktywne(checkBox)) {
                    rezystancja += 100;
                }
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 330") {
                image.setImage(rezystor330_2);
                if (czyAktywne(checkBox)) {
                    rezystancja += 330;
                }
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 1k") {
                image.setImage(rezystor1k_2);
                if (czyAktywne(checkBox)) {
                    rezystancja += 1000;
                }
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Rezystor 10k") {
                image.setImage(rezystor10k_2);
                if (czyAktywne(checkBox)) {
                    rezystancja += 10000;
                }
                miernik.setText(" " + rezystancja);
            } else if (elementy.getValue() == "Kondensator 100nf") {
                image.setImage(kondensator100nf_2);
            } else if (elementy.getValue() == "Kondensator 220uf") {
                image.setImage(kondensator220uf_2);
            } else if (elementy.getValue() == "Kondensator 1000uf") {
                image.setImage(kondensator1000uf_2);
            } else if (elementy.getValue() == "Dioda krzemowa") {
                image.setImage(dioda_krzemowa_2);
            }
            licz_napiecie();
        }
//        else {
////            image.setImage(brak);
//            if (elementy.getValue() == "Rezystor 100") {
//                image.setImage(brak);
//                if (czyAktywne(checkBox)) rezystancja -= 100;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 330") {
//                image.setImage(brak);
//                if (czyAktywne(checkBox)) rezystancja -= 330;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 1k") {
//                image.setImage(brak);
//                if (czyAktywne(checkBox)) rezystancja -= 1000;
//                miernik.setText(" " + rezystancja);
//            } else if (elementy.getValue() == "Rezystor 10k") {
//                image.setImage(brak);
//                if (czyAktywne(checkBox)) rezystancja -= 10000;
//                miernik.setText(" " + rezystancja);
//            }
//            licz_napiecie();
//        }
    }

    public void changeA2_B2() {
        change_vertical(A2_B2, im_A2_B2);
    }

    public void changeA3_B3() {
        change_vertical(A3_B3, im_A3_B3);
    }

    public void changeA4_B4() {
        change_vertical(A4_B4, im_A4_B4);
    }

    public void changeA5_B5() {
        change_vertical(A5_B5, im_A5_B5);
    }

    public void changeA6_B6() {
        change_vertical(A6_B6, im_A6_B6);
    }

    public void changeA7_B7() {
        change_vertical(A7_B7, im_A7_B7);
    }

    public void changeA8_B8() {
        change_vertical(A8_B8, im_A8_B8);
    }

    public void changeA9_B9() {
        change_vertical(A9_B9, im_A9_B9);
    }

    public void changeB1_B2() {
        change_horizontal(B1_B2, im_B1_B2);
    }

    public void changeB2_B3() {
        change_horizontal(B2_B3, im_B2_B3);
    }

    public void changeB3_B4() {
        change_horizontal(B3_B4, im_B3_B4);
    }

    public void changeB4_B5() {
        change_horizontal(B4_B5, im_B4_B5);
    }

    public void changeB5_B6() {
        change_horizontal(B5_B6, im_B5_B6);
    }

    public void changeB6_B7() {
        change_horizontal(B6_B7, im_B6_B7);
    }

    public void changeB7_B8() {
        change_horizontal(B7_B8, im_B7_B8);
    }

    public void changeB8_B9() {
        change_horizontal(B8_B9, im_B8_B9);
    }

    public void changeB9_B10() {
        change_horizontal(B9_B10, im_B9_B10);
    }

    public void changeC1_C2() {
        change_horizontal(C1_C2, im_C1_C2);
    }

    public void changeC2_C3() {
        change_horizontal(C2_C3, im_C2_C3);
    }

    public void changeC3_C4() {
        change_horizontal(C3_C4, im_C3_C4);
    }

    public void changeC4_C5() {
        change_horizontal(C4_C5, im_C4_C5);
    }

    public void changeC5_C6() {
        change_horizontal(C5_C6, im_C5_C6);
    }

    public void changeC6_C7() {
        change_horizontal(C6_C7, im_C6_C7);
    }

    public void changeC7_C8() {
        change_horizontal(C7_C8, im_C7_C8);
    }

    public void changeC8_C9() {
        change_horizontal(C8_C9, im_C8_C9);
    }

    public void changeC9_C10() {
        change_horizontal(C9_C10, im_C9_C10);
    }

    public void changeD1_D2() {
        change_horizontal(D1_D2, im_D1_D2);
    }

    public void changeD2_D3() {
        change_horizontal(D2_D3, im_D2_D3);
    }

    public void changeD3_D4() {
        change_horizontal(D3_D4, im_D3_D4);
    }

    public void changeD4_D5() {
        change_horizontal(D4_D5, im_D4_D5);
    }

    public void changeD5_D6() {
        change_horizontal(D5_D6, im_D5_D6);
    }

    public void changeD6_D7() {
        change_horizontal(D6_D7, im_D6_D7);
    }

    public void changeD7_D8() {
        change_horizontal(D7_D8, im_D7_D8);
    }

    public void changeD8_D9() {
        change_horizontal(D8_D9, im_D8_D9);
    }

    public void changeD9_D10() {
        change_horizontal(D9_D10, im_D9_D10);
    }

    public void changeE1_E2() {
        change_horizontal(E1_E2, im_E1_E2);
    }

    public void changeE2_E3() {
        change_horizontal(E2_E3, im_E2_E3);
    }

    public void changeE3_E4() {
        change_horizontal(E3_E4, im_E3_E4);
    }

    public void changeE4_E5() {
        change_horizontal(E4_E5, im_E4_E5);
    }

    public void changeE5_E6() {
        change_horizontal(E5_E6, im_E5_E6);
    }

    public void changeE6_E7() {
        change_horizontal(E6_E7, im_E6_E7);
    }

    public void changeE7_E8() {
        change_horizontal(E7_E8, im_E7_E8);
    }

    public void changeE8_E9() {
        change_horizontal(E8_E9, im_E8_E9);
    }

    public void changeE9_E10() {
        change_horizontal(E9_E10, im_E9_E10);
    }

    public void changeE2_F2() {
        change_vertical(E2_F2, im_E2_F2);
    }

    public void changeE3_F3() {
        change_vertical(E3_F3, im_E3_F3);
    }

    public void changeE4_F4() {
        change_vertical(E4_F4, im_E4_F4);
    }

    public void changeE5_F5() {
        change_vertical(E5_F5, im_E5_F5);
    }

    public void changeE6_F6() {
        change_vertical(E6_F6, im_E6_F6);
    }

    public void changeE7_F7() {
        change_vertical(E7_F7, im_E7_F7);
    }

    public void changeE8_F8() {
        change_vertical(E8_F8, im_E8_F8);
    }

    public void changeE9_F9() {
        change_vertical(E9_F9, im_E9_F9);
    }

    public boolean czyAktywne(CheckBox checkbox) {
        String nazwa;
        nazwa = checkbox.getId();
        if (nazwa.charAt(0) == 'A' || nazwa.charAt(3) == 'F') {
            if (nazwa.charAt(1) == '2') {
                if (SECTION_2 == false) SECTION_2 = true;
                return true;
            }
            if (nazwa.charAt(1) == '3') {
                if (SECTION_3 == false) SECTION_3 = true;
                return true;
            }
            if (nazwa.charAt(1) == '4') {
                if (SECTION_4 == false) SECTION_4 = true;
                return true;
            }
            if (nazwa.charAt(1) == '5') {
                if (SECTION_5 == false) SECTION_5 = true;
                return true;
            }
            if (nazwa.charAt(1) == '6') {
                if (SECTION_6 == false) SECTION_6 = true;
                return true;
            }
            if (nazwa.charAt(1) == '7') {
                if (SECTION_7 == false) SECTION_7 = true;
                return true;
            }
            if (nazwa.charAt(1) == '8') {
                if (SECTION_8 == false) SECTION_8 = true;
                return true;
            }
            if (nazwa.charAt(1) == '9') {
                if (SECTION_9 == false) SECTION_9 = true;
                return true;
            }
        }
        if (nazwa.charAt(1) == '1') {
            if (SECTION_1 == true || SECTION_2 == true) {
                SECTION_1 = true;
                SECTION_2 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '2') {
            if (SECTION_2 == true || SECTION_3 == true) {
                SECTION_2 = true;
                SECTION_3 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '3') {
            if (SECTION_3 == true || SECTION_4 == true) {
                SECTION_3 = true;
                SECTION_4 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '4') {
            if (SECTION_4 == true || SECTION_5 == true) {
                SECTION_4 = true;
                SECTION_5 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '5') {
            if (SECTION_5 == true || SECTION_6 == true) {
                SECTION_5 = true;
                SECTION_6 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '6') {
            if (SECTION_6 == true || SECTION_7 == true) {
                SECTION_6 = true;
                SECTION_7 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '7') {
            if (SECTION_7 == true || SECTION_8 == true) {
                SECTION_7 = true;
                SECTION_8 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '8') {
            if (SECTION_8 == true || SECTION_9 == true) {
                SECTION_8 = true;
                SECTION_9 = true;

                return true;
            } else return false;
        } else if (nazwa.charAt(1) == '9') {
            if (SECTION_9 == true || SECTION_10 == true) {
                SECTION_9 = true;
                SECTION_10 = true;

                return true;
            } else return false;
        }
        return false;
    }
}
