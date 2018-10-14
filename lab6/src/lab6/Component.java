package lab6;

public interface Component {
    void printDescription() ;
    void addChild(Component c);
    void removeChild(Component c);
    int getChildCount();
    Component getChild(int i);
    
    void setStrategy(SortingStrategy s);
    String getDescription();
 }
