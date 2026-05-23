# Explora México

## 📱 Aplicación Android de Exploración Geográfica de México

**Explora México** es una aplicación móvil desarrollada en Android Studio con Java que permite a los usuarios explorar los estados de la República Mexicana, sus municipios, y acceder a información geográfica, cultural y turística.

## 🎯 Objetivos del Proyecto

### Objetivos Iniciales
- ✅ Visualizar los 32 estados de México
- ✅ Seleccionar un estado para explorar sus municipios
- ✅ Mostrar información detallada de cada municipio
- ✅ Utilizar RecyclerView, Activities, Adapters
- ✅ Almacenar datos en JSON local

### Características Futuras Planeadas
- 🗺️ Mapa interactivo de México
- 📊 Información adicional:
  - Población y estadísticas demográficas
  - Capital de cada estado
  - Superficie territorial
  - Gastronomía típica
  - Sitios de interés turístico
  - Aspectos culturales e históricos
- 🔍 Sistema de búsqueda avanzada
- ❤️ Sistema de favoritos
- 🔥 Integración con Firebase
- 🎨 Diseño moderno con Material Design 3
- 🧭 Integración con Google Maps
- 📋 Soporte para GeoJSON

## 🏗️ Estructura del Proyecto

```
app/src/main/
├── java/com/astrocls777/exploraméxico/
│   ├── model/
│   │   ├── State.java
│   │   └── Municipality.java
│   ├── adapter/
│   │   ├── StatesAdapter.java
│   │   └── MunicipalitiesAdapter.java
│   ├── activity/
│   │   ├── MainActivity.java
│   │   └── StateDetailActivity.java
│   ├── viewmodel/
│   │   └── StateViewModel.java (próximas versiones)
│   └── util/
│       └── DataManager.java
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── activity_state_detail.xml
│   │   ├── item_state.xml
│   │   └── item_municipality.xml
│   ├── values/
│   │   ├── strings.xml
│   │   ├── colors.xml
│   │   └── themes.xml
│   ├── drawable/
│   └── menu/
│       └── menu_main.xml
└── assets/
    └── states_data.json
```

## 📦 Dependencias

```gradle
- AndroidX AppCompat: 1.6.1
- Material Design: 1.11.0
- RecyclerView: 1.3.2
- Lifecycle & ViewModel: 2.7.0
- GSON: 2.10.1
```

## 🚀 Cómo Comenzar

### Requisitos
- Android Studio Flamingo o superior
- JDK 11+
- SDK mínimo: Android 7.0 (API 24)
- SDK objetivo: Android 14 (API 34)

### Instalación

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/astrocls777/explora-mexico.git
   cd explora-mexico
   ```

2. **Abre el proyecto en Android Studio:**
   - File → Open → Selecciona la carpeta del proyecto

3. **Sincroniza las dependencias:**
   - Android Studio descargará automáticamente las dependencias de Gradle

4. **Compila y ejecuta:**
   - Conecta un dispositivo o abre un emulador
   - Presiona Shift + F10 (Windows/Linux) o Cmd + R (Mac)

## ✨ Características Actuales (v1.0.0)

### Funcionalidades

1. **Lista de Estados**
   - Muestra todos los 32 estados de México
   - Información: nombre, capital, cantidad de municipios
   - Interfaz con CardView para mejor presentación
   - Scroll fluido con RecyclerView

2. **Detalles del Estado**
   - Información completa del estado seleccionado
   - Capital, población, área, región
   - Lista completa de municipios
   - Información de población y área de cada municipio

3. **Diseño Material**
   - AppBar con tema verde (color representativo de México)
   - ColorScheme con paleta verde/amarilla
   - Interfaz limpia y fácil de usar
   - Responsive para diferentes tamaños de pantalla

## 📊 Datos Incluidos

La aplicación incluye información de:
- **32 Estados** de México
- **Municipios** por estado (información básica en v1.0.0)
- **Estadísticas**: población, área, región

## 🔄 Versiones Planeadas

### v1.0.0 (Actual)
- [x] Estructura base del proyecto
- [x] Modelos de datos (State, Municipality)
- [x] Adapters para RecyclerView
- [x] Navegación entre Activities
- [x] Datos JSON locales
- [x] Material Design básico

### v1.1.0
- [ ] ViewModel + LiveData
- [ ] Mejor gestión de ciclo de vida
- [ ] Búsqueda de estados y municipios
- [ ] Animaciones de transición

### v1.2.0
- [ ] Sistema de favoritos local
- [ ] SharedPreferences para persistencia
- [ ] Pantalla "Mis favoritos"

### v2.0.0
- [ ] Mapa interactivo de México
- [ ] Integración con Google Maps
- [ ] Información ampliada (gastronomía, turismo, cultura)
- [ ] Material Design 3

### v2.5.0+
- [ ] Firebase Firestore para datos en la nube
- [ ] Autenticación de usuario
- [ ] Sincronización de favoritos
- [ ] Notificaciones push

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java
- **IDE**: Android Studio
- **API Mínima**: Android 7.0 (API 24)
- **API Objetivo**: Android 14 (API 34)
- **Patrón de Arquitectura**: MVVM (planeado para versiones futuras)
- **Persistencia**: JSON local, SharedPreferences
- **Interfaz**: Material Design

## 📝 Cómo Contribuir

Ve a [CONTRIBUTING.md](CONTRIBUTING.md) para más información sobre cómo contribuir al proyecto.

## 🗂️ Roadmap

- [ ] Phase 1: Core Features (En desarrollo)
- [ ] Phase 2: Search & Favorites
- [ ] Phase 3: Maps Integration
- [ ] Phase 4: Cloud Sync with Firebase
- [ ] Phase 5: Enhanced Content

## 📄 Licencia

Este proyecto está bajo la licencia MIT. Ver [LICENSE](LICENSE) para más detalles.

## 👨‍💻 Autor

**astrocls777**
- GitHub: [@astrocls777](https://github.com/astrocls777)
- Email: contacto@astrocls777.dev

## 🙏 Agradecimientos

- Android Community por recursos y documentación
- Material Design por los estándares de UI/UX
- Todos los contribuidores que ayudan a mejorar este proyecto

## 📞 Soporte

Si encuentras algún problema o tienes sugerencias:
1. Abre un [Issue](https://github.com/astrocls777/explora-mexico/issues)
2. Crea un [Pull Request](https://github.com/astrocls777/explora-mexico/pulls)
3. Contacta al autor

---

**Última actualización**: Mayo 2024

**Estado**: En desarrollo activo ✨
