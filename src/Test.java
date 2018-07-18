import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File f = new File("j.txt");
        try {
            FileInputStream fip = new FileInputStream(f);

            Scanner sc = new Scanner(fip);
            StringBuffer sb = new StringBuffer();

//            while(reader.ready()) {
//                char currentChar = (char)reader.read();
//                sb.append(currentChar);
//                if(currentChar == '\n' || currentChar == '\r') {
//                    sb.append("haha\n");
//                }
//            }

            //reader.read(char[] cbuf);
            List<String> words = new LinkedList<>();
            while (sc.hasNext()){
                words.add(sc.next());
            }

            ListIterator<String> wordsList = words.listIterator();

            while(wordsList.hasNext()) {
                String current = wordsList.next();
                //String next = wordsList.next();
                //wordsList.previous();
                sb.append(current + "\n");
                //if(!current.equals("haha")&& !next.equals("haha")) {
                    sb.append("haha\n");
                //}
            }
            System.out.println(sb);
            //reader.close();
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