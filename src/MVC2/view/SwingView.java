package MVC2.view;

import MVC2.model.Model;
import MVC2.controller.Controller;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class SwingView implements ActionListener, View {
    private JFrame frame;
    private JList<String> list;
    private JButton add;
    private JButton remove;
    private JTextField field;
    private Controller controller;

    public SwingView() {
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            controller.addAction(field.getText());
        } else if (e.getSource() == remove) {
            controller.removeAction(list.getSelectedValue());
            list.clearSelection();
        }
    }

    @Override
    public void dispose() {
        frame.dispose();
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(Model model) {
        list.setModel(new ModelWrapper(model));
    }

    @Override
    public void show() {
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }

    private void initComponents() {
        frame = new JFrame("List");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        frame.setSize(new Dimension(500, 150));
        frame.setContentPane(mainPanel);

        list = createList();
        mainPanel.add(list);

        field = createField();
        mainPanel.add(field);

        add = createButton("Add");
        mainPanel.add(add);

        remove = createButton("Remove");
        mainPanel.add(remove);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        button.setEnabled(false);

        return button;
    }

    private JTextField createField() {
        JTextField textField = new JTextField(15);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateAddButtonState();
            }

            private void updateAddButtonState() {
                add.setEnabled(!field.getText().isEmpty());
            }
        });

        return textField;
    }

    private JList<String> createList() {
        JList<String> jList = new JList<>();
        jList.setPreferredSize(new Dimension(100, 100));
        jList.addListSelectionListener(e -> remove.setEnabled(!list.isSelectionEmpty()));
        return jList;
    }

    private class ModelWrapper extends AbstractListModel<String> implements Observer {
        private Model model;

        public ModelWrapper(Model model) {
            this.model = model;
            model.addObserver(this);
        }

        @Override
        public String getElementAt(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }

        @Override
        public void update(Observable o, Object arg) {
            fireContentsChanged(this, 0, model.size());
        }
    }
}

