package ua.hillel.zirukin.lessons.lesson13;

public class MusicStyles {
    public void playMusic() {
        System.out.println("Playing generic music...");
    }

    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicOrchestra = new ClassicMusic();

        MusicStyles[] musicBands = {popBand, rockBand, classicOrchestra};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music...");
    }
}

class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music...");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classical music...");
    }
}
