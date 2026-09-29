//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Licuados lucha = new Licuados();
        Licuados macaco = new Licuados();
        Licuados albertano = lucha;
        Licuados rosa = null;
        macaco.setSabor("De fresa");
        lucha.setPrecio(30.5);
        System.out.println("Precio del licuado de doña lucha: " + lucha.getPrecio());
        System.out.println("Precio del licuado de doña albertano: " + albertano.getPrecio());
        if (rosa != null){
            rosa.getSabor();
        }
        String sabor1 = lucha.getSabor();
        String sabor2= macaco.getSabor();
        if (sabor1.equals(sabor2)) {
            System.out.println("Los dos licuados son iguales ");
        } else {
            System.out.println("Los dos licuados no son iguales ");
        }





    }
}