/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etf.openpgp.ad160262d.GUI;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ZP_Projekat extends Application {

    private MenuBar menuBar = new MenuBar();
    private Menu key_menu = new Menu("Key operations");
    private Menu mess_menu = new Menu ("Messige operations");
    private MenuItem keyimpu = new MenuItem("Import Public Key");
    private MenuItem keyimpr = new MenuItem("Import PrivateKey");
    private MenuItem keyexpu = new MenuItem("Export Public Key");
    private MenuItem keyexpr = new MenuItem("xport Public Key");
    
    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("OpenPGP client");
        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Keys");
        Tab tab2 = new Tab("Messages");        
        VBox root = new VBox();
        menuBar.getMenus().add(key_menu);
        key_menu.getItems().add(keyimpu);
        key_menu.getItems().add(keyimpr);
        key_menu.getItems().add(keyexpu);
        key_menu.getItems().add(keyexpr);
        menuBar.getMenus().add(mess_menu);
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        root.getChildren().add(menuBar);
        root.getChildren().add(tabPane);
        primaryStage.setScene(new Scene(root, 750, 750));
        primaryStage.show();
    }
     
    public static void main(String[] args){
        launch();
    }
    
}
