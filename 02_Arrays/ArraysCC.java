public class ArraysCC {
    public static void upadate(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
        // for(int i = 0; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }
    }


    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        upadate(marks);

        // for(int i = 1; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }


    }
}