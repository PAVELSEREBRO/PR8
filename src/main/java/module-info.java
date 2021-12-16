module com.example.pr8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.gibo01.pr8 to javafx.fxml;
    exports ru.mirea.gibo01.pr8;
}