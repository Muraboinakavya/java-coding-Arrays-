public class Min {
    public static void main(String[]args){
        int arr[] ={2,5,1,9,6};
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr[i];j++){
                if(j<arr[i]){
                    System.out.println("The minimum value is" +j);
                    System.out.println("the index is "+i);
                }

                
            }
            
        }
    }
    
}
