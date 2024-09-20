public class Main {
    public static void main(String[] args) {

        StringBuilder h;
        Market market1 = new Market();
        for (int i = 0; i < 20; i++) {
            h = new StringBuilder("human_" + i);
            Human human = new Human(h.toString());
            market1.acceptToMarket(human);
        }

        System.out.println("visitors : "+market1.getActors());

        for (Actor human: market1.getActors()) {
            market1.takeInQueue(human);
        }

        System.out.println("Queue : "+market1.getQueue());
        while (!market1.getActors().isEmpty()) {

            market1.update();
        }

        System.out.println("visitors : "+market1.getActors());
        System.out.println("Queue : "+market1.getQueue());
    }
}