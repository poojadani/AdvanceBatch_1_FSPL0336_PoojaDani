interface Playable
{
    public abstract void play();
}

class Guitar implements Playable {
    public void play()
    {
        System.out.println("Playing with Guitar");
    }
}
class Piano implements Playable {
    public void play()
    {
        System.out.println("Playing with Piano");
    }
}
public class InterfaceEx_Playable
{
    public static void main(String[] args) {
        Playable p1=new Guitar();
        p1.play();

        Playable p2= new Piano();
        p2.play();
    }
}
/*OUTPUT
Playing with Guitar
Playing with Piano

 */