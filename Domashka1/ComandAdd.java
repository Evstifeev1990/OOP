package Domashka1;

public class ComandAdd implements Option {

    View view;


    public ComandAdd(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.comandAdd();      
    }

    @Override
    public String description() {
        return "Добавление человека в дерево";
    }
}
