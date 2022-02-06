package stringParser;

public class Long extends Command{
    @Override
    public void execute() {
        String longestWord = "";
        int longestLength = 0;

        for(int i = 0; i < super.args.length; i++){
            if(super.args[i].length() > longestLength){
                longestLength = super.args[i].length();
                longestWord = super.args[i];
            }
        }

        System.out.println(longestWord);
    }
}
