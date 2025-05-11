package com.example.jetpack_compose_assignment_1

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

fun sampleCourses(): List<Course> = listOf(
    Course("Introduction to Python", "SE101", 3, "Basics of programming using Python.", "None"),
    Course("Data Structures", "SE102", 4, "Study of linear and non-linear data structures.", "SE101"),
    Course("Object-Oriented", "SE201", 4, "Concepts of OOP with Java.", "SE101"),
    Course("Database Systems", "SE202", 3, "Design and querying of relational databases.", "SE101"),
    Course("Operating System", "SE203", 3, "Software development lifecycle and methodologies.", "SE102, SE201"),
    Course("Web Development", "SE204", 3, "Frontend and backend web technologies.", "SE201"),
    Course("Mobile App Development", "SE301", 4, "Building apps using Kotlin and Android Studio.", "SE201, SE204"),
    Course("Algorithms & Complexity", "SE302", 4, "Efficient algorithms and computational complexity.", "SE102"),
    Course("Operating Systems", "SE303", 3, "Concepts of OS like memory and process management.", "SE102"),
    Course("Computer Networks", "SE304", 3, "Fundamentals of networking and protocols.", "SE102"),
    Course("Capstone Project I", "SE401", 3, "Team project applying all SE knowledge.", "SE203"),
    Course("Capstone Project II", "SE402", 3, "Finalizing and presenting SE projects.", "SE401"),
    Course("AI Basics", "SE305", 3, "Introduction to Artificial Intelligence and ML concepts.", "SE302"),
    Course("Cloud Intro", "SE306", 3, "Fundamentals of cloud computing and services.", "SE204"),
    Course("UX Design", "SE307", 2, "Principles of user experience and interface design.", "None"),
    Course("DevOps", "SE308", 3, "CI/CD pipelines and infrastructure automation.", "SE202"),
    Course("Cyber Sec", "SE309", 3, "Basics of cybersecurity and threat mitigation.", "SE102")
)






