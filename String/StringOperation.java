package String;

class StringOperation {
    public static void main(String[] args) {
        String s1="Edureka";
        String s2="Edurekab";

        System.out.println(s1.compareTo(s2));//-1 means not matched
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.substring(2));
        String s3="";
        System.out.println(s3.isEmpty());
        int a=50;
        String s=String.valueOf(a);
        System.out.println(s);
        String replace=s2.replace('d','l');
        System.out.println(replace);
        System.out.println(s2.contains("d"));

        String x="Welcome to edureka";
        String y="Welcome to eDureKa";
        System.out.println(x.equals(y));
        System.out.println(x.charAt(3));
        System.out.println(x.endsWith("u"));
    }
}
