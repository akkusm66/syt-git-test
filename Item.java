public record Item(String name,double cost){

    public Item{
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Sie haben keinen Namen gefügt ! Bitte erneut eingeben :");
        }
        if(cost < 0){
            throw new IllegalArgumentException("Kosten dürfen nicht negativ sein!");
        }
    }
    public Item(String name){
        this(name, 0);
    }
    @Override
    public String toString(){
        return "Name des Items :" + name + ", Kosten des Items" + cost "€" ;
    }
    public int betragInteger(){
        return (int) Math.rounf(cost);
    }
}