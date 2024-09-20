import java.util.List;

public interface MarketBehaviour {

    void acceptMarket(Actor actor);

    void releaseFromMarket(List<Actor> actorList);

    void update();

    void giveOrders();

    void releasedFromQueue();

    void takeOrders();
}
