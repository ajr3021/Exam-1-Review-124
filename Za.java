package stringParser;

public class Za extends Command{
    @Override
    public void execute() {
        String lastWord = super.args[0];

        for(int i = 0; i < super.args.length; i++){
            if(super.args[i].charAt(0) > lastWord.charAt(0)){
                lastWord = super.args[i];
            }
        }

        System.out.println(lastWord);
    }
}
