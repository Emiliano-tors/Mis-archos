import java.util.HashMap;
import java.util.Map;

public class AikoResponde {
    private int score = 0;
    private Map<String, String> diccionarioEtiquetas = new HashMap<>();

    public AikoResponde() {
        inicializarTokens();
    }

    private void inicializarTokens() {
        // Aquí están TODAS las palabras que investigaste, intactas y etiquetadas
        diccionarioEtiquetas.put("a", "preposicion"); diccionarioEtiquetas.put("abajo", "posicion");
        diccionarioEtiquetas.put("acabamos", "accion"); diccionarioEtiquetas.put("actual", "tiempo");
        diccionarioEtiquetas.put("actualiza", "accion"); diccionarioEtiquetas.put("además", "conector");
        diccionarioEtiquetas.put("adentro", "posicion"); diccionarioEtiquetas.put("algún", "indefinido");
        diccionarioEtiquetas.put("algo", "indefinido"); diccionarioEtiquetas.put("al", "preposicion");
        diccionarioEtiquetas.put("ambigua", "adjetivo"); diccionarioEtiquetas.put("asemos", "accion");
        diccionarioEtiquetas.put("así", "adverbio"); diccionarioEtiquetas.put("cuando", "tiempo");
        diccionarioEtiquetas.put("cada", "distributivo"); diccionarioEtiquetas.put("callado", "estado");
        diccionarioEtiquetas.put("cambia", "accion"); diccionarioEtiquetas.put("cambie", "accion");
        diccionarioEtiquetas.put("captura", "accion"); diccionarioEtiquetas.put("centrado", "estado");
        diccionarioEtiquetas.put("clara", "adjetivo"); diccionarioEtiquetas.put("como", "comparativo");
        diccionarioEtiquetas.put("común", "adjetivo"); diccionarioEtiquetas.put("completa", "estado");
        diccionarioEtiquetas.put("completado", "estado"); diccionarioEtiquetas.put("completamente", "adverbio");
        diccionarioEtiquetas.put("completo", "estado"); diccionarioEtiquetas.put("con", "preposicion");
        diccionarioEtiquetas.put("conversación", "sustantivo"); diccionarioEtiquetas.put("crea", "accion");
        diccionarioEtiquetas.put("cuál", "interrogativo"); diccionarioEtiquetas.put("da", "accion");
        diccionarioEtiquetas.put("dame", "accion"); diccionarioEtiquetas.put("dando", "accion");
        diccionarioEtiquetas.put("de", "preposicion"); diccionarioEtiquetas.put("decía", "accion");
        diccionarioEtiquetas.put("definir", "accion"); diccionarioEtiquetas.put("definitivamente", "adverbio");
        diccionarioEtiquetas.put("del", "preposicion"); diccionarioEtiquetas.put("diseño", "sustantivo");
        diccionarioEtiquetas.put("dices", "accion"); diccionarioEtiquetas.put("dile", "accion");
        diccionarioEtiquetas.put("donde", "lugar"); diccionarioEtiquetas.put("elegante", "adjetivo");
        diccionarioEtiquetas.put("el", "articulo"); diccionarioEtiquetas.put("ejemplo", "sustantivo");
        diccionarioEtiquetas.put("emi", "nombre"); diccionarioEtiquetas.put("encantó", "emocion");
        diccionarioEtiquetas.put("entiendo", "cognitivo"); diccionarioEtiquetas.put("es", "verbo");
        diccionarioEtiquetas.put("escenario", "sustantivo"); diccionarioEtiquetas.put("ese", "demostrativo");
        diccionarioEtiquetas.put("esta", "demostrativo"); diccionarioEtiquetas.put("estamos", "verbo");
        diccionarioEtiquetas.put("estoy", "verbo"); diccionarioEtiquetas.put("exacto", "afirmacion");
        diccionarioEtiquetas.put("explicamos", "accion"); diccionarioEtiquetas.put("fluya", "accion");
        diccionarioEtiquetas.put("fondo", "sustantivo"); diccionarioEtiquetas.put("favor", "peticion");
        diccionarioEtiquetas.put("hagas", "accion"); diccionarioEtiquetas.put("habrá", "verbo");
        diccionarioEtiquetas.put("haces", "accion"); diccionarioEtiquetas.put("hecho", "estado");
        diccionarioEtiquetas.put("hey", "saludo"); diccionarioEtiquetas.put("hola", "saludo");
        diccionarioEtiquetas.put("igual", "comparativo"); diccionarioEtiquetas.put("igualmente", "comparativo");
        diccionarioEtiquetas.put("imitar", "accion"); diccionarioEtiquetas.put("increíble", "adjetivo");
        diccionarioEtiquetas.put("increíblemente", "adverbio"); diccionarioEtiquetas.put("inferior", "posicion");
        diccionarioEtiquetas.put("jugar", "accion"); diccionarioEtiquetas.put("la", "articulo");
        diccionarioEtiquetas.put("llama", "accion"); diccionarioEtiquetas.put("lugar", "sustantivo");
        diccionarioEtiquetas.put("lograr", "accion"); diccionarioEtiquetas.put("más", "cantidad");
        diccionarioEtiquetas.put("me", "pronombre"); diccionarioEtiquetas.put("mete", "accion");
        diccionarioEtiquetas.put("mismo", "identidad"); diccionarioEtiquetas.put("muy", "intensificador");
        diccionarioEtiquetas.put("necesitamos", "necesidad"); diccionarioEtiquetas.put("necesito", "necesidad");
        diccionarioEtiquetas.put("nunca", "negacion"); diccionarioEtiquetas.put("no", "negacion");
        diccionarioEtiquetas.put("nueva", "adjetivo"); diccionarioEtiquetas.put("osea", "conector");
        diccionarioEtiquetas.put("para", "preposicion"); diccionarioEtiquetas.put("parte", "sustantivo");
        diccionarioEtiquetas.put("pero", "conector"); diccionarioEtiquetas.put("primera", "orden");
        diccionarioEtiquetas.put("puede", "posibilidad"); diccionarioEtiquetas.put("puedes", "posibilidad");
        diccionarioEtiquetas.put("puedo", "posibilidad"); diccionarioEtiquetas.put("poner", "accion");
        diccionarioEtiquetas.put("ponerle", "accion"); diccionarioEtiquetas.put("por", "preposicion");
        diccionarioEtiquetas.put("que", "conector"); diccionarioEtiquetas.put("quede", "estado");
        diccionarioEtiquetas.put("quitalas", "accion"); diccionarioEtiquetas.put("querés", "deseo");
        diccionarioEtiquetas.put("rápido", "tiempo"); diccionarioEtiquetas.put("real", "adjetivo");
        diccionarioEtiquetas.put("repetiré", "accion"); diccionarioEtiquetas.put("repitió", "accion");
        diccionarioEtiquetas.put("repitieron", "accion"); diccionarioEtiquetas.put("refieres", "accion");
        diccionarioEtiquetas.put("rol", "sustantivo"); diccionarioEtiquetas.put("roles", "sustantivo");
        diccionarioEtiquetas.put("sabe", "cognitivo"); diccionarioEtiquetas.put("se", "pronombre");
        diccionarioEtiquetas.put("sepa", "cognitivo"); diccionarioEtiquetas.put("ser", "verbo");
        diccionarioEtiquetas.put("seré", "verbo"); diccionarioEtiquetas.put("si", "condicional");
        diccionarioEtiquetas.put("simplemente", "adverbio"); diccionarioEtiquetas.put("sin", "negacion");
        diccionarioEtiquetas.put("sistema", "sustantivo"); diccionarioEtiquetas.put("solo", "cantidad");
        diccionarioEtiquetas.put("suave", "adjetivo"); diccionarioEtiquetas.put("te", "pronombre");
        diccionarioEtiquetas.put("tenga", "verbo"); diccionarioEtiquetas.put("tenés", "verbo");
        diccionarioEtiquetas.put("tengo", "verbo"); diccionarioEtiquetas.put("tiene", "verbo");
        diccionarioEtiquetas.put("tienes", "verbo"); diccionarioEtiquetas.put("todavía", "tiempo");
        diccionarioEtiquetas.put("totalmente", "adverbio"); diccionarioEtiquetas.put("trato", "sustantivo");
        diccionarioEtiquetas.put("tu", "posesivo"); diccionarioEtiquetas.put("tus", "posesivo");
        diccionarioEtiquetas.put("un", "articulo"); diccionarioEtiquetas.put("una", "articulo");
        diccionarioEtiquetas.put("usuario", "sustantivo"); diccionarioEtiquetas.put("usar", "accion");
        diccionarioEtiquetas.put("vamos", "accion"); diccionarioEtiquetas.put("voy", "accion");
        diccionarioEtiquetas.put("vez", "tiempo"); diccionarioEtiquetas.put("vea", "accion");
        diccionarioEtiquetas.put("verse", "accion"); diccionarioEtiquetas.put("volada", "estado");
        diccionarioEtiquetas.put("y", "conector"); diccionarioEtiquetas.put("ya", "tiempo");
        diccionarioEtiquetas.put("yo", "pronombre"); diccionarioEtiquetas.put("triste", "emocion");
        diccionarioEtiquetas.put("feliz", "emocion"); diccionarioEtiquetas.put("felicidades", "emocion");
        diccionarioEtiquetas.put("aburrido", "emocion"); diccionarioEtiquetas.put("aburrida", "emocion");
        diccionarioEtiquetas.put("cansado", "emocion"); diccionarioEtiquetas.put("cansada", "emocion");
        diccionarioEtiquetas.put("cansancio", "estado"); diccionarioEtiquetas.put("genial", "emocion");
        diccionarioEtiquetas.put("mal", "emocion"); diccionarioEtiquetas.put("malísima", "emocion");
        diccionarioEtiquetas.put("malísimo", "emocion"); diccionarioEtiquetas.put("malo", "emocion");
        diccionarioEtiquetas.put("mala", "emocion"); diccionarioEtiquetas.put("bien", "emocion");
        diccionarioEtiquetas.put("bienestar", "estado"); diccionarioEtiquetas.put("perro", "sustantivo");
        diccionarioEtiquetas.put("perros", "sustantivo"); diccionarioEtiquetas.put("mañana", "tiempo");
        diccionarioEtiquetas.put("ayer", "tiempo"); diccionarioEtiquetas.put("hoy", "tiempo");
        diccionarioEtiquetas.put("siempre", "tiempo"); diccionarioEtiquetas.put("pronto", "tiempo");
        diccionarioEtiquetas.put("por qué", "interrogativo"); diccionarioEtiquetas.put("quien", "interrogativo");
        diccionarioEtiquetas.put("cuánto", "interrogativo"); diccionarioEtiquetas.put("hacer", "accion");
        diccionarioEtiquetas.put("harás", "accion"); diccionarioEtiquetas.put("ir", "accion");
        diccionarioEtiquetas.put("iré", "accion"); diccionarioEtiquetas.put("irás", "accion");
        diccionarioEtiquetas.put("ver", "accion"); diccionarioEtiquetas.put("verás", "accion");
        diccionarioEtiquetas.put("veré", "accion"); diccionarioEtiquetas.put("escuchar", "accion");
        diccionarioEtiquetas.put("escucharás", "accion"); diccionarioEtiquetas.put("escucha", "accion");
        diccionarioEtiquetas.put("contar", "accion"); diccionarioEtiquetas.put("cuenta", "accion");
        diccionarioEtiquetas.put("cuento", "accion"); diccionarioEtiquetas.put("hambre", "estado");
        diccionarioEtiquetas.put("sed", "estado"); diccionarioEtiquetas.put("sueño", "estado");
        diccionarioEtiquetas.put("enferma", "estado"); diccionarioEtiquetas.put("enfermo", "estado");
        diccionarioEtiquetas.put("salud", "estado"); diccionarioEtiquetas.put("medicina", "estado");
        diccionarioEtiquetas.put("medicamento", "sustantivo"); diccionarioEtiquetas.put("medicamentos", "sustantivo");
        diccionarioEtiquetas.put("comer", "accion"); diccionarioEtiquetas.put("beber", "accion");
        diccionarioEtiquetas.put("beberé", "accion"); diccionarioEtiquetas.put("beberas", "accion");
        diccionarioEtiquetas.put("dormir", "accion"); diccionarioEtiquetas.put("dormiré", "accion");
        diccionarioEtiquetas.put("dormirás", "accion"); diccionarioEtiquetas.put("quedará", "estado");
        diccionarioEtiquetas.put("quiere", "deseo"); diccionarioEtiquetas.put("sí", "afirmacion");
        diccionarioEtiquetas.put("claro", "afirmacion"); diccionarioEtiquetas.put("obvio", "afirmacion");
        diccionarioEtiquetas.put("obviamente", "adverbio"); diccionarioEtiquetas.put("tal", "comparativo");
        diccionarioEtiquetas.put("quizás", "duda"); diccionarioEtiquetas.put("imposible", "duda");
        diccionarioEtiquetas.put("difícil", "duda"); diccionarioEtiquetas.put("difícilmente", "adverbio");
        diccionarioEtiquetas.put("normal", "estado"); diccionarioEtiquetas.put("normalmente", "adverbio");
        diccionarioEtiquetas.put("fácil", "estado"); diccionarioEtiquetas.put("fácilmente", "adverbio");
        diccionarioEtiquetas.put("imposiblemente", "adverbio"); diccionarioEtiquetas.put("correcto", "afirmacion");
        diccionarioEtiquetas.put("incorrecto", "negacion"); diccionarioEtiquetas.put("mío", "posesivo");
        diccionarioEtiquetas.put("tuyo", "posesivo"); diccionarioEtiquetas.put("suyo", "posesivo");
        diccionarioEtiquetas.put("nuestro", "posesivo"); diccionarioEtiquetas.put("alguien", "indefinido");
        diccionarioEtiquetas.put("nadie", "indefinido"); diccionarioEtiquetas.put("gente", "sustantivo");
        diccionarioEtiquetas.put("persona", "sustantivo"); diccionarioEtiquetas.put("amigo", "sustantivo");
        diccionarioEtiquetas.put("amiga", "sustantivo"); diccionarioEtiquetas.put("enemigo", "sustantivo");
        diccionarioEtiquetas.put("amigos", "sustantivo"); diccionarioEtiquetas.put("amigas", "sustantivo");
        diccionarioEtiquetas.put("desconocido", "sustantivo"); diccionarioEtiquetas.put("desconocida", "sustantivo");
        diccionarioEtiquetas.put("desconocidos", "sustantivo"); diccionarioEtiquetas.put("desconocidas", "sustantivo");
        diccionarioEtiquetas.put("creada", "accion"); diccionarioEtiquetas.put("creado", "accion");
        diccionarioEtiquetas.put("creare", "accion"); diccionarioEtiquetas.put("creación", "sustantivo");
        diccionarioEtiquetas.put("tipo", "sustantivo"); diccionarioEtiquetas.put("tipa", "sustantivo");
        diccionarioEtiquetas.put("casa", "lugar"); diccionarioEtiquetas.put("escuela", "lugar");
        diccionarioEtiquetas.put("calle", "lugar"); diccionarioEtiquetas.put("parque", "lugar");
        diccionarioEtiquetas.put("trabajo", "lugar"); diccionarioEtiquetas.put("cuarto", "lugar");
        diccionarioEtiquetas.put("ciudad", "lugar"); diccionarioEtiquetas.put("aquí", "lugar");
        diccionarioEtiquetas.put("allá", "lugar"); diccionarioEtiquetas.put("lejos", "lugar");
        diccionarioEtiquetas.put("cerca", "lugar"); diccionarioEtiquetas.put("departamento", "lugar");
        diccionarioEtiquetas.put("cafetería", "lugar"); diccionarioEtiquetas.put("bar", "lugar");
        diccionarioEtiquetas.put("restaurante", "lugar"); diccionarioEtiquetas.put("cine", "lugar");
        diccionarioEtiquetas.put("prostíbulo", "lugar"); diccionarioEtiquetas.put("antro", "lugar");
        diccionarioEtiquetas.put("país", "lugar"); diccionarioEtiquetas.put("nombre", "sustantivo");
        diccionarioEtiquetas.put("llamo", "accion"); diccionarioEtiquetas.put("llame", "accion");
        diccionarioEtiquetas.put("venir", "accion"); diccionarioEtiquetas.put("vendré", "accion");
        diccionarioEtiquetas.put("vendrás", "accion"); diccionarioEtiquetas.put("vendría", "accion");
        diccionarioEtiquetas.put("entrar", "accion"); diccionarioEtiquetas.put("entraré", "accion");
        diccionarioEtiquetas.put("entre", "preposicion"); diccionarioEtiquetas.put("sali", "accion");
        diccionarioEtiquetas.put("saliste", "accion"); diccionarioEtiquetas.put("salir", "accion");
        diccionarioEtiquetas.put("subir", "accion"); diccionarioEtiquetas.put("subiré", "accion");
        diccionarioEtiquetas.put("subirá", "accion"); diccionarioEtiquetas.put("bajar", "accion");
        diccionarioEtiquetas.put("bajara", "accion"); diccionarioEtiquetas.put("bajaré", "accion");
        diccionarioEtiquetas.put("baje", "accion"); diccionarioEtiquetas.put("izquierda", "posicion");
        diccionarioEtiquetas.put("derecha", "posicion"); diccionarioEtiquetas.put("arriba", "posicion");
        diccionarioEtiquetas.put("adelante", "posicion"); diccionarioEtiquetas.put("atrás", "posicion");
        diccionarioEtiquetas.put("cuáles", "interrogativo"); diccionarioEtiquetas.put("acaso", "duda");
        diccionarioEtiquetas.put("mucho", "cantidad"); diccionarioEtiquetas.put("muchísimo", "cantidad");
        diccionarioEtiquetas.put("mucha", "cantidad"); diccionarioEtiquetas.put("muchísima", "cantidad");
        diccionarioEtiquetas.put("muchísimas", "cantidad"); diccionarioEtiquetas.put("muchísimos", "cantidad");
        diccionarioEtiquetas.put("poco", "cantidad"); diccionarioEtiquetas.put("poca", "cantidad");
        diccionarioEtiquetas.put("poquito", "cantidad"); diccionarioEtiquetas.put("poquitito", "cantidad");
        diccionarioEtiquetas.put("poquita", "cantidad"); diccionarioEtiquetas.put("poquitita", "cantidad");
        diccionarioEtiquetas.put("bastante", "cantidad"); diccionarioEtiquetas.put("algunos", "indefinido");
        diccionarioEtiquetas.put("algunas", "indefinido"); diccionarioEtiquetas.put("ninguno", "negacion");
        diccionarioEtiquetas.put("ninguna", "negacion"); diccionarioEtiquetas.put("ni", "negacion");
        diccionarioEtiquetas.put("ne", "negacion"); diccionarioEtiquetas.put("todo", "totalidad");
        diccionarioEtiquetas.put("toda", "totalidad"); diccionarioEtiquetas.put("nada", "negacion");
        diccionarioEtiquetas.put("nadita", "negacion"); diccionarioEtiquetas.put("nadota", "negacion");
        diccionarioEtiquetas.put("gracias", "cortesia"); diccionarioEtiquetas.put("porfa", "cortesia");
        diccionarioEtiquetas.put("porfis", "cortesia"); diccionarioEtiquetas.put("perdón", "cortesia");
        diccionarioEtiquetas.put("perdóname", "cortesia"); diccionarioEtiquetas.put("perdóneme", "cortesia");
        diccionarioEtiquetas.put("disculpa", "cortesia"); diccionarioEtiquetas.put("disculpame", "cortesia");
        diccionarioEtiquetas.put("discúlpeme", "cortesia"); diccionarioEtiquetas.put("adiós", "cortesia");
        diccionarioEtiquetas.put("bay", "cortesia"); diccionarioEtiquetas.put("hasta", "cortesia");
        diccionarioEtiquetas.put("luego", "tiempo"); diccionarioEtiquetas.put("entendi", "cognitivo");
        diccionarioEtiquetas.put("dijiste", "accion"); diccionarioEtiquetas.put("explicarme", "accion");
        diccionarioEtiquetas.put("otras", "indefinido"); diccionarioEtiquetas.put("eso", "demostrativo");
        diccionarioEtiquetas.put("esa", "demostrativo"); diccionarioEtiquetas.put("refieres", "accion");
        diccionarioEtiquetas.put("refiero", "accion"); diccionarioEtiquetas.put("refería", "accion");
        diccionarioEtiquetas.put("referí", "accion"); diccionarioEtiquetas.put("tokens", "tecnico");
        diccionarioEtiquetas.put("etiquetas", "tecnico"); diccionarioEtiquetas.put("veamos", "accion");
        diccionarioEtiquetas.put("besos", "cortesia"); diccionarioEtiquetas.put("besar", "accion");
    }

    public String procesar(String entrada) {
        // Lógica de pesos usando tus etiquetas
        String[] tokens = entrada.toLowerCase().split(" ");
        for (String t : tokens) {
            if (diccionarioEtiquetas.containsKey(t)) {
                // Aquí sumaremos o restaremos basándonos en la etiqueta
                score += (diccionarioEtiquetas.get(t).equals("emocion") ? 5 : 1);
            }
        }
        return "Score: " + score;
    }
    }
          
