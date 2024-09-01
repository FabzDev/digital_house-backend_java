import java.util.Objects;

public class User {
    private Integer id;
    private String name;

    public User (Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mi toString quiero que diga el nombre: " + this.name + " y Tu Papa";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si este objeto y el que se pasa por parametro tienen el mismo espacio en memoria, retorna true
        if (o == null || getClass() != o.getClass()) return false; // Si el obj pasado por parametro es nulo, o su clase es diferente a la de este objeto, retorna false
        User user = (User) o; // El objeto user será equivalente al casteo del objeto por parametro a esta clase.
        return Objects.equals(id, user.id) && Objects.equals(name, user.name); // Regresa true si el id de esta clase y del objeto casteado (pasado por parametro) es igual, y lo mismo para el atributo name.
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); //Tu elijes que incluir para la creación del Hash, aqui se usa el método estatico "hash" de la clase Object para crear el hash.
    }
}
