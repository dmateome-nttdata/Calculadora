package org.example;

public class Calculadora {
    private int ans;
    public Calculadora() {
        ans = 0;
        System.out.println("print");
    }

    public int div(int a, int b){
        if(b==0){
            throw new ArithmeticException("No puedes dividir por cero");
        }
        ans=a/b;

        return ans;
    }
    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }
    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }
    public int ans() {
        return ans;
    }

    public void clear(){
        ans=0;
    }
    public void operacionOptima() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) {

    }
}