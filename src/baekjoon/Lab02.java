package baekjoon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
        FileWriter fw = new FileWriter("c:/FirstJava/myData2.txt");
        String intStr;

        while(true) {
            intStr = br.readLine();
            if (intStr == null)
                break;
            fw.write(intStr + "\n");
        }
        br.close();
        fw.close();
        System.out.println("--- myData2.txt가 newFile.txt로 복사되었음 ---");
    }
}
