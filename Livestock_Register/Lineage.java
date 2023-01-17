package Livestock_Register;

public class Lineage{

    private int lineageID;
    private int age;

    /**
     * the constructor is used to initialize the new livestock
     *
     * @param id
     * @param age
     */
    public Lineage(int id, int age) {
        this.lineageID = id;
        this.age = age;
    }

    public int getLineageID() {
        return lineageID;
    }

    public int getAge() {
        return age;
    }

}
