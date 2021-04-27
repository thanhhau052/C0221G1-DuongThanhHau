public class test {
    public static void sort_ascending (java.util.ArrayList<Integer> arrayList) {
        //Your code here
        for (int i=0 ; i<arrayList.size();i++){
            for (int j=i+1;j<arrayList.size(); j++){
                if (arrayList.get(i) > arrayList.get(j)){
                    int temp= arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);
                }
            }
        }
    }


}
