package sample;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class AppController {

    private MainController mainController;
    double napiecie = 9;
    double rezystancja;

    ArrayList<CheckBox> POLA = new ArrayList<>();

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
    private ImageView pomiarPrimary1;
    @FXML
    private ImageView pomiarPrimary2;
    @FXML
    private ImageView pomiarB1_B5;
    @FXML
    private ImageView pomiarB6_B10;
    @FXML
    private ImageView pomiarB;
    @FXML
    private ImageView pomiarB_C1;
    @FXML
    private ImageView pomiarB_C2;
    @FXML
    private ImageView pomiarB_C3;
    @FXML
    private ImageView pomiarB_C4;
    @FXML
    private ImageView pomiarB_C5;
    @FXML
    private ImageView pomiarB_C6;
    @FXML
    private ImageView pomiarB_C7;
    @FXML
    private ImageView pomiarB_C8;
    @FXML
    private ImageView pomiarB_C9;
    @FXML
    private ImageView pomiarC1;
    @FXML
    private ImageView pomiarC2;
    @FXML
    private ImageView pomiarC3;
    @FXML
    private ImageView pomiarC4;
    @FXML
    private ImageView pomiarC5;
    @FXML
    private ImageView pomiarC6;
    @FXML
    private ImageView pomiarC7;
    @FXML
    private ImageView pomiarC8;
    @FXML
    private ImageView pomiarC9;
    @FXML
    private ImageView pomiarE;
    @FXML
    private ImageView pomiarE_D1;
    @FXML
    private ImageView pomiarE_D2;
    @FXML
    private ImageView pomiarE_D3;
    @FXML
    private ImageView pomiarE_D4;
    @FXML
    private ImageView pomiarE_D5;
    @FXML
    private ImageView pomiarE_D6;
    @FXML
    private ImageView pomiarE_D7;
    @FXML
    private ImageView pomiarE_D8;
    @FXML
    private ImageView pomiarE_D9;
    @FXML
    private ImageView pomiarD1;
    @FXML
    private ImageView pomiarD2;
    @FXML
    private ImageView pomiarD3;
    @FXML
    private ImageView pomiarD4;
    @FXML
    private ImageView pomiarD5;
    @FXML
    private ImageView pomiarD6;
    @FXML
    private ImageView pomiarD7;
    @FXML
    private ImageView pomiarD8;
    @FXML
    private ImageView pomiarD9;
    @FXML
    private ImageView pomiarE1_E5;
    @FXML
    private ImageView pomiarE6_E10;
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
    Image dioda_led = new Image(getClass().getResourceAsStream("img/dioda_ledOFF.png"));
    Image dioda_led_2 = new Image(getClass().getResourceAsStream("img/dioda_led_2OFF.png"));
    Image dioda_ledON = new Image(getClass().getResourceAsStream("img/dioda_ledON.png"));
    Image dioda_led_2ON = new Image(getClass().getResourceAsStream("img/dioda_led_2ON.png"));
    Image brak = new Image(getClass().getResourceAsStream("img/brak.png"));
    Image brak2 = new Image(getClass().getResourceAsStream("img/brak2.png"));
    Image pomiar = new Image(getClass().getResourceAsStream("img/pomiar.png"));
    Image pomiarB2 = new Image(getClass().getResourceAsStream("img/pomiarB2.png"));
    Image pomiarB3 = new Image(getClass().getResourceAsStream("img/pomiarB3.png"));
    Image pomiarB4 = new Image(getClass().getResourceAsStream("img/pomiarB4.png"));
    Image pomiarB5 = new Image(getClass().getResourceAsStream("img/pomiarB5.png"));
    Image pomiarB6 = new Image(getClass().getResourceAsStream("img/pomiarB6.png"));
    Image pomiarB7 = new Image(getClass().getResourceAsStream("img/pomiarB7.png"));
    Image pomiarB8 = new Image(getClass().getResourceAsStream("img/pomiarB8.png"));
    Image pomiarB9 = new Image(getClass().getResourceAsStream("img/pomiarB9.png"));
    Image pomiarB10 = new Image(getClass().getResourceAsStream("img/pomiarB10.png"));
    Image pomiarC = new Image(getClass().getResourceAsStream("img/pomiarC.png"));
    Image pomiar_C2 = new Image(getClass().getResourceAsStream("img/pomiarC2.png"));
    Image pomiarBC = new Image(getClass().getResourceAsStream("img/pomiarB_C.png"));
    Image PC2 = new Image(getClass().getResourceAsStream("img/PC2.png"));
    Image PC3 = new Image(getClass().getResourceAsStream("img/PC3.png"));
    Image PC4 = new Image(getClass().getResourceAsStream("img/PC4.png"));
    Image PC5 = new Image(getClass().getResourceAsStream("img/PC5.png"));
    Image PC6 = new Image(getClass().getResourceAsStream("img/PC6.png"));
    Image PC7 = new Image(getClass().getResourceAsStream("img/PC7.png"));
    Image PC8 = new Image(getClass().getResourceAsStream("img/PC8.png"));
    Image PC9 = new Image(getClass().getResourceAsStream("img/PC9.png"));
    Image PD2 = new Image(getClass().getResourceAsStream("img/PD2.png"));
    Image PD3 = new Image(getClass().getResourceAsStream("img/PD3.png"));
    Image PD4 = new Image(getClass().getResourceAsStream("img/PD4.png"));
    Image PD5 = new Image(getClass().getResourceAsStream("img/PD5.png"));
    Image PD6 = new Image(getClass().getResourceAsStream("img/PD6.png"));
    Image PD7 = new Image(getClass().getResourceAsStream("img/PD7.png"));
    Image PD8 = new Image(getClass().getResourceAsStream("img/PD8.png"));
    Image PD9 = new Image(getClass().getResourceAsStream("img/PD9.png"));
    Image pomiarE2 = new Image(getClass().getResourceAsStream("img/pomiarE2.png"));
    Image pomiarE3 = new Image(getClass().getResourceAsStream("img/pomiarE3.png"));
    Image pomiarE4 = new Image(getClass().getResourceAsStream("img/pomiarE4.png"));
    Image pomiarE5 = new Image(getClass().getResourceAsStream("img/pomiarE5.png"));
    Image pomiarE6 = new Image(getClass().getResourceAsStream("img/pomiarE6.png"));
    Image pomiarE7 = new Image(getClass().getResourceAsStream("img/pomiarE7.png"));
    Image pomiarE8 = new Image(getClass().getResourceAsStream("img/pomiarE8.png"));
    Image pomiarE9 = new Image(getClass().getResourceAsStream("img/pomiarE9.png"));
    Image pomiarE10 = new Image(getClass().getResourceAsStream("img/pomiarE10.png"));

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

    ArrayList<String> ElDodane = new ArrayList<>();

    public void initialize() {
        elementy.getItems().add("Przewod");
        elementy.getItems().add("Rezystor 100");
        elementy.getItems().add("Rezystor 330");
        elementy.getItems().add("Rezystor 1k");
        elementy.getItems().add("Rezystor 10k");
//        elementy.getItems().add("Kondensator 100nf");
//        elementy.getItems().add("Kondensator 220uf");
//        elementy.getItems().add("Kondensator 1000uf");
        elementy.getItems().add("Dioda LED");
    }

    @FXML
    public void backMenu() {
        mainController.loadMenuScreen();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void clear_all() {
        A2_B2.setDisable(false);
        A2_B2.setSelected(false);
        A3_B3.setDisable(false);
        A3_B3.setSelected(false);
        A4_B4.setDisable(false);
        A4_B4.setSelected(false);
        A5_B5.setDisable(false);
        A5_B5.setSelected(false);
        A6_B6.setDisable(false);
        A6_B6.setSelected(false);
        A7_B7.setDisable(false);
        A7_B7.setSelected(false);
        A8_B8.setDisable(false);
        A8_B8.setSelected(false);
        A9_B9.setDisable(false);
        A9_B9.setSelected(false);

        B1_B2.setDisable(false);
        B1_B2.setSelected(false);
        B2_B3.setDisable(false);
        B2_B3.setSelected(false);
        B3_B4.setDisable(false);
        B3_B4.setSelected(false);
        B4_B5.setDisable(false);
        B4_B5.setSelected(false);
        B5_B6.setDisable(false);
        B5_B6.setSelected(false);
        B6_B7.setDisable(false);
        B6_B7.setSelected(false);
        B7_B8.setDisable(false);
        B7_B8.setSelected(false);
        B8_B9.setDisable(false);
        B8_B9.setSelected(false);
        B9_B10.setDisable(false);
        B9_B10.setSelected(false);

        C1_C2.setDisable(false);
        C1_C2.setSelected(false);
        C2_C3.setDisable(false);
        C2_C3.setSelected(false);
        C3_C4.setDisable(false);
        C3_C4.setSelected(false);
        C4_C5.setDisable(false);
        C4_C5.setSelected(false);
        C5_C6.setDisable(false);
        C5_C6.setSelected(false);
        C6_C7.setDisable(false);
        C6_C7.setSelected(false);
        C7_C8.setDisable(false);
        C7_C8.setSelected(false);
        C8_C9.setDisable(false);
        C8_C9.setSelected(false);
        C9_C10.setDisable(false);
        C9_C10.setSelected(false);

        D1_D2.setDisable(false);
        D1_D2.setSelected(false);
        D2_D3.setDisable(false);
        D2_D3.setSelected(false);
        D3_D4.setDisable(false);
        D3_D4.setSelected(false);
        D4_D5.setDisable(false);
        D4_D5.setSelected(false);
        D5_D6.setDisable(false);
        D5_D6.setSelected(false);
        D6_D7.setDisable(false);
        D6_D7.setSelected(false);
        D7_D8.setDisable(false);
        D7_D8.setSelected(false);
        D8_D9.setDisable(false);
        D8_D9.setSelected(false);
        D9_D10.setDisable(false);
        D9_D10.setSelected(false);

        E1_E2.setDisable(false);
        E1_E2.setSelected(false);
        E2_E3.setDisable(false);
        E2_E3.setSelected(false);
        E3_E4.setDisable(false);
        E3_E4.setSelected(false);
        E4_E5.setDisable(false);
        E4_E5.setSelected(false);
        E5_E6.setDisable(false);
        E5_E6.setSelected(false);
        E6_E7.setDisable(false);
        E6_E7.setSelected(false);
        E7_E8.setDisable(false);
        E7_E8.setSelected(false);
        E8_E9.setDisable(false);
        E8_E9.setSelected(false);
        E9_E10.setDisable(false);
        E9_E10.setSelected(false);

        E2_F2.setDisable(false);
        E2_F2.setSelected(false);
        E3_F3.setDisable(false);
        E3_F3.setSelected(false);
        E4_F4.setDisable(false);
        E4_F4.setSelected(false);
        E5_F5.setDisable(false);
        E5_F5.setSelected(false);
        E6_F6.setDisable(false);
        E6_F6.setSelected(false);
        E7_F7.setDisable(false);
        E7_F7.setSelected(false);
        E8_F8.setDisable(false);
        E8_F8.setSelected(false);
        E9_F9.setDisable(false);
        E9_F9.setSelected(false);

        im_A2_B2.setImage(brak);
        im_A3_B3.setImage(brak);
        im_A4_B4.setImage(brak);
        im_A5_B5.setImage(brak);
        im_A6_B6.setImage(brak);
        im_A7_B7.setImage(brak);
        im_A8_B8.setImage(brak);
        im_A9_B9.setImage(brak);

        im_B1_B2.setImage(brak);
        im_B2_B3.setImage(brak);
        im_B3_B4.setImage(brak);
        im_B4_B5.setImage(brak);
        im_B5_B6.setImage(brak);
        im_B6_B7.setImage(brak);
        im_B7_B8.setImage(brak);
        im_B8_B9.setImage(brak);

        im_C1_C2.setImage(brak);
        im_C2_C3.setImage(brak);
        im_C3_C4.setImage(brak);
        im_C4_C5.setImage(brak);
        im_C5_C6.setImage(brak);
        im_C6_C7.setImage(brak);
        im_C7_C8.setImage(brak);
        im_C8_C9.setImage(brak);

        im_D1_D2.setImage(brak);
        im_D2_D3.setImage(brak);
        im_D3_D4.setImage(brak);
        im_D4_D5.setImage(brak);
        im_D5_D6.setImage(brak);
        im_D6_D7.setImage(brak);
        im_D7_D8.setImage(brak);
        im_D8_D9.setImage(brak);

        im_E1_E2.setImage(brak);
        im_E2_E3.setImage(brak);
        im_E3_E4.setImage(brak);
        im_E4_E5.setImage(brak);
        im_E5_E6.setImage(brak);
        im_E6_E7.setImage(brak);
        im_E7_E8.setImage(brak);
        im_E8_E9.setImage(brak);

        im_E2_F2.setImage(brak);
        im_E3_F3.setImage(brak);
        im_E4_F4.setImage(brak);
        im_E5_F5.setImage(brak);
        im_E6_F6.setImage(brak);
        im_E7_F7.setImage(brak);
        im_E8_F8.setImage(brak);
        im_E9_F9.setImage(brak);


        rezystancja = 0;
        miernik_nap.setText(" " + 9 / 1 + " A");
        clear_pomiarUp();
        clear_pomiarDown();
        pomiarPrimary1.setImage(pomiar);
        pomiarPrimary2.setImage(pomiar);
    }

    public void clear_pomiarUp() {
        pomiarPrimary1.setImage(brak);
        pomiarB1_B5.setImage(brak);
        pomiarB6_B10.setImage(brak);
        pomiarB.setImage(brak);
        pomiarB_C1.setImage(brak);
        pomiarB_C2.setImage(brak);
        pomiarB_C3.setImage(brak);
        pomiarB_C4.setImage(brak);
        pomiarB_C5.setImage(brak);
        pomiarB_C6.setImage(brak);
        pomiarB_C7.setImage(brak);
        pomiarB_C8.setImage(brak);
        pomiarC1.setImage(brak);
        pomiarC2.setImage(brak);
        pomiarC3.setImage(brak);
        pomiarC4.setImage(brak);
        pomiarC5.setImage(brak);
        pomiarC6.setImage(brak);
        pomiarC7.setImage(brak);
        pomiarC8.setImage(brak);
    }

    public void clear_pomiarDown() {
        pomiarPrimary2.setImage(brak);
        pomiarE1_E5.setImage(brak);
        pomiarE6_E10.setImage(brak);
        pomiarE.setImage(brak);
        pomiarE_D1.setImage(brak);
        pomiarE_D2.setImage(brak);
        pomiarE_D3.setImage(brak);
        pomiarE_D4.setImage(brak);
        pomiarE_D5.setImage(brak);
        pomiarE_D6.setImage(brak);
        pomiarE_D7.setImage(brak);
        pomiarE_D8.setImage(brak);
        pomiarD1.setImage(brak);
        pomiarD2.setImage(brak);
        pomiarD3.setImage(brak);
        pomiarD4.setImage(brak);
        pomiarD5.setImage(brak);
        pomiarD6.setImage(brak);
        pomiarD7.setImage(brak);
        pomiarD8.setImage(brak);
    }

    public void licz_natezenie() {
        if (rezystancja == 0) {
            miernik_nap.setText(" " + 9 / 1 + " A");
        } else {
            napiecie = 9/rezystancja;
            napiecie *= 1000000000;
            napiecie = Math.round(napiecie);
            napiecie = napiecie/1000000000;
            if(napiecie < 0.01) miernik_nap.setText(napiecie*1000 + " mA");
            else miernik_nap.setText(napiecie + " A");
        }
    }

    public void set_pomiar(CheckBox checkBox) {
        String nazwa = checkBox.getId();
        if (nazwa.charAt(3) == 'B') {
            pomiarPrimary1.setImage(brak);
            pomiarB.setImage(pomiar);
            if(nazwa.charAt(4) == '2') {
                pomiarB1_B5.setImage(pomiarB2);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '3') {
                pomiarB1_B5.setImage(pomiarB3);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '4') {
                pomiarB1_B5.setImage(pomiarB4);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '5') {
                pomiarB1_B5.setImage(pomiarB5);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '6') {
                pomiarB1_B5.setImage(brak);
                pomiarB6_B10.setImage(pomiarB6);
            }
            else if(nazwa.charAt(4) == '7') {
                pomiarB1_B5.setImage(brak);
                pomiarB6_B10.setImage(pomiarB7);
            }
            else if(nazwa.charAt(4) == '8') {
                pomiarB1_B5.setImage(brak);
                pomiarB6_B10.setImage(pomiarB8);
            }
            else if(nazwa.charAt(4) == '9') {
                pomiarB1_B5.setImage(brak);
                pomiarB6_B10.setImage(pomiarB9);
            }
            else {
                pomiarB1_B5.setImage(brak);
                pomiarB6_B10.setImage(pomiarB10);
            }
        }
        else if (nazwa.charAt(3) == 'C') {
            clear_pomiarUp();
            pomiarB.setImage(pomiar);
            if(nazwa.charAt(4) == '2') {
                pomiarB1_B5.setImage(PC2);
                pomiarB_C1.setImage(pomiarBC);
                pomiarC1.setImage(pomiar_C2);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '3') {
                pomiarB1_B5.setImage(PC3);
                pomiarB_C2.setImage(pomiarBC);
                pomiarC2.setImage(pomiar_C2);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '4') {
                pomiarB1_B5.setImage(PC4);
                pomiarB_C3.setImage(pomiarBC);
                pomiarC3.setImage(pomiar_C2);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '5') {
                pomiarB1_B5.setImage(PC5);
                pomiarB_C4.setImage(pomiarBC);
                pomiarC4.setImage(pomiar_C2);
                pomiarB6_B10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '6') {
                pomiarB6_B10.setImage(PC6);
                pomiarB_C5.setImage(pomiarBC);
                pomiarC5.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '7') {
                pomiarB6_B10.setImage(PC7);
                pomiarB_C6.setImage(pomiarBC);
                pomiarC6.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '8') {
                pomiarB6_B10.setImage(PC8);
                pomiarB_C7.setImage(pomiarBC);
                pomiarC7.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '9') {
                pomiarB6_B10.setImage(PC9);
                pomiarB_C8.setImage(pomiarBC);
                pomiarC8.setImage(pomiar_C2);
            }
        }
        else if (nazwa.charAt(3) == 'D') {
            clear_pomiarDown();
            pomiarE.setImage(pomiar);
            if(nazwa.charAt(4) == '2') {
                pomiarE1_E5.setImage(PD2);
                pomiarE_D1.setImage(pomiarBC);
                pomiarD1.setImage(pomiar_C2);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '3') {
                pomiarE1_E5.setImage(PD3);
                pomiarE_D2.setImage(pomiarBC);
                pomiarD2.setImage(pomiar_C2);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '4') {
                pomiarE1_E5.setImage(PD4);
                pomiarE_D3.setImage(pomiarBC);
                pomiarD3.setImage(pomiar_C2);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '5') {
                pomiarE1_E5.setImage(PD5);
                pomiarE_D4.setImage(pomiarBC);
                pomiarD4.setImage(pomiar_C2);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '6') {
                pomiarE6_E10.setImage(PD6);
                pomiarE_D5.setImage(pomiarBC);
                pomiarD5.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '7') {
                pomiarE6_E10.setImage(PD7);
                pomiarE_D6.setImage(pomiarBC);
                pomiarD6.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '8') {
                pomiarE6_E10.setImage(PD8);
                pomiarE_D7.setImage(pomiarBC);
                pomiarD7.setImage(pomiar_C2);
            }
            else if(nazwa.charAt(4) == '9') {
                pomiarE6_E10.setImage(PD9);
                pomiarE_D8.setImage(pomiarBC);
                pomiarD8.setImage(pomiar_C2);
            }
        }
        else if (nazwa.charAt(3) == 'E' || nazwa.charAt(3) == 'F') {
            clear_pomiarDown();
            pomiarE.setImage(pomiar);
            if(nazwa.charAt(4) == '2') {
                pomiarE1_E5.setImage(pomiarE2);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '3') {
                pomiarE1_E5.setImage(pomiarE3);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '4') {
                pomiarE1_E5.setImage(pomiarE4);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '5') {
                pomiarE1_E5.setImage(pomiarE5);
                pomiarE6_E10.setImage(pomiar);
            }
            else if(nazwa.charAt(4) == '6') {
                pomiarE1_E5.setImage(brak);
                pomiarE6_E10.setImage(pomiarE6);
            }
            else if(nazwa.charAt(4) == '7') {
                pomiarE1_E5.setImage(brak);
                pomiarE6_E10.setImage(pomiarE7);
            }
            else if(nazwa.charAt(4) == '8') {
                pomiarE1_E5.setImage(brak);
                pomiarE6_E10.setImage(pomiarE8);
            }
            else if(nazwa.charAt(4) == '9') {
                pomiarE1_E5.setImage(brak);
                pomiarE6_E10.setImage(pomiarE9);
            }
            else {
                pomiarE1_E5.setImage(brak);
                pomiarE6_E10.setImage(pomiarE10);
            }
        }
    }

    public void change_vertical(CheckBox checkBox, ImageView image) {
        if (checkBox.isSelected()) {
            checkBox.setDisable(true);

            if (elementy.getValue() == "Przewod") {
                image.setImage(przewod);
            } else if (elementy.getValue() == "Rezystor 100") {
                image.setImage(rezystor100);
                if (czyAktywne(checkBox)) {
                    rezystancja += 100;
                }
            } else if (elementy.getValue() == "Rezystor 330") {
                image.setImage(rezystor330);
                if (czyAktywne(checkBox)) rezystancja += 330;
            } else if (elementy.getValue() == "Rezystor 1k") {
                image.setImage(rezystor1k);
                if (czyAktywne(checkBox)) rezystancja += 1000;
            } else if (elementy.getValue() == "Rezystor 10k") {
                image.setImage(rezystor10k);
                if (czyAktywne(checkBox)) rezystancja += 10000;
            } else if (elementy.getValue() == "Kondensator 100nf") {
                image.setImage(kondensator100nf);
            } else if (elementy.getValue() == "Kondensator 220uf") {
                image.setImage(kondensator220uf);
            } else if (elementy.getValue() == "Kondensator 1000uf") {
                image.setImage(kondensator1000uf);
            } else if (elementy.getValue() == "Dioda LED") {
                image.setImage(dioda_led);
                if(napiecie == 0.009) image.setImage(dioda_ledON);
            }
            set_pomiar(checkBox);
            licz_natezenie();
        }
    }
ArrayList<String> zbior = new ArrayList<>();

    void czyRownolegle(CheckBox checkBox, int rez) {
        int counter = 0;
        for(int i = 0; i < zbior.size(); i++) {
            if (zbior.get(i).charAt(1) == checkBox.getId().charAt(1) && zbior.get(i).charAt(4) == checkBox.getId().charAt(4)) {
                counter++;
            }
        }
        if(counter > 1) {
            System.out.println(rezystancja);
            rezystancja-=2*rez;
            System.out.println(rezystancja);
            rezystancja +=rez*rez/(rez+rez);
            System.out.println(rezystancja);
            char firstChar = checkBox.getId().charAt(0);
            if(firstChar == 'A' || firstChar == 'B' || firstChar == 'C') {
                clear_pomiarUp();
                pomiarPrimary1.setImage(pomiar);
            }
            if(firstChar == 'D' || firstChar == 'E' || firstChar == 'F') {
                clear_pomiarDown();
                pomiarPrimary2.setImage(pomiar);
            }
        }

    }

    public void change_horizontal(CheckBox checkBox, ImageView image) {
        if (checkBox.isSelected()) {
            checkBox.setDisable(true);
            char firstChar = checkBox.getId().charAt(0);
            if(firstChar == 'A' || firstChar == 'B' || firstChar == 'C') clear_pomiarUp();
            if(firstChar == 'D' || firstChar == 'E' || firstChar == 'F') clear_pomiarDown();
            set_pomiar(checkBox);
            if (elementy.getValue() == "Przewod") {
                image.setImage(przewod2);
            } else if (elementy.getValue() == "Rezystor 100") {
                image.setImage(rezystor100_2);
//                if (czyAktywne(checkBox)) {
                    rezystancja += 100;
                    zbior.add(checkBox.getId());
                    System.out.println(zbior);
//                    if(checkBox.getId().charAt(0) == checkBox.getId().charAt(3) &&  == 'B') {
                        czyRownolegle(checkBox, 100);
                        System.out.println(rezystancja);
//                    }
//                }
            } else if (elementy.getValue() == "Rezystor 330") {
                image.setImage(rezystor330_2);
//                if (czyAktywne(checkBox)) {
                    rezystancja += 330;
                    zbior.add(checkBox.getId());
                    System.out.println(zbior);
//                    if(checkBox.getId().charAt(0) == checkBox.getId().charAt(3) &&  == 'B') {
                    czyRownolegle(checkBox, 330);
                    System.out.println(rezystancja);
//                }
            } else if (elementy.getValue() == "Rezystor 1k") {
                image.setImage(rezystor1k_2);
//                if (czyAktywne(checkBox)) {
                    rezystancja += 1000;
                zbior.add(checkBox.getId());
                System.out.println(zbior);
//                    if(checkBox.getId().charAt(0) == checkBox.getId().charAt(3) &&  == 'B') {
                czyRownolegle(checkBox, 1000);
                System.out.println(rezystancja);
//                }
            } else if (elementy.getValue() == "Rezystor 10k") {
                image.setImage(rezystor10k_2);
//                if (czyAktywne(checkBox)) {
                    rezystancja += 10000;
                zbior.add(checkBox.getId());
                System.out.println(zbior);
//                    if(checkBox.getId().charAt(0) == checkBox.getId().charAt(3) &&  == 'B') {
                czyRownolegle(checkBox, 10000);
                System.out.println(rezystancja);
//                }
            } else if (elementy.getValue() == "Dioda LED") {
                image.setImage(dioda_led_2);
                if(napiecie == 0.009) image.setImage(dioda_led_2ON);
            }
            licz_natezenie();
        }
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
