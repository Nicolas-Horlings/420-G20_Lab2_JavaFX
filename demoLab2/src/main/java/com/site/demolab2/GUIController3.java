package com.site.demolab2;

import javafx.fxml.FXML;
import javafx.stage.*;

public class GUIController3 {
   @FXML
   private void handleExit() {
       Stage stage = (Stage) Stage.getWindows().filtered(window -> window.isShowing()).get(0);
       stage.close();
   }
}
