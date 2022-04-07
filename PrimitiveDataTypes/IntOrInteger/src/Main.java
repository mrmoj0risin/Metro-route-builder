 class Main {
     public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        char start = 'А';
        char end = 'я';
        char e = 'ё';
        char e2 = 'Ё';

        int startCode = start;
        int endCode = end;
        int eCode = e;
        int eUpCode = e2;

//        System.out.println(startCode + "  " + endCode + "  " + eCode + "  " + eUpCode);


        for (; eUpCode <= eCode ; eUpCode += 1){

            Character c = (char)eUpCode;
            System.out.println(c + " - " + eUpCode);
        }


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
