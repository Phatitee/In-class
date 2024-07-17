package ku.cs.application;

import ku.cs.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "FavoriteSinger");
        configRoute();
        FXRouter.goTo("Personal");

    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("student-list", viewPath + "student-list.fxml");
        FXRouter.when("FavoriteSinger", viewPath + "Singer.fxml");
        FXRouter.when("Personal", viewPath + "Personal.fxml");

    }

    public static void main(String[] args) {
        launch();
    }
}