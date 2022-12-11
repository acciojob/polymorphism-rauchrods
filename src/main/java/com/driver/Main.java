package com.driver;

public class Main {

    static class Product{
        public  int product(int x, int y) {
           return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();
        int ans1=p.product(1,2);
        int ans2=p.product(1,2,3);
        double ans3=p.product(1.2,1.4);
        System.out.println(ans1 + " " + ans2 + " " + ans3);
    }

}