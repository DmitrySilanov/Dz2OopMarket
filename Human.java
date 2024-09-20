public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean flag) {
        super.isMakeOrder = flag;

    }

    @Override
    public void setTakeOrder(boolean flag) {
        super.isTakeOrder = flag;

    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public String toString() {
        return "Name: "+ getName();
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;


    }
}
