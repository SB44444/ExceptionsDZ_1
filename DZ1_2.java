// Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Задание 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Возможные варианты ошибок в этом коде:
// 1.  ArithmeticException, 2. ArrayIndexOutOfBoundsException, 3. NullPointerException, 
// 4. IllegalArgumentExceptionб 5. IOException 6. ClassCastException

public class DZ1_2 {
	public static void main(String[] args) {
		
		double[] myArray = {3.1, 5.2, 3.0, 78.4, 15.2, 0.6, 7.1, 0.0, 9.4, 10.0};
        String[] strArray = {"Вася", "Иван", " ", null, "Ирина", "Анна"};

		//findValue(myArray, 20);
        //difference(myArray, 2,7);
        findNull(strArray);

    }
    public static void difference(double[] myArray, int a, int b){  //  Ф-ция деления
        if(myArray[b] == 0) throw new ArithmeticException("Делить на ноль нельзя");
        else{
            double differ =  (myArray[a] / myArray[b]);
            System.out.printf("Результат деления равен " + differ);
        }        
        
    }
    public static void findValue(double[] myArray, int inIndex){  //  Ф-ция вывода значения эл-та массива по индексу
        if(myArray.length - 1 < inIndex) throw new ArrayIndexOutOfBoundsException("Э-та массива с заданным индексом нет, повторите ввод");
        System.out.printf("Значение эл-та с индексом %d = %d.\n",inIndex, myArray[inIndex]);
    }

    public static void findNull(String[] strArray){  //  Ф-ция проверки на Null
        for (String i: strArray){
            if(i == null) throw new NullPointerException("В массиве прсудствуюет эл-т, значение котрого не опрнеделено");            
        }
        System.out.println("В массиве нет null");
    }
}