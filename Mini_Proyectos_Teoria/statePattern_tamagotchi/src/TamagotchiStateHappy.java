public class TamagotchiStateHappy implements TamagotchiState{
    @Override
    public TamagotchiState giveFun() {
        return this;
    }

    @Override
    public TamagotchiState giveFood() {
        return new TamagotchiStateTired();
    }

    @Override
    public TamagotchiState giveRest() {
        return new TamagotchiStateHungry();
    }
}
