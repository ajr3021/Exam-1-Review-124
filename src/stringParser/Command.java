package stringParser;

public abstract class Command {
    String[] args;
    public abstract void execute();
    public void parse(String[] input){
        this.args = new String[input.length - 1];
        for(int i = 1; i < input.length; i++){
            this.args[i - 1] = input[i];
        }
    }
}
