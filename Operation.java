public class Operation {

    public static int operation(String[] array) {
        int result = 0;
        try {
            switch (array[1]) {
                case "+": {
                    result = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
                    break;
                }
                case "-": {
                    result = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
                    break;
                }
                case "*": {
                    result = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
                    break;
                }
                case "/": {
                    result = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
        return result;
    }
}
