package day12.task5;

import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, new LinkedList<>(new LinkedList<>(List.of(
                new MusicArtist("Chester Bennington", 30),
                new MusicArtist("Mike Shinoda", 33)
        ))));

        MusicBand nickelback =  new MusicBand("Nickelback", 1995, new LinkedList<>(new LinkedList<>(List.of(
                new MusicArtist("Chad Kroeger", 38),
                new MusicArtist("Ryan Peake", 36)
        ))));

        MusicBand.transferMembers(linkinPark, nickelback);

        System.out.println(linkinPark.printMembers());
        System.out.println(nickelback.printMembers());
    }
}
