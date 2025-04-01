package com.eventpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import com.eventpro.management.Luogo;
import com.eventpro.management.Luoghi;
import com.eventpro.management.Evento;
import com.eventpro.management.Eventi;
import java.io.IOException;

/**
 * JavaFX App
 * Applicazionie JavaFX per la gestione di eventi musicali
 */
public class App extends Application {

    private static Scene scene;
    public static Luoghi luoghi = new Luoghi();
    public static Eventi eventi = new Eventi();
    public static Evento currentEvento = null;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("eventi"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        initEventi();
        launch();
    }

    private static void initEventi() {
        // creazione eventi
        Evento evento1 = new Evento("Firenze Rocks", luoghi.getLuogo(0), "16 giugno 2025", "Festival di musica rock");
        Evento evento2 = new Evento("IDays", luoghi.getLuogo(1), "8 luglio 2025", "Festival di musica pop");
        Evento evento3 = new Evento("Mind Festival", luoghi.getLuogo(2), "27 luglio 2025", "Il più grande festival marchigiano");

        eventi.aggiungiEvento(evento1);
        eventi.aggiungiEvento(evento2);
        eventi.aggiungiEvento(evento3);
    }

}