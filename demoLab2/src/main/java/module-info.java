module com.site.demolab2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.site.demolab2 to javafx.fxml;
    exports com.site.demolab2;
}