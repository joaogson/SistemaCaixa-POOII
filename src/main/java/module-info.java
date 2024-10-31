module com.example.sistemacaixa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sistemacaixa to javafx.fxml;
    exports com.example.sistemacaixa;
}