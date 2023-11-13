# Project Title

FEM2

## Run Locally

Clone the project

```bash
  git clone https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication.git
```

## API Reference (restcountries.com)

#### Get all countries

```[http
  GET /api/items](https://restcountries.com/v3.1/all
)
```

## Usage/Examples

```CountriesAuth.Common.Databases.SessionManager 
 
   public SessionManager(Context _context, String sessionName) {
        context = _context;
        usersSession = context.getSharedPreferences(sessionName, Context.MODE_PRIVATE);
        editor = usersSession.edit();
    }
 


```CountriesAuth.Common.LoginSignUp.verifyOTP

    private void sendVerificationCodeToUser(String phoneNo) {
        // [START start_phone_auth]
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber(phoneNo)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallbacks)          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
        // [END start_phone_auth]
    }

```CountriesAuth.Common.CountryActivity
Retrieve All Countries From the API (restcountries.com)

```

```CountriesAuth.Common.SplashScreen(Main Activity)


```

## Screenshots


# Users
![Users](https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication/assets/46055260/01d48123-aeef-4e06-8ba2-adf7f6d164f0)

# Signing method

![Signin-method](https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication/assets/46055260/6a9b4fd0-a6d3-4899-8c18-9e8f5a162577)

# Project settings

![Project-settings](https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication/assets/46055260/d509e5eb-a327-43fb-91b2-6c19d167221b)

# Authentication
![Authentication](https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication/assets/46055260/95075bff-a7b8-496f-89e0-6e0f3cf2627c)

# Database (Room)
![Database](https://github.com/wzzzzwwzw/Rest-Countries-API-Authentication/assets/46055260/527d24c4-0be7-47d7-98fb-cb04d59144fe)
