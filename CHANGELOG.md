# Changelog

Todos los cambios importantes de este proyecto serán documentados en este archivo.

## [1.0.0] - 2024-05-23

### ✨ Agregado
- Estructura inicial del proyecto Android
- Modelos de datos: State y Municipality
- Adapters para RecyclerView: StatesAdapter y MunicipalitiesAdapter
- Activities: MainActivity y StateDetailActivity
- Utilitarios: DataManager para cargar datos JSON
- Datos JSON con 32 estados y sus municipios
- Layouts XML para interfaz de usuario:
  - activity_main.xml
  - activity_state_detail.xml
  - item_state.xml
  - item_municipality.xml
- Recursos: strings, colors, themes con Material Design
- Menú principal con opción "Acerca de"
- Documentación: README.md completo
- Archivo .gitignore para Android
- Configuración de Gradle con dependencias necesarias

### 🎨 Diseño
- Material Design con paleta de colores verde y amarilla
- CardView para presentación de elementos
- AppBar personalizado
- Temas responsivos

### 📱 Funcionalidades
- Visualizar lista de 32 estados de México
- Seleccionar un estado para ver sus detalles
- Mostrar lista de municipios del estado
- Información básica: capital, población, área, región

### 🔧 Técnico
- RecyclerView para listas eficientes
- JSON local con GSON para parseo de datos
- ViewHolder pattern en adapters
- Navigation entre activities con Intent
- Soporte para Android 7.0+ (API 24)

## [Próximas Versiones - Planeado]

### v1.1.0
- [ ] ViewModel y LiveData
- [ ] Búsqueda de estados/municipios
- [ ] Animaciones de transición

### v1.2.0
- [ ] Sistema de favoritos
- [ ] SharedPreferences

### v2.0.0
- [ ] Mapa interactivo
- [ ] Información ampliada
- [ ] Material Design 3

---

Para información más detallada, ver [README.md](README.md)
