package co.edu.unipiloto.laboratoriolistviews;


public class Stores {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Stores[] stores = {
            new Stores("Mac", "Mac es una línea de computadoras personales diseñadas, fabricadas y comercializadas por Apple Inc. Los productos Mac son conocidos por su diseño elegante, alto rendimiento y sistema operativo macOS. Los ordenadores Mac incluyen computadoras de escritorio como iMac y Mac Pro, así como portátiles como MacBook Air y MacBook Pro. Los Mac son populares entre los usuarios creativos y profesionales por su calidad de construcción y eficiencia en la producción multimedia.",
                    R.drawable.mac),
            new Stores("Starbucks", "Starbucks es una cadena de cafeterías multinacional con sede en Seattle, Washington. La compañía es conocida por sus cafés de alta calidad, bebidas de café espresso, tés, bocadillos y productos de panadería. Starbucks es reconocido por crear un ambiente acogedor y cómodo para los clientes, con un énfasis en la sostenibilidad y el comercio justo. La marca Starbucks es omnipresente en muchas ciudades de todo el mundo y es un lugar popular para reuniones, estudio y disfrute de bebidas de café.",
                    R.drawable.starbucks),
            new Stores("Domino´s", "Domino's es una cadena internacional de restaurantes especializada en pizzas para entrega a domicilio y para llevar. La empresa ofrece una amplia variedad de pizzas con ingredientes frescos y sabrosos, así como otros platos como pollo, sándwiches y pasta. Domino's es conocido por su enfoque en la conveniencia y rapidez de entrega, utilizando tecnología innovadora para facilitar pedidos en línea y seguimiento en tiempo real. La marca Domino's es popular entre los amantes de la pizza por su calidad constante y servicio eficiente.",
                    R.drawable.domino)
    };
    private Stores(String name, String description, int imageResourceId){
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