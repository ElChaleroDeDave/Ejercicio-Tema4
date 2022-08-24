public class EstacionSwitch
{
    public static void main(String[] args) {
        int estacion= 1;

        switch (estacion){

            case  1:
            System.out.println("es primavera");
            break;
            case  2:
            System.out.println("es invierno");
            break;
            case 3:
                System.out.println("es verano");
                break;
            case 4:
                System.out.println("otoño");
                break;
            default:
                System.out.println("no coincide la estacion");
        }

    }


}
