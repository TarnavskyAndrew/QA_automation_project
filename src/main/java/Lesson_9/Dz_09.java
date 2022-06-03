package Lesson_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dz_09 {


        public static void main(String[] args) {

            List<String> finalStrArray = new ArrayList<String>();
            HashMap<Character, Integer> keyValue = new HashMap<Character, Integer>();


            String [] strStart = new String[] {"mama", "papa", "dodo", "nono", "BoBob"};


            for (String elementString : strStart) {
                boolean ifEvenChars;

                int numStr = 0;

                if (elementString.length() % 2 == 0 && numStr < 2) {
                    char[] charsChenge = elementString.toUpperCase().toCharArray();
                    char[] sortedCharsChenge = Arrays.copyOf(charsChenge, charsChenge.length);
                    Arrays.sort(sortedCharsChenge);

                    for (int i = 0; i < sortedCharsChenge.length; i += 2) {
                        if (sortedCharsChenge[i] != sortedCharsChenge[i + 1]){
                            ifEvenChars = false;
                            break;
                        }
                    }

                    if (ifEvenChars = true) {
                        finalStrArray.add(elementString);
                        numStr++;
                    }
                }
            }

            for (String element : finalStrArray) {
                char[] chars = element.toUpperCase().toCharArray();
                for (char ch : chars) {
                    keyValue.put(ch, (keyValue.getOrDefault(ch, 0))+1);
                }
            }
            System.out.println(keyValue);
            System.out.println(finalStrArray);

        }
    }