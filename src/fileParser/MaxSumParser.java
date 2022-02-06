package fileParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaxSumParser implements Parser{
    @Override
    public int parse(String filename) {
        try{
            int sum = 0;
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                int value = Integer.parseInt(line.strip());
                if(isPositive(value)){
                    sum += value;
                }
            }
            fileReader.close();
            bufferedReader.close();
            return sum;
        }catch (IOException ioe){
            System.out.println("Something went wrong reading " + filename);
            return 0;
        }
    }

    public boolean isPositive(int x){
        return x >= 0;
    }
}
