import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File f = new File("j.txt");
        try {
            FileInputStream fip = new FileInputStream(f);

            Scanner sc = new Scanner(fip);
            StringBuffer sb = new StringBuffer();

            List<String> words = new LinkedList<>();
            while (sc.hasNext()){
                String current = sc.next();
                if (!current.equals("haha")) {
                    words.add(current);
                }
            }

            ListIterator<String> wordsList = words.listIterator();

            while(wordsList.hasNext()) {
                String current = wordsList.next();
                sb.append(current + "\n");
                sb.append("haha\n");
            }
            System.out.println(sb);
            sc.close();
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