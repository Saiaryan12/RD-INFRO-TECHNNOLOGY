# RD INFRO TECHNOLOGY Internship

Android Development Internship Tasks

## Task 1 Completed
- Android Studio Setup
- SDK Configuration
- Emulator Setup
- GitHub Integration
- First Android App

## Technologies Used
- Kotlin
- Android Studio
- Jetpack Compose
- Git & GitHub
- 
- ## Task 2 Completed

* Splash Screen Implementation
* Onboarding / Intro Screens
* ViewPager Integration
* RecyclerView Adapter Setup
* Next Button Navigation
* SharedPreferences Integration
* Intro Skip on Reopen
* Home Screen Navigation
* UI Design using XML
* GitHub Version Control

### Features Added

* Welcome Screen
* Learn Android Screen
* Start Building Screen
* Automatic Navigation Logic
* Persistent User Session

### Technologies Used

* Kotlin
* Android Studio
* RecyclerView
* ViewPager
* SharedPreferences
* XML Layout Design
* Git & GitHub

## Task 3 Completed

### Firebase Authentication System

Implemented complete Firebase Authentication using Email and Password login system.

### Features Implemented

* Firebase Project Configuration
* Firebase SDK Integration
* google-services.json Setup
* Firebase Authentication Enabled
* Email/Password Authentication
* User Signup Functionality
* User Login Functionality
* Dashboard Screen
* Logout Functionality
* Firebase Session Handling
* Automatic User Login Persistence
* Intro Screen Navigation Logic
* Authentication Flow Management
* Input Validation
* Toast Messages for Authentication Status

### Authentication Flow

```text
Splash Screen
   ↓
Intro Screens (First Time Only)
   ↓
Login Screen
   ↓
Signup Screen / Login
   ↓
Dashboard Screen
```

### Auto Session Handling

* New users see Intro Screens
* Logged-in users directly enter Dashboard
* Firebase Authentication session persists after reopening app
* Logout returns user to Login screen

### Activities Created

* SplashActivity
* IntroActivity
* LoginActivity
* SignupActivity
* DashboardActivity

### UI Screens Developed

* Login Screen UI
* Signup Screen UI
* Dashboard UI
* Intro Slider UI
* Splash Screen UI

### Firebase Components Used

* Firebase Authentication
* FirebaseAuth Instance
* Email/Password Provider
* Firebase User Session

### Technologies Used

* Kotlin
* Android Studio
* Firebase Authentication
* ViewPager2
* SharedPreferences
* XML Layout Design
* Git & GitHub

### Learning Outcomes

* Learned Firebase Android Integration
* Implemented User Authentication System
* Understood Firebase Session Management
* Built Login and Signup Flow
* Managed App Navigation Logic
* Implemented Persistent Login State
* Improved Android UI Development Skills

## Task 4 Completed

### RecyclerView Implementation

Implemented a dynamic RecyclerView to display Android-related news and updates using custom card layouts.

### Features Implemented

* RecyclerView Setup
* Custom Adapter Implementation
* ViewHolder Pattern
* Dynamic Data Binding
* Custom Card Layout Design
* Scrollable List Interface
* Data Model Class
* LinearLayoutManager Integration
* Dark Theme UI Design

### Components Created

* RecyclerView
* NewsAdapter
* News Data Class
* item_news.xml Layout
* Dashboard RecyclerView Integration

### RecyclerView Flow

```text id="rjlwm4"
Dashboard Screen
   ↓
RecyclerView
   ↓
News Cards Displayed Dynamically
```

### News Items Displayed

* Android 15 Released
* Firebase Authentication
* Jetpack Compose
* Kotlin for Android
* RecyclerView Concepts

### Technologies Used

* Kotlin
* Android Studio
* RecyclerView
* ViewHolder
* Adapter Pattern
* XML Layout Design
* LinearLayoutManager

### Learning Outcomes

* Learned RecyclerView Implementation
* Understood Adapter and ViewHolder Pattern
* Built Dynamic List UI
* Managed Data Binding in RecyclerView
* Designed Reusable Card Layouts
* Improved Android UI Development Skills

## Task 5 Completed

### API Integration using Retrofit

Implemented REST API integration in Android application using Retrofit and Gson Converter to fetch and display dynamic online data in RecyclerView.

### Features Implemented

* REST API Integration
* Retrofit Setup
* Gson Converter Integration
* Internet Permission Configuration
* Dynamic Data Fetching
* JSON Data Parsing
* RecyclerView API Data Display
* API Response Handling
* Error Handling with Toast Messages
* Asynchronous Network Calls
* Dynamic RecyclerView Updates

### Components Created

* Post Data Class
* ApiService Interface
* RetrofitClient Object
* PostAdapter
* API-based RecyclerView Integration

### API Flow

```text id="kjlwm1"
REST API
   ↓
Retrofit Client
   ↓
JSON Response
   ↓
RecyclerView Adapter
   ↓
Dynamic Card Display
```

### API Used

```text id="jlwm21"
https://jsonplaceholder.typicode.com/posts
```

### Technologies Used

* Kotlin
* Android Studio
* Retrofit
* Gson Converter
* RecyclerView
* REST API
* JSON Parsing
* LinearLayoutManager
* XML Layout Design
* Git & GitHub

### Networking Features

* GET API Request
* JSON Response Parsing
* Callback Handling
* Response Validation
* Failure/Error Handling
* Dynamic Content Loading

### Learning Outcomes

* Learned REST API Integration in Android
* Understood Retrofit Library Usage
* Implemented JSON Data Parsing
* Managed Asynchronous API Calls
* Displayed Dynamic Internet Data
* Improved RecyclerView Integration Skills
* Learned Network Error Handling
* Understood Client-Server Communication

## Task 6 Completed

### Profile Screen with Image Picker

Implemented a user profile screen with image selection functionality in Android application.

### Features Implemented

- Profile Screen UI
- Image Picker Integration
- Gallery Image Selection
- Dynamic Profile Image Preview
- Dashboard to Profile Navigation
- Button Click Navigation
- Modern Dark UI Design
- Activity Navigation using Intent

### Components Created

- ProfileActivity
- activity_profile.xml
- Profile ImageView
- Choose Image Button
- Image Picker Logic

### Functionalities

- Open Profile Screen
- Select Image from Gallery
- Display Selected Image
- Navigate between Activities
- Dynamic UI Updates

### Technologies Used

- Kotlin
- Android Studio
- ImageView
- Intent Navigation
- Activity Result API
- XML Layout Design
- RecyclerView
- Git & GitHub

### Learning Outcomes

- Learned Activity Navigation
- Implemented Image Picker
- Understood Gallery Access
- Used ActivityResultContracts
- Improved Android UI Skills
- Learned Dynamic Image Handling

## Task 7 Completed

### Firebase Cloud Messaging (FCM) Push Notifications

Implemented push notification functionality using Firebase Cloud Messaging in the Android application.

### Features Implemented

- Firebase Cloud Messaging Integration
- Push Notification Support
- FCM Token Generation
- Notification Service Implementation
- Real-time Notification Delivery
- Notification Permission Handling
- Background Notification Support
- Firebase Console Notification Testing

### Components Created

- MyFirebaseMessagingService.kt
- Notification Channel Setup
- FCM Token Generation Logic
- Firebase Messaging Configuration

### Functionalities

- Generate FCM Device Token
- Receive Push Notifications
- Display Notifications on Device
- Background Notification Handling
- Firebase Console Testing
- Real-time Notification Alerts

### Firebase Services Used

- Firebase Cloud Messaging (FCM)
- Firebase Authentication
- Firebase SDK Integration

### Technologies Used

- Kotlin
- Android Studio
- Firebase Cloud Messaging
- NotificationCompat
- Firebase Console
- Android Notifications
- Firebase SDK
- Git & GitHub

### Permissions Added

```xml
<uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
