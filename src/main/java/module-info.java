module com.example.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.postgresql.jdbc;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    exports Frontend;
    exports Backend;
}