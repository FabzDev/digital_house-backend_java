public class Main {

    public static void main(String[] args){
        BurgerJoint dondeFabio = new BurgerJoint();

        SingleProduct perro = new SingleProduct("Perro Caliente",5000.0);
        SingleProduct chuzo = new SingleProduct("Chuzo Desgranado",12000.0);
        SingleProduct salchipapa = new SingleProduct("Salchipapa",10000.0);
        SingleProduct mazorca = new SingleProduct("Mazorca Desgranada",8000.0);
        SingleProduct papas = new SingleProduct("Papas a la Francesa",5000.0);
        SingleProduct gaseosa = new SingleProduct("Postobon",3000.0);

        ProductComposite combo1 = new ProductComposite("Combo Perro Caliente",0.2);
        combo1.addProductToCombo(perro);
        combo1.addProductToCombo(papas);
        combo1.addProductToCombo(gaseosa);
        System.out.println("\nPrecio combo 1: " + combo1.calculatePrice());

        ProductComposite combo2 = new ProductComposite("Combo Perro Chuzo",0.2);
        combo2.addProductToCombo(chuzo);
        combo2.addProductToCombo(papas);
        combo2.addProductToCombo(gaseosa);
        System.out.println("\nPrecio combo 2: " + combo2.calculatePrice());

        ProductComposite combo3 = new ProductComposite("Combo Perro Salchipapa",0.2);
        combo3.addProductToCombo(salchipapa);
        combo3.addProductToCombo(papas);
        combo3.addProductToCombo(gaseosa);
        System.out.println("\nPrecio combo 3: " + combo3.calculatePrice());

        ProductComposite combo4 = new ProductComposite("Combo Perro Mazorca",0.2);
        combo4.addProductToCombo(mazorca);
        combo4.addProductToCombo(papas);
        combo4.addProductToCombo(gaseosa);
        System.out.println("\nPrecio combo 4: " + combo4.calculatePrice());

        ProductComposite ultraCombo = new ProductComposite("Combo Ultra Familiar",0.4);
        ultraCombo.addProductToCombo(combo1);
        ultraCombo.addProductToCombo(combo2);
        ultraCombo.addProductToCombo(combo3);
        ultraCombo.addProductToCombo(combo2);
        ultraCombo.addProductToCombo(papas);
        ultraCombo.addProductToCombo(papas);
        System.out.println("\nPrecio Ultra Combo Familiar: " + ultraCombo.calculatePrice());

    }

}
