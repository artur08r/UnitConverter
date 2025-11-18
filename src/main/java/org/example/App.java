package org.example;

import org.example.Converters.BaseConverter;
import org.example.Converters.ConverterFabrica;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        try{
            String[] input = scanner.nextLine().split(" ");
            if (input.length != 4){
                throw new ConverterException("Некоректный вормат ввода");
            }

            BaseConverter<?> converter = ConverterFabrica.create(
                    input[0],
                    Double.parseDouble(input[1]),
                    input[2],
                    input[3]
            );

            System.out.println(converter.printResult());
        } catch (ConverterException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неизвестные единицы");
        } catch (Exception e) {
            System.out.println("Ошибка: что-то пошло не так");
        }
    }
}
