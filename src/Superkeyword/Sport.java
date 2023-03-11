package Superkeyword;

public class Sport {
    String name;
    String country;

    Sport(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void display() {
        System.out.println(name + " is played in " + country);
    }
}

    class Hockey extends Sport {
        String cleets;

        Hockey(String name, String cleets, String country) {
            super(name, country);
            this.cleets = cleets;

        }

    }
class Soccer extends Sport{
    String team;
    int numberofplayers;
    Soccer(String name,String country,String team,int numberofplayers){
        super(name,country);
        this.team=team;
        this.numberofplayers=numberofplayers;
    }
    void displayTeam(){
        System.out.println(team+" consists of"+"numberofplayers"+numberofplayers);
    }
}