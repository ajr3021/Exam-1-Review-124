package stringParser;

public class Short extends Command{
    @Override
    public void execute() {
        String shortestWord = super.args[0];
        int shortestLength = super.args[0].length();

        for(int i = 0; i < super.args.length; i++){
            if(super.args[i].length() < shortestLength){
                shortestLength = super.args[i].length();
                shortestWord = super.args[i];
            }
        }

        System.out.println(shortestWord);
    }
}
