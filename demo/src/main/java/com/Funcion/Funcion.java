package com.Funcion;

public class Funcion {
    
  
    public double funcion1(int x, int y){

      if(y == 0){
        return 1;
      }else{
        return x * funcion1(x, y-1);
      }
    }

    public double funcion2(int x, int y){
        if(y == 0){
            return 1;
        }else{
            if(y % 2 == 0){
                return funcion2(x, y/2) * funcion2(x, y/2);
            }else{
                return x * funcion2(x, y/2) * funcion2(x, y/2);
            }

        }
    }


}
