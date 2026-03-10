package com.test;

public class Divisible {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

            String output = ""; //output.isEmpty()
            if (i % 3 == 0) output += "Crackle".intern(); //output=output+"Crackle"
            if (i % 5 == 0) output += "Pop".intern();    //output=output+"Pop"

            System.out.println(!output.isEmpty() ? output:i);
            
        }
	}

}
/*
 * In string pool (only once):
 * 
 * ✅ "" ✅ "Crackle" ✅ "Pop"
 * 
 * Created many times at runtime:
 * 
 * ❗ "CracklePop" (new every multiple of 15)
 * 
 * ❗ strings from Integer.toString(i) when printing numbers
 */
//Using intern() all the 3 strings are pooled.