package mooc.vandy.java4android.diamonds.recycler;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {

    private List<Friends> listOfFriends = new ArrayList<>();

    public FakeDatabase(){
        listOfFriends.add(new Friends("1","", "Harold Rhoads",80,"2302","30"));
        listOfFriends.add(new Friends("2","", "Phyllis Woods",35,"2127","30"));
        listOfFriends.add(new Friends("3","", "Frank Guy",90,"1992","28"));
        listOfFriends.add(new Friends("4","", "Corinne Gregg",10,"1942","28"));
        listOfFriends.add(new Friends("5","", "Alan Foland",70,"1864","26"));
        listOfFriends.add(new Friends("6","", "Arthur Rice",40,"1856","26"));
        listOfFriends.add(new Friends("7","", "Shannon Fitzpatrick",70,"1832","26"));
        listOfFriends.add(new Friends("8","", "Beverly",95,"1791","25"));
        listOfFriends.add(new Friends("9","", "Sandra",50,"1782","25"));
        listOfFriends.add(new Friends("10","", "Harold Rhoads",50,"2302","30"));
    }

    public List<Friends> getListOfFriends() {
        return listOfFriends;
    }
}
