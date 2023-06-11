package com.example.vocabulary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class HelloController {
    public ListView ListView = new ListView<>();


    public void action(ActionEvent actionEvent) throws IOException {
        Scanner text = new Scanner(new FileReader("src/main/resources/com/example/vocabulary/words.txt")).useDelimiter(",\\n");
        String collection;

        while(text.hasNext()){
            collection = text.next();
            ListView.getItems().add(collection);
        }
    }
}