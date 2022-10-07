public class Q1 {
    public static void main(String args[]){
        int size,temp;
        int array[]={56,34,23,11,89};
        size=array.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Largest element is: " +array[size-1]);
    }
}
