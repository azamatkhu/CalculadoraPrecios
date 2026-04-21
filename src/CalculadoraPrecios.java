import java.util.Scanner;

public class CalculadoraPrecios {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un precio base");
        double precioBase = sc.nextDouble();

        sc.nextLine();

        System.out.println("Dime un tipo de cliente");
        String tipoCliente = sc.nextLine();

        double descuentoAplicado = 0.0;

        switch (tipoCliente){
            case "estudiante":
                descuentoAplicado = ConstantesDescuento.descuentoEstudiante;
                break;
            case "mayor":
                descuentoAplicado = ConstantesDescuento.descuentoMayor;
                break;
            case "vip":
                descuentoAplicado = ConstantesDescuento.descuentoVip;
                break;
            default:
                System.out.println("Error: tipo de cliente invalido");
                break;
        }

        double precioDescontado = precioBase - (descuentoAplicado * precioBase);
        double precioFinal = precioBase + (precioDescontado * ConstantesDescuento.iva);

        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}
