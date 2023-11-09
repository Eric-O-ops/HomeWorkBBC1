module com.eric.homeworkbbc1 {
    requires kotlin.stdlib;

    opens com.eric.homeworkbbc1 to javafx.fxml;
    exports com.eric.homeworkbbc1;
    exports com.eric.homeworkbbc1.module1;
    opens com.eric.homeworkbbc1.module1 to javafx.fxml;
}