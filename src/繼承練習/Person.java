package 繼承練習;

public class Person {
    private String name;
    private int grand;
    private String rank;
    
    public Person(String name, int grand) {
        this.name = name;
        this.grand = grand;
        this.rank = ""; 
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 要設定的 name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank 要設定的 rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }
}
