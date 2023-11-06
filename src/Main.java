public class Main {
    public static void main(String[] args) {
        System.out.println("Uy ishi");
        int[] array = {1, -2, 0, 3, -4, 0, 5};

        int nol = 0;
        int musbat = 0;
        int manfiy = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                nol++;
            } else if (array[i] > 0) {
                musbat++;
            } else {
                manfiy++;
            }
        }


        System.out.println("0 lar soni: " + nol);
        System.out.println("Musbat sonlar soni: " + musbat);
        System.out.println("Manfiy sonlar soni: " + manfiy);

    }
}