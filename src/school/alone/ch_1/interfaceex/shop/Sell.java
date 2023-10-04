package school.alone.ch_1.interfaceex.shop;

public interface Sell {
        void sell();

        default void order() {
                System.out.println("구메주문");
        }
}
