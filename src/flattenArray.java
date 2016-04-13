import java.util.ArrayList;

/**
 * Created by ryan on 3/28/16.
 */
public class flattenArray {

    public static void main(String args[]) {

        //test values
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("1");
        list.add("2");
        list.add("3");
        ArrayList<Object> list2 = new ArrayList<Object>();
        list2.add("1");
        list2.add("2");
        list.add(list2);

        list = flatten(list);

        for(Object obj: list)
            System.out.println(obj.toString());
    }

    //flatten takes an ArrayList of objects and returns a flattened list
    public static ArrayList<Object> flatten(ArrayList<Object> list){
        ArrayList<Object> newList = new ArrayList<Object>();
        for(Object obj: list) {
            if (obj instanceof ArrayList<?>) {
                newList.addAll(flatten((ArrayList<Object>) obj));
            }else{
                newList.add(obj);
            }
        }
        return newList;
    }
}
