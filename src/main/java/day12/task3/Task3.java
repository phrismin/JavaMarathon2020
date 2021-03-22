package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(List.of(
                new MusicBand("Linkin Park", 1996),
                new MusicBand("Nirvana", 1986),
                new MusicBand("Nickelback", 1995),
                new MusicBand("Noisia", 2003),
                new MusicBand("Above & Beyond", 2000),
                new MusicBand("Led Zeppelin", 1968),
                new MusicBand("Metallica", 1981),
                new MusicBand("LMFAO", 2006),
                new MusicBand("MBAND", 1996),
                new MusicBand("IC3PEAK", 2013),
                new MusicBand("Serebro", 2007)

        ));
        System.out.println(musicBandList);
        Collections.shuffle(musicBandList);
        System.err.println(groupsAfter2000(musicBandList));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandListAfter2000 = new ArrayList<>();
        MusicBand currentMusicBand;
        for (int i = 0; i < bands.size(); i++) {
            currentMusicBand = bands.get(i);
            if (currentMusicBand.getYear() > 2000) {
                musicBandListAfter2000.add(currentMusicBand);
            }
        }
        return musicBandListAfter2000;
    }
}
