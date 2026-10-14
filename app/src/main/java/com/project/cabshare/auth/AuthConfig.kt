package com.project.cabshare.auth

// Microsoft authorization configuration
object AuthConfig {
    // TODO: Replace with your actual application (client) ID from Azure Portal
    const val CLIENT_ID = "00000000-0000-0000-0000-000000000000"
    
    // Authority URL for Microsoft login
    const val AUTHORITY = "https://login.microsoftonline.com/common"
    
    // Scopes required for the application
    val SCOPES = arrayOf("User.Read")
    
    // The redirect URI after authentication
    const val REDIRECT_URI = "msauth://com.project.cabshare/callback"
    
    // Email domain to restrict authentication
    const val REQUIRED_EMAIL_DOMAIN = "iitp.ac.in"
} 
