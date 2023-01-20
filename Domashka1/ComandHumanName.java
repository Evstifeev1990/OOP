package Domashka1;

public class ComandHumanName implements Option {
    
    View view;

    public ComandHumanName(View view) {
        this.view = view;
    }
    
    
    @Override
    public void execute() { 
        view.comandHumanName();     
    }

    @Override
    public String description() {
        return "Поиск человека по имени";
    }
}
