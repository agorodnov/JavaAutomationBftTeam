package Box;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BoxCollection {
    private List<Box> boxes;
    private List<Box> largeBox;

    public BoxCollection() {
        boxes = new ArrayList<>();
        largeBox = new ArrayList<>();
    }

    public void addBox (Box box) {
        boxes.add(box);
    }
    public void moveLargeBoxes() {
        Iterator<Box> iterator = boxes.iterator();   ///Создаем итератор для перебора коробок
        while (iterator.hasNext()){
            Box box = iterator.next();
            if (box.getWidth()> 30) {  /// Условие проверяет ширину коробки///
                largeBox.add(box);      //// Переместить в коллекцию больших коробок///
                iterator.remove();          /// Удалить коробку
            }
        }
    }
    @Override
    public String toString() {
        return "BoxCollection{" +
                "boxes=" + boxes +
                ", largeBoxes=" + largeBox +
                '}';
    }
}
