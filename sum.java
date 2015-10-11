public class sum{
    private int Sum;
    public sum(){
        this.Sum = 0;
    }
    public sum(int value){
        this.Sum = value;
    }
    public void add(int value){
        this.Sum = this.Sum + value;
    }
    public int getSum(){
        return this.Sum;
    }
}