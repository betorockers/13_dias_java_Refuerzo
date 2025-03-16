public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Agregaremos un constructor (vacio)
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    // Agregamos un constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this(); // mandamos a llamar al constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    // agregaremos los metodos GET Y SET
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // usaremos sobreescritura de metodos de la clase padre


    @Override
    public String toString() {
        return "Persona:\n" +
                "id=" + id + '\n' +
                "nombre='" + nombre + '\'' + '\n' +
                "tel='" + tel + '\'' + '\n' +
                "email='" + email + '\'' +
                '\n';
    }

    // agreagremos unas pruebas
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez","55443322", "juan@mail.com");
        System.out.println(persona1);
    }
}
