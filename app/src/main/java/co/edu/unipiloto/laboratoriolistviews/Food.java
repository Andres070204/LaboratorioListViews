package co.edu.unipiloto.laboratoriolistviews;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] foods = {
            new Food("Hmburguesa", "La hamburguesa es un popular plato de origen estadounidense que consiste en una carne molida (generalmente de res) moldeada en forma de disco y cocinada a la parrilla o a la plancha. Se sirve dentro de un panecillo (llamado bollo o pan de hamburguesa) junto con diversos ingredientes complementarios como lechuga, tomate, cebolla, queso, pepinillos y salsas como kétchup y mayonesa. La hamburguesa es conocida por ser sabrosa, satisfactoria y versátil, con numerosas variaciones y estilos en todo el mundo.",
                    R.drawable.hamburguesa),
            new Food("Pasta", "La pasta es un tipo de alimento hecho a base de sémola de trigo o harina de trigo, agua y a veces huevo. Existen una gran variedad de formas y tipos de pasta, como espaguetis, fettuccine, penne, rigatoni, entre otros. Se cocina hirviéndola en agua salada y se suele servir acompañada de salsas diversas como boloñesa, carbonara, pesto o marinara. La pasta es un plato muy popular en la cocina italiana y se aprecia por su versatilidad, siendo una opción deliciosa y reconfortante.",
                    R.drawable.pasta),
            new Food("Sushi", "El sushi es una especialidad culinaria japonesa que consiste en arroz avinagrado combinado con otros ingredientes, como pescado fresco (como salmón, atún o pez blanco), mariscos, vegetales, y ocasionalmente huevo o tofu, enrollado en algas nori. Existen varias formas de sushi, incluyendo maki (rollos), nigiri (bolas de arroz con pescado encima) y sashimi (rebanadas finas de pescado crudo). El sushi se sirve comúnmente con salsa de soja, wasabi y jengibre encurtido (gari), y es apreciado por su frescura, sabor delicado y presentación artística.",
                    R.drawable.sushi)
    };
    private Food(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}