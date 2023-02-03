package selfstudy;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Resultat {

    /*
     * Complete the 'splitIntoTwo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

//    public static int splitIntoTwo(List<Integer> arr) {

//        int counter = 0;
//        List<Integer>leftArr = new ArrayList<Integer>();
//        List<Integer> rightArr = new ArrayList<Integer>();
//        int sumLeft = 0, sumRight = 0;
//        for (int i = arr.size()-1; i >0; i--) {
//            leftArr.add(arr.get(0));
//
//            rightArr.add(arr.get(arr.size() - 1));
//
//            leftArr.addAll(arr.subList(1, i));
//
//            rightArr.addAll(arr.subList(i , arr.size()-1));
//
//            if(leftArr.stream().reduce((a,b) -> a+b).(rightArr.stream().reduce((a,b) -> a+b))){
//
//            }?counter++:continue;
//            for (Integer w : leftArr) {
//                sumLeft+=w;
//            }
//            for (Integer w : rightArr) {
//                sumRight+=w;
//            }
//            if (sumLeft>sumRight) {
//                counter++;
//            }
//            leftArr.clear();
//            rightArr.clear();
//            sumLeft = 0;
//            sumRight = 0;
//        }

//        return counter;
//    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> arr = new ArrayList<Integer>();
//        arr.add(5);
        arr.add(10);
        arr.add(-5);
        arr.add(6);
        System.out.println(arr.toString());
//        int result = Resultat.splitIntoTwo(arr);

//        System.out.println("result = " + result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

    }
}
