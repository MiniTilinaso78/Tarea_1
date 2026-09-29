//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Licuados lucha = new Licuados();
        Licuados macaco = new Licuados();
        Licuados albertano = lucha;
        Licuados rosa = null;

        lucha.setPrecio(30.5);
        System.out.println("Precio del licuado de doña lucha: " + lucha.getPrecio());
        System.out.println("Precio del licuado de doña albertano: " + albertano.getPrecio());
        if (rosa != null){
            rosa.getSabor();
        }





    }
}