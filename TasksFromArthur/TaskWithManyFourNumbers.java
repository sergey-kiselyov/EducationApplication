package TasksFromArthur;

public class TaskWithManyFourNumbers {
    public static void main(String[] args) {
        String array[] =new String[4];
        array[0] ="2";
        array[1]="0";
        array[2]="2";
        array[3]="1";

        for (int i = 0; i < array.length ; i++) {
            for(int j=0; j< array.length; j++){
                for(int k=0; k< array.length; k++){
                    for(int l=0; l< array.length; l++){
                        if(i!=j & i!=k & j!=k)
                            System.out.println(array[i]+array[j]+array[k]+array[l]);
                    }
                }
            }

        }
    }
}
