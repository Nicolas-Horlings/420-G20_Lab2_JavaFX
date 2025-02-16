package com.site.demolab2;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class GUIController4 {

    @FXML
    private Circle outerCircle;

    @FXML
    private void handleEnlarge() {
        outerCircle.setRadius(outerCircle.getRadius() + 1);
    }

    @FXML
    private void handleShrink() {
        outerCircle.setRadius(outerCircle.getRadius() - 1);
    }
}
