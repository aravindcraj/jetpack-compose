package com.aravindcraj.contacts

data class Contact(
    val name: String,
    val contactNumber: String,
    val profile: String
)

val details = listOf(
    Contact(
        name = "Alex",
        contactNumber = "(632)498319",
        profile = "Mobile"
    ),
    Contact(
        name = "Archie",
        contactNumber = "(938)893782",
        profile = "School"
    ),
    Contact(
        name = "Ann",
        contactNumber = "(938)973320",
        profile = "School"
    ),
    Contact(
        name = "Lisa",
        contactNumber = "(123)234412",
        profile = "Telephone"
    ),
    Contact(
        name = "Zoya",
        contactNumber = "(653)876542",
        profile = "Work"
    ),
    Contact(
        name = "Amber",
        contactNumber = "(938)973320",
        profile = "Work"
    )
)