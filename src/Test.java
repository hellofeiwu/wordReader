import java.io.*;

public class Test {
    public static void main(String[] args) {
        File f = new File("j.txt");
        try {
            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop);

            writer.append("中午");
            writer.close();
            fop.close();

            FileInputStream fip = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fip);
            System.out.println((char)reader.read());

        }catch (IOException e) {

        }

    }
}