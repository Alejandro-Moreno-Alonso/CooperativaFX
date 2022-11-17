module com.example.cooperativafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cooperativafx to javafx.fxml;
    exports com.example.cooperativafx;
}