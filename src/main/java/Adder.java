class q {
    public static void main(String[] args) {
        int[] a = { 1 };
        q q= new q();
        q.inc(a);
        System.out.println(a[a.length - 1]);
    }

    void inc(int[] a) {
        a[a.length - 1]++;

    }
}

