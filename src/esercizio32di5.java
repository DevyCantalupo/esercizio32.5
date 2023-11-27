import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class esercizio32di5 {
    public static void main(String[] args) {

        OffsetDateTime fecha = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(fecha);

        OffsetDateTime nuevaFecha = agregarYear(fecha);
        System.out.println(nuevaFecha);

        nuevaFecha = agregarMes(nuevaFecha);
        System.out.println(nuevaFecha);

        nuevaFecha = agregar7dias(nuevaFecha);
        System.out.println(nuevaFecha);

        String fechaString = nuevaFecha.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALY));
        System.out.println(fechaString);
    }

    static OffsetDateTime agregar7dias(OffsetDateTime newDate) {
        if (newDate == null) {
            return null;
        } else {
            return newDate.plusDays(7);
        }
    }

    static OffsetDateTime agregarMes(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.minusMonths(1);
        }
    }

    public static OffsetDateTime agregarYear(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.plusYears(1);
        }


    }
}
