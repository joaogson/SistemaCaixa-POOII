module com.example.sistemacaixa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.compiler;
    requires java.sql;


    opens com.example.sistemacaixa to javafx.fxml;
    exports com.example.sistemacaixa;
}