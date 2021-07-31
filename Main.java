/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l5;

/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1
        Побитовые операции
        Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
        Примечание: нужно закомментировать только две строки
        */
        
         int x = 7;
//        x = x & 25;
        x = x & 5;
//        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
        
        /* 2
        Swap по-новому
        В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
        Можно использовать только операции:
        Исключающее или.
        Присваивание.
        Исключающее или с присваиванием.
        Не оставляй комментарии, не меняй остальной код.
        
        expected output
        x=4, y=5
        x=5, y=4      
        */
        
        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
    
}
