public class Programmer {
    private String name;
    private String company;
    private String position;

    int stage;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition(){
        return position;
    }

    public void work(){
        this.stage++;
        switch(stage){
            case 1:
                position = "junior";
                break;
            case 2:
                position = "middle";
                break;
            case 3:
                position = "senior";
                break;
            case 4:
                position = "lead";
        }
    }
}
