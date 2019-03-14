package MVC2.controller;

import MVC2.model.Model;
import MVC2.view.View;

public interface Controller {
    void addAction(String text);

    void removeAction(String text);

    void setModel(Model model);

    void setView(View view);

    void start();
}

