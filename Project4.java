class Project4{
    public static void fibonace(int n){
        int a=1;
        int b=1;
        int c=0;
         System.out.println(a);
          System.out.println(b);
          c = a+b;
          for(int i=0;i<n-2;i++){
               System.out.println(c);
               a=b;
               b=c;
               c=a+b;
          }
        
    }
    public static void main(String[] args) {
       fibonace(10); 
    }
}