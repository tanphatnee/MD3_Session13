package th.th1;

public class BinarySearch {
    public static void main(String[] args) {
        int [] list = {2,4,6,8,9,24,68,89};
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,5));
    }
    static int binarySearch(int []list,int key){
        int low = 0;
        int high = list.length-1;
        while(high>=low){
            int mid = (high+low)/2;
            if(key<list[mid]){
                high=mid-1;
            }else if(key==list[mid]){
                return mid;
            }else {
                low = mid+1;
            }
        }
        return  -1;
    }
}
