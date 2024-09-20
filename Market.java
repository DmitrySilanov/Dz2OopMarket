import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> actors = new ArrayList<Actor>();
    private final List<Human> queue = new ArrayList<>();


    public List<Actor> getActors() {
        return actors;
    }

    public List<Human> getQueue() {
        return queue;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }


    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();

        if (getQueue().getFirst().setTakeOrder(false);


        System.out.println("If "+getQueue().getFirst().getName()+" reserve your order, you leave the queue");
        System.out.println(getQueue().getFirst().isTakeOrder);
        System.out.println("and "+getQueue().getFirst().getName()+" leaves the store");
        releaseFromQueue();
        releaseFromMarket(actors);
    }


    @Override
    public void giveOrders() {
        if (getQueue().getFirst().isMakeOrder) {

            getQueue().getFirst().setTakeOrder(true);
            System.out.println("If "+getQueue().getFirst().getName()+" make is order, he gets it");
            System.out.println(getQueue().getFirst().isTakeOrder);
        }
    }

    @Override
    public void releasedFromQueue() {
        queue.removeFirst();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.addLast((Human) actor);
    }


    @Override
    public void takeOrders() {
        getQueue().getFirst().setMakeOrder(true);
        System.out.println(getQueue().getFirst().getName()+" makes an order");
        System.out.println(getQueue().getFirst().isMakeOrder);
    }

}

