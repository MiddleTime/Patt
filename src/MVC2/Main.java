/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC2;

import MVC2.model.Model;
import MVC2.controller.Controller;
import MVC2.controller.DefaultController;
import MVC2.controller.DoNothingController;
import MVC2.view.SwingView;
import MVC2.view.View;

import java.util.Objects;

public class Main {
    private Model model;
    private View view;
    private Controller controller;

    private Main(Model model, View view, Controller controller) {
        this.model = model;
        this.view = view;
        this.controller = controller;
        init();
    }

    public static void main(String[] args) {
        Controller controller = makeController(args);
        Main main = new Main(new Model(), new SwingView(), controller);

        main.start();
    }

    static Controller makeController(String... args) {
        Controller controller = new DefaultController();
        for (String arg : args) {
            if (Objects.equals(arg, "-nothing")) {
                controller = new DoNothingController();
            }
        }
        return controller;
    }

    void start() {
        controller.start();
    }

    private void init() {
        view.setModel(model);
        view.setController(controller);
        controller.setView(view);
        controller.setModel(model);
    }
}