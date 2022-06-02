package com.bharat.dummyapp

import com.bharat.dummyapp.models.PlaceItem
import com.bharat.dummyapp.models.PlaceItemDetail

fun getFakeDetailData(): List<PlaceItemDetail> {

    return listOf(

        PlaceItemDetail(
            id = 1,
            largeImageUrl = "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            placeName = "Australia"
        ),

        PlaceItemDetail(
            id = 2,
            largeImageUrl = "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Winter 2020",
            duration = "10 days",
            placeName = "India"
        ),

        PlaceItemDetail(
            id = 3,
            largeImageUrl = "https://images.pexels.com/photos/459335/pexels-photo-459335.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            placeName = "Australia"
        ),

        PlaceItemDetail(
            id = 4,
            largeImageUrl = "https://images.pexels.com/photos/1680140/pexels-photo-1680140.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Winter 2020",
            duration = "10 days",
            placeName = "India"
        ),

        PlaceItemDetail(
            id = 5,
            largeImageUrl = "https://images.pexels.com/photos/255379/pexels-photo-255379.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            placeName = "Australia"
        ),

        PlaceItemDetail(
            id = 6,
            largeImageUrl = "https://image.shutterstock.com/image-photo/people-joined-hands-team-600w-754453969.jpg",
            season = "Winter 2020",
            duration = "10 days",
            placeName = "India"
        ),
    )
}

fun getFakeData(): List<PlaceItem> {

    return listOf(

        PlaceItem(
            id = 1,
            largeImageUrl = "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            roundImage = "https://images.pexels.com/photos/235986/pexels-photo-235986.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            placeName = "Australia"
        ),

        PlaceItem(
            id = 2,
            largeImageUrl = "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Winter 2020",
            duration = "10 days",
            roundImage = "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            placeName = "India"
        ),

        PlaceItem(
            id = 3,
            largeImageUrl = "https://images.pexels.com/photos/459335/pexels-photo-459335.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            roundImage = "https://images.pexels.com/photos/459335/pexels-photo-459335.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            placeName = "Australia"
        ),

        PlaceItem(
            id = 4,
            largeImageUrl = "https://images.pexels.com/photos/1680140/pexels-photo-1680140.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Winter 2020",
            duration = "10 days",
            roundImage = "https://images.pexels.com/photos/1680140/pexels-photo-1680140.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            placeName = "India"
        ),

        PlaceItem(
            id = 5,
            largeImageUrl = "https://images.pexels.com/photos/255379/pexels-photo-255379.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            season = "Summer 2019",
            duration = "5 days",
            roundImage = "https://images.pexels.com/photos/255379/pexels-photo-255379.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            placeName = "Australia"
        ),

        PlaceItem(
            id = 6,
            largeImageUrl = "https://image.shutterstock.com/image-photo/people-joined-hands-team-600w-754453969.jpg",
            season = "Winter 2020",
            duration = "10 days",
            roundImage = "https://image.shutterstock.com/image-photo/people-joined-hands-team-600w-754453969.jpg",
            placeName = "India"
        ),
    )

}