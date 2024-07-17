package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.FavoriteSinger;
import ku.cs.services.FXRouter;

import java.io.IOException;


public class SingerController {
        @FXML
        private Label name1,lastname1,name2,lastname2,name3,lastname3,name4,lastname4,name5,lastname5,age1,age2,age3,age4,age5;


        @FXML
        public void initialize() {
            FavoriteSinger info1 = new FavoriteSinger("PUN","YARB",2003);
            FavoriteSinger info2 = new FavoriteSinger("NONT","TANONT",1996);
            FavoriteSinger info3 = new FavoriteSinger("MAX","JENMANA",1989);
            FavoriteSinger info4 = new FavoriteSinger("JUSTIN","BIEBER",1994);
            FavoriteSinger info5 = new FavoriteSinger("JEFF","SATUR",1995);
            showName(info1,info2,info3,info4,info5);
        }

        private void showName(FavoriteSinger info1,FavoriteSinger info2,FavoriteSinger info3,FavoriteSinger info4,FavoriteSinger info5) {
            int currentYear = 2024;
            name1.setText(info1.getName());
            lastname1.setText(info1.getLastName());
            age1.setText(info1.getBirthyear());

            name2.setText(info2.getName());
            lastname2.setText(info2.getLastName());
            age2.setText(info2.getBirthyear());

            name3.setText(info3.getName());
            lastname3.setText(info3.getLastName());
            age3.setText(info3.getBirthyear());

            name4.setText(info4.getName());
            lastname4.setText(info4.getLastName());
            age4.setText(info4.getBirthyear());

            name5.setText(info5.getName());
            lastname5.setText(info5.getLastName());
            age5.setText(info5.getBirthyear());

        }
    @FXML
    public void onBackButtonClick() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

