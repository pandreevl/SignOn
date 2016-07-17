package android.galileo.edu;

/**
 * Clase que representa la existencia de una seña
 */
public class Sign {
    private String nombre;
    private int idDrawable;

    public Sign(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Sign[] ITEMS = {
            new Sign("A", R.drawable.a),
            new Sign("B", R.drawable.b),
            new Sign("C", R.drawable.c),
            new Sign("D", R.drawable.d),
            new Sign("E", R.drawable.e),
            new Sign("F", R.drawable.f),
            new Sign("G", R.drawable.g),
            new Sign("H", R.drawable.h),
            new Sign("I", R.drawable.i),
            new Sign("J", R.drawable.j),
            new Sign("K", R.drawable.k),
            new Sign("L", R.drawable.l),
            new Sign("M", R.drawable.m),
            new Sign("N", R.drawable.n),
            new Sign("O", R.drawable.o),
            new Sign("P", R.drawable.p),
            new Sign("Q", R.drawable.q),
            new Sign("R", R.drawable.r),
            new Sign("S", R.drawable.s),
            new Sign("T", R.drawable.t),
            new Sign("U", R.drawable.u),
            new Sign("V", R.drawable.v),
            new Sign("W", R.drawable.w),   new Sign("X", R.drawable.x),   new Sign("Y", R.drawable.y),
            new Sign("Z", R.drawable.z),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return seña
     */
    public static Sign getItem(int id) {
        for (Sign item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
