package pl.developerpi91.wzorce.obserwator;

public class Observator implements Observer {

    public String observatorName;
    public String observatorEmail;


    public Observator(String observatorName, String observatorEmail) {
        this.observatorName = observatorName;
        this.observatorEmail = observatorEmail;
    }

    @Override
    public void update() {

        System.out.println("Dear " + this.observatorName + " We have some news for you !!!");
    }
}
