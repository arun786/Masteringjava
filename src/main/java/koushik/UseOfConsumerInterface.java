package koushik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Adwiti on 7/24/2017.
 */
public class UseOfConsumerInterface {
    public static void main(String[] args) {

        List<Container> containers = Arrays.asList(new Container("BlackContainer", 100), new Container("WhiteContainer", 200), new Container("BlueContainer", 300));
        findAllContainer(containers, e -> System.out.println(e.getNameOfcontainer()));
        findAllContainer(containers, e -> System.out.println(e.getPrice()));
        findAllContainerUsingFilter(containers, e -> e.getPrice() > 100, e -> System.out.println(e.getNameOfcontainer() + " : " + e.getPrice()));
    }

    static void findAllContainer(List<Container> containers, Consumer<Container> printer) {
        containers.forEach(container -> {
            printer.accept(container);
        });
    }

    static void findAllContainerUsingFilter(List<Container> containers, Predicate<Container> predicate, Consumer<Container> printer) {
        containers.forEach(container -> {
            if (predicate.test(container)) {
                printer.accept(container);
            }
        });
    }
}

class Container {
    private String nameOfcontainer;
    private Integer price;

    public Container(String nameOfcontainer, Integer price) {
        this.nameOfcontainer = nameOfcontainer;
        this.price = price;
    }

    public String getNameOfcontainer() {
        return nameOfcontainer;
    }

    public void setNameOfcontainer(String nameOfcontainer) {
        this.nameOfcontainer = nameOfcontainer;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
