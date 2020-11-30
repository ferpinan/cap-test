package eus.ferpinan.captest.service.impl;

import eus.ferpinan.captest.service.FindBiggerNumberToTheRightService;

import java.util.Arrays;
import java.util.List;

public class FindBiggerNumberToTheRightServiceStreamsImpl implements FindBiggerNumberToTheRightService {
    @Override
    public Integer[] execute(Integer[] inputNumberArrays) {
        if (inputNumberArrays == null || inputNumberArrays.length == 0) {
            return new Integer[0];
        }

        List<Integer> inputNumberList = Arrays.asList(inputNumberArrays);

        Integer[] processedNumberArray = new Integer[inputNumberArrays.length];
        for (int i = 0; i < inputNumberList.size(); i++) {
            Integer current = inputNumberList.get(i);
            List<Integer> inputNumberSubList = inputNumberList.subList(i + 1, inputNumberList.size());

            Integer max = inputNumberSubList
                    .stream()
                    .filter(number -> number > current)
                    .findFirst()
                    .orElse(-1);
            processedNumberArray[i] = max;
        }
        return processedNumberArray;
    }
}
