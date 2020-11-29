import model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class FindBiggerToTheRight {
    public static void main(String args[]) {
        List<Integer> numberList = Arrays.asList(4, 5, 2, 25);
        numberList = Arrays.asList(13, 7, 6, 12);
        List<Integer> processedNumberList = new ArrayList<>();
        for(int i =0; i<numberList.size(); i++){
            Integer unekoa = numberList.get(i);
            List<Integer> subList = numberList.subList(i, numberList.size());

            Integer max = subList
                    .stream()
                    .filter(number -> number > unekoa)
                    .findFirst()
                    .orElse(-1);
                processedNumberList.add(max);
        }
        System.out.println(processedNumberList);

    }
}