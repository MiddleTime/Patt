package MVC2.view;

import MVC2.model.Model;
import MVC2.controller.Controller;

public interface View {
    void dispose();

    void setController(Controller controller);

    void setModel(Model model);

    void show();
}
