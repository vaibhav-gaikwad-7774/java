public class enhancedFor {
    public static void main(String[] args) {
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
       /* for(int i=0;i<7;i++)
        {
            days[i];
        } */
        //enhanced for loop for(String day:days){ ....}
        for(String day:days)
        {
            System.out.println(day);
        } //access elements from array
        int x=days.length;
        System.out.println(x);
    }
}
