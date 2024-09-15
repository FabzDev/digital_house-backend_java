public class TamagotchiStateTired implements TamagotchiState{
    @Override
    public TamagotchiState giveFun() {
        return this;
    }

    @Override
    public TamagotchiState giveFood() {
        return this;
    }

    @Override
    public TamagotchiState giveRest() {
        return new TamagotchiStateHappy();
    }
}
