📱 TODO Android App











📌 Project Overview

This Android application fetches a list of TODO items from the JSONPlaceholder API and displays them using Jetpack Compose.
  - Users can see a scrollable list of TODO items.
  - When a user clicks on an item, the app navigates to a detail screen that shows more information.
  - The app also uses a Room database to store data locally. This allows offline access and faster loading.




🎯 Goals of the Project

- Learn how to use Retrofit to fetch data from an API.
  
- Implement local caching with Room Database.
  
- Build modern Android UIs with Jetpack Compose.
  
- Practice MVVM architecture for clean and maintainable code.
  
- Implement Compose Navigation for moving between screens.




⚙️ Functional Requirements

- Data Retrieval & Caching
  
 : Fetch TODO items from JSONPlaceholder API.
 
 : Cache data locally using Room.
 
 : Show cached data immediately when the app opens, then refresh from the network.


- User Interface
  
 : List Screen: Show all TODOs (title + status) in a LazyColumn.

 : Detail Screen: Show full details of a selected TODO.
 
 : Show loading indicators and error messages if something goes wrong.



- Navigation
  
   : Use Compose Navigation to move between list and detail screens.
  
   : Provide back navigation.
  
-  Error Handling
  
   : Show error messages if the network fails.
   
   :  If cached data exists, display it even when offline.




🛠️ Tech Stack

: Language: Kotlin

: UI: Jetpack Compose

: Networking: Retrofit + Coroutines

: Database: Room Database

: Architecture: MVVM (Model - ViewModel - View)




📂 Project Structure

: Model → Data classes for TODO items.

: API → Retrofit interface to fetch data.

: Database → Room Entity + DAO for caching.

: Repository → Manages data from API and Room.

: ViewModel → Provides data to the UI.

: UI →

List Screen: Shows all TODOs.

Detail Screen: Shows details of a selected TODO.

