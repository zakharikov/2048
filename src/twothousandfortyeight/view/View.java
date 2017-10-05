package twothousandfortyeight.view;

import java.util.Scanner;
import twothousandfortyeight.model.Field;


public class View {

    int inputSize;

    public int askForSize() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер поля:");
        inputSize = sc.nextInt();
        sc.close();
        System.out.println("Вы выбрали размер поля: " + inputSize + " x " + inputSize);
        return inputSize;
    }

}
