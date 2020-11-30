package eus.ferpinan.captest;

import eus.ferpinan.captest.service.FindBiggerNumberToTheRightService;
import eus.ferpinan.captest.service.impl.FindBiggerNumberToTheRightServiceStackImpl;
import eus.ferpinan.captest.service.impl.FindBiggerNumberToTheRightServiceStreamsImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBiggerToTheRightMain {
    public static void main(String[] args) {

        FindBiggerNumberToTheRightService findBiggerNumberToTheRightServiceStreams = new FindBiggerNumberToTheRightServiceStreamsImpl();
        FindBiggerNumberToTheRightService findBiggerNumberToTheRightServiceStack = new FindBiggerNumberToTheRightServiceStackImpl();

        Integer[] numberArray = {4, 5, 2, 25};
        Integer[] resultStreams = findBiggerNumberToTheRightServiceStreams.execute(numberArray);
        System.out.println(Arrays.toString(resultStreams));
        Integer[] resultStack = findBiggerNumberToTheRightServiceStack.execute(numberArray);
        System.out.println(Arrays.toString(resultStack));

        numberArray = new Integer[]{13, 7, 6, 12};
        resultStreams = findBiggerNumberToTheRightServiceStreams.execute(numberArray);
        System.out.println(Arrays.toString(resultStreams));
        resultStack = findBiggerNumberToTheRightServiceStack.execute(numberArray);
        System.out.println(Arrays.toString(resultStack));

        numberArray = new Integer[]{15, 13, 11, 10, 30, 23, 11, 18};
        resultStreams = findBiggerNumberToTheRightServiceStreams.execute(numberArray);
        System.out.println(Arrays.toString(resultStreams));
        resultStack = findBiggerNumberToTheRightServiceStack.execute(numberArray);
        System.out.println(Arrays.toString(resultStack));
    }
}