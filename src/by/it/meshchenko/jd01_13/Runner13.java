package by.it.meshchenko.jd01_13;

import java.io.IOException;

public class Runner13 {
    public static void main(String[] args) throws Exception {
        // A. Создать программу с использованием двух типов обработки исключений, которая:
        //      - открывает консоль;
        //      - считывает данные из консоли построчно;
        //      - переводит каждую строку в число и выводит в консоль данное число и сумму корней всех
        //      ранее введенных чисел, включая введенное;
        //      - если перевести ввод в число невозможно или невозможно извлечь корень, то программа
        //      обрабатывает ошибку и показывает на русском языке соответствующее сообщение в консоли;
        //      - закрывается при вводе в консоль слова END.
        System.out.println("A.  **************************");
        TaskA.example1();

        // B. Разработать консольное приложение, в котором поместить 3 void процедуры, вложенные друг в друга.
        //      - Каждую процедуру сопроводить двумя сообщениями: в начале и в конце тела процедуры.
        //      Код процедуры – произвольный, но с возможным делением на ноль (3 уровень),
        //      извлечением корня из отрицательного числа (2-й уровень), другими ошибками (1-й и 0-й
        //      уровни, где 0-й уровень это public static void main(String[ ] args) ).
        //      - Проследить обработку исключений, обязательно защитить вызов каждой процедуры во
        //      внешнем вызывающем блоке.
        //      - Один тип ошибки – деление на ноль обрабатывать в процедуре, остальные ошибки
        //      пробрасывать и обрабатывать в main.
        System.out.println("B.  **************************");
        System.out.println("main START:");
        try{
            TaskB.void1(-9);
        }
        catch(NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException: "
                    + ": Массив создан с отрицательным размером.");
        }

        catch(Exception e){
            Util.printException(e);
        }

        System.out.println("main END");
        System.out.println("Вывод: При передаче исключения на верх, метод завершается в том месте где \n"
                        + "происходит исключение");

        // C. Создать произвольный пример JD01_13/VariantC на базе своего задания
        //      по ООП (JD01_08) с собственным событием обработки ошибки и собственным типом
        //      ошибки. Требуется выводить в консоль данные об месте возникновения ошибки: имя
        //      класса, номер строки, глубину вложенности метода по стеку от main.
        System.out.println("C.  **************************");
        System.out.println("На базе задания по ООП создадим новый шкаф (NewBookCase) с не корректными размерами.");
        System.out.println("Создаём: NewBookCase(\"NewCase\", 1500, 1000, -1000, 10); \n");
        TaskC.example1();
    }
}
