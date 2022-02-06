package stringParser;

public class Az extends Command{
    @Override
    public void execute() {
        String firstWord = super.args[0];

        for(int i = 0; i < super.args.length; i++){
            if(super.args[i].charAt(0) < firstWord.charAt(0)){
               firstWord = super.args[i];
            }
        }

        System.out.println(firstWord);
    }
}
