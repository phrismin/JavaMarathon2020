package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<MusicArtist> membersBandA = bandA.getMembers();
        List<MusicArtist> membersBandB = bandB.getMembers();
        membersBandB.addAll(membersBandA);
        bandA.getMembers().removeAll(membersBandA);
        bandB.setMembers(membersBandB);
    }


    public String printMembers() {
        String result= "";
        for (MusicArtist member : members) {
            result += member + "\n";
        }
        return result;
    }

}