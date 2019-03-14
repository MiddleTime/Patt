package MVC1.view;

import MVC1.model.Model;
import MVC1.controller.Controller;

public interface View {
    void dispose();

    void setController(Controller controller);

    void setModel(Model model);

    void show();
}
