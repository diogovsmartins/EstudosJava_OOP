module com.example.java_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bytebank_encapsulado to javafx.fxml;
    exports Bytebank_encapsulado;
    opens Bytebank_encapsulado to javafx.fxml;
}