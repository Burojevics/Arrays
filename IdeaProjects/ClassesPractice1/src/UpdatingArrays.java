public class UpdatingArrays {
    public static void main(String[] args) {
        char [] letter={'A','B','C','D','E','F'};
        letter[0]='a';
        for (int i = 0; i < letter.length ; i++) {
            System.out.print(letter[i]+" ");
        }
    }
}
