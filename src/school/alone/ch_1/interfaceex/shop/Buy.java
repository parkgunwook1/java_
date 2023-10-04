package school.alone.ch_1.interfaceex.shop;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("구메주문");
    }
}
