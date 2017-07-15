/**
MIT License

Copyright (c) 2017 Benjaminlopez9

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

@author: Benjamin Lopez,
@email: Blopez24@asu.edu,
@project type: Machine Learning,
**/

import java.lang.reflect.Array;
import java.util.*;

public class back_end_ {
    public String[] array_of_values = {"add","subtract","multiply","divide"};
    public static void main(String[] args) {
        Stack<String> story = new Stack<>();
	    LinkedList<Neuron> stackedNet = new LinkedList<>();
    }
}

class Neuron{
    Neuron(){}

}

class sm_toolkit{
    sm_toolkit(){}
    sm_toolkit(String action){
        String closest_match = close_match_finder(action);
    }


    //sm_tools for sm_toolkit
    String close_match_finder(String str){
        String result = "";
        if(!str.isEmpty()){
            char[] array_of_str = str.toCharArray();
            for(int i = 0; i < array_of_str.length; i++){

            }
        }
        return result;
    }
    int[] treeBuilder(int[] unorganized_data){
        int[] result = null;
        for (;;){
            if(unorganized_data.length>0){

            }
        }
        return result;
    }

