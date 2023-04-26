package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Remove_Data_Element {
    public static void main(String[] args) {
        // Remove all data elements that are equal to 1

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,2,3,3,4,5,6,7,8,1,1,1));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(num==1 || num==2){
                it.remove();
            }
        }
        System.out.println(list);


    }

}
