package clase_13.Ventas;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto ("Pantalon", 64300.00) ;
        Producto producto2 = new Producto ("Campera", 52300.00) ;
        Producto producto3 = new Producto ("Remera", 14300.00) ;
        Producto producto4 = new Producto ("Bufanda", 64300.00) ;
        Producto producto5 = new Producto ("Zapatillas", 52300.00) ;
        Producto producto6 = new Producto ("Medias", 25300.00) ;
        Producto producto7 = new Producto ("Musculosa", 25300.00) ;
        Producto producto8 = new Producto ("Short", 13400.00) ;
        Producto producto9 = new Producto ("Sombrero", 13400.00) ;
        Producto producto10 = new Producto ("Guantes", 14300.00) ;
        
        Orden orden1 = new Orden();
        // Agregar productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        // Agregar productos al arreglo
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        // Agregar productos al arreglo
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.mostrarOrden();

        Orden orden4 = new Orden();
        // Agregar productos al arreglo
        orden4.agregarProducto(producto7);
        orden4.agregarProducto(producto8);
        orden4.mostrarOrden();

        Orden orden5 = new Orden();
        // Agregar productos al arreglo
        orden5.agregarProducto(producto9);
        orden5.agregarProducto(producto10);
        orden5.mostrarOrden();
    }
}