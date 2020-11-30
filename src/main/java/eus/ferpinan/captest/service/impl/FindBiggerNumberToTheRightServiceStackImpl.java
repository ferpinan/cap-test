package eus.ferpinan.captest.service.impl;

import eus.ferpinan.captest.service.FindBiggerNumberToTheRightService;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class FindBiggerNumberToTheRightServiceStackImpl implements FindBiggerNumberToTheRightService {
    @Override
    public Integer[] execute(Integer[] inputNumberArrays) {
        if (inputNumberArrays == null || inputNumberArrays.length == 0) {
            return new Integer[0];
        }

        // we save in the stack the index of the element if the next one is not bigger
        Stack<Integer> stack = new Stack<>();
        // array where we will save the result
        Integer[] result = new Integer[inputNumberArrays.length];

        stack.push(0);
        for (int i = 1; i < inputNumberArrays.length; i++) {
            // the first element will always be pushed to the stack
            // we will be picking the saved elements in the stack to see if the current number is bigger
            while (!stack.empty() && inputNumberArrays[stack.peek()] < inputNumberArrays[i]) {
                // if it is bigger we will save it in the result array and we will repeat with the next element in the stack
                result[stack.pop()] = inputNumberArrays[i];
            }
            // the next number is not bigger so we save the index in the stack
            stack.push(i);
        }
        // not bigger number were found for this indices so we set them to -1
        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }
}
