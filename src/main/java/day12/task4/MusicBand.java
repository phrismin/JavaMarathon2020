package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<String> membersBandA = bandA.getMembers();
        List<String> membersBandB = bandB.getMembers();
        membersBandB.addAll(membersBandA);
        bandA.getMembers().removeAll(membersBandA);
        bandB.setMembers(membersBandB);
    }


    public String printMembers() {
        String result= "";
        for (String member : members) {
            result += member + "\n";
        }
        return result;
    }

}