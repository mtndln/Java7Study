package HomeWorks;

public class h30_Array3 {
    public static void main(String[] args) {
        /*
        Write  a code   string   array    with   the   following   strings:
"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.
         */

        String [] Arrays = {"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday", "Saturday"};

        for (int i = 0; i <Arrays.length ; i++) {
            System.out.println("The day is: "+Arrays[i]);

        }

    }
}
