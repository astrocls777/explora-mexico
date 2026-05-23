# Contribuir a Explora México

¡Gracias por tu interés en contribuir a Explora México! Este documento proporciona directrices sobre cómo participar en el desarrollo de la aplicación.

## 📖 Código de Conducta

Este proyecto adhiere a un Código de Conducta que esperamos que todos los contribuidores respeten. Por favor, lee [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) antes de contribuir.

## 🐛 Reportar Bugs

Antes de crear un reporte de bug, por favor verifica la lista de issues ya que es posible que el problema ya haya sido reportado.

### Cómo reportar un bug

1. **Usa un título claro y descriptivo** para el issue
2. **Describe los pasos exactos** para reproducir el problema
3. **Proporciona ejemplos específicos** para ilustrar los pasos
4. **Describe el comportamiento observado** y explica qué es lo que sale mal
5. **Explica qué era lo que esperabas ver** en lugar del comportamiento incorrecto
6. **Incluye capturas de pantalla o GIFs** si es posible
7. **Incluye tu entorno**: versión de Android, dispositivo, etc.

### Plantilla para reporte de bug

```markdown
## Descripción del Bug
[Descripción clara y concisa]

## Pasos para reproducir
1. [Primer paso]
2. [Segundo paso]
3. [Tercer paso]

## Comportamiento esperado
[Qué debería suceder]

## Comportamiento actual
[Qué sucede en realidad]

## Entorno
- Android Studio: [versión]
- Dispositivo/Emulador: [modelo, versión de Android]
- Rama: [rama de trabajo]

## Archivos y código relevante
[Si es aplicable]
```

## 🚀 Sugerir mejoras

Las sugerencias de mejora son siempre bienvenidas. Por favor:

1. **Usa un título claro y descriptivo** para la sugerencia
2. **Proporciona una descripción detallada** de la mejora sugerida
3. **Incluye ejemplos específicos** para demostrar los pasos
4. **Describe el comportamiento actual** y menciona el comportamiento alternativo esperado
5. **Explica por qué sería útil** esta mejora

## 📝 Pautas para Pull Requests

### Antes de comenzar

1. **Fork el repositorio** y crea una rama desde `develop`
2. **Instala las dependencias** necesarias
3. **Sigue el estilo de código** del proyecto
4. **Escribe pruebas** para tu código nuevo
5. **Asegúrate de que tu código compila sin errores**

### Creando un Pull Request

1. **Rama**: Crea una rama descriptiva desde `develop`
   - Formato: `feature/descripcion`, `bugfix/descripcion`, `docs/descripcion`
   - Ejemplo: `feature/search-functionality`, `bugfix/crash-on-rotation`

2. **Commits**: 
   - Usa mensajes claros y concisos
   - Prefijo tipo: `[Feature]`, `[Fix]`, `[Docs]`, `[Refactor]`
   - Ejemplo: `[Feature] Add search functionality to states list`

3. **Código**:
   - Sigue el estilo de código existente
   - Utiliza nombres significativos para variables y métodos
   - Comenta código complejo
   - Mantén las funciones pequeñas y enfocadas

4. **Descripción del PR**:
   - Proporciona una descripción clara de los cambios
   - Relaciona cualquier issue relevante: `Closes #123`
   - Incluye screenshots si hay cambios visuales
   - Describe cualquier cambio en comportamiento

### Plantilla para Pull Request

```markdown
## Descripción
[Descripción clara de los cambios realizados]

## Tipo de cambio
- [ ] Bug fix (cambio no disruptivo que arregla un issue)
- [ ] Feature (cambio no disruptivo que agrega funcionalidad)
- [ ] Breaking change (fix o feature que causaría que funcionalidad existente no funcionara como se espera)
- [ ] Documentación

## Relacionado a Issues
Closes #[issue_number]

## Testing realizado
[Describe cómo has testado los cambios]

## Checklist
- [ ] Mi código sigue el estilo del proyecto
- [ ] He realizado una auto-revisión de mi código
- [ ] He comentado mi código, particularmente en áreas complejas
- [ ] He realizado cambios correspondientes a la documentación
- [ ] Mis cambios no generan nuevas advertencias
- [ ] He agregado tests que prueban que mi fix o feature funciona
- [ ] Los tests nuevos y existentes pasaron localmente

## Screenshots (si es aplicable)
[Agrega screenshots aquí]
```

## 🎨 Pautas de Estilo

### Java
- Usa convenciones de nomenclatura Java estándar
- Nombres de clases: PascalCase
- Nombres de métodos y variables: camelCase
- Constantes: UPPER_SNAKE_CASE
- Indentación: 4 espacios
- Longitud máxima de línea: 100 caracteres (preferentemente)

### XML
- Indentación: 4 espacios
- Atributos en líneas separadas para claridad
- IDs: snake_case
- Nombres descriptivos para elementos

## 🧪 Testing

- Escribe tests unitarios para lógica nueva
- Verifica que todos los tests pasen: `./gradlew test`
- Incluye tests en tu PR

## 📚 Documentación

- Actualiza README.md si hay cambios en funcionalidad
- Documenta APIs públicas
- Actualiza CHANGELOG.md con tus cambios
- Incluye comentarios JavaDoc para métodos públicos

## ⚙️ Proceso de Revisión

1. Al menos un maintainer revisará tu PR
2. Se pueden solicitar cambios
3. Una vez aprobado, será mergeado a `develop`
4. Los cambios en `develop` serán integrados a `main` en releases

## 💡 Áreas donde se busca contribución

- [ ] ViewModel y gestión de datos mejorada
- [ ] Sistema de búsqueda
- [ ] Mapas interactivos
- [ ] Firebase integration
- [ ] Material Design 3 updates
- [ ] Internacionalización
- [ ] Documentación
- [ ] Tests

## 📞 Preguntas?

Si tienes preguntas sobre cómo contribuir:
1. Abre un issue con la etiqueta `question`
2. Contacta al mantenedor
3. Revisa la documentación existente

---

¡Gracias por contribuir a Explora México! 🇲🇽
