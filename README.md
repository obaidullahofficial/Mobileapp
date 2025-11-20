# Task Manager - Android Application

A Java-based Android application that demonstrates all required technical features for a mobile development project.

## Features

### ✅ Technical Requirements Met

1. **Java Language**: Entire application written in Java
2. **Good UI Design**: Clean XML layouts with Material Design components
3. **Two Fragments**: 
   - TaskListFragment: Displays list of tasks using RecyclerView
   - AddTaskFragment: Form to add new tasks with camera integration
4. **Activity Lifecycle Methods**: MainActivity implements all lifecycle methods (onCreate, onStart, onPause, onStop, onDestroy)
5. **Device Feature - Camera**: Take photos for tasks using device camera
6. **Database - Room/SQLite**: Persistent storage using Room Database
7. **MVVM Architecture**:
   - Model: Task entity and database classes
   - View: MainActivity, Fragments, and Adapters
   - ViewModel: TaskViewModel for business logic
8. **Successfully Runs**: Application builds and runs on Android emulator/device

### Application Features

- Create tasks with title and description
- Attach photos to tasks using camera
- View all tasks in a scrollable list
- Mark tasks as complete (strikethrough)
- Delete tasks
- Automatic timestamp for each task
- Data persists across app restarts

## Architecture

### MVVM Pattern
```
Model (Data Layer)
├── Task.java - Entity class with Room annotations
├── TaskDao.java - Database access object
├── TaskDatabase.java - Room database implementation
└── TaskRepository.java - Data repository

ViewModel (Business Logic)
└── TaskViewModel.java - LiveData and business logic

View (UI Layer)
├── MainActivity.java - Main activity with lifecycle methods
├── TaskListFragment.java - Fragment to display tasks
├── AddTaskFragment.java - Fragment to add new tasks
└── TaskAdapter.java - RecyclerView adapter
```

## Build Instructions

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK 24 or higher
- Java 8 or higher

### Building the Project
1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Run on emulator or physical device

## Permissions Required
- Camera: For taking task photos
- Storage: For saving captured images

## Technologies Used
- Java
- Android SDK
- Room Database
- LiveData & ViewModel (Architecture Components)
- RecyclerView
- Material Design Components
- FileProvider for camera images
