class ContinueStatement {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i==3)
                continue;//when i=3 then value 3 will be skipped
            System.out.println(i);
        }
    }
}
