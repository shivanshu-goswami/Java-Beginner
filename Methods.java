class Computer{
    public void playMusic(){
        System.out.println("Music is Playing");
    }

    public String giveMePen(int cost){
        if(cost>=10) return "Pen";
        return "Nothing";
    }
}

public class Methods {
    public static void main(String a[]){
        Computer obj = new Computer();
        obj.playMusic();
        String res= obj.giveMePen(2);
        System.out.println(res);
    }
}
