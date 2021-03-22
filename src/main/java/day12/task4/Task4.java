package day12.task4;

import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, new LinkedList<>(List.of(
                "Chester Bennington",
                "Mike Shinoda"
        )));
        MusicBand nickelback =  new MusicBand("Nickelback", 1995, new LinkedList<>(List.of(
                "Chad Kroeger",
                "Ryan Peake"
        )));

        MusicBand.transferMembers(linkinPark, nickelback);

        System.out.println(linkinPark.printMembers());
        System.out.println(nickelback.printMembers());
    }
}
