package com.bharat.dummyapp.models

data class PlaceItem (
    var id: Int?,
    var largeImageUrl: String?,
    var placeName: String?,
    var season: String?,
    var duration: String?,
    var roundImage: String?
)

data class PlaceItemDetail (
    var id: Int?,
    var largeImageUrl: String?,
    var placeName: String?,
    var season: String?,
    var duration: String?,
    var title: String? = "Some Title here",
    var desciption: String? = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    var listOfProfiles: List<Profiles>? = listOf(
        Profiles(
            "Bharat",
            "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        ),
        Profiles(
            "Abhishek",
            "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        ),
        Profiles(
            "Saurav",
            "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        ),
    )
)

data class Profiles (
    var name: String?,
    var profilePic: String?
)