public class Main {
    public static void main(String[] args) {
        MagicBox<String> itemMagicBox = new MagicBox<>(10);
        MagicBox<Integer> numberMagicBox = new MagicBox<>(6);

        itemMagicBox.add("Boot");
        itemMagicBox.add("Ball");
        itemMagicBox.add("Umbrella");
        itemMagicBox.add("Gum");
        itemMagicBox.add("Pen");
        itemMagicBox.add("Ruler");
        itemMagicBox.add("Tyre");
        itemMagicBox.add("Guitar");
        itemMagicBox.add("Bottle");
        itemMagicBox.add("Cell-phone");
        itemMagicBox.add("Book");

        numberMagicBox.add(1);
        numberMagicBox.add(2);
        numberMagicBox.add(3);
        numberMagicBox.add(4);
        numberMagicBox.add(5);
        numberMagicBox.add(6);
        numberMagicBox.add(7);

        System.out.println(itemMagicBox.pick());
        System.out.println(numberMagicBox.pick());
    }
}
