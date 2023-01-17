package Livestock_Register;

/**
 * This class is meant to keep track of the livestock.
 * ID, age, gender, medical history, how many births.
 */
public class Livestock extends Lineage {

    private int id;
    private int age;
    private String gender;
    private int immunizations;
    private int births;

    /**
     * the constructor is used to initialize the new livestock
     * 
     * @param id
     * @param lineageID
     * @param lineageAge
     * @param immunizations
     * @param gender
     */
    public Livestock(int id, int lineageID, int lineageAge, int immunizations, String gender) {
        super(lineageID, lineageAge);
        this.immunizations = immunizations;
        this.gender = gender;
        this.id = id;
        this.births = 0;
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /***
     * @param immunized
     */
    public void updateImmunizations(int immunized) {
        this.immunizations += immunized;
    }

    /**
     * @param birth
     */
    public void updateBirths(int birth) {
        this.births += birth;
    }

    public int getId() {
        return this.id;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public int getImmunizations() {
        return this.immunizations;
    }

    public int getBirths() {
        return this.births;
    }

    @Override
    public String toString() {
        return "*".repeat(20) + "\nDetails for livestock: " + this.getId() + "\nGender: " + this.getGender() + "\nAge: " + this.getAge() 
        + "\nImmunizations: " + this.getImmunizations() +"\nBirths: " + this.getBirths() + "\nLineage: " + this.getLineageID() + "\n" + "*".repeat(20);

        // return super.toString();
    }
}
