public class Tamagotchi{
    private TamagotchiState tamagotchiState;

    public Tamagotchi() {
        this.tamagotchiState = new TamagotchiStateHappy();
    }

    public void play(){
        this.tamagotchiState = this.tamagotchiState.giveFun();
    }

    public void eat(){
        this.tamagotchiState = this.tamagotchiState.giveFood();
    }

    public void sleep(){
        this.tamagotchiState = this.tamagotchiState.giveRest();
    }
}
