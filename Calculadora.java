///*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;
public class Calculadora {
//comentario
   private int num1;
   private int num2;
   public Calculadora(int n1, int n2){
       this.num1 = n1;
       this.num2 = n2;
   }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
   
   public int suma(){
       return num1 + num2;
   }
   /*public int resta(){
       if(resta2())
            return num1 - num2;
      else 
        return num2-num1;
   }*/
   public int resta(){
       return num1-num2;
   }
   public int multiplica(){
       return num1 * num2;
   }
   public int divide(){
        return (num1 / num2);
   }
   public boolean resta2(){
       return num1 >= num2;
   }
    public Integer divide2(){
       if(num2==0)
           return null;
       else return num1/num2;
   }
    public int divide0(){
       if(num2==0)
           throw new java.lang.ArithmeticException("División por 0");
       else return num1/num2;
   }
    
}

