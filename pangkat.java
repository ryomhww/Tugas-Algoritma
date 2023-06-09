class Pangkat {
    public static int pangkatRekursif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatRekursif(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int basis = 10;
        int eksponen = 3;
        int hasil = pangkatRekursif(basis, eksponen);
        System.out.println(basis + " dipangkatkan " + eksponen + " = " + hasil);
    }
}
