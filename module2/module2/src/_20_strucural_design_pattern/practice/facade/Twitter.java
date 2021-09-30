package _20_strucural_design_pattern.practice.facade;

public class Twitter implements SocialShare {
    private  String message;
    @Override
    public void setMessage(String message) {
        this.message = message;

    }

    @Override
    public void share() {
        System.out.println("sharing"+ this.message);

    }
}
