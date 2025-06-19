 Music Playlist Manager

Exam Submission Details  
Student Name: Muhammet Emin Isik  
Student No: ST10479263  
Module name :  Introduction to mobile Application development   
Submission Date: 19.06.2025  
https://github.com/IIEWFL/imad5112-practicum-ST10479263-Muhammet-Isik


 App Overview

Music Playlist Manager is a basic Android application designed for managing music playlists. The app features a clean and intuitive button-based menu interface, allowing users to add songs, view playlists, learn about the app, or exit.

The design emphasizes simplicity, ease of use, and a visually appealing experience with a custom background and color-coded buttons.


 App Structure

The main interface with the following elements:

-Title: "Music Playlist Manager" (blue-colored header text)
- Add Song Button: Opens a screen to add songs to the playlist
- View Playlist Button: Displays the current playlist
- About Button: Shows app and developer info
- Exit Button: Closes the app

1. Main Page

    Layout: Vertical LinearLayout with padding and centered gravity

    Background: Custom image (@drawable/image)

    Header:

        Text: "Music Playlist Manager"

        Style: Blue color (#2196F3), bold, 24sp font, margin below

    Buttons: Full-width, color-coded with margins

        Add Song — green (#4CAF50)

        View Playlist — blue (#3F51B5)

        About — pink (#E91E63)

        Exit App — orange (#FF9800)

    Function: Navigates to respective screens or exits app

2. Playlist Details Page

    Layout: Vertical LinearLayout with padding

    Background: Custom image (@drawable/image)

    Header:

        Text: "Playlist Details"

        Style: Blue color (#2196F3), bold, 35sp font, margin below

    Buttons:

        Display All Songs — orange (#FF9800), full width, margin below

        Calculate Average Rating — blue (#2196F3), full width, margin below

        Back to Main — green (#4CAF50), full width

    Content Area:

        ScrollView containing a TextView (text_playlist_output)

        Used to display song list or average rating results

3. Add Song Page

    Layout: ScrollView with vertical LinearLayout inside, padded

    Background: Custom image (@drawable/image)

    Input Fields:

        Song Title — text input, hint "Song Title"

        Artist Name — text input, hint "Artist Name"

        Rating (1-5) — numeric input, hint "Rating (1-5)"

        Comments — text input, hint "Comments"

    Purpose: Allows users to input song details for playlist addition

4. About Page

    Layout: Vertical LinearLayout with padding and centered gravity

    Background: Custom image (@drawable/image)

    Header:

        Text: "About This App" (bold, 28sp, margin below)

    Information Text:

        App Name: "Music Playlist Manager" (blue #3F51B5, 22sp)

        Version: "Version 1.0" (blue #3F51B5, 18sp)

        Developer: "Developed by: Muhammet Emin Isik" (green #4CAF50, 20sp)

    Button:

        Back to Main — green (#4CAF50), fixed size (200x60dp), returns to main screen



Reference list 
// Logging best practices reference:
//  Android Developers - Logging
//  https://developer.android.com/reference/android/util/Log
// StringBuilder optimization reference:
//  Kotlinlang Documentation - String Templates
//  https://kotlinlang.org/docs/strings.html#string-templates
//
//Collection operations reference:
//  Kotlin Collections Guide
//  https://kotlinlang.org/docs/collections-overview.html
// Dialog implementation reference:
   Android Developers Documentation - AlertDialog
   https://developer.android.com/guide/topics/ui/dialogs
 // ... existing code ...
//  Intent data passing reference:
    //  IMAD Module Manual - Page 137
    //  https://advtechonline.sharepoint.com/.../IMAD5112_MM.docx
    





