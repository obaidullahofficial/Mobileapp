# Project Structure

```
Mobileapp/
├── app/
│   ├── build.gradle                           # App-level Gradle configuration
│   ├── proguard-rules.pro                     # ProGuard configuration
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml            # App manifest with permissions
│           ├── java/com/example/taskmanager/
│           │   ├── model/                     # MODEL (MVVM)
│           │   │   └── Task.java              # Task entity with Room annotations
│           │   ├── database/                  # DATABASE (MVVM Model)
│           │   │   ├── TaskDao.java           # Data Access Object
│           │   │   ├── TaskDatabase.java      # Room database
│           │   │   └── TaskRepository.java    # Repository pattern
│           │   ├── viewmodel/                 # VIEWMODEL (MVVM)
│           │   │   └── TaskViewModel.java     # ViewModel with LiveData
│           │   └── view/                      # VIEW (MVVM)
│           │       ├── MainActivity.java      # Main activity (lifecycle methods)
│           │       ├── TaskListFragment.java  # Fragment 1: Display tasks
│           │       ├── AddTaskFragment.java   # Fragment 2: Add tasks + Camera
│           │       └── TaskAdapter.java       # RecyclerView adapter
│           └── res/
│               ├── layout/
│               │   ├── activity_main.xml      # Main activity layout
│               │   ├── fragment_task_list.xml # Task list fragment layout
│               │   ├── fragment_add_task.xml  # Add task fragment layout
│               │   └── item_task.xml          # RecyclerView item layout
│               ├── menu/
│               │   └── bottom_nav_menu.xml    # Bottom navigation menu
│               ├── values/
│               │   ├── colors.xml             # Color resources
│               │   ├── strings.xml            # String resources
│               │   └── themes.xml             # App theme
│               ├── xml/
│               │   └── file_paths.xml         # FileProvider paths for camera
│               ├── drawable/
│               │   └── ic_launcher_foreground.xml
│               └── mipmap-*/                  # App icons (all densities)
├── build.gradle                               # Project-level Gradle
├── settings.gradle                            # Gradle settings
├── gradle.properties                          # Gradle properties
├── gradle/wrapper/                            # Gradle wrapper
├── .gitignore                                 # Git ignore file
├── README.md                                  # Project documentation
└── REQUIREMENTS_VERIFICATION.md               # Requirements checklist
```

## Key Architecture Components

### MVVM Pattern Implementation

#### Model (Data Layer)
- **Task.java**: Entity class with Room annotations (@Entity, @PrimaryKey)
- **TaskDao.java**: Database operations (@Insert, @Update, @Delete, @Query)
- **TaskDatabase.java**: Room database singleton
- **TaskRepository.java**: Abstraction over data sources

#### ViewModel (Business Logic)
- **TaskViewModel.java**: 
  - Extends AndroidViewModel
  - Manages UI-related data
  - Communicates with Repository
  - Provides LiveData to Views

#### View (UI Layer)
- **MainActivity.java**: 
  - AppCompatActivity with all lifecycle methods
  - Fragment container
  - Bottom navigation setup
- **TaskListFragment.java**: 
  - Fragment to display tasks
  - RecyclerView implementation
  - Observes LiveData from ViewModel
- **AddTaskFragment.java**: 
  - Fragment to add new tasks
  - Camera integration
  - Form inputs (EditText)
- **TaskAdapter.java**: 
  - RecyclerView.Adapter
  - ViewHolder pattern
  - Item click listeners

## Features Implementation

### 1. Java Language ✅
All source files (.java) in the project

### 2. UI Components ✅
- Buttons (Save, Camera, Delete)
- TextViews (Title, Description, Timestamp)
- EditTexts (Title input, Description input)
- RecyclerView (Task list)
- ImageView (Photo preview)

### 3. Two Fragments ✅
- TaskListFragment
- AddTaskFragment

### 4. Lifecycle Methods ✅
MainActivity implements:
- onCreate()
- onStart()
- onPause()
- onStop()
- onDestroy()

### 5. Device Feature: Camera ✅
- Camera intent
- Permission handling
- FileProvider for image storage
- Image preview

### 6. Database: Room ✅
- SQLite via Room
- CRUD operations
- LiveData integration
- Persistent storage

### 7. Architecture: MVVM ✅
- Clear separation of concerns
- LiveData for reactive UI
- Repository pattern
- ViewModel survives config changes

### 8. Runs Successfully ✅
- Proper Gradle configuration
- All dependencies included
- Min SDK 24, Target SDK 33
