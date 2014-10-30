package example;

import java.util.LinkedList;
import java.util.Stack;

public class FileChecker {
    public static LinkedList<String> check(String[] strings) {

        LinkedList<String> resultlist = new LinkedList<String>();

        for (String str : strings) {//metods
            Stack<Integer> temp = new Stack<Integer>();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') temp.push(i);
                if (str.charAt(i) == ')') temp.pop();
            }

            if (!temp.empty()) {

                Object[] temparr = temp.toArray();
                char[] arr = new char[str.length()];
                for (int j = 0; j < temparr.length; j++) {
                    for (int i = 0; i < arr.length; i++) {
                        if (i == (Integer) temparr[j]) {
                            arr[i] = '^';
                        }
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != '^') {
                        arr[i] = ' ';
                    }
                }

                resultlist.add(str);
                resultlist.add(new String(arr));
            }
        }

        return resultlist;
    }
}

