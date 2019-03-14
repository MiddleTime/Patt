package MVC2.controller;

import MVC2.model.Model;
import MVC2.view.View;

public abstract class AbstractController implements Controller {
    protected Model model;
    protected View view;

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void start() {
        view.show();
    }
}
