package RECURSION;

class Rekursi {
    public int triangle(int n){
        if(n==1){
            return 1;
        }else{
            return triangle(1)+n;
        }
    }
    public int fac(int n){
        if(n==1){
            return 1;
        }else{
            return fac(n-1) * n;
        }
    }
    public int fibo(int n){
        if(n==0){ 
            return 1;
        }else if(n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public int deret(int n){
        if(n==1){
            return 1;
        }else{
            return deret(n-1)+1;
        }
    }
    public int pangkat(int a, int b){
        if(b == 1){
            return a;
        }else{
            return pangkat(a, b-1)*a;
        }
    }
}

public class DemoDasar {

    public static void main(String[] args) {
        Rekursi r = new Rekursi();
        System.out.println(r.pangkat(2,3));
    }
}
