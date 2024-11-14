interface MediaPlayer
{
    public void play();
    public void stop();
}
class AudioPlayer implements MediaPlayer
{
    public void play()
    {
        System.out.println("Audio Player is started ,Format is MP3");
    }
    public void stop()
    {
        System.out.println("Audio Player is stopped...");
    }
}


class VedioPlayer implements MediaPlayer
{
    public void play()
    {
        System.out.println("Video Player is started ,Format is MP4");
    }
    public void stop()
    {
        System.out.println("Video Player is stopped...");
    }
}

public class MediaPlayer_Interface
{
    public static void main(String[] args) {
        AudioPlayer a1= new AudioPlayer();
        a1.play();
        a1.stop();
        VedioPlayer v1= new VedioPlayer();
        v1.play();
        v1.stop();
    }
}
/*OUTPUT
Audio Player is started ,Format is MP3
Audio Player is stopped...
Vedio Player is started ,Format is MP4
Video Player is stopped...
 */