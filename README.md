# ✨ Escritura Rápida – Mini Proyecto #1

Un juego de habilidad desarrollado en **Java + JavaFX** en el que los jugadores deben escribir palabras o frases que aparecen en pantalla antes de que se acabe el tiempo. El objetivo es superar la mayor cantidad de niveles posibles, incrementando la dificultad conforme avanza la partida.

---

## 🎯 Descripción
En cada nivel se muestra una palabra o frase aleatoria que el jugador debe escribir exactamente igual. El tiempo inicial por nivel es de **20 segundos** y cada 5 niveles superados el tiempo disminuye en **2 segundos**, hasta un mínimo de **2 segundos**. El juego finaliza cuando el tiempo se agota o el jugador comete un error. Al finalizar, se muestra un resumen con niveles alcanzados y la posibilidad de reiniciar.

---

## 🛠️ Tecnologías y herramientas
- **Lenguaje:** Java SE 17+
- **Librería gráfica:** JavaFX
- **Diseño de interfaz:** Scene Builder (FXML)
- **IDE:** IntelliJ IDEA
- **Control de versiones:** Git + GitHub
- **Documentación:** Javadoc

---

## 📌 Objetivo general
Desarrollar el juego “Escritura Rápida” implementando una interfaz gráfica funcional e intuitiva con Java y JavaFX, aplicando principios de **UX/UI** y fundamentos de programación orientada a eventos.

---

## ✅ Objetivos específicos
- Diseñar una interfaz gráfica atractiva y alineada a principios de **usabilidad**.
- Implementar eventos de teclado y mouse para la interacción con el juego.
- Modularizar la lógica del juego mediante **interfaces, clases internas y adaptadoras**.
- Mostrar visualmente el progreso, el tiempo y la retroalimentación del jugador en cada nivel.
- Documentar el código fuente con **Javadoc**.

---

## 📚 Historias de usuario
- **HU-1:** Visualización de palabra/frase aleatoria y validación exacta.  
- **HU-2:** Temporizador visible (20s iniciales) con validación al finalizar.  
- **HU-3:** Progresión de niveles y aumento de dificultad (–2s cada 5 niveles).  
- **HU-4:** Retroalimentación visual (éxito/fracaso) y resumen final.  

---

## 🚀 Cómo ejecutar el proyecto
1. **Clonar** el repositorio:
   ```bash
   git clone https://github.com/TU-USUARIO/EscrituraRapida_TheGame.git
   ```
2. **Abrir el proyecto** en IntelliJ IDEA (o tu IDE preferido).
3. **Configurar JavaFX** en el IDE (SDK/lib en el module path; si usas Maven, asegúrate de tener las dependencias o plugin de JavaFX).
4. **Ejecutar la clase** `Main`.

> **Nota:** Si usas Maven con el plugin de JavaFX, también puedes correr con `mvn javafx:run`.

---

## 📂 Estructura del proyecto
```
src/main/java/com/example/escriturarapida_thegame/
  model/ # Clases de lógica del juego 
  controller/ # Controladores FXML (manejo de eventos y comunicación con la vista)
  Main.java # Clase principal, punto de entrada de la aplicación

src/main/resources/com/example/escriturarapida_thegame/
  fonts/ # Fuentes personalizadas (ej. RussoOne-Regular.ttf)
  fxml/ # Interfaces gráficas en FXML (menú, pantallas del juego)
  styles/ # Hojas de estilo CSS
  images/ # Recursos gráficos e imágenes de fondo
```

---

## 🛣️ Roadmap
- [ ] Pantalla de juego con input y validación exacta.
- [ ] Temporizador y ajuste automático de dificultad.
- [ ] Resumen final con estadísticas.
- [ ] Sonidos/animaciones ligeras.
- [ ] Tests básicos y Javadoc.

---

## 👨‍💻 Autor
Proyecto realizado de forma **individual** como parte de la asignatura *Fundamentos de Programación Orientada a Eventos*.
