module com.example.gui.main{
        requires javafx.controls;
        requires javafx.fxml;

        requires org.controlsfx.controls;
        requires com.dlsc.formsfx;
        requires org.kordamp.ikonli.javafx;
        requires org.kordamp.bootstrapfx.core;
        requires org.jsoup;
//    requires itextpdf;
    requires itextg;

    opens com.example.gui to javafx.fxml;
        exports com.example.gui;
}