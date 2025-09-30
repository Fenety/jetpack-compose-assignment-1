# 🎓 Academic Courses Android App  

## 📖 Description  
This project is a **simple Android application** built with **Jetpack Compose** that displays a list of academic courses. Each course item shows **basic information** (Course Title, Code, and Credit Hours). Users can **expand** a course to reveal **more details** (Description and Prerequisites).  

The app follows **Material 3 Design principles** and demonstrates how to:  
- Build UIs declaratively with **Composable functions**.  
- Manage UI **state** (expanded/collapsed cards).  
- Display lists efficiently with **LazyColumn**.  
- Apply **animations** for smooth expand/collapse transitions.  
- Style the UI using **MaterialTheme**.  

This project is designed as a **hands-on learning exercise** to strengthen understanding of Jetpack Compose fundamentals, state management, theming, and list performance.  

---

## 🎯 Objectives & Features  

### ✅ Using Composable Functions  
- Entire UI is built with `@Composable` functions.  
- A **reusable CourseCard** composable is created to display each course.  

### ✅ Building UIs with Compose  
- Layouts use **Column** and **Row** to arrange content.  
- **Modifiers** are applied for spacing, sizing, and styling.  
- The main screen content is declared inside `setContent`.  

### ✅ State Management & State Hoisting  
- Each `CourseCard` tracks its **expanded/collapsed state** using `rememberSaveable`.  
- Expanded content (Description & Prerequisites) only appears when `isExpanded = true`.  
- Clicking a card toggles its expanded state.  
- State hoisting is applied by passing course data into the composable instead of hardcoding it.  

### ✅ Efficient List Display  
- A **LazyColumn** displays all course cards.  
- Only visible items are rendered, making it scalable for large lists.  

### ✅ Animations  
- Expansion and collapse transitions are animated using `animateContentSize()`.  

### ✅ Styling & Theming  
- The app uses a **Material 3 theme** for consistent colors, typography, and shapes.  
- **Surface** and **Card** components are used for course items.  
- The app supports **light and dark themes**.  



## 🛠️ Tech Stack  
- **Language:** Kotlin  
- **UI Framework:** Jetpack Compose  
- **Design System:** Material 3  
- **Architecture:** Declarative UI with State & State Hoisting  
- **List Rendering:** LazyColumn  



## 📂 Project Structure  
- **MainActivity** → Hosts the UI using `setContent`.  
- **CourseCard** → A composable to display individual course details.  
- **CourseListScreen** → Displays the list of CourseCards using LazyColumn.  
- **Theme** → Defines Material 3 theming, colors, typography.  
- **Model** → Represents course data (Title, Code, Credit, Description, Prerequisites).  



