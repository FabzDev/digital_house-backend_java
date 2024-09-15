public class TamagotchiStateHungry implements TamagotchiState{
    @Override
    public TamagotchiState giveFun() {
        return this;
    }

    @Override
    public TamagotchiState giveFood() {
        return new TamagotchiStateHappy();
    }

    @Override
    public TamagotchiState giveRest() {
        return this;
    }
}
