package ifpr.pgua.eic.colecaomusicas.controllers;

import ifpr.pgua.eic.colecaomusicas.App;
import io.github.hugoperlin.navigatorfx.BorderPaneRegion;
import javafx.fxml.FXML;
import javafx.util.Callback;

public class Principal {
    

    @FXML
    private void cadastrarGenero(){
        //App.pushScreen("CADASTROGENERO");
        App.changeScreenRegion("CADASTROGENERO",BorderPaneRegion.CENTER);
    }

    @FXML
    private void cadastrarArtista(){
        //App.pushScreen("CADASTROARTISTA");
        App.changeScreenRegion("CADASTROARTISTA", BorderPaneRegion.CENTER);
    }

    @FXML
    private void listarGeneros(){
        //App.pushScreen("LISTARGENEROS");
        App.changeScreenRegion("LISTARGENRO", BorderPaneRegion.CENTER);
    }

    @FXML
    private void listarArtistas(){
        App.pushScreen("LISTARARTISTAS");
    }

        @FXML
    private void cadastrarMusica(){
        App.pushScreen("CADASTRARMUSICA");
    }

    @FXML
    private void listarMusicas(){
        App.pushScreen("LISTARMUSICAS");
    }

    @FXML
    private void cadastrarPlaylist(){
        App.pushScreen("CADASTRARPLAYLIST");
    }

    @FXML
    private void listarPlaylists(){
        App.pushScreen("LISTARPLAYLISTS");
    }

}
