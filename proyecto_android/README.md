# MultiIdioma App - Proyecto Android Básico

## Descripción
Esta es una aplicación básica de Android que demuestra:
- Soporte para múltiples idiomas (Español, Inglés, Francés, Alemán)
- Adaptación a diferentes tamaños de pantalla
- Uso de imagen de fondo con nine-patch para redimensionamiento

## Características

### 1. Soporte Multiidioma
- **Español** (idioma por defecto)
- **Inglés**
- **Francés**
- **Alemán**

### 2. Diseño Responsivo
- Layouts adaptados para diferentes orientaciones (portrait/landscape)
- Soporte para tablets (pantallas grandes)
- Uso de ConstraintLayout para máxima flexibilidad

### 3. Imagen de Fondo
- Utiliza la imagen `fotoandroid.png` como fondo
- Se requiere crear un archivo nine-patch (`background_android.9.png`) para redimensionamiento
- El marcianito Android no se verá afectado por la redimensión

## Estructura del Proyecto

```
app/
├── src/main/
│   ├── java/com/example/multiidiomaapp/
│   │   └── MainActivity.java
│   ├── res/
│   │   ├── drawable/
│   │   │   ├── background_android.9.png (requerido)
│   │   │   └── button_background.xml
│   │   ├── layout/
│   │   │   ├── activity_main.xml (portrait)
│   │   │   ├── layout-land/activity_main.xml (landscape)
│   │   │   └── layout-sw600dp/activity_main.xml (tablets)
│   │   ├── values/
│   │   │   ├── strings.xml (español)
│   │   │   ├── colors.xml
│   │   │   └── themes.xml
│   │   ├── values-en/strings.xml (inglés)
│   │   ├── values-fr/strings.xml (francés)
│   │   └── values-de/strings.xml (alemán)
│   └── AndroidManifest.xml
├── build.gradle
└── proguard-rules.pro
```

## Instrucciones de Configuración

### 1. Crear el Archivo Nine-Patch
Para que la imagen de fondo sea redimensionable:

1. Copia `fotoandroid.png` a `app/src/main/res/drawable/`
2. Renómbrala como `background_android.9.png`
3. Edita la imagen para agregar bordes negros:
   - **Lados izquierdo y superior**: Define las áreas que se pueden estirar
   - **Lados derecho e inferior**: Define el padding del contenido
4. El marcianito Android debe estar en un área que no se estire

### 2. Compilar y Ejecutar
1. Abre el proyecto en Android Studio
2. Sincroniza el proyecto con Gradle
3. Conecta un dispositivo Android o usa un emulador
4. Presiona "Run" para compilar y ejecutar

## Funcionalidades

- **Cambio de idioma en tiempo real**: Los botones permiten cambiar el idioma de la aplicación
- **Interfaz adaptativa**: Se adapta automáticamente a diferentes tamaños de pantalla
- **Diseño responsive**: Funciona tanto en smartphones como en tablets
- **Orientación flexible**: Soporta cambios de orientación de pantalla

## Requisitos del Sistema

- Android Studio Arctic Fox o superior
- Android SDK API 24 (Android 7.0) o superior
- Gradle 7.0 o superior

## Notas Importantes

- La aplicación reinicia automáticamente al cambiar de idioma para aplicar los cambios
- Los layouts están optimizados para diferentes densidades de pantalla
- Se utiliza Material Design para una apariencia moderna y consistente
