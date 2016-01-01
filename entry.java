import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Administrator on 12/31/2015.
 */
public class entry {

    public static void main(String args[])
    {
        if(args.length != 1)
        {
            System.out.println("1 argument should be provided. "+args.length+ "given.");
            return;
        }

        File inputJSON = new File(args[0]);
        char inBuf[] = new char[1024];

        try {
            new BufferedReader(new FileReader(inputJSON)).read(inBuf);
        } catch (IOException e) {
            System.out.println("File: "+ args[0]+" Not Found!");
            return;
        }

    }
    static String[][] fromJSON(char[] inBuf)
    {
        ArrayList<String> types = new ArrayList<>();
        ArrayList<String> vars = new ArrayList<>();


        //TODO: Parse JSON
        return new String[][]{(String[])types.toArray(),(String[])vars.toArray()};
    }

    static void toClass(File outputFile, String[][] vars)
    {



    }
    static void toClass(File outFile, char[] inBuff)
    {
        String[][] vars = fromJSON(inBuff);

    }
}
