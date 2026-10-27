enum class Bebida(
    val id: Int,
    val nombre: String,
    val precio: Double,
    var cantidad: Int = 5
) {
    CAFE_AMERICANO(1, "Café Americano", 1.20, 10),
    CAFE_CON_LECHE(2, "Café con Leche", 1.50, 6),
    NO_CAFE(3, "No cafe", 1.80, 0)
}