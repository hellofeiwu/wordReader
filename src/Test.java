import java.io.*;

public class Test {
    public static void main(String[] args) {
        File f = new File("j.txt");
        try {
            FileInputStream fip = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fip);

            StringBuffer sb = new StringBuffer();

            while(reader.ready()) {
                char currentChar = (char)reader.read();
                sb.append(currentChar);
                if(currentChar == '\n' || currentChar == '\r') {
                    sb.append("haha\n");
                }
            }

            System.out.println(sb);
            reader.close();
            fip.close();

            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop);

            writer.append(sb);
            writer.close();
            fop.close();

        }catch (IOException e) {

        }

    }
}