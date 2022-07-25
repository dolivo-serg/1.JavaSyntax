package com.javarush.task.task06.task0622;



import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] list = new Integer[5];  //массив для заполнения с клавиатуры
        int[] sort = new int[5];  //массив для переноса значений из int[] list по возрастанию.

        //заполнение массива с клавиатуры
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        //переменная "сумма" понадобится для приравнивания к ней минимального элемента массива
        //т.е. после сортировки и дублирования в итоговый массив
        int sum = 0;
        for (int i = 0; i < list.length; i++)
            sum += Math.abs(list[i]);

        int min = list[0];  // переменная для хранения минимального значения

            for(int x = 0; x < list.length; x++) {

                //цикл для поиска минимального значения
                for (int i = 0; i < list.length; i++) {
                    if (list[i] < min)
                        min = list[i];
                }

                //поочередно заполняем ячейки отсортированного массива
                sort[x] = min;

                //цикл для поиска ячейки, которая оказалась минимальной
                for (int h = 0; h < list.length; h++) {

                    if (list[h] == min) {
                        list[h] = sum;  //присваиваем ей значение суммы по модулю, что исключит
                                        //данную ячейку при оставшихся сортировках
                                        //(не смог исключить ячейку другим способом)
                        min = sum;  //до этого в переменной min = list[i]
                                    //что недопустимо для последующей сортировки
                    }
                }
            }
        //выводим все значения массива в консоль
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
